package com.example.longdungeon.classes;

import java.util.ArrayList;

public class Player 
{
	
	private String Name;
	private  ArrayList <Consumable> potions;
	//these are the magic, stamina and health potions,
	// which restore points to the cur values for those stats
	private int score;
	private int XP;
	private int gold;
	private int maxHp;
	private int curHp;	
	private int maxStm;
	private int curStm;
	private int maxMgk;
	private int curMgk;
	private int def;
	private int atk;
	private ArrayList <Equipment> armsAndArmor;//this is all the extra equipment you own
	private Equipment curArmor;//equipped armor 
	private Weapon curWeapon;//the weapon equipped determines physical attacks
	private Equipment curShield;
	private Spell spell1;//you have 3 available spell slots, each gives an attack, heal or buff
	private Spell spell2;
	private Spell spell3;
	private Equipment curRing;
	
	public Player()
	{}
	
	public Player(String newName)
	{
		setName(newName);
		setScore(0);
		setXP(0);
		setGold(100);
		
		setMaxHp(120);
		setCurHp(120);
		setMaxStm(100);
		setCurStm(100);
		setMaxMgk(60);
		setCurMgk(60);
		setDef(40);
		setAtk(35);
		setCurArmor(new Equipment("Knight's Armor","The full suit of armor of a chivalrous knight",50,0,10));
		setCurWeapon(new Weapon("Short Sword","The basic adventuring sword",0,0,0,"Slash",15,10,"Thrust",20,15,"Helm Splitter",60,50));
		setCurShield(new Equipment("Star Shield","The shining star on the front is said to bring luck to adventurers",15,0,0));
		setSpell1(new Spell("fireball", "a mystical ball of flame that burns one's foes",25,0,0,15));
		setCurRing(new Equipment("Old Copper Ring","a worn old copper ring that is warm to the touch",4,0,15));
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getXP() {
		return XP;
	}

	public void setXP(int xP) {
		XP = xP;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getCurHp() {
		return curHp;
	}

	public void setCurHp(int curHp) {
		this.curHp = curHp;
	}

	public int getMaxStm() {
		return maxStm;
	}

	public void setMaxStm(int maxStm) {
		this.maxStm = maxStm;
	}

	public int getCurStm() {
		return curStm;
	}

	public void setCurStm(int curStm) {
		this.curStm = curStm;
	}

	public int getMaxMgk() {
		return maxMgk;
	}

	public void setMaxMgk(int maxMgk) {
		this.maxMgk = maxMgk;
	}

	public int getCurMgk() {
		return curMgk;
	}

	public void setCurMgk(int curMgk) {
		this.curMgk = curMgk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public ArrayList <Equipment> getArmsAndArmor() {
		return armsAndArmor;
	}

	public void setArmsAndArmor(ArrayList <Equipment> armsAndArmor) {
		this.armsAndArmor = armsAndArmor;
	}

	public Equipment getCurArmor() {
		return curArmor;
	}

	public void setCurArmor(Equipment curArmor) {
		this.curArmor = curArmor;
	}

	public Weapon getCurWeapon() {
		return curWeapon;
	}

	public void setCurWeapon(Weapon curWeapon) {
		this.curWeapon = curWeapon;
	}

	public Equipment getCurShield() {
		return curShield;
	}

	public void setCurShield(Equipment curShield) {
		this.curShield = curShield;
	}

	public Spell getSpell1() {
		return spell1;
	}

	public void setSpell1(Spell spell1) {
		this.spell1 = spell1;
	}

	public Spell getSpell2() {
		return spell2;
	}

	public void setSpell2(Spell spell2) {
		this.spell2 = spell2;
	}

	public Spell getSpell3() {
		return spell3;
	}

	public void setSpell3(Spell spell3) {
		this.spell3 = spell3;
	}

	public Equipment getCurRing() {
		return curRing;
	}

	public void setCurRing(Equipment curRing) {
		this.curRing = curRing;
	}

	public ArrayList <Consumable> getPotions() {
		return potions;
	}

	public void setPotions(ArrayList <Consumable> potions) {
		this.potions = potions;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	

}
