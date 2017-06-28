package Project1_YYMonster;
import java.util.*;

public class Battle {

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	Monster mst = new Monster();

	Battle() {

	}

	public void Battle_Start() {
		int mon = random.nextInt(3) + 1;
		if (mon == 1) {
			mst.종얼();
		} else if (mon == 2) {
			mst.덩국();
		} else if (mon == 3) {
			mst.상옆();
		}
	}

	public void battle() {
		Battle_Start();
		System.out.println("와앗! 야생 " + mst.MonName + "이 튀어나왔다!");
		System.out.println("");
		Turn();
	}

	public void Turn() {
		System.out.println("가라! 흙섭이!");
		Functions.sleep1500();
		while (true) {
			Fight();
			System.out.println();
			if (mst.HP2 <= 0) {
				System.out.println(mst.MonName + "은 쓰러졌다!");
				break;
			}
			MonTurn();
			System.out.println();
		}
	}

	public void Fight() {
		int user;
		while (true) {
			System.out.println("흙섭이 HP : " + mst.HP + "/" + mst.FullHP);
			System.out.println(mst.MonName + " HP : " + mst.HP2 + "/" + mst.FullHP2);
			System.out.println();
			System.out.println("무엇을 할까?");
			System.out.println("1. 싸운다");
			user = scanner.nextInt();
			if (user == 1)
				break;
		}
		while (true) {
			System.out.println("1. 흙흙 거리기 2. 국수 마시기");
			System.out.println("3. 화염 방사");
			user = scanner.nextInt();
			if (user == 1) {
				System.out.println("흙섭이의 흙흙 거리기!!");
				Functions.sleep1000();
				System.out.println("흙...흙..C언어도 배웠는데...");
				Functions.sleep1000();
				System.out.println(mst.MonName + "의 공격력이 내려갔다!");
				Functions.sleep1500();
				mst.damage2 -= 1;
				break;
			} else if (user == 2) {
				System.out.println("흙섭이의 국수 마시기!!");
				Functions.sleep1000();
				System.out.println("흙후룩 후루룩!!");
				Functions.sleep1000();
				int i = random.nextInt(5) + 10;
				System.out.println("흙섭이의 체력이 " + i + " 회복 되었다!");
				Functions.sleep1500();
				mst.HP += i;
				break;
			} else if (user == 3) {
				System.out.println("흙섭이의 화염 방사!!");
				Functions.sleep1000();
				System.out.println("흙로라라가ㅏ라각!!!");
				Functions.sleep1000();
				int i = random.nextInt(7) + 6;
				System.out.println(mst.MonName + "은 " + i + "의 데미지를 입었다!");
				Functions.sleep1500();
				mst.HP2 -= i;
				break;
			}
		}
	}

	public void MonTurn() {
		if (mst.MonNum == 1) {
			int i = random.nextInt(2) + 1;
			if (i == 1) {
				System.out.println("종얼의 발암 기억!!");
				Functions.sleep1000();
				System.out.println("우리으이이이에 미이읻음!! 우리으이이에 사아아아랑!!");
				Functions.sleep1000();
				int j = random.nextInt(4) + 6;
				mst.HP -= j;
				System.out.println("흙섭이는 " + j + "의 데미지를 입었다!");
				Functions.sleep1000();
				mst.damage -= 1;
				System.out.println("흙섭이의 공격력이 내려갔다!");
				Functions.sleep1500();
			} else if (i == 2) {
				System.out.println("종얼의 협박!!");
				Functions.sleep1000();
				System.out.println("너 그러다 진짜뒤져!! 또 ㅈㄹ 또 ㅈㄹ!!");
				Functions.sleep1000();
				System.out.println("그러나 아무일도 일어나지 않았다.");
				Functions.sleep1500();
			}
		} else if (mst.MonNum == 2) {
			int i = random.nextInt(3) + 1;
			if (i == 1) {
				System.out.println("덩국의 개드립!!");
				Functions.sleep1000();
				System.out.println("자바를 자바 !! ㅋㅋㅋㅋㅋㅋ");
				Functions.sleep1000();
				int j = random.nextInt(10) + 6;
				System.out.println("흙섭이는 " + j + "의 데미지를 입었다!");
				Functions.sleep1500();
			} else if (i == 2) {
				System.out.println("덩국의 편의점가기!!");
				Functions.sleep1000();
				System.out.println("콜라.. 빵... 초코우유..");
				Functions.sleep1000();
				int j = random.nextInt(5) + 10;
				if (mst.FullHP2 - mst.HP2 < j) {
					j = mst.FullHP2 - mst.HP2;
				}
				mst.HP2 += j;
				System.out.println("덩국의 체력이 " + j + "만큼 회복되었다!");
				Functions.sleep1500();
			} else if (i == 3) {
				System.out.println("덩국의 야설읽기!!");
				Functions.sleep1000();
				System.out.println("... ... ... ...");
				Functions.sleep1000();
				System.out.println("그러나 아무일도 일어나지 않았다..");
				Functions.sleep1000();
			}
		} else if (mst.MonNum == 3) {
			System.out.println("상옆은 쿨쿨 잠들어있다...");
			Functions.sleep1500();
			if (mst.FullHP2 > mst.HP2) {
				int j = 5;
				if (mst.FullHP2 - mst.HP2 < j) {
					j = mst.FullHP2 - mst.HP2;
				}
				mst.HP2 += j;
				System.out.println("상옆의 체력이 " + j + "만큼 회복되었다!");
				Functions.sleep1500();
			}
		}
	}

}
