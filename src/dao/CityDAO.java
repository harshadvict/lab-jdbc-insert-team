package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.*;
import utility.ConnectionManager;


public class CityDAO{
	public City getCityByName(String name) throws ClassNotFoundException, SQLException {
		ConnectionManager conn=new ConnectionManager();
		Connection con=conn.getConnection();
		
		String sql="select city_id,city_name from city1 where city_name=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setString(1,name);
		ResultSet rst=stmt.executeQuery();
		System.out.println("Id\t\tcity_id\t\tcity_name\n");
		while(rst.next()) {
            System.out.print(rst.getLong(1));
            System.out.print("\t\t"+rst.getString(2));
            System.out.println();
         }
		return null;
	}
	public void createCity() {
		
	}
}
