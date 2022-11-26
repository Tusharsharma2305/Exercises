package Exercise;

import java.sql.*;

public class CP {
	static Connection con;

	public static Connection createc() {

		try {

			// load the driver
			Class.forName("org.postgresql.Driver");
			// create the Connection
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/studentdb", "postgres", "Password");
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}
}

