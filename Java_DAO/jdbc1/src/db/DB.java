package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

	private static Connection conn = null;
	
	//Método getConnection padrão
	public static Connection getConnection() {
		if(conn == null) {
			try {
				//Ler o arquivo properties
			Properties props = loadProperties();
			String url = props.getProperty("dburl");
			//Save da conexão
			conn = DriverManager.getConnection(url,props);
			}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	return conn;
	}
	
	//Método closeConnection -> encerrar conexão
	public static void closeConnection() {
		if(conn!=null) {
			try {
			conn.close();
		}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		
	}
	
	
	//Método para ler o arquivo db.properties
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		}
		catch(IOException e) {
			throw new DbException(e.getMessage());
		}
	}
	
}
