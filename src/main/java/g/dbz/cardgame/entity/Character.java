package g.dbz.cardgame.entity;

import java.util.List;

public class Character {

	protected String name;
// SDICE
	protected Integer str;
	protected Integer dex;
	protected Integer intel;
	protected Integer cha;
	protected Integer endr;
	protected Integer ki;
//
//BATTLE STATS
	protected Integer hp;
	protected Integer atk;
	protected Integer def;
	protected Integer spd;
	protected Integer btlKi;
//
	protected String art;
	protected String color;
	protected String species;
	protected List<Move> moves;
	protected List<Card> cards;
	protected List<Item> items;
	protected String morality;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStr() {
		return str;
	}

	public void setStr(Integer str) {
		this.str = str;
	}

	public Integer getDex() {
		return dex;
	}

	public void setDex(Integer dex) {
		this.dex = dex;
	}

	public Integer getIntel() {
		return intel;
	}

	public void setIntel(Integer intel) {
		this.intel = intel;
	}

	public Integer getCha() {
		return cha;
	}

	public void setCha(Integer cha) {
		this.cha = cha;
	}

	public Integer getEndr() {
		return endr;
	}

	public void setEndr(Integer endr) {
		this.endr = endr;
	}

	public Integer getKi() {
		return ki;
	}

	public void setKi(Integer ki) {
		this.ki = ki;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getAtk() {
		return atk;
	}

	public void setAtk(Integer atk) {
		this.atk = atk;
	}

	public Integer getDef() {
		return def;
	}

	public void setDef(Integer def) {
		this.def = def;
	}

	public Integer getSpd() {
		return spd;
	}

	public void setSpd(Integer spd) {
		this.spd = spd;
	}

	public Integer getBtlKi() {
		return btlKi;
	}

	public void setBtlKi(Integer btlKi) {
		this.btlKi = btlKi;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public String getColor() {
		return color;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Move> getMoves() {
		return moves;
	}

	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getMorality() {
		return morality;
	}

	public void setMorality(String morality) {
		this.morality = morality;
	}

}
