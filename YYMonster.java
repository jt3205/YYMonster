package Project1_YYMonster;

import java.util.*;

public class YYMonster {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int user; // ����� ������ ����
		boolean event2 = false;
		Story st = new Story();
		Battle bt = new Battle();
		st.intro1();
		while (true) {
			st.intro1_choice();
			user = scanner.nextInt();
			if (user == 3)
				break;
			st.intro2(user);
		}
		st.intro3();
		String name; // ����� �̸�
		while (true) {
			System.out.println("�ڳ��� �̸���?");
			name = scanner.next();
			st.intro4(name);
			user = scanner.nextInt();
			if (user == 1)
				break;
		}
		String friend; // ģ�� �̸�
		while (true) {
			st.intro5();
			friend = scanner.next();
			st.intro6(friend);
			user = scanner.nextInt();
			if (user == 1)
				break;
		}
		st.intro7(); // ���� ��
		// ����
		// ������~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		st.story1();
		F1: while (true) { // ���濡�� �Ͼ����
			st.choice1();
			user = scanner.nextInt();
			st.act1(user);
			if (user != 4)
				continue;
			F2: while (true) { // ���� �Žǿ��� �Ͼ����
				if (st.breek2 == false)
					st.story2(); // ģ���� �Ծ���
				if (event2 == true) {
					st.story_final(); // ���� ��@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
					System.out.println("���� ��");
					break F1;
				}
				st.choice2();
				user = scanner.nextInt();
				st.act2(user);
				if (user == 1) // ������ �ö󰡱�
					continue F1;
				else if (user != 4) // ������ ������ ������ �ٽý���
					continue;
				if (st.breek3 == false)
					st.story3(); // Ǯ���� ��������
				F3: while (true) { // ���ٸ���
					st.choice3();
					user = scanner.nextInt();
					if (user == 1) // �������� ����
						continue F2;
					else if (user == 2) { // ���� ����
						while (true) {
							st.choice3_2();
							user = scanner.nextInt();
							st.act3_2(user);
							if (user == 3)
								break;
						}
					} else if (user == 3) { // ���� ����
						while (true) {
							st.choice3_3();
							user = scanner.nextInt();
							st.act3_3(user);
							if (user == 3)
								break;
						}
					} else if (user == 4) {
						F4: while (true) { // ģ�� �� �Ž�
							if (st.breek3_1_1 == false) { // �ʴ�!
								st.story3_1_1();
								continue F3;
							}
							st.choice3_1();
							user = scanner.nextInt();
							st.act3_1(user);
							if (user == 4) // �Žǿ��� ������ ������
								continue F3;
							else if (user == 2) {
								while (true) { // ģ���� �ö��
									if (st.breek3_1_2 == false)
										st.story3_1_2(); // ������ 1000�����̾�!
									st.choice3_1_2(); // ģ���濡�� ������?
									user = scanner.nextInt();
									st.act3_1_2(user);
									if (user == 1)
										continue F4;
								}
							}
						}
					}
					else if(user == 6){
						System.out.println("�̰��� : �߻��� �翵����");
						Functions.sleep1000();
						System.out.println("������ ���� ������");Functions.sleep1000();
						System.out.println("���� ģ���� �� �� �ִ� ���� ����");Functions.sleep1000();
						System.out.println("�翵���̶���!");
					}
					else if(user == 7){
						System.out.println("Dap!.. ��ĩ ��ĩ �ε�ĩ");Functions.sleep1000();
						System.out.println("... ... ...");
						System.out.println("���� �߰��ִ�..");
					}
					if (user == 5 && st.breek3_1_2 == false) {
						st.story3_5();
						continue;
					} else if (user != 5) // ���������� �������ʱ�����
						continue;
					while (true) { // ���������� ���� 201����
						if (st.breek4_4 == false)
							st.story4();
						if (st.event1 == false)
							st.choice4();
						else
							st.choice4_1();
						user = scanner.nextInt();
						if (st.event1 == false) // event1 �� ���ϸ� get�ϰ� ù��Ʋ�Ѱ� Ȯ��
							st.act4(user);
						else if (st.event1 == true) // �ι�° ������ ����� �ൿ
							st.act4_1(user);
						if (user != 1 && st.event1 == false) { // ������ ȣ���ΰ����� ����
							continue;
						}
						if (st.event1 == false) {
							while (true) {
								st.story5(); // �ڻ�� ������ ��ȭ
								while (true) { // �߻� ���ϸ� �� �� ��
									st.choice5(); // ���� �翵���� ����?
									user = scanner.nextInt();
									st.act5(user);
									if (user == 4) { // �뼷�� ���� Ż��
										break;
									}
								}
								bt.battle();
								st.story6();
								st.event1 = true;
								continue F2;
							}
						}
						while (true) { // ���� ���� ����!
							st.story7(); // ��! �Դ�!
							while (true) {
								st.choice7();
								user = scanner.nextInt();
								st.act7(user);
								if (user == 5)
									break;
							}
							st.story8();
							st.act8();
							event2 = true;
							continue F2;
						}
					}
				}
			}
		}
	}
}