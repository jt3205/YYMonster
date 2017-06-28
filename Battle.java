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
			mst.����();
		} else if (mon == 2) {
			mst.����();
		} else if (mon == 3) {
			mst.��();
		}
	}

	public void battle() {
		Battle_Start();
		System.out.println("�;�! �߻� " + mst.MonName + "�� Ƣ��Դ�!");
		System.out.println("");
		Turn();
	}

	public void Turn() {
		System.out.println("����! �뼷��!");
		Functions.sleep1500();
		while (true) {
			Fight();
			System.out.println();
			if (mst.HP2 <= 0) {
				System.out.println(mst.MonName + "�� ��������!");
				break;
			}
			MonTurn();
			System.out.println();
		}
	}

	public void Fight() {
		int user;
		while (true) {
			System.out.println("�뼷�� HP : " + mst.HP + "/" + mst.FullHP);
			System.out.println(mst.MonName + " HP : " + mst.HP2 + "/" + mst.FullHP2);
			System.out.println();
			System.out.println("������ �ұ�?");
			System.out.println("1. �ο��");
			user = scanner.nextInt();
			if (user == 1)
				break;
		}
		while (true) {
			System.out.println("1. ���� �Ÿ��� 2. ���� ���ñ�");
			System.out.println("3. ȭ�� ���");
			user = scanner.nextInt();
			if (user == 1) {
				System.out.println("�뼷���� ���� �Ÿ���!!");
				Functions.sleep1000();
				System.out.println("��...��..C�� ����µ�...");
				Functions.sleep1000();
				System.out.println(mst.MonName + "�� ���ݷ��� ��������!");
				Functions.sleep1500();
				mst.damage2 -= 1;
				break;
			} else if (user == 2) {
				System.out.println("�뼷���� ���� ���ñ�!!");
				Functions.sleep1000();
				System.out.println("���ķ� �ķ��!!");
				Functions.sleep1000();
				int i = random.nextInt(5) + 10;
				System.out.println("�뼷���� ü���� " + i + " ȸ�� �Ǿ���!");
				Functions.sleep1500();
				mst.HP += i;
				break;
			} else if (user == 3) {
				System.out.println("�뼷���� ȭ�� ���!!");
				Functions.sleep1000();
				System.out.println("��ζ�󰡤���!!!");
				Functions.sleep1000();
				int i = random.nextInt(7) + 6;
				System.out.println(mst.MonName + "�� " + i + "�� �������� �Ծ���!");
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
				System.out.println("������ �߾� ���!!");
				Functions.sleep1000();
				System.out.println("�츮�������̿� ���̟���!! �츮�����̿� ��ƾƾƶ�!!");
				Functions.sleep1000();
				int j = random.nextInt(4) + 6;
				mst.HP -= j;
				System.out.println("�뼷�̴� " + j + "�� �������� �Ծ���!");
				Functions.sleep1000();
				mst.damage -= 1;
				System.out.println("�뼷���� ���ݷ��� ��������!");
				Functions.sleep1500();
			} else if (i == 2) {
				System.out.println("������ ����!!");
				Functions.sleep1000();
				System.out.println("�� �׷��� ��¥����!! �� ���� �� ����!!");
				Functions.sleep1000();
				System.out.println("�׷��� �ƹ��ϵ� �Ͼ�� �ʾҴ�.");
				Functions.sleep1500();
			}
		} else if (mst.MonNum == 2) {
			int i = random.nextInt(3) + 1;
			if (i == 1) {
				System.out.println("������ ���帳!!");
				Functions.sleep1000();
				System.out.println("�ڹٸ� �ڹ� !! ������������");
				Functions.sleep1000();
				int j = random.nextInt(10) + 6;
				System.out.println("�뼷�̴� " + j + "�� �������� �Ծ���!");
				Functions.sleep1500();
			} else if (i == 2) {
				System.out.println("������ ����������!!");
				Functions.sleep1000();
				System.out.println("�ݶ�.. ��... ���ڿ���..");
				Functions.sleep1000();
				int j = random.nextInt(5) + 10;
				if (mst.FullHP2 - mst.HP2 < j) {
					j = mst.FullHP2 - mst.HP2;
				}
				mst.HP2 += j;
				System.out.println("������ ü���� " + j + "��ŭ ȸ���Ǿ���!");
				Functions.sleep1500();
			} else if (i == 3) {
				System.out.println("������ �߼��б�!!");
				Functions.sleep1000();
				System.out.println("... ... ... ...");
				Functions.sleep1000();
				System.out.println("�׷��� �ƹ��ϵ� �Ͼ�� �ʾҴ�..");
				Functions.sleep1000();
			}
		} else if (mst.MonNum == 3) {
			System.out.println("���� ���� �����ִ�...");
			Functions.sleep1500();
			if (mst.FullHP2 > mst.HP2) {
				int j = 5;
				if (mst.FullHP2 - mst.HP2 < j) {
					j = mst.FullHP2 - mst.HP2;
				}
				mst.HP2 += j;
				System.out.println("���� ü���� " + j + "��ŭ ȸ���Ǿ���!");
				Functions.sleep1500();
			}
		}
	}

}
