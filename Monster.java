package Project1_YYMonster;
import java.util.*;

public class Monster {
	static Random random = new Random();
	static int level;
	static int HP;
	static String FullHP;
	static int damage;
	static int EXP;
	static int FullEXP;
	
	static int MonNum;
	static String MonName;
	static int level2;
	static int HP2;
	static int FullHP2;
	static int damage2;

	Monster() {
		level = 5;
		FullHP = "¡Ä";
		HP = 6 + (level * 3);
		damage = level * 2;
		EXP = 0;
		FullEXP = level * 3;
	}

	public static void Á¾¾ó() {
		level2 = random.nextInt(4) + 2;
		HP2 = 6 + level2 * 3;
		FullHP2 = HP2;
		damage2 = level2 * 2;
		MonName = "Á¾¾ó";
		MonNum = 1;
	}

	public static void µ¢±¹() {
		level2 = random.nextInt(3) + 4;
		HP2 = 6 + level2 * 3;
		damage2 = level2 * 3;
		MonName = "µ¢±¹";
		FullHP2 = HP2;
		MonNum = 2;
	}
	
	public static void »ó¿·() {
		level2 = random.nextInt(4) + 2;
		HP2 = 6 + level2 * 3;
		FullHP2 = HP2;
		damage2 = level2 * 3;
		MonName = "»ó¿·";
		MonNum = 3;
	}
}
