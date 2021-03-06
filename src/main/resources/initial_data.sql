-- Insertando valores iniciales en cada tabla

-- USER
INSERT INTO USER(NAME1,SURNAME1,VISIT_DATE,OPTIONS) VALUES ('Emilio Kenji','Hernandez Kuramata','2022-04-12','Yes');
INSERT INTO USER(NAME1,SURNAME1,VISIT_DATE,OPTIONS) VALUES ('Antonio','Hernandez Kuramata','2022-04-17','Yes');
INSERT INTO USER(NAME1,SURNAME1,VISIT_DATE,OPTIONS) VALUES ('Pepe','Pepito','2021-03-12','No');
INSERT INTO USER(NAME1,SURNAME1,VISIT_DATE,OPTIONS) VALUES ('Pedro','Sanchez','2020-12-21','No');
INSERT INTO USER(NAME1,SURNAME1,VISIT_DATE,OPTIONS) VALUES ('Mortadelo','De La Mancha','2022-04-12',null);

-- RESPONSE
INSERT INTO RESPONSE(OPTIONS,ANSWER) VALUES ('Yes',2);
INSERT INTO RESPONSE(OPTIONS,ANSWER) VALUES ('No',2);

-- SHOP
INSERT INTO SHOP(ID,ITEM,PRICE,QUANTITY,SOLD) VALUES (1,'Taza de Cafe', 19, 20, 0);
INSERT INTO SHOP(ID,ITEM,PRICE,QUANTITY,SOLD) VALUES (2,'Descuento 50% Amazon', 992, 5, 0);
INSERT INTO SHOP(ID,ITEM,PRICE,QUANTITY,SOLD) VALUES (3,'Objeto Secreto', 999, 0, 1);
INSERT INTO SHOP(ID,ITEM,PRICE,QUANTITY,SOLD) VALUES (4,'Curso Gratis de PAT', 0, 1, 0);


-- PURCHASE
INSERT INTO PURCHASE(ID,U_NAME1,U_SURNAME1) VALUES (1, 'Emilio Kenji', 'Hernandez Kuramata');
INSERT INTO PURCHASE(ID,U_NAME1,U_SURNAME1) VALUES (2, 'Antonio', 'Hernandez Kuramata');
INSERT INTO PURCHASE(ID,U_NAME1,U_SURNAME1) VALUES (2, 'Antonio', 'Hernandez Kuramata');
INSERT INTO PURCHASE(ID,U_NAME1,U_SURNAME1) VALUES (2, 'Pedro', 'Sanchez');