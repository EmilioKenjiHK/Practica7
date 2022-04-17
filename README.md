# Practica 7: Persistencia con Queries

## Emilio Kenji Hernández Kuramata


### Enunciado

Desarrollo de una App de Spring Boot que incluya una funcionalidad que permita persistir información utilizando la librería Spring Data JDBC con una base de datos H2.

El módulo de persistencia debe incluir las operaciones (INSERT, UPDATE, SELECT y DELETE)

Las operaciones debe de incluir como mínimo dos operaciones “JOINS” utilizando la anotación @Query.


### Método

 A partir de la teoría y de los ejemplos subidos en https://github.com/gitt-3-pat/ejemplos-2022/tree/main/tema-10 , aplicaré el código necesario.

 

### Contenido (Requerido)

Mi site contiene lo siguiente (todo se encuentra en MyService.java):

1) INSERT: newUser(String  name, String  surname, LocalDate  date)

2) UPDATE: updateAnswer(String  response)

3) SELECT: getResponses(), getUsers(), getShop() y getPurchases()

4) DELETE: deleteItem(String  item)

5) 2 operaciones "JOINS":  getInfoVotes(String  option) y getPurchaseInfo(String  name, String  surname)

He podido aplicar tests para los SELECTs

  
### Contenido (Extra)

Como extra, he intentado establecer una interacción front-end que tiene una dirección diferente del que se encuentra la base de datos mediante un CORS proxy (aunque no he podido hacer que funcione como debería)

### Todo se puede comprobar en mi Github page de esta práctica:

https://github.com/EmilioKenjiHK/Practica7