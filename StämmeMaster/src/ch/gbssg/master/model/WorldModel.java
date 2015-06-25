package ch.gbssg.master.model;

import java.util.ArrayList;

public class WorldModel {
	private static int id_m=0;
	private int worldId_m;
	private String worldName_m;
	private ArrayList<PlayerModel> player_m;

	public WorldModel(String name){
		this.setWorldId_m(id_m);
		this.setWorldName_m(name);
		id_m++;
	}
	
	public WorldModel(String name,ArrayList<PlayerModel> player){
		this.setWorldId_m(id_m);
		this.setWorldName_m(name);
		this.setPlayer_m(player);
		id_m++;
	}

	public int getWorldId_m() {
		return worldId_m;
	}

	public void setWorldId_m(int worldId_m) {
		this.worldId_m = worldId_m;
	}

	public String getWorldName_m() {
		return worldName_m;
	}

	public void setWorldName_m(String worldName_m) {
		this.worldName_m = worldName_m;
	}

	public ArrayList<PlayerModel> getPlayer_m() {
		return player_m;
	}

	public void setPlayer_m(ArrayList<PlayerModel> player_m) {
		this.player_m = player_m;
	}
}

