package Project1_YYMonster;
import java.util.*;

public class Story {
	String name;
	String friend;

	Story() {
		breek2 = false;
		breek3 = false;
	}

	Random random = new Random();
	Monster mst = new Monster();

	public void intro1() {
		System.out.println("����!!");
		Functions.sleep500();
		System.out.println("�߿Դ�!");
		Functions.sleep1000();
		System.out.println("�翵������ ���迡 �� ����");
		Functions.sleep1000();
		System.out.println("ȯ���Ѵ�!");
		Functions.sleep1500();
		System.out.println("�� �̸��� ���ڻ�!");
		Functions.sleep1000();
		System.out.println("��ΰ�");
		Functions.sleep500();
		System.out.println("�ڹ� �������̶� �θ����ִܴ�");
		Functions.sleep1500();
		System.out.println("�װ� �׷��� �ڳ״�");
		Functions.sleep1000();
		System.out.println("������ ó���ΰհ�?");
		Functions.sleep1500();
		System.out.println("�׷� ����");
		Functions.sleep500();
		System.out.println("�̰����� �������ָ�!");
		Functions.sleep1500();
		System.out.println("�˰� ������ �����ΰ�?");
		Functions.sleep1500();
	}

	public void intro1_choice() {
		System.out.println("1. ���� ����̶�?");
		Functions.sleep300();
		System.out.println("2. �����̶�?");
		Functions.sleep300();
		System.out.println("3. ������!");
		Functions.sleep300();
	}

	public void intro2(int i) {
		if (i == 1) {
			Functions.sleep1000();
			System.out.println("�� ������ �������� �Ƿ��� ���ڶ� �����");
			Functions.sleep1500();
			System.out.println("������ �������� ����˴ϴ�.");
			Functions.sleep1500();
			System.out.println("�����ϰ� ���� �׸��� ��ȣ�� �Է��ϴ�");
			Functions.sleep1500();
			System.out.println("������ ���ӹ������ �̷���� �ֽ��ϴ�.");
			Functions.sleep1500();
			System.out.println("���� : ������ . 010-7205-3242");
			Functions.sleep1000();
			Functions.sleep300();
			System.out.println();
			Functions.sleep500();
			System.out.println("���ڻ� : �� �ۿ� �˰� ���� �� �����ΰ�?");
			Functions.sleep1000();
		} else if (i == 2) {
			Functions.sleep1000();
			System.out.println("����� ���ݺ��� ���۵� ������");
			Functions.sleep1000();
			System.out.println("���ΰ��� �Ǿ�");
			Functions.sleep1000();
			System.out.println("������ �����ϴ�.");
			Functions.sleep2000();
			System.out.println("");
			System.out.println("��Ÿ�, �� ��, ����, Ǯ��");
			Functions.sleep1000();
			System.out.println("�׸��� �����̳� �� ��...");
			Functions.sleep1000();
			System.out.println("���� ��ҿ� �ִ� ����鿡�� ���� �ɾ�� �ֽʽÿ�.");
			Functions.sleep2000();
			System.out.println("");
			System.out.println("��濡 ó���ִ� ����� �����ְų�");
			Functions.sleep1000();
			System.out.println("������ ����鿡�� ���� �ɴ� ����");
			Functions.sleep1000();
			System.out.println("���Ӽӿ��� �ڽ��� ã������ �𸨴ϴ�.");
			Functions.sleep1500();
			System.out.println("");
			Functions.sleep1000();
			System.out.println("���ڻ� : �� �ۿ� �˰� ���� �� �����ΰ�?");
			Functions.sleep1000();
		}
	}

	public void intro3() {
		System.out.println("�� ���迡��");
		Functions.sleep500();
		System.out.println("�翵 ����");
		Functions.sleep500();
		System.out.println("�ٿ��� \"�翵��\"�̶� �Ҹ���");
		Functions.sleep1000();
		System.out.println("�̰���.. �ƴ� �ű��� ����ü��");
		Functions.sleep1000();
		System.out.println("��ó�� ��� �ִ�!");
		Functions.sleep1500();
		System.out.println("�츮 �ΰ���");
		Functions.sleep500();
		System.out.println("�翵��� �������� ��� ����");
		Functions.sleep1500();
		System.out.println("�Բ� ��⵵ �ϰ�");
		Functions.sleep1000();
		System.out.println("���� ���� ���� �ϱ⵵ �ϰ�");
		Functions.sleep1000();
		System.out.println("�׸��� �翵�󳢸� �ο�� �Ͽ�");
		Functions.sleep1000();
		System.out.println("���밨�� ������ �����⵵ �ϰ�...");
		Functions.sleep1500();
		System.out.println("���� �׷� �翵�����");
		Functions.sleep1000();
		System.out.println("�ڼ��� �˱� ����");
		Functions.sleep1000();
		System.out.println("�����ϰ� �ִ� ���̶���!");
		Functions.sleep1500();
		System.out.println("�װ� �׷��� ���� ����");
		Functions.sleep1000();
		System.out.println("�ڳ׿� ���� �˾ƺ����� ����!");
		Functions.sleep1000();
	}

	public void intro4(String name) {
		this.name = name;
		System.out.println(name + "�̷α���?");
		Functions.sleep500();
		System.out.println("1. �� 2. �ƴϿ�");
	}

	public void intro5() {
		Functions.sleep500();
		System.out.println("�� �ҳ��� �ڳ��� ģ����?");
		Functions.sleep1000();
		System.out.println("���� �̸���");
		Functions.sleep1000();
		System.out.println("�����Ĵٿ�!");
	}

	public void intro6(String friend) {
		this.friend = friend;
		Functions.sleep500();
		System.out.println(friend + "�̷α�");
		Functions.sleep1000();
		System.out.println("�� �̸��� �´°�?");
		Functions.sleep500();
		System.out.println("1. �� 2. �ƴϿ�");
	}

	public void intro7() {
		System.out.println("�������� ");
		Functions.sleep500();
		System.out.println("�ʸ��� �̾߱Ⱑ ���۵ȴ�!");
		Functions.sleep1500();
		System.out.println("�ű⼭ �ʴ�");
		Functions.sleep500();
		System.out.println("���� �翵���̳�");
		Functions.sleep1000();
		System.out.println("���� ������ ����");
		Functions.sleep1000();
		System.out.println("���𰡸� �߰��ϰ� �ǰ���!");
		Functions.sleep1500();
		System.out.println("�׷�");
		Functions.sleep500();
		System.out.println("�翵������ �����!");
		Functions.sleep2000();
	}

	public void story1() {
		System.out.println("TVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV             �ᱹ ��������                                TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV             ��¿��� �ұ��ϰ�                            TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV             ������ �ٸ� ����� �翵��                    TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV             ���� �뼵���� �����                         TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV             ������� �� ��                               TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV             �� �� �������ϴ�...                          TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTV");
		Functions.sleep2000();
		System.out.println("");
		System.out.println("���ݱ��� Ư�� ���");
		Functions.sleep1000();
		System.out.println("\"���� �뼷�̸� �Ѿƶ�!\"");
		Functions.sleep1000();
		System.out.println("�翵 ��Ʈ��ũ����");
		Functions.sleep1000();
		System.out.println("����ƮTV��۱��� ������Ƚ��ϴ�");
	}

	public void choice1() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("���� ��ġ : " + name + "�� ��");
		Functions.sleep1000();
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
		System.out.println("������ �ұ�?");
		System.out.println("1. TV�� ���� 2. ħ�뿡 ���´�");
		System.out.println("3. PC�� Ȯ���Ѵ� 4. �ŽǷ� ��������");
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
	}

	public void act1(int user) {
		if (user == 1)
			System.out.println("TV���� ���� Ÿ��Ʋ�� ������ �ִ�.");
		else if (user == 2)
			System.out.println("���� ���� �ʴ´�.. ��������");
		else if (user == 3) {
			System.out.println(name + "�� PC�� Ȯ���ߴ�");
			Functions.sleep1000();
			System.out.println("�翵�� ��������!");
			Functions.sleep1000();
			System.out.println("�� ���迡�� �翵���");
			Functions.sleep1000();
			System.out.println("����� �Բ� ��� �ֽ��ϴ�");
			Functions.sleep1000();
			System.out.println("�翵���� �ο�� �ϴ� �����");
			Functions.sleep1000();
			System.out.println("�翵�� Ʈ���̳ʶ�� �մϴ�");
		}
	}

	boolean breek2;

	public void story2() {
		System.out.println("���� : " + name + "��!");
		Functions.sleep1000();
		System.out.println("�Ʊ� " + friend + "��");
		Functions.sleep1000();
		System.out.println("�ʸ� ã�ƿԴܴ�");
		Functions.sleep1000();
		System.out.println("���� �������� �𸣰ڴٸ�");
		Functions.sleep1000();
		System.out.println("���� ���� ���ΰ� ��!");
		breek2 = true;
	}

	public void choice2() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("���� ��ġ : " + name + "�� �� �Ž�");
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
		System.out.println("������ �ұ�?");
		System.out.println("1. �ö󰣴� 2. �������� �����Ǵ�");
		System.out.println("3. TV�� ���� 4. ������ ������ ");
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
	}

	public void act2(int user) {
		if (user == 2) {
			System.out.println("���� : �ٳ���ʶ� " + name + "��!");
			Functions.sleep1000();
			System.out.println("��� ��ġ�� ����!");
		} else if (user == 3) {
			System.out.println("���� : ������ �翵������ ������");
			Functions.sleep1000();
			System.out.println("������ ���� ���ͺ� �غ��ڽ��ϴ�!");
			Functions.sleep1000();
			System.out.println("������ : ���� �翵���� ����� ����׿� ����...");
			Functions.sleep1500();
		}
	}

	boolean breek3;

	public void story3() {
		System.out.println("���� : �¾�! " + name + "��!");
		Functions.sleep1000();
		System.out.println("Ǯ���� ���� �� �ȴܴ�!");
		Functions.sleep1000();
		System.out.println("�߻��� �翵���� �޷���ϱ�");
		Functions.sleep1000();
		System.out.println("�� �翵���� �ִٸ�");
		Functions.sleep1000();
		System.out.println("�������� �𸣰�����...");
		Functions.sleep1000();
		breek3 = true;
	}

	public void choice3() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("���� ��ġ : ���ٸ���");
		Functions.sleep1000();
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
		System.out.println("������ �ұ�?");
		System.out.println("1. " + name + "�� �������� 2. ������ ����");
		System.out.println("3. ������ ���� 4. " + friend + "�� ��������");
		System.out.println("5. ������ ����� 6. �̰������� �����Ǵ�");
		System.out.println("7. �̱��ҳ� �迹�ؿ��� �����Ǵ�");
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
	}

	boolean breek3_1_1 = false;

	public void story3_1_1() {
		System.out.println("�ʴ�!!");
		Functions.sleep500();
		System.out.println(friend + " : ����-!");
		Functions.sleep1000();
		System.out.println("���, �� " + name + "���ݾ�!");
		Functions.sleep1000();
		System.out.println("�̺�! ȣ���� �� �״ϱ�");
		Functions.sleep1000();
		System.out.println("���� ��!");
		Functions.sleep1000();
		System.out.println();
		System.out.println("�˾ҳ� " + name + "? ������");
		Functions.sleep1000();
		System.out.println("���� 100�� ���̾�!");
		Functions.sleep1000();
		System.out.println("... ... ... ...");
		Functions.sleep1000();
		System.out.println();
		System.out.println(friend + " : ��! ������ �� �ִ�!");
		Functions.sleep1000();
		System.out.println(friend + "�� �ٽ� ������ �����ȴ�");
		breek3_1_1 = true;
	}

	boolean breek3_1_2 = false;

	public void story3_1_2() {
		System.out.println(friend + " : ...�����̶�");
		Functions.sleep1000();
		System.out.println("�����Ʈ�� ��� ������");
		Functions.sleep1000();
		System.out.println();
		System.out.println("! ����! " + name + "!");
		Functions.sleep500();
		System.out.println("ȣ���� ����!");
		Functions.sleep1000();
		System.out.println("���ο��� ��ٸ� �״ϱ�");
		Functions.sleep1000();
		System.out.println("������ ���� 1000�� ���̾�!");
		Functions.sleep1000();
		System.out.println();
		System.out.println("�����ȴ�...");
		breek3_1_2 = true;
	}

	public void choice3_1() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("���� ��ġ : " + friend + "�� ��");
		Functions.sleep1000();
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
		System.out.println("������ �ұ�?");
		System.out.println("1. " + friend + "�� �������� �����Ǵ�");
		System.out.println("2. " + friend + "�� ������ �ö󰣴�. ");
		System.out.println("3. TV�� ���� 4. ������ ������");
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
	}

	public void act3_1(int user) {
		if (user == 1) {
			System.out.println(friend + "���� : �� " + name + "�̴�?");
			Functions.sleep1000();
			System.out.println(friend + " ã�ƿԱ���?");
			Functions.sleep1000();
			System.out.println("�� �� ��� �������µ�");
			Functions.sleep1000();
			System.out.println("�ٷ� ���ƿ��� ����");
			Functions.sleep1000();
			System.out.println("���� ������ ������ �ʴ±���");
			Functions.sleep1000();
			System.out.println("���� ��Ƽ� ������?");
			Functions.sleep1000();
		} else if (user == 3) {
			System.out.println("TV�� Show Me The Money �� ������ �ִ�");
		}
	}

	public void choice3_1_2() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("���� ��ġ : " + friend + "�� ��");
		Functions.sleep1000();
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
		System.out.println("������ �ұ�?");
		System.out.println("1. �������� 2. ħ�뿡 ���´�");
		System.out.println("3. TV�� ���� 4. PC�� Ȯ���Ѵ�");
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
	}

	public void act3_1_2(int user) {
		if (user == 2)
			System.out.println("ģ���� ���̶� ���̿��� �ʴ´�...");
		else if (user == 3)
			System.out.println("TV�� ���� �ִ�");
		else if (user == 4)
			System.out.println("PC�� ��й�ȣ�� �ɷ��ִ�");
	}

	public void choice3_2() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("���� ��ġ : ����");
		Functions.sleep1000();
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
		System.out.println("������ �ұ�?");
		System.out.println("1. �������ҸӴ� ���� ���� �Ǵ�");
		System.out.println("2. ��������� ���� ���� �Ǵ�");
		System.out.println("3. ������ ������");
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
	}

	public void act3_2(int user) {
		if (user == 1) {
			System.out.println("������ : �������?");
			Functions.sleep1000();
			System.out.println("���� ����Ʈ���� ���ο� ��������");
			Functions.sleep1000();
			System.out.println("���̴ٰ� �Ѵ�");
			Functions.sleep1000();
			System.out.println("���� ����� �л��̶�");
			Functions.sleep1000();
			System.out.println("Ű��÷��� �°հ�");
		} else if (user == 2) {
			System.out.println(name + " : ����.. �����??");
			Functions.sleep1000();
			System.out.println("������ : ... ... ... ...");
			Functions.sleep1500();
			System.out.println("�ڵ����� ���� ���� ���ϴµ� �ϴ�");
		}
	}

	public void choice3_3() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("���� ��ġ : ����");
		Functions.sleep1000();
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
		System.out.println("������ �ұ�?");
		System.out.println("1. ������ ���� �����Ǵ�");
		System.out.println("2. TV�� ����\t3. ������ ������");
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
	}

	public void act3_3(int user) {
		if (user == 1) {
			System.out.println("���� : �� " + friend + "�� �Բ� �� ����?");
			Functions.sleep1000();
			System.out.println("���� ��¦ ģ���α���");
		} else if (user == 2) {
			System.out.println("������ �� ������ ��������");
			Functions.sleep1000();
			System.out.println("������ ���� ���ͺ��غ��ڽ��ϴ�");
			Functions.sleep1000();
			System.out.println("������ : ���� ¥�鼭�� ���۰ŷ� �װڴ�;;");
		}

	}

	public void story3_5() {
		System.out.println("��ä : ����!" + name + " �ƴѰ�");
		Functions.sleep1000();
		System.out.println(friend + "�� ã�Ҵܴ�");
		Functions.sleep1000();
		System.out.println("�� �༮ ����");
		Functions.sleep1000();
		System.out.println("������ �� �?");
	}

	boolean breek4_4 = false;

	public void story4() {
		System.out.println(friend + " : ���� ����");
		Functions.sleep1000();
		System.out.println("�Ʊ� TV ����?");
		Functions.sleep1000();
		System.out.println("\"���� �뼷�̸� �Ѿƶ�!");
		Functions.sleep1000();
		System.out.println("ȣ���� ��Ÿ��");
		Functions.sleep1000();
		System.out.println("�г��� �翵���� ��������!!\"");
		Functions.sleep1000();
		System.out.println();
		System.out.println("�� ������ �ôµ� ����");
		Functions.sleep1000();
		System.out.println("�� ȣ������");
		Functions.sleep1000();
		System.out.println("�׷� �翵���� �ݵ�� ���� �Ŷ��!");
		Functions.sleep1000();
		System.out.println("�׷��ϱ� ���� ���� �װ�");
		Functions.sleep1000();
		System.out.println("�׳༮�� �߰��Ϸ� ���� �ž�!");
		breek4_4 = true;
	}

	public void choice4() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("���� ��ġ : 201����");
		Functions.sleep1000();
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
		System.out.println("������ �ұ�?");
		System.out.println("1. ���ʱ�(ȣ�� ����)���� ����");
		System.out.println("2. ������ Ǯ����(���𷡸��� ����)���� ����");
		System.out.println("3. " + friend + "���� ���� �Ǵ�");
		System.out.println("4. ������ �ǵ��ư���");
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
	}

	public void choice4_1() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("���� ��ġ : 201����");
		Functions.sleep1000();
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
		System.out.println("������ �ұ�?");
		System.out.println("1. ���ʱ�(ȣ�� ����)���� ����");
		System.out.println("2. ������ Ǯ����(��𷡸��� ����)���� ����");
		System.out.println("3. ������ �ǵ��ư���");
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
	}

	public void act4(int user) {
		if (user == 2) {
			System.out.println("������ ������ ���÷ȴ�!");
			Functions.sleep1000();
			System.out.println("���� :" + name + "��!");
			Functions.sleep1000();
			System.out.println("Ǯ���� ���� �� �ȴܴ�!");
			Functions.sleep1000();
			System.out.println("�߻��� �翵���� �޷���ϱ�");
			Functions.sleep1000();
			System.out.println("�� �翵���� �ִٸ�");
			Functions.sleep1000();
			System.out.println("�������� �𸣰�����...");
		} else if (user == 3) {
			System.out.println(friend + " : �̷��� ����� ������ ����");
			Functions.sleep1000();
			System.out.println("� ȣ���� ����");
			Functions.sleep1000();
			System.out.println("�� ���� ���������ؼ�");
			Functions.sleep1000();
			System.out.println("�� ���ھ�-!!");
		} else if (user == 4) {
			System.out.println(friend + " : ����!");
			Functions.sleep1000();
			System.out.println("��� ���� �ž�!?");
			Functions.sleep1000();
			System.out.println("ȯ���� �翵����!");
			Functions.sleep1000();
			System.out.println("���� �θ��� �ִ� ���̴�!");
			Functions.sleep1000();
			System.out.println("������ �ǵ��ư� �� ������!");
		}
	}

	boolean event1 = false;
	int rand;
	int count = 0;
	Battle bt = new Battle();

	public void act4_1(int user) {
		if (user == 1) { // ȣ���� ������ �׳ɵ��ư�
			System.out.println("�ƹ��͵� ���� ȣ���� �ִ�.. ���ư���");
		} else if (user == 2) { // ���� ������ ����
			while (true) {
				int i = 0;
				System.out.println("���� ������ ���±�");
				int j = 0;
				while (j < 4) {
					while (i < 3) {
						System.out.print(".");
						i++;
						Functions.sleep150();
					}
					System.out.print(" ");
					i = 0;
					j++;
				}
				System.out.println();
				j = 0;
				rand = random.nextInt(3) + 1;
				if (rand == 1) {
					count++;
					if (count == 1) {
						bt.Battle_Start();
						System.out.println("���� : �ϴٴ� �ٴٴ� ��~~!!");
						Functions.sleep1000();
						System.out.println("�ʴɷ��� ������");
						Functions.sleep500();
						System.out.println("�ºθ� �ɾ�Դ�!");
						Functions.sleep1500();
						System.out.println("������ " + mst.MonName + "�� �����´�!");
						Functions.sleep1000();
						bt.Turn();
					} else if (count == 2) {
						bt.Battle_Start();
						System.out.println("��ȯ : ���ܴ��ڴ�!");
						Functions.sleep1000();
						System.out.println("��Ÿ�� ��ȯ�̰�");
						Functions.sleep500();
						System.out.println("�ºθ� �ɾ�Դ�!");
						Functions.sleep1500();
						System.out.println("��ȯ�̴� " + mst.MonName + "�� �����´�!");
						Functions.sleep1000();
						bt.Turn();
					} else if (count == 3) {
						bt.Battle_Start();
						System.out.println("���� : �� �����ȿ� ��� �濰���̿�...");
						Functions.sleep1000();
						System.out.println("��2�� ȯ�� �����̰�");
						Functions.sleep500();
						System.out.println("�ºθ� �ɾ�Դ�!");
						Functions.sleep1500();
						System.out.println("�����̴� " + mst.MonName + "�� �����´�!");
						Functions.sleep1000();
						bt.Turn();
					}
				}
				if (count >= 3) {
					System.out.println("���� ������ �����ߴ�!");
					break;
				}
			}

		}
	}

	public void story5() {
		System.out.println(friend + " : ���� ! ȣ����!");
		Functions.sleep1000();
		System.out.println("���� �뼷�� ã�Ƴ��� ���ھ�!");
		Functions.sleep1000();
		System.out.print("...");
		Functions.sleep300();
		System.out.println("...");
		Functions.sleep300();
		System.out.println(friend + " : ����...?");
		Functions.sleep1000();
		System.out.println();
		System.out.println("��ȭ�� : �ڻ��! ���ʵ� Ư���� ��");
		Functions.sleep1000();
		System.out.println("�ƹ��͵� �����!");
		Functions.sleep1000();
		System.out.println("�ڻ� : ����...");
		Functions.sleep500();
		System.out.println("�׷����� ���� �� �����߳�");
		Functions.sleep1000();
		System.out.println("��¾�� �����ϰ��");
		Functions.sleep1000();
		System.out.println("���� �ٸ� �� ������...");
		Functions.sleep1000();
		System.out.println("�� �� ȣ���� ������");
		Functions.sleep1000();
		System.out.println("�̰ɷ� �����ؾ߰ڱ�!");
		Functions.sleep1500();
		System.out.println();
		System.out.println("ȭ��!");
		Functions.sleep500();
		System.out.println("�׷� ���ư����� ����");
		Functions.sleep1000();
		System.out.println("��ȭ�� : �׷��� �ڻ��,");
		Functions.sleep1000();
		System.out.println("4�⸸�� ã�� �ſ�������");
		Functions.sleep1000();
		System.out.println("� �����̿���?");
		Functions.sleep1500();
		System.out.println();
		System.out.println("�ڻ� : ...��");
		Functions.sleep500();
		System.out.println("�ſ����濡��");
		Functions.sleep500();
		System.out.println("�ź��� �翵���� ����");
		Functions.sleep1000();
		System.out.println("�����ϴ� ������ �����ž�");
		Functions.sleep1000();
		System.out.println();
		System.out.println("�ڻ簡 �������� �ٰ��´�..");
		Functions.sleep1500();
		System.out.println("�ڻ� : �Ƿ�!");
		Functions.sleep500();
		System.out.println("�� ��������");
		Functions.sleep500();
		System.out.println("��ȭ�� : �˼��մϴ�...");
		Functions.sleep1000();
		System.out.println("��� �������ڽ��ϴ�");
		Functions.sleep1000();
		System.out.println();
		System.out.println(friend + " : ����?");
		Functions.sleep1000();
		System.out.println("���� �λ��...");
		Functions.sleep1000();
		System.out.println("���? " + friend + "!");
		Functions.sleep1000();
		System.out.println("��� ���� ����!");
		Functions.sleep1000();
		System.out.println("... ... ... ... ... ...");
		Functions.sleep1000();
		System.out.println("... ... ... ... ... ...");
		Functions.sleep1000();
		System.out.println("����?");
		Functions.sleep500();
		System.out.println("Ǯ���� ���� �����?");
		Functions.sleep1000();
		System.out.println("������! ������!");
		Functions.sleep1000();
		System.out.println("����̸�");
		Functions.sleep500();
		System.out.println("�翵�� �� ���´ٴϱ�?");
		Functions.sleep1000();
		System.out.println();
		System.out.println("Ǯ���� ���Դ�...");
		Functions.sleep1500();
		System.out.println();
		System.out.println("����...�̴�...");
		Functions.sleep1000();
		System.out.println("�Ʊ� �� ����� �ΰ� �� �ű���");
		Functions.sleep1000();
		System.out.println("��ϸ� ����?");
		Functions.sleep1500();
		System.out.println("�����ַ��� �ص� ���� ��������?");
		Functions.sleep1000();
		System.out.println("�ڻ��� �ߴµ�...");
		Functions.sleep2000();
		System.out.println("!-!?-!?-?!?-!?-?!?-!??-!??-!?!!");
		Functions.sleep500();
		System.out.println("�Ϳ�!");
		Functions.sleep500();
		System.out.println("ǲ �翵��!?");
		Functions.sleep1000();
		System.out.println("���� �̰�-!");
		Functions.sleep1000();
		System.out.println("���ͺ��̴�!!");
		Functions.sleep1000();
		System.out.println("�̰����� �ο���!");
		Functions.sleep1000();
	}

	public void choice5() {
		System.out.println("��...");
		Functions.sleep300();
		System.out.println("��� ������ �ұ�?");
		Functions.sleep1000();
		System.out.println("1. �Ҳɼ��� 2. �ص��� 3. ��α� 4. �뼷��");
	}

	public void act5(int user) {
		if (user != 4) {
			Functions.sleep500();
			System.out.println("�ƴϾ�... ���� �뼷�̿���");
			Functions.sleep1000();
			System.out.println("���� ���°�?");
		} else if (user == 4) {
			System.out.println("�׷� �뼷�̰� ���ھ�!");
		}
	}

	public void story6() {
		System.out.println(friend + " : �Ŀ�-!");
		Functions.sleep1000();
		System.out.println("�� �뼷�� ����Ѱ�!");
		Functions.sleep1000();
		System.out.println("�� �����̰�");
		Functions.sleep500();
		System.out.println("�ξ� �� ���߾����� ����!");
		Functions.sleep1000();
		System.out.println("...�ٵ� ���� �ʵ�");
		Functions.sleep1000();
		System.out.println("�ٸ� ��� ���ϸ� ��µ�");
		Functions.sleep1000();
		System.out.println("������ ����...?");
		Functions.sleep1500();
		System.out.println();
		System.out.println("��ȭ�ϰ� �پ�´�...");
		Functions.sleep1500();
		System.out.println();
		System.out.println("�����̴�! ���� �ִ�!");
		Functions.sleep1000();
		System.out.println("�ڻ�Բ� ȥ�� ���߾�!");
		Functions.sleep1000();
		System.out.println("��? ��?");
		Functions.sleep500();
		System.out.println("Ȥ�� ����");
		Functions.sleep500();
		System.out.println("�翵�� ���!?");
		Functions.sleep1500();
		System.out.println();
		System.out.println("��-��! ��¼��!?");
		Functions.sleep1000();
		System.out.println("�ڻ�� ���� ������ �ϽǱ�");
		Functions.sleep1500();
		System.out.println("...�ϴ�");
		Functions.sleep500();
		System.out.println("�� ������ ��������");
		Functions.sleep1500();
		System.out.println();
		System.out.println(friend + " : ���� �� �༮...");
		Functions.sleep1000();
		System.out.println(name + "!");
		Functions.sleep1000();
		System.out.println("�ϴ� ���⼭ ������...");
		Functions.sleep1000();
		System.out.println("�Ʊ� �ο�鼭");
		Functions.sleep1000();
		System.out.println("�� �翵�� ���ư�...");
		Functions.sleep1000();
		System.out.println("�ٽ� �翵���� �����ϸ�");
		Functions.sleep1000();
		System.out.println("�� �����Ұž�...");
		Functions.sleep1500();
		System.out.println();
		System.out.println("ȣ�� ������ ���Դ�..");
		Functions.sleep2000();
		System.out.println();
		System.out.println(friend + " : �� ���� ��");
		Functions.sleep1000();
		System.out.println("...�翵���̾� �翬��");
		Functions.sleep1000();
		System.out.println("�����ַ� ���� �ϰ�����");
		Functions.sleep1000();
		System.out.println("�� �� �� �� �༮��");
		Functions.sleep1000();
		System.out.println("���� �ְ� �Ͱŵ�...");
		Functions.sleep1500();
		System.out.println();
		System.out.println("... ... ... ...");
		Functions.sleep1000();
		System.out.println("������ �����ִ�..");
		Functions.sleep200();
		System.out.println("");
		System.out.println("!!!");
		System.out.println(friend + " : ��, �Ʊ� �� ����̴�!");
		Functions.sleep1000();
		System.out.println("���� �츮 ������� ���� �ʳ�?");
		Functions.sleep1500();
		System.out.println("�ڻ� : ... ... ...");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("ȭ�Ͽ��� ����ٸ�");
		Functions.sleep1000();
		System.out.println("�翵���� �� �� ��������?");
		Functions.sleep1000();
		System.out.println("��� �����ٿ�");
		Functions.sleep1500();
		System.out.println("����...");
		Functions.sleep500();
		System.out.println("�뼷�̿� �������ΰ�...");
		Functions.sleep1000();
		System.out.println("����...");
		Functions.sleep1000();
		System.out.println("�׷���, �׷��ٴ� ���ΰ�");
		Functions.sleep1000();
		System.out.println("ȭ��! �����ҷ� ���ư���!");
		Functions.sleep1000();
		System.out.println("��ȭ�� : �� ��!");
		Functions.sleep1000();
		System.out.println("�ڻ�� ��ٷ��ּ���!");
		Functions.sleep1000();
		System.out.println("���߿� �����ҷ� ���� ���� ������...?");
		Functions.sleep1000();
		System.out.println("�� �׷� �� ����");
		Functions.sleep1500();
		System.out.println("");
		System.out.println(friend + " : ���� �̰�...");
		Functions.sleep1000();
		System.out.println("ȭ�� ������ ȭ�� ������...");
		Functions.sleep1000();
		System.out.println("�Դٰ� ���ϸ���");
		Functions.sleep1000();
		System.out.println("�������� �ʾƵ� ������ ���ΰ�?...");
		Functions.sleep1000();
		System.out.println(name + "...");
		Functions.sleep1000();
		System.out.println("�츮�� ���ư���...");
		Functions.sleep1500();
		System.out.println();
		System.out.println("���� ���ƿԴ�..");
		Functions.sleep1500();
		System.out.println();
		System.out.println("���� : �װ� �׷��� ���� ���̴�?");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("�׷� ���� �־�����");
		Functions.sleep1000();
		System.out.println("������ �ʵ� " + friend + "��");
		Functions.sleep1000();
		System.out.println("�����ؼ� �����̴�");
		Functions.sleep1000();
		System.out.println();
		System.out.println("�� �ڻ���̶�� ��� �Ƹ���");
		Functions.sleep1000();
		System.out.println("�ܸ𷡸����� ���ڻ���̰ڱ���");
		Functions.sleep1500();
		System.out.println("�翵�� ����������");
		Functions.sleep1000();
		System.out.println("������ �ڻ���̶�� ����ܴ�");
		Functions.sleep1000();
		System.out.println("�׸��� �����ٴ� �ҹ���...");
		Functions.sleep2000();
		System.out.println();
		System.out.println(name + "��");
		Functions.sleep500();
		System.out.println("��°�� �翵���� �����");
		Functions.sleep1000();
		System.out.println("��Ȯ�� ������ �帮�� ���ؼ�");
		Functions.sleep1000();
		System.out.println("�ܸ𷡸����� ���߰ڱ���");
		Functions.sleep1500();
		System.out.println();
		System.out.println("������!");
		Functions.sleep500();
		System.out.println("�и� ���ظ� �� �ֽǰž�");
		Functions.sleep1000();
		System.out.println("�ܸ𷡸����� ���� �� ��ü��");
		Functions.sleep1000();
		System.out.println("������ �����̳�?");
		Functions.sleep1000();
		System.out.println("�� ��¦�� �� ���ٿ��ž�!");
	}

	public void story7() {
		System.out.println("!");
		Functions.sleep300();
		System.out.println("ȭ�� : ��! �Դ�!");
		Functions.sleep1000();
		System.out.println("���� �����!");
		Functions.sleep1000();
		System.out.println("�ڻ���� ��ٸ��� ��ôϱ�!");
		Functions.sleep1000();
		System.out.println();
		System.out.println("����! ���Ⱑ");
		Functions.sleep1000();
		System.out.println("���ϸ� ������!");
		Functions.sleep1000();
		System.out.println("�ȿ���...");
		Functions.sleep1500();
		System.out.println("�ʴ�!!!");
		Functions.sleep500();
		System.out.println(friend + " : �̰� ����-!");
		Functions.sleep1000();
		System.out.println("���� " + name + "�̾���!");
		Functions.sleep1000();
		System.out.println("�� �ڻ�...");
		Functions.sleep1000();
		System.out.println("�����ٰ� �ؾ� �ϳ� ���ڴ�ξ�!");
		Functions.sleep1000();
		System.out.println("�� ������... " + name + "!");
		Functions.sleep1000();
		System.out.println("�� ����! �׷� �̸�!");
		Functions.sleep1000();
		System.out.println();
		System.out.println("ȭ�� : ����!?");
		Functions.sleep1000();
		System.out.println("�� ģ����");
		Functions.sleep500();
		System.out.println("��û �����ϱ���");
		Functions.sleep1000();
		System.out.println("�� ������");
		Functions.sleep500();
		System.out.println("������ ����");
		Functions.sleep1000();
		System.out.println("");
		System.out.println("������ ������ ���Դ�..");
		Functions.sleep1000();
		System.out.println("�ڻ� : ... ... ...");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("���� �Դ���");
		Functions.sleep1000();
		System.out.println(name + "�̶�� ����?");
		Functions.sleep1000();
		System.out.println("�ٽ� �� �� �翵���� �����ٿ�");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("����...");
		Functions.sleep500();
		System.out.println("����...");
		Functions.sleep500();
		System.out.println("�� �翵����");
		Functions.sleep1000();
		System.out.println("���� �⻵�ϴ� �� ���� ���̴±�");
		Functions.sleep1500();
		System.out.println();
		System.out.println("���� �˰ڴ�!");
		Functions.sleep1000();
		System.out.println("�� �뼷�̴�");
		Functions.sleep1000();
		System.out.println("�ʿ��� ������ �ְڴ�");
		Functions.sleep1000();
		System.out.println("ȣ�������� ����");
		Functions.sleep1000();
		System.out.println("�Ʊ� " + friend + "�κ��� �����");
		Functions.sleep1000();
		System.out.println("ó���ε���");
		Functions.sleep1000();
		System.out.println("�Ǹ��ϰ� �翵��� �ο��ٰ�");
		Functions.sleep1000();
		System.out.println("�Դٰ� ���� �ô���");
		Functions.sleep1000();
		System.out.println("�ʿ� �翵�� ���̿�");
		Functions.sleep1000();
		System.out.println("�����̳��� ���밨�� ���� �� ��������");
		Functions.sleep2000();
		System.out.println();
		System.out.println("�׷��⿡ �뼷�̸�");
		Functions.sleep1000();
		System.out.println("�ʿ��� �°ܺ��� �Ѵ�");
		Functions.sleep1000();
		System.out.println();
		System.out.println("ȭ�� : �װ� ���ϸ���");
		Functions.sleep1000();
		System.out.println("������ �ٷ�� ����̶� �����̾�!");
		Functions.sleep1000();
		System.out.println("�׷��� �ʾҴٸ�...");
		Functions.sleep1000();
		System.out.println("�ƾ� �� ���ϰھ�...");
		Functions.sleep2000();
		System.out.println();
		System.out.println("�ڻ� : �� ����");
		Functions.sleep1000();
		System.out.println("�װ� �׷��� �������� ����");
		Functions.sleep1000();
		System.out.println("�ʿ��� ��Ź�ϰ� ���� ���� �ִ�");
		Functions.sleep2000();
		System.out.println("���� ���ڻ��� �Ѵ�!");
		Functions.sleep1000();
		System.out.println("�翵�� ������ �ϰ� ����");
		Functions.sleep1000();
		System.out.println("�켱 �ſ����濡��");
		Functions.sleep1000();
		System.out.println("��� �翵���� �ִ���");
		Functions.sleep1000();
		System.out.println("�� ��� ���� �˰� �ͱ���");
		Functions.sleep1000();
		System.out.println("�׷����� �翵�� ������");
		Functions.sleep1000();
		System.out.println("����� ���� �ʿ䰡 �ִ�!");
		Functions.sleep2000();
		System.out.println();
		System.out.println("�׷� ������� ��Ź�� �ϴ� ���̴�!");
		Functions.sleep1500();
		System.out.println("�� �翵�� ������ ��Ź�� �״�");
		Functions.sleep1000();
		System.out.println("�ʴ� �ſ����濡 �ִ�");
		Functions.sleep1000();
		System.out.println("��� �翵���� ���� ���ʶ�! ...");
		Functions.sleep1000();
		System.out.println();
		System.out.println("���ڻ� : �� �翵�� ������");
		Functions.sleep1000();
		System.out.println("�װ� ���� �翵����");
		Functions.sleep1000();
		System.out.println("�ڵ������� ����� ������");
		Functions.sleep1000();
		System.out.println("�ϵ���ũ ������!");
		Functions.sleep1000();
		System.out.println("");
		System.out.println("�׷��ϱ� �ʴ�");
		Functions.sleep1000();
		System.out.println("�پ��� ��ҷ� ����");
		Functions.sleep1000();
		System.out.println("��� �翵��� �������� �ϰŶ�!");
		Functions.sleep1500();
		System.out.println("ȭ�� : ���� �Ȱ��� ���� ������ �־�!");
		Functions.sleep1500();
		System.out.println();
		System.out.println("���ڻ� : �翵��� �Բ�");
		Functions.sleep1000();
		System.out.println("201�����θ� �Ȱ� ������");
		Functions.sleep1000();
		System.out.println("� ����̿�����?");
		Functions.sleep1500();
		System.out.println("���� ���� �¾ ��");
		Functions.sleep1000();
		System.out.println("60���̶�� ������ �귶����");
		Functions.sleep1000();
		System.out.println("���ݵ� ���� �翵��� �Բ�");
		Functions.sleep1000();
		System.out.println("�ִ� �͸����ε� ������ �ٰ� �Ѵ�");
		Functions.sleep2000();
		System.out.println();
		System.out.println("�˰ڴ���? ���󿡴� �ſ�");
		Functions.sleep1000();
		System.out.println("���� �翵����� �ִ�!");
		Functions.sleep1000();
		System.out.println("�� �׸�ŭ");
		Functions.sleep500();
		System.out.println("���� ������ ��ٸ��� �ִٴ� �����");
		Functions.sleep1000();
		System.out.println("�� �׷� �����Ŷ�!");
		Functions.sleep1000();
		System.out.println("���� " + name + "��");
		Functions.sleep1000();
		System.out.println("������ ���۵Ǵ� ���̴�!");
		Functions.sleep1500();
		System.out.println();
		System.out.println("ȭ�� : ���� ó������ ���");
		Functions.sleep1000();
		System.out.println("�翵���� �ص�������");
		Functions.sleep1000();
		System.out.println("��¼�� �װ� ȣ������");
		Functions.sleep1000();
		System.out.println("�ص����� ����ٸ�");
		Functions.sleep1000();
		System.out.println("�츮�� ������ �ٵ� ����");
		Functions.sleep1500();
		System.out.println("�� ��·�� ���������...");
		Functions.sleep1000();
		System.out.println();
		System.out.println("���� �ڻ���� ��Ź�� �޾Ƽ�");
		Functions.sleep1000();
		System.out.println("������ �������� ä��� �־�");
		Functions.sleep1000();
		System.out.println("�׷��ϱ� �ʶ� ���� ���� �ž�");
		Functions.sleep1000();
		System.out.println("���� �ʺ��ٴ� ����");
		Functions.sleep1000();
		System.out.println("������ �� �� �ְ���");
		Functions.sleep1500();
		System.out.println("���� �̰����� �������ٰ�");
		Functions.sleep1000();
		System.out.println("�׷� �� ��Ź��! " + name + "!");
	}

	public void choice7() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("���� ��ġ : ���ڻ�� ������");
		Functions.sleep1000();
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");
		System.out.println("������ �ұ�?");
		System.out.println("1. ���ڻ� ���� �����Ǵ�");
		System.out.println("2. PC�� Ȯ���Ѵ�");
		System.out.println("3. ����� �������� �����Ǵ�");
		System.out.println("4. �̿�ȣ �������� �����Ǵ�");
		System.out.println("5. ������ ������");
		System.out.println("�ȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢȢ�");

	}

	public void act7(int user) {
		if (user == 1) {
			System.out.println("���ڻ� : �� �׷� �����Ŷ�!");
			Functions.sleep1000();
			System.out.println("���� " + name + "��");
			Functions.sleep1000();
			System.out.println("������ ���۵Ǵ� ���̴�!");
		} else if (user == 2) {
			System.out.println(name + "�� PC�� Ȯ���ߴ�!");
			Functions.sleep1000();
			System.out.println("���� ������");
			Functions.sleep1000();
			System.out.println("�м����� ����");
			Functions.sleep1000();
			System.out.println("����� ������ �ܶ� ���� �ִ�");
		} else if (user == 3) {
			System.out.println("��� : ���� �ڻ���� �����Դϴ�");
			Functions.sleep1000();
			System.out.println("����� ���ڻ���� �����");
			Functions.sleep1000();
			System.out.println("���� ����� �����ֵ��� ����!");
			Functions.sleep1000();
			System.out.println("������");
			Functions.sleep500();
			System.out.println("�����ε� �� ��Ź�ϰھ��!");
		} else if (user == 4) {
			System.out.println("��ȣ : ���ڻ���� ������");
			Functions.sleep1000();
			System.out.println("�ڻ�԰� �Բ� ���ο�");
			Functions.sleep1000();
			System.out.println("�翵�� ������ �������ϴ�!");
		}
	}

	public void story8() {
		System.out.println("!!!");
		Functions.sleep500();
		System.out.println("ȭ�� : �´�! " + name + "��");
		Functions.sleep1000();
		System.out.println("���ڻ���� ���ͼ�");
		Functions.sleep1000();
		System.out.println("�翵�� ������ ����� ����");
		Functions.sleep1000();
		System.out.println("�ı��鿡�� �̾߱����� �ʾƵ� ������?");
		Functions.sleep1500();
		System.out.println();
		System.out.println("�ָ� ���� �ϵ� �����ϱ�");
		Functions.sleep1000();
		System.out.println("���� �� �δ� ���� ���ٰ� ������");
		Functions.sleep1000();
		System.out.println("�� �׷� �̸�-!");
		Functions.sleep1000();
		System.out.println("... ...");
		Functions.sleep1000();
		System.out.println("������ ���ư��߰ڴ�...");
		Functions.sleep2000();
	}

	public void act8() {
		count = 0;
		while (true) {
			int i = 0;
			System.out.println("������ ���±�");
			int j = 0;
			while (j < 4) {
				while (i < 3) {
					System.out.print(".");
					i++;
					Functions.sleep150();
				}
				System.out.print(" ");
				i = 0;
				j++;
			}
			System.out.println();
			j = 0;
			rand = random.nextInt(3) + 1;
			if (rand == 1) {
				count++;
				if (count == 1) {
					bt.Battle_Start();
					System.out.println("�켺 : �޼��� �ŵ��!");
					Functions.sleep1500();
					System.out.println("�󱸼ҳ�(��Ī õ��) �켺�̰�");
					Functions.sleep1000();
					System.out.println("�ºθ� �ɾ�Դ�!");
					Functions.sleep1000();
					System.out.println("�켺�̴� " + mst.MonName + "�� �����´�!");
					Functions.sleep1000();
					bt.Turn();
				} else if (count == 2) {
					bt.Battle_Start();
					System.out.println("���� : ... ... ... .....");
					Functions.sleep1500();
					System.out.println("������ �����̰�");
					Functions.sleep1000();
					System.out.println("�ºθ� �ɾ�Դ�!");
					Functions.sleep1000();
					System.out.println("�����̴� " + mst.MonName + "�� �����´�!");
					Functions.sleep1000();
					bt.Turn();
				} else if (count == 3) {
					bt.Battle_Start();
					System.out.println("�¿� : ���� �翵�� �º�����!");
					Functions.sleep1500();
					System.out.println("Ʈ������ �¿��̰�");
					Functions.sleep1000();
					System.out.println("�ºθ� �ɾ�Դ�!");
					Functions.sleep1000();
					System.out.println("�¿��̴� " + mst.MonName + "�� �����´�!");
					Functions.sleep1000();
					bt.Turn();
				}
			}
			if (count >= 3) {
				System.out.println("���� �����ߴ�!");
				break;
			}
		}
	}

	public void story_final() {
		System.out.println("���� : ����ʶ� " + name);
		Functions.sleep1000();
		System.out.println("�ʵ� �翵�� �ǰ��ϰ� ���´�?");
		Functions.sleep1000();
		System.out.println("��, ���� ���̴�, " + name + "��?");
		Functions.sleep1000();
		System.out.println();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("�׷����� ���ڻ�����κ���");
		Functions.sleep1000();
		System.out.println("�׷� ������ ���� ��Ź�޾ұ���");
		Functions.sleep1500();
		System.out.println("��-��! ������ �غ��Ŷ�-");
		Functions.sleep1000();
		System.out.println("������ ������ �� �״ϱ�!");
		Functions.sleep1000();
		System.out.println("�´�! �������� �����ϱ� ��������");
		Functions.sleep1000();
		System.out.println("�����Ʈ�� �����!");
		Functions.sleep1500();
		System.out.println("���ݱ��� �־��� �ϵ���");
		Functions.sleep1000();
		System.out.println("�� �����Ʈ�� �ٽ� �о��");
		Functions.sleep1000();
		System.out.println("������ �� �ž�!");
		Functions.sleep1500();
		System.out.println();
		System.out.println("���ڱ���-! ���� ���൵ ������");
		Functions.sleep1000();
		System.out.println("�װ͵� ȥ�ڰ� �ƴ϶�");
		Functions.sleep1000();
		System.out.println("�뼷�̿� �Բ��ݴ�?");
		Functions.sleep1000();
		System.out.println("������ ��� ���� ���� ��������");
		Functions.sleep1000();
		System.out.println("���� ���� �Ҹ��� �ϰ� �ֳ�!");
		Functions.sleep1000();
		System.out.println("��! " + name + "��");
		Functions.sleep1000();
		System.out.println("������ �������ϱ�");
		Functions.sleep1000();
		System.out.println("������ ������ ����!");
		Functions.sleep1000();
		System.out.println("�װ� ���� ���� �ް�");
		Functions.sleep1000();
		System.out.println("���� ���� ������ ����");
		Functions.sleep1000();
		System.out.println("������ �ູ�� �� �״ϱ�!");
		Functions.sleep1500();
		System.out.println();
		System.out.println("...������ ������ ���ƿ��� ���ڳ�");
		Functions.sleep1000();
		System.out.println("�װ� � �翵����");
		Functions.sleep1000();
		System.out.println("��Ҵ��� ������ �˰� �����ϱ�");
		Functions.sleep1000();
		System.out.println();
		System.out.println("�� !!!");
		Functions.sleep500();
		System.out.println(friend + "���� : �Ƿ��մϴ�");
		Functions.sleep1000();
		System.out.println("���⿡ �츮 " + friend + " �Գ���?");
		Functions.sleep1000();
		System.out.println("���� : ��? �� �Դµ�...");
		Functions.sleep1000();
		System.out.println(friend + "���� : �׷�����");
		Functions.sleep1000();
		System.out.println("�׷� ���� ���� ����");
		Functions.sleep1000();
		System.out.println("ū���̳�...");
		Functions.sleep500();
		System.out.println("�� �� ������ ���� �״ϱ�! ���");
		Functions.sleep1000();
		System.out.println("�̾߱��ϰ� ���ĳ��� ���Ⱦ��");
		Functions.sleep1000();
		System.out.println("�� �ְ� �� �����ϰ� ������ ���ŵ��");
		Functions.sleep1000();
		System.out.println("�׷��� �̰͸��� �����ְ� �;��µ�...");
		Functions.sleep1500();
		System.out.println();
		System.out.println("���� : �����ƿ�");
		Functions.sleep1000();
		System.out.println(name + "�̰� ������ �״ϱ��");
		Functions.sleep1000();
		System.out.println("��ġ? " + name + "��");
		Functions.sleep1000();
		System.out.println(friend + " : �׷�?");
		Functions.sleep1000();
		System.out.println("�׷� ��Ź�� �ص� �ǰڴ�?");
		Functions.sleep1500();
		System.out.println(name + "��");
		Functions.sleep1000();
		System.out.println("�̰� " + friend + "���� ������");
		Functions.sleep1000();
		System.out.println("�� ������ ������ �����!");
		Functions.sleep2000();
		System.out.println();
		System.out.println("���� : " + name + "�� �� �ٳ���Ŷ�!");
		Functions.sleep1000();
		System.out.println("���� ���� ��̰� �ϰ� ��!");
		Functions.sleep1000();
		System.out.println(friend + "���� : �׷� " + friend + "�� ��Ź�Ұ�!");
		Functions.sleep1000();
		System.out.println("... ... ... ... ... ...");
		Functions.sleep1000();
		System.out.println("�� �׷��� �ؼ� " + name + "�� ������ ������ �Ǿ���");
		Functions.sleep2000();
		System.out.println("�� ������ �������� ���������� ������");
		Functions.sleep2000();
		System.out.println("�� ������! �翵������ �����!!!...��");
		Functions.sleep2000();
	}
}
