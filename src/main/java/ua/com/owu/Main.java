package ua.com.owu;


import java.sql.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/update15",
               "root",
                "Roman22520");

        PreparedStatement preparedStatement = connection.prepareStatement("insert into contact(name) values ('Nadja');");
        preparedStatement.executeUpdate();

        PreparedStatement ps = connection.prepareStatement("select * from update15.contact");
        ResultSet resultSet = ps.executeQuery();
        ArrayList<Contact> list = new ArrayList<>();

        while (resultSet.next()) {
            list.add( new Contact(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("email")));
            System.out.println(list);

        }
//        System.out.println(
//                list.stream()
//                .filter(contact -> contact.getEmail().startsWith("t"))
//                .collect(Collectors.toList()));


    }



}
