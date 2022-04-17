package com.example.Practica7.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.StreamSupport;

import com.example.Practica7.model.PurchaseInfoTable;
import com.example.Practica7.model.PurchaseTable;
import com.example.Practica7.model.ResponseTable;
import com.example.Practica7.model.ShopTable;
import com.example.Practica7.model.UserTable;
import com.example.Practica7.model.VoteInfoTable;
import com.example.Practica7.repository.PurchaseRepository;
import com.example.Practica7.repository.ResponseRepository;
import com.example.Practica7.repository.ShopRepository;
import com.example.Practica7.repository.UserRepository;
import com.example.Practica7.service.MyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MyServiceImpl implements MyService {

    public static Logger logger = LoggerFactory.getLogger(MyServiceImpl.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ResponseRepository responseRepository;

    @Autowired
    private ShopRepository shopRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;

    // USER

    @Override
    public List<UserTable> getUsers() {
        //logger.info("Llega aqui");
        //logger.info("Repositorio: " + userRepository);
        return StreamSupport.stream(userRepository.findAll().spliterator(), false).toList();
    }

    @Override
    public void newUser(String name, String surname, LocalDate date) {
        jdbcTemplate.update("INSERT INTO my_schema.USER (NAME1, SURNAME1, VISIT_DATE, OPTIONS) VALUES (?, ?, ?, ?)",
        name,surname,date,null);
    }

    // RESPONSE

    @Override
    public List<ResponseTable> getResponses() {
        //logger.info("Llega aqui");
        //logger.info("Repositorio: " + responseRepository);
        return StreamSupport.stream(responseRepository.findAll().spliterator(), false).toList();
    }

    @Override
    public void updateAnswer(String response)
    {
        Long answer;
        List<ResponseTable> oldValues = this.getResponses();
        if(response == "Yes")
        {
            answer = (long) oldValues.get(0).getLong();
        }
        else{
            answer = (long) oldValues.get(0).getLong();
        }

        jdbcTemplate.update("UPDATE RESPONSE SET ANSWER = ? WHERE OPTIONS = ?", 
        answer,response);  
    }

    // inner-join
	@Override
	public List<VoteInfoTable> getInfoVotes(String option) {

		String query=
				"SELECT RESPONSE.OPTIONS, USER.NAME1, USER.SURNAME1 FROM USER WHERE RESPONSE.OPTIONS == '" + option + "' INNER JOIN RESPONSE ON RESPONSE.OPTIONS=USER.OPTIONS;";

		List<VoteInfoTable> infoList = jdbcTemplate.query(
				query,
				(rs, rowNum) ->
						new VoteInfoTable(
                            rs.getString("OPTIONS"),
                            rs.getString("NAME1"),
                            rs.getString("SURNAME1")
                        )
		);
		return infoList;
	}

    

    // SHOP

    @Override
    public List<ShopTable> getShop() {
        return StreamSupport.stream(shopRepository.findAll().spliterator(), false).toList();
    }

    @Override
    public boolean deleteItem(String item) {
        String sql = "DELETE FROM SHOP WHERE ITEM = ?";
        Object[] args = new Object[] {item};

        return jdbcTemplate.update(sql, args) == 1;
    }

    // PURCHASE
    @Override
    public List<PurchaseTable> getPurchases() {
        return StreamSupport.stream(purchaseRepository.findAll().spliterator(), false).toList();
    }

    // inner-join
	@Override
	public List<PurchaseInfoTable> getPurchaseInfo(String name, String surname) {

		String query=
				"SELECT PURCHASE.U_NAME1, PURCHASE.U_SURNAME1, PURCHASE.ID, SHOP.ITEM, SHOP.PRICE FROM PURCHASE WHERE PURCHASE.U_NAME1 == '" + name + "' AND PURCHASE.U_SURNAME1 == '" +  surname + "' INNER JOIN SHOP ON PURCHASE.ID=SHOP.ID;";

		List<PurchaseInfoTable> purchaseList = jdbcTemplate.query(
				query,
				(rs, rowNum) ->
						new PurchaseInfoTable(
								rs.getString("U_NAME1"),
								rs.getString("U_SURNAME1"),
                                rs.getLong("ID"),
								rs.getString("ITEM"),
								rs.getBigDecimal("PRICE") 
                                )
		);
		return purchaseList;
	}

    
}
