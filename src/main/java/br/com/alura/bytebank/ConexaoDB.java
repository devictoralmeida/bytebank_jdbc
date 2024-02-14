package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    public static void main(String... x) {
        // Vamos nos conectar ao BD, você deve passar a url dentro dos parênteses
        try {
            // Abrindo a conexão
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bytebank-db?user=victor&password=200694");
            System.out.println("Recuperei a conexão");
            // Fechando a conexão
            connection.close();
        } catch (SQLException exception) {
            System.out.println(exception);
        }
    }
}
