# study_orm
Spring Data JPA 강의 - 관계형 데이터 베이스와 자바 

* 관계형 데이터 베이스와 자바
    * JDBC
        * DataSource / DriverManager
        * Connection
        * PreparedStatement
    * SQL
        * DDL
        * DML
    * 무엇이 문제인가 ?
        * SQL을 실행하는 비용이 비싸다.
        * SQL 이 데이터베이스 마다 다르다.
        * 스키마를 바꿧더니 코드의 변경이 많다.
        * 반복적인 코드가 많다.
        * 불필요한 데이터를 다 읽어와야 하는지 ?