package com.alexnikollaj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Datasource {

    public static final String DB_NAME = "characters";

    Connection conn = null;
         {
        try {
            conn =
                    DriverManager.getConnection("jdbc:sqlite:C:\\\\Users\\\\Alex\\\\Desktop\\\\JavaPrograms\\\\JavaTestTechChallenge\\" + DB_NAME);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Do something with the Connection

    } SQLException ex; {
        // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }

}
