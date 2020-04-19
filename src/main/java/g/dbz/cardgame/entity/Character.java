package g.dbz.cardgame.entity;

import java.util.List;

import g.dbz.cardgame.enumerator.Art;
import g.dbz.cardgame.enumerator.Color;
import g.dbz.cardgame.enumerator.Morality;
import g.dbz.cardgame.enumerator.Species;

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
	protected Art art;
	protected Color color;
	protected Species species;
	protected List<Move> moves;
	protected List<Card> cards;
	protected List<Item> items;
	protected Morality morality;

	public Character(String name, Integer str, Integer dex, Integer intel, Integer cha, Integer endr, Integer ki,
			Integer hp, Integer atk, Integer def, Integer spd, Integer btlKi, Art art, Color color, Species species,
			Morality morality) {
		this.name = name;
		this.str = str;
		this.dex = dex;
		this.intel = intel;
		this.cha = cha;
		this.endr = endr;
		this.ki = ki;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.spd = spd;
		this.btlKi = btlKi;
		this.art = art;
		this.color = color;
		this.species = species;
		this.morality = morality;
	}

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

	public Art getArt() {
		return art;
	}

	public void setArt(Art art) {
		this.art = art;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
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

	public Morality getMorality() {
		return morality;
	}

	public void setMorality(Morality morality) {
		this.morality = morality;
	}

}
