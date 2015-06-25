package ch.gbssg.master.model;


public class TownModel {
	private static int  id_m;
	private int         townId_m;
	private String      townName_m;
	private int         points_m;
	private int		    spearCount_m;
	private int         swordCount_m;
	private int         archerCount_m;
	private int         axeCount_m;
	private int         spyCount_m;
	private int         lightCavalryCount_m;
	private int         heavyCavalryCount_m;
	private int         mountedArcherCount_m;
	private int 		wallLevel_m;
	private boolean     offTown_m;


	public TownModel(){
		id_m++;
		this.setTownId_m(id_m);
		this.setTownName_m("");
		this.setPoints_m(0);
		this.setSpearCount_m(0);
		this.setSwordCount_m(0);
		this.setArcherCount_m(0);
		this.setAxeCount_m(0);
		this.setSpyCount_m(0);
		this.setLightCavalryCount_m(0);
		this.setHeavyCavalryCount_m(0);
		this.setMountedArcherCount_m(0);
		this.setWallLevel_m(0);
		this.setOffTown_m(false);
	}
	
	public TownModel(String townName,int points,int spearCount,int swordCount,int archerCount,
					 int axeCount,int spyCount,int lightCavalryCount,int heavyCavalryCount,
					 int mountedArcherCount,int wallLevel,boolean offTown){
		id_m++;
		this.setTownId_m(id_m);
		this.setTownName_m(townName);
		this.setPoints_m(points);
		this.setSpearCount_m(spearCount);
		this.setSwordCount_m(swordCount);
		this.setArcherCount_m(archerCount);
		this.setAxeCount_m(axeCount);
		this.setSpyCount_m(spyCount);
		this.setLightCavalryCount_m(lightCavalryCount);
		this.setHeavyCavalryCount_m(heavyCavalryCount);
		this.setMountedArcherCount_m(mountedArcherCount);
		this.setWallLevel_m(wallLevel);
		this.setOffTown_m(offTown);
	}
	
	/* getter und setter */
	public void setAllData(String townName,int points,int spearCount,int swordCount,int archerCount,
			 int axeCount,int spyCount,int lightCavalryCount,int heavyCavalryCount,
			 int mountedArcherCount,int wallLevel,boolean offTown){
		this.setTownId_m(id_m);
		this.setTownName_m(townName);
		this.setPoints_m(points);
		this.setSpearCount_m(spearCount);
		this.setSwordCount_m(swordCount);
		this.setArcherCount_m(archerCount);
		this.setAxeCount_m(axeCount);
		this.setSpyCount_m(spyCount);
		this.setLightCavalryCount_m(lightCavalryCount);
		this.setHeavyCavalryCount_m(heavyCavalryCount);
		this.setMountedArcherCount_m(mountedArcherCount);
		this.setWallLevel_m(wallLevel);
		this.setOffTown_m(offTown);
	}

	public int getTownId_m() {
		return townId_m;
	}

	public void setTownId_m(int townId_m) {
		this.townId_m = townId_m;
	}

	public String getTownName_m() {
		return townName_m;
	}

	public void setTownName_m(String townName_m) {
		this.townName_m = townName_m;
	}

	public int getPoints_m() {
		return points_m;
	}

	public void setPoints_m(int points_m) {
		this.points_m = points_m;
	}

	public int getSpearCount_m() {
		return spearCount_m;
	}

	public void setSpearCount_m(int spearCount_m) {
		this.spearCount_m = spearCount_m;
	}

	public int getSwordCount_m() {
		return swordCount_m;
	}

	public void setSwordCount_m(int swordCount_m) {
		this.swordCount_m = swordCount_m;
	}

	public int getArcherCount_m() {
		return archerCount_m;
	}

	public void setArcherCount_m(int archerCount_m) {
		this.archerCount_m = archerCount_m;
	}

	public int getAxeCount_m() {
		return axeCount_m;
	}

	public void setAxeCount_m(int axeCount_m) {
		this.axeCount_m = axeCount_m;
	}

	public int getSpyCount_m() {
		return spyCount_m;
	}

	public void setSpyCount_m(int spyCount_m) {
		this.spyCount_m = spyCount_m;
	}

	public int getLightCavalryCount_m() {
		return lightCavalryCount_m;
	}

	public void setLightCavalryCount_m(int lightCavalryCount_m) {
		this.lightCavalryCount_m = lightCavalryCount_m;
	}

	public int getHeavyCavalryCount_m() {
		return heavyCavalryCount_m;
	}

	public void setHeavyCavalryCount_m(int heavyCavalryCount_m) {
		this.heavyCavalryCount_m = heavyCavalryCount_m;
	}

	public int getMountedArcherCount_m() {
		return mountedArcherCount_m;
	}

	public void setMountedArcherCount_m(int mountedArcherCount_m) {
		this.mountedArcherCount_m = mountedArcherCount_m;
	}

	public int getWallLevel_m() {
		return wallLevel_m;
	}

	public void setWallLevel_m(int wallLevel_m) {
		this.wallLevel_m = wallLevel_m;
	}

	public boolean isOffTown_m() {
		return offTown_m;
	}

	public void setOffTown_m(boolean offTown_m) {
		this.offTown_m = offTown_m;
	}
}
