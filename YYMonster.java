package Project1_YYMonster;

import java.util.*;

public class YYMonster {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int user; // 사용자 선택지 변수
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
		String name; // 사용자 이름
		while (true) {
			System.out.println("자네의 이름은?");
			name = scanner.next();
			st.intro4(name);
			user = scanner.nextInt();
			if (user == 1)
				break;
		}
		String friend; // 친구 이름
		while (true) {
			st.intro5();
			friend = scanner.next();
			st.intro6(friend);
			user = scanner.nextInt();
			if (user == 1)
				break;
		}
		st.intro7(); // 설명 끗
		// 게임
		// 시이작~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		st.story1();
		F1: while (true) { // 내방에서 일어나는일
			st.choice1();
			user = scanner.nextInt();
			st.act1(user);
			if (user != 4)
				continue;
			F2: while (true) { // 내집 거실에서 일어나는일
				if (st.breek2 == false)
					st.story2(); // 친구가 왔었어
				if (event2 == true) {
					st.story_final(); // 게임 끝@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
					System.out.println("게임 끝");
					break F1;
				}
				st.choice2();
				user = scanner.nextInt();
				st.act2(user);
				if (user == 1) // 방으로 올라가기
					continue F1;
				else if (user != 4) // 밖으로 나가지 않을때 다시실행
					continue;
				if (st.breek3 == false)
					st.story3(); // 풀숲에 들어가지마렴
				F3: while (true) { // 떡잎마을
					st.choice3();
					user = scanner.nextInt();
					if (user == 1) // 내집으로 들어가기
						continue F2;
					else if (user == 2) { // 옆집 들어옴
						while (true) {
							st.choice3_2();
							user = scanner.nextInt();
							st.act3_2(user);
							if (user == 3)
								break;
						}
					} else if (user == 3) { // 뒷집 들어옴
						while (true) {
							st.choice3_3();
							user = scanner.nextInt();
							st.act3_3(user);
							if (user == 3)
								break;
						}
					} else if (user == 4) {
						F4: while (true) { // 친구 집 거실
							if (st.breek3_1_1 == false) { // 꽈당!
								st.story3_1_1();
								continue F3;
							}
							st.choice3_1();
							user = scanner.nextInt();
							st.act3_1(user);
							if (user == 4) // 거실에서 밖으로 나가기
								continue F3;
							else if (user == 2) {
								while (true) { // 친구방 올라옴
									if (st.breek3_1_2 == false)
										st.story3_1_2(); // 늦으면 1000만원이야!
									st.choice3_1_2(); // 친구방에서 무엇을?
									user = scanner.nextInt();
									st.act3_1_2(user);
									if (user == 1)
										continue F4;
								}
							}
						}
					}
					else if(user == 6){
						System.out.println("이가람 : 야생의 양영몬은");
						Functions.sleep1000();
						System.out.println("덤벼들 때도 있지만");Functions.sleep1000();
						System.out.println("좋은 친구가 될 수 있는 존재 역시");Functions.sleep1000();
						System.out.println("양영몬이란다!");
					}
					else if(user == 7){
						System.out.println("Dap!.. 둠칫 둠칫 두둠칫");Functions.sleep1000();
						System.out.println("... ... ...");
						System.out.println("춤을 추고있다..");
					}
					if (user == 5 && st.breek3_1_2 == false) {
						st.story3_5();
						continue;
					} else if (user != 5) // 마을밖으로 나가지않기위해
						continue;
					while (true) { // 마을밖으로 나옴 201번길
						if (st.breek4_4 == false)
							st.story4();
						if (st.event1 == false)
							st.choice4();
						else
							st.choice4_1();
						user = scanner.nextInt();
						if (st.event1 == false) // event1 은 포켓몬 get하고 첫배틀한거 확인
							st.act4(user);
						else if (st.event1 == true) // 두번째 왔을땐 제대로 행동
							st.act4_1(user);
						if (user != 1 && st.event1 == false) { // 무조건 호수로가도록 설정
							continue;
						}
						if (st.event1 == false) {
							while (true) {
								st.story5(); // 박사와 빛나의 대화
								while (true) { // 야생 포켓몬 등 ㅋ 장
									st.choice5(); // 무슨 양영몬을 고를까?
									user = scanner.nextInt();
									st.act5(user);
									if (user == 4) { // 흙섭이 고르면 탈출
										break;
									}
								}
								bt.battle();
								st.story6();
								st.event1 = true;
								continue F2;
							}
						}
						while (true) { // 진모래 마을 도착!
							st.story7(); // 엇! 왔다!
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