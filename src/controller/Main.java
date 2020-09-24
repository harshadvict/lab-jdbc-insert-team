package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.*;
import model.City;
import model.Team;
class Main{
	public static void  main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		TeamDAO team=new TeamDAO();
		CityDAO city=new CityDAO();
		
		boolean value=true;
		while(value) {
			
	    System.out.println("1.enter the data in the team and city table \t 2.enter the city name to be searched");
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int choice=Integer.parseInt(br.readLine());
		//input from the user
		switch (choice){
		case 1:
		
		System.out.println("please enter the team name");
		String teamname=br.readLine();
		System.out.println("please enter the coach name");
		String coachname=br.readLine();
		System.out.println("please enter the city id");
		Long cityId=Long.parseLong(br.readLine());
		System.out.println("please enter the city name");
		String cityName=br.readLine();
		
		
		City cityModel= new City(cityId, cityName);
		Team teamModel=new Team(teamname, coachname, cityModel);
		
		
		//calling class teamDAO method createTeam
		team.createTeam(teamModel);
		break;
		
		case 2:
		System.out.println("enter the city name to be searched");
		String name=br.readLine();
		city.getCityByName(name);
		break;
		default: value=false;
		}
		}
	}
}
