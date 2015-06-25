package ch.gbssg.master.model;

import java.util.ArrayList;

public class PlayerModel {
	static int id_m=0;
	private int playerId_m;
	private String playerName_m;
	private int points_m;
	private ArrayList<TownModel> towns_m;
	
	public PlayerModel(String playerName, int points, ArrayList<TownModel> towns){
		this.setPlayerId_m(id_m);
		this.setPlayerName_m(playerName);
		this.setPoints_m(points);
		id_m++;
	}

	public int getPlayerId_m() {
		return playerId_m;
	}

	public void setPlayerId_m(int playerId_m) {
		this.playerId_m = playerId_m;
	}

	public String getPlayerName_m() {
		return playerName_m;
	}

	public void setPlayerName_m(String playerName_m) {
		this.playerName_m = playerName_m;
	}

	public int getPoints_m() {
		return points_m;
	}

	public void setPoints_m(int points_m) {
		this.points_m = points_m;
	}

	public ArrayList<TownModel> getTowns_m() {
		return towns_m;
	}

	public void setTowns_m(ArrayList<TownModel> towns_m) {
		this.towns_m = towns_m;
	}
}
