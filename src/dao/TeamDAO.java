package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.*;
import utility.*;
public class TeamDAO{
	public void createTeam(Team team) throws SQLException, ClassNotFoundException {
		
		ConnectionManager obj=new ConnectionManager();
		Connection con=obj.getConnection();
		
		System.out.println("loading data in database");
		
		String sql="Insert into team1(name,coach,city_id)values(?,?,?)";
		String sql1="Insert into city1(city_id,city_name)values(?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		//printing for checking purpose
		System.out.println(team.getName());
		st.setString(1,team.getName());
		//printing for checking purpose
		System.out.println(team.getCoach());
		st.setString(2,team.getCoach());
		st.setLong(3, team.getCity().getCityId());
		st.executeUpdate();
		PreparedStatement st1=con.prepareStatement(sql1);
		st1.setLong(1, team.getCity().getCityId());
		st1.setString(2,team.getCity().getCityName());
		st1.executeUpdate();
		//successful message
		System.out.println("loading data in database");
		con.close();
	}
}
