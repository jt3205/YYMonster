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
		System.out.println("흐음!!");
		Functions.sleep500();
		System.out.println("잘왔다!");
		Functions.sleep1000();
		System.out.println("양영몬스터의 세계에 온 것을");
		Functions.sleep1000();
		System.out.println("환영한다!");
		Functions.sleep1500();
		System.out.println("내 이름은 남박사!");
		Functions.sleep1000();
		System.out.println("모두가");
		Functions.sleep500();
		System.out.println("자바 선생님이라 부르고있단다");
		Functions.sleep1500();
		System.out.println("그건 그렇고 자네는");
		Functions.sleep1000();
		System.out.println("모험이 처음인겐가?");
		Functions.sleep1500();
		System.out.println("그럼 내가");
		Functions.sleep500();
		System.out.println("이것저것 가르쳐주마!");
		Functions.sleep1500();
		System.out.println("알고 싶은게 무엇인가?");
		Functions.sleep1500();
	}

	public void intro1_choice() {
		System.out.println("1. 조작 방법이란?");
		Functions.sleep300();
		System.out.println("2. 모험이란?");
		Functions.sleep300();
		System.out.println("3. 괜찮다!");
		Functions.sleep300();
	}

	public void intro2(int i) {
		if (i == 1) {
			Functions.sleep1000();
			System.out.println("이 게임은 개발자의 실력이 모자란 관계로");
			Functions.sleep1500();
			System.out.println("선택형 게임으로 진행됩니다.");
			Functions.sleep1500();
			System.out.println("선택하고 싶은 항목의 번호를 입력하는");
			Functions.sleep1500();
			System.out.println("간단한 게임방식으로 이루어져 있습니다.");
			Functions.sleep1500();
			System.out.println("문의 : 박형진 . 010-7205-3242");
			Functions.sleep1000();
			Functions.sleep300();
			System.out.println();
			Functions.sleep500();
			System.out.println("남박사 : 그 밖에 알고 싶은 건 무엇인가?");
			Functions.sleep1000();
		} else if (i == 2) {
			Functions.sleep1000();
			System.out.println("당신은 지금부터 시작될 세계의");
			Functions.sleep1000();
			System.out.println("주인공이 되어");
			Functions.sleep1000();
			System.out.println("모험을 떠납니다.");
			Functions.sleep2000();
			System.out.println("");
			System.out.println("길거리, 집 안, 도로, 풀숲");
			Functions.sleep1000();
			System.out.println("그리고 동굴이나 숲 속...");
			Functions.sleep1000();
			System.out.println("여러 장소에 있는 사람들에게 말을 걸어봐 주십시오.");
			Functions.sleep2000();
			System.out.println("");
			System.out.println("곤경에 처해있는 사람을 도와주거나");
			Functions.sleep1000();
			System.out.println("세세한 사람들에게 말을 걸다 보면");
			Functions.sleep1000();
			System.out.println("게임속에서 자신을 찾을지도 모릅니다.");
			Functions.sleep1500();
			System.out.println("");
			Functions.sleep1000();
			System.out.println("남박사 : 그 밖에 알고 싶은 건 무엇인가?");
			Functions.sleep1000();
		}
	}

	public void intro3() {
		System.out.println("이 세계에는");
		Functions.sleep500();
		System.out.println("양영 몬스터");
		Functions.sleep500();
		System.out.println("줄여서 \"양영몬\"이라 불리는");
		Functions.sleep1000();
		System.out.println("미개한.. 아니 신기한 생명체가");
		Functions.sleep1000();
		System.out.println("도처에 살고 있다!");
		Functions.sleep1500();
		System.out.println("우리 인간은");
		Functions.sleep500();
		System.out.println("양영몬과 사이좋게 살고 있지");
		Functions.sleep1500();
		System.out.println("함께 놀기도 하고");
		Functions.sleep1000();
		System.out.println("힘을 합쳐 일을 하기도 하고");
		Functions.sleep1000();
		System.out.println("그리고 양영몬끼리 싸우게 하여");
		Functions.sleep1000();
		System.out.println("유대감을 돈독히 다지기도 하고...");
		Functions.sleep1500();
		System.out.println("나는 그런 양영몬들을");
		Functions.sleep1000();
		System.out.println("자세히 알기 위해");
		Functions.sleep1000();
		System.out.println("연구하고 있는 것이란다!");
		Functions.sleep1500();
		System.out.println("그건 그렇고 이제 슬슬");
		Functions.sleep1000();
		System.out.println("자네에 대해 알아보도록 하지!");
		Functions.sleep1000();
	}

	public void intro4(String name) {
		this.name = name;
		System.out.println(name + "이로구나?");
		Functions.sleep500();
		System.out.println("1. 예 2. 아니오");
	}

	public void intro5() {
		Functions.sleep500();
		System.out.println("이 소년은 자네의 친구지?");
		Functions.sleep1000();
		System.out.println("그의 이름도");
		Functions.sleep1000();
		System.out.println("가르쳐다오!");
	}

	public void intro6(String friend) {
		this.friend = friend;
		Functions.sleep500();
		System.out.println(friend + "이로군");
		Functions.sleep1000();
		System.out.println("이 이름이 맞는가?");
		Functions.sleep500();
		System.out.println("1. 예 2. 아니오");
	}

	public void intro7() {
		System.out.println("이제부터 ");
		Functions.sleep500();
		System.out.println("너만의 이야기가 시작된다!");
		Functions.sleep1500();
		System.out.println("거기서 너는");
		Functions.sleep500();
		System.out.println("여러 양영몬이나");
		Functions.sleep1000();
		System.out.println("많은 사람들과 만나");
		Functions.sleep1000();
		System.out.println("무언가를 발견하게 되겠지!");
		Functions.sleep1500();
		System.out.println("그럼");
		Functions.sleep500();
		System.out.println("양영몬스터의 세계로!");
		Functions.sleep2000();
	}

	public void story1() {
		System.out.println("TVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV             결국 수색대의                                TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV             노력에도 불구하고                            TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV             색깔이 다른 희귀한 양영몬                    TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV             빨간 흙섧이의 모습은                         TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV             목격조차 한 번                               TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV             할 수 없었습니다...                          TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TV                                                          TV");
		Functions.sleep100();
		System.out.println("TVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTVTV");
		Functions.sleep2000();
		System.out.println("");
		System.out.println("지금까지 특별 방송");
		Functions.sleep1000();
		System.out.println("\"빨간 흙섭이를 쫓아라!\"");
		Functions.sleep1000();
		System.out.println("양영 네트워크에서");
		Functions.sleep1000();
		System.out.println("소프트TV방송국이 보내드렸습니다");
	}

	public void choice1() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("현재 위치 : " + name + "의 방");
		Functions.sleep1000();
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
		System.out.println("무엇을 할까?");
		System.out.println("1. TV를 본다 2. 침대에 눕는다");
		System.out.println("3. PC를 확인한다 4. 거실로 내려간다");
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
	}

	public void act1(int user) {
		if (user == 1)
			System.out.println("TV에는 게임 타이틀이 나오고 있다.");
		else if (user == 2)
			System.out.println("잠이 오지 않는다.. 내려갈까");
		else if (user == 3) {
			System.out.println(name + "는 PC를 확인했다");
			Functions.sleep1000();
			System.out.println("양영몬 기초지식!");
			Functions.sleep1000();
			System.out.println("이 세계에는 양영몬과");
			Functions.sleep1000();
			System.out.println("사람이 함께 살고 있습니다");
			Functions.sleep1000();
			System.out.println("양영몬을 싸우게 하는 사람을");
			Functions.sleep1000();
			System.out.println("양영몬 트레이너라고 합니다");
		}
	}

	boolean breek2;

	public void story2() {
		System.out.println("엄마 : " + name + "아!");
		Functions.sleep1000();
		System.out.println("아까 " + friend + "가");
		Functions.sleep1000();
		System.out.println("너를 찾아왔단다");
		Functions.sleep1000();
		System.out.println("무슨 일인지는 모르겠다만");
		Functions.sleep1000();
		System.out.println("아주 급한 일인가 봐!");
		breek2 = true;
	}

	public void choice2() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("현재 위치 : " + name + "의 집 거실");
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
		System.out.println("무엇을 할까?");
		System.out.println("1. 올라간다 2. 엄마에게 말을건다");
		System.out.println("3. TV를 본다 4. 밖으로 나간다 ");
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
	}

	public void act2(int user) {
		if (user == 2) {
			System.out.println("엄마 : 다녀오너라 " + name + "아!");
			Functions.sleep1000();
			System.out.println("어디 다치지 말고!");
		} else if (user == 3) {
			System.out.println("기자 : 오늘은 양영몬스터의 제작자");
			Functions.sleep1000();
			System.out.println("박형진 군을 인터뷰 해보겠습니다!");
			Functions.sleep1000();
			System.out.println("박형진 : 정말 양영몬스터 만들기 힘드네요 쓰읍...");
			Functions.sleep1500();
		}
	}

	boolean breek3;

	public void story3() {
		System.out.println("엄마 : 맞아! " + name + "아!");
		Functions.sleep1000();
		System.out.println("풀숲에 들어가면 안 된단다!");
		Functions.sleep1000();
		System.out.println("야상의 양영몬이 달려드니까");
		Functions.sleep1000();
		System.out.println("네 양영몬이 있다면");
		Functions.sleep1000();
		System.out.println("괜찮을지 모르겠지만...");
		Functions.sleep1000();
		breek3 = true;
	}

	public void choice3() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("현재 위치 : 떡잎마을");
		Functions.sleep1000();
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
		System.out.println("무엇을 할까?");
		System.out.println("1. " + name + "의 집에간다 2. 옆집에 간다");
		System.out.println("3. 뒷집에 간다 4. " + friend + "의 집에간다");
		System.out.println("5. 마을을 벗어난다 6. 이가람에게 말을건다");
		System.out.println("7. 미국소년 김예준에게 말을건다");
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
	}

	boolean breek3_1_1 = false;

	public void story3_1_1() {
		System.out.println("꽈당!!");
		Functions.sleep500();
		System.out.println(friend + " : 뭐야-!");
		Functions.sleep1000();
		System.out.println("어라, 너 " + name + "이잖아!");
		Functions.sleep1000();
		System.out.println("이봐! 호수에 갈 테니까");
		Functions.sleep1000();
		System.out.println("빨리 와!");
		Functions.sleep1000();
		System.out.println();
		System.out.println("알았냐 " + name + "? 늦으면");
		Functions.sleep1000();
		System.out.println("벌금 100만 원이야!");
		Functions.sleep1000();
		System.out.println("... ... ... ...");
		Functions.sleep1000();
		System.out.println();
		System.out.println(friend + " : 아! 깜빡한 게 있다!");
		Functions.sleep1000();
		System.out.println(friend + "는 다시 집으로 들어가버렸다");
		breek3_1_1 = true;
	}

	boolean breek3_1_2 = false;

	public void story3_1_2() {
		System.out.println(friend + " : ...가방이랑");
		Functions.sleep1000();
		System.out.println("모험노트도 들고 가볼까");
		Functions.sleep1000();
		System.out.println();
		System.out.println("! 오옷! " + name + "!");
		Functions.sleep500();
		System.out.println("호수에 가자!");
		Functions.sleep1000();
		System.out.println("도로에서 기다릴 테니까");
		Functions.sleep1000();
		System.out.println("늦으면 벌금 1000만 원이야!");
		Functions.sleep1000();
		System.out.println();
		System.out.println("가버렸다...");
		breek3_1_2 = true;
	}

	public void choice3_1() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("현재 위치 : " + friend + "의 집");
		Functions.sleep1000();
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
		System.out.println("무엇을 할까?");
		System.out.println("1. " + friend + "의 엄마에게 말을건다");
		System.out.println("2. " + friend + "의 방으로 올라간다. ");
		System.out.println("3. TV를 본다 4. 밖으로 나간다");
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
	}

	public void act3_1(int user) {
		if (user == 1) {
			System.out.println(friend + "엄마 : 아 " + name + "이니?");
			Functions.sleep1000();
			System.out.println(friend + " 찾아왔구나?");
			Functions.sleep1000();
			System.out.println("그 애 방금 나갔었는데");
			Functions.sleep1000();
			System.out.println("바로 돌아왔지 뭐니");
			Functions.sleep1000();
			System.out.println("정말 가만히 있지를 않는구나");
			Functions.sleep1000();
			System.out.println("누굴 닮아서 저럴까?");
			Functions.sleep1000();
		} else if (user == 3) {
			System.out.println("TV엔 Show Me The Money 가 나오고 있다");
		}
	}

	public void choice3_1_2() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("현재 위치 : " + friend + "의 방");
		Functions.sleep1000();
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
		System.out.println("무엇을 할까?");
		System.out.println("1. 내려간다 2. 침대에 눕는다");
		System.out.println("3. TV를 본다 4. PC를 확인한다");
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
	}

	public void act3_1_2(int user) {
		if (user == 2)
			System.out.println("친구네 집이라 잠이오지 않는다...");
		else if (user == 3)
			System.out.println("TV가 꺼져 있다");
		else if (user == 4)
			System.out.println("PC는 비밀번호가 걸려있다");
	}

	public void choice3_2() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("현재 위치 : 옆집");
		Functions.sleep1000();
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
		System.out.println("무엇을 할까?");
		System.out.println("1. 서유빈할머니 에게 말을 건다");
		System.out.println("2. 박조윤어린이 에게 말을 건다");
		System.out.println("3. 밖으로 나간다");
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
	}

	public void act3_2(int user) {
		if (user == 1) {
			System.out.println("서유빈 : 들었느냐?");
			Functions.sleep1000();
			System.out.println("양디고 소프트과에 새로운 선생님이");
			Functions.sleep1000();
			System.out.println("오셨다고 한다");
			Functions.sleep1000();
			System.out.println("뭔가 대단한 학생이라도");
			Functions.sleep1000();
			System.out.println("키우시려고 온겐가");
		} else if (user == 2) {
			System.out.println(name + " : 저기.. 저기요??");
			Functions.sleep1000();
			System.out.println("박조윤 : ... ... ... ...");
			Functions.sleep1500();
			System.out.println("핸드폰에 빠져 듣지 못하는듯 하다");
		}
	}

	public void choice3_3() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("현재 위치 : 뒷집");
		Functions.sleep1000();
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
		System.out.println("무엇을 할까?");
		System.out.println("1. 지민이 에게 말을건다");
		System.out.println("2. TV를 본다\t3. 밖으로 나간다");
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
	}

	public void act3_3(int user) {
		if (user == 1) {
			System.out.println("지민 : 또 " + friend + "와 함께 놀 거지?");
			Functions.sleep1000();
			System.out.println("정말 단짝 친구로구나");
		} else if (user == 2) {
			System.out.println("오늘은 이 게임의 제작자인");
			Functions.sleep1000();
			System.out.println("박형진 씨를 인터뷰해보겠습니다");
			Functions.sleep1000();
			System.out.println("박형진 : 내가 짜면서도 오글거려 죽겠다;;");
		}

	}

	public void story3_5() {
		System.out.println("영채 : 오오!" + name + " 아닌가");
		Functions.sleep1000();
		System.out.println(friend + "가 찾았단다");
		Functions.sleep1000();
		System.out.println("그 녀석 집에");
		Functions.sleep1000();
		System.out.println("가보는 건 어때?");
	}

	boolean breek4_4 = false;

	public void story4() {
		System.out.println(friend + " : 있지 있지");
		Functions.sleep1000();
		System.out.println("아까 TV 봤지?");
		Functions.sleep1000();
		System.out.println("\"빨간 흙섭이를 쫓아라!");
		Functions.sleep1000();
		System.out.println("호수에 나타난");
		Functions.sleep1000();
		System.out.println("분노의 양영몬의 수수께끼!!\"");
		Functions.sleep1000();
		System.out.println();
		System.out.println("나 생각해 봤는데 말야");
		Functions.sleep1000();
		System.out.println("저 호수에도");
		Functions.sleep1000();
		System.out.println("그런 양영몬이 반드시 있을 거라고!");
		Functions.sleep1000();
		System.out.println("그러니까 말야 나와 네가");
		Functions.sleep1000();
		System.out.println("그녀석을 발견하러 가는 거야!");
		breek4_4 = true;
	}

	public void choice4() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("현재 위치 : 201번길");
		Functions.sleep1000();
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
		System.out.println("무엇을 할까?");
		System.out.println("1. 왼쪽길(호수 방향)으로 간다");
		System.out.println("2. 오른쪽 풀숲길(진모래마을 방향)으로 간다");
		System.out.println("3. " + friend + "에게 말을 건다");
		System.out.println("4. 마을로 되돌아간다");
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
	}

	public void choice4_1() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("현재 위치 : 201번길");
		Functions.sleep1000();
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
		System.out.println("무엇을 할까?");
		System.out.println("1. 왼쪽길(호수 방향)으로 간다");
		System.out.println("2. 오른쪽 풀숲길(백모래마을 방향)으로 간다");
		System.out.println("3. 마을로 되돌아간다");
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
	}

	public void act4(int user) {
		if (user == 2) {
			System.out.println("엄마의 말씀을 떠올렸다!");
			Functions.sleep1000();
			System.out.println("엄마 :" + name + "아!");
			Functions.sleep1000();
			System.out.println("풀숲에 들어가면 안 된단다!");
			Functions.sleep1000();
			System.out.println("야상의 양영몬이 달려드니까");
			Functions.sleep1000();
			System.out.println("네 양영몬이 있다면");
			Functions.sleep1000();
			System.out.println("괜찮을지 모르겠지만...");
		} else if (user == 3) {
			System.out.println(friend + " : 이렇게 떠들고 있지만 말고");
			Functions.sleep1000();
			System.out.println("어서 호수에 가자");
			Functions.sleep1000();
			System.out.println("나 벌써 근질근질해서");
			Functions.sleep1000();
			System.out.println("못 참겠어-!!");
		} else if (user == 4) {
			System.out.println(friend + " : 어이!");
			Functions.sleep1000();
			System.out.println("어디 가는 거야!?");
			Functions.sleep1000();
			System.out.println("환상의 양영몬이!");
			Functions.sleep1000();
			System.out.println("나를 부르고 있단 말이다!");
			Functions.sleep1000();
			System.out.println("마을로 되돌아갈 것 같으냐!");
		}
	}

	boolean event1 = false;
	int rand;
	int count = 0;
	Battle bt = new Battle();

	public void act4_1(int user) {
		if (user == 1) { // 호수에 갔을때 그냥돌아감
			System.out.println("아무것도 없고 호수만 있다.. 돌아가자");
		} else if (user == 2) { // 진모래 마을로 가기
			while (true) {
				int i = 0;
				System.out.println("진모래 마을로 가는길");
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
						System.out.println("현수 : 북다닥 다다닥 야~~!!");
						Functions.sleep1000();
						System.out.println("초능력자 현수가");
						Functions.sleep500();
						System.out.println("승부를 걸어왔다!");
						Functions.sleep1500();
						System.out.println("현수는 " + mst.MonName + "을 내보냈다!");
						Functions.sleep1000();
						bt.Turn();
					} else if (count == 2) {
						bt.Battle_Start();
						System.out.println("동환 : 니콘니코니!");
						Functions.sleep1000();
						System.out.println("오타쿠 동환이가");
						Functions.sleep500();
						System.out.println("승부를 걸어왔다!");
						Functions.sleep1500();
						System.out.println("동환이는 " + mst.MonName + "을 내보냈다!");
						Functions.sleep1000();
						bt.Turn();
					} else if (count == 3) {
						bt.Battle_Start();
						System.out.println("성훈 : 내 오른팔에 잠든 흑염룡이여...");
						Functions.sleep1000();
						System.out.println("중2병 환자 성훈이가");
						Functions.sleep500();
						System.out.println("승부를 걸어왔다!");
						Functions.sleep1500();
						System.out.println("성훈이는 " + mst.MonName + "을 내보냈다!");
						Functions.sleep1000();
						bt.Turn();
					}
				}
				if (count >= 3) {
					System.out.println("진모래 마을에 도착했다!");
					break;
				}
			}

		}
	}

	public void story5() {
		System.out.println(friend + " : 좋아 ! 호수다!");
		Functions.sleep1000();
		System.out.println("빨간 흙섭이 찾아내고 말겠어!");
		Functions.sleep1000();
		System.out.print("...");
		Functions.sleep300();
		System.out.println("...");
		Functions.sleep300();
		System.out.println(friend + " : 뭐야...?");
		Functions.sleep1000();
		System.out.println();
		System.out.println("윤화니 : 박사님! 저쪽도 특별한 건");
		Functions.sleep1000();
		System.out.println("아무것도 없어요!");
		Functions.sleep1000();
		System.out.println("박사 : 으음...");
		Functions.sleep500();
		System.out.println("그렇구나 내가 좀 예민했나");
		Functions.sleep1000();
		System.out.println("어쩐지 옛날하고는");
		Functions.sleep1000();
		System.out.println("조금 다른 것 같은데...");
		Functions.sleep1000();
		System.out.println("뭐 이 호수를 봤으니");
		Functions.sleep1000();
		System.out.println("이걸로 만족해야겠군!");
		Functions.sleep1500();
		System.out.println();
		System.out.println("화니!");
		Functions.sleep500();
		System.out.println("그럼 돌아가도록 하지");
		Functions.sleep1000();
		System.out.println("윤화니 : 그런데 박사님,");
		Functions.sleep1000();
		System.out.println("4년만에 찾은 신오지방은");
		Functions.sleep1000();
		System.out.println("어떤 느낌이에요?");
		Functions.sleep1500();
		System.out.println();
		System.out.println("박사 : ...음");
		Functions.sleep500();
		System.out.println("신오지방에는");
		Functions.sleep500();
		System.out.println("신비한 양영몬이 많아");
		Functions.sleep1000();
		System.out.println("연구하는 보람이 있을거야");
		Functions.sleep1000();
		System.out.println();
		System.out.println("박사가 이쪽으로 다가온다..");
		Functions.sleep1500();
		System.out.println("박사 : 실례!");
		Functions.sleep500();
		System.out.println("좀 지나가마");
		Functions.sleep500();
		System.out.println("윤화니 : 죄송합니다...");
		Functions.sleep1000();
		System.out.println("잠깐 지나가겠습니다");
		Functions.sleep1000();
		System.out.println();
		System.out.println(friend + " : 뭐야?");
		Functions.sleep1000();
		System.out.println("지금 두사람...");
		Functions.sleep1000();
		System.out.println("얼라? " + friend + "!");
		Functions.sleep1000();
		System.out.println("잠깐 보러 가자!");
		Functions.sleep1000();
		System.out.println("... ... ... ... ... ...");
		Functions.sleep1000();
		System.out.println("... ... ... ... ... ...");
		Functions.sleep1000();
		System.out.println("뭐야?");
		Functions.sleep500();
		System.out.println("풀숲에 들어가지 말라고?");
		Functions.sleep1000();
		System.out.println("괜찮아! 괜찮아!");
		Functions.sleep1000();
		System.out.println("잠깐이면");
		Functions.sleep500();
		System.out.println("양영몬도 안 나온다니까?");
		Functions.sleep1000();
		System.out.println();
		System.out.println("풀숲에 들어왔다...");
		Functions.sleep1500();
		System.out.println();
		System.out.println("가방...이다...");
		Functions.sleep1000();
		System.out.println("아까 그 사람이 두고 간 거구나");
		Functions.sleep1000();
		System.out.println("어떡하면 좋지?");
		Functions.sleep1500();
		System.out.println("갖다주려고 해도 지금 누구였지?");
		Functions.sleep1000();
		System.out.println("박사라고 했는데...");
		Functions.sleep2000();
		System.out.println("!-!?-!?-?!?-!?-?!?-!??-!??-!?!!");
		Functions.sleep500();
		System.out.println("와왓!");
		Functions.sleep500();
		System.out.println("풋 양영몬!?");
		Functions.sleep1000();
		System.out.println("뭐야 이건-!");
		Functions.sleep1000();
		System.out.println("몬스터볼이다!!");
		Functions.sleep1000();
		System.out.println("이것으로 싸우자!");
		Functions.sleep1000();
	}

	public void choice5() {
		System.out.println("자...");
		Functions.sleep300();
		System.out.println("어느 것으로 할까?");
		Functions.sleep1000();
		System.out.println("1. 불꽃숭이 2. 팽도리 3. 모부기 4. 흙섭이");
	}

	public void act5(int user) {
		if (user != 4) {
			Functions.sleep500();
			System.out.println("아니야... 왠지 흙섭이에게");
			Functions.sleep1000();
			System.out.println("손이 가는걸?");
		} else if (user == 4) {
			System.out.println("그래 흙섭이가 좋겠어!");
		}
	}

	public void story6() {
		System.out.println(friend + " : 후와-!");
		Functions.sleep1000();
		System.out.println("네 흙섭이 대단한걸!");
		Functions.sleep1000();
		System.out.println("내 통쿡이가");
		Functions.sleep500();
		System.out.println("훨씬 더 강했었지만 말야!");
		Functions.sleep1000();
		System.out.println("...근데 나도 너도");
		Functions.sleep1000();
		System.out.println("다른 사람 포켓몬 썼는데");
		Functions.sleep1000();
		System.out.println("괜찮은 거지...?");
		Functions.sleep1500();
		System.out.println();
		System.out.println("윤화니가 뛰어온다...");
		Functions.sleep1500();
		System.out.println();
		System.out.println("다행이다! 가방 있다!");
		Functions.sleep1000();
		System.out.println("박사님께 혼날 뻔했어!");
		Functions.sleep1000();
		System.out.println("어? 어?");
		Functions.sleep500();
		System.out.println("혹시 너희");
		Functions.sleep500();
		System.out.println("양영몬 썼어!?");
		Functions.sleep1500();
		System.out.println();
		System.out.println("어-엇! 어쩌지!?");
		Functions.sleep1000();
		System.out.println("박사님 무슨 말씀을 하실까");
		Functions.sleep1500();
		System.out.println("...일단");
		Functions.sleep500();
		System.out.println("이 가방은 가져갈게");
		Functions.sleep1500();
		System.out.println();
		System.out.println(friend + " : 뭐야 저 녀석...");
		Functions.sleep1000();
		System.out.println(name + "!");
		Functions.sleep1000();
		System.out.println("일단 여기서 나갈까...");
		Functions.sleep1000();
		System.out.println("아까 싸우면서");
		Functions.sleep1000();
		System.out.println("내 양영몬도 다쳤고...");
		Functions.sleep1000();
		System.out.println("다시 양영몬이 습격하면");
		Functions.sleep1000();
		System.out.println("좀 위험할거야...");
		Functions.sleep1500();
		System.out.println();
		System.out.println("호수 밖으로 나왔다..");
		Functions.sleep2000();
		System.out.println();
		System.out.println(friend + " : 너 먼저 가");
		Functions.sleep1000();
		System.out.println("...양영몬이야 당연히");
		Functions.sleep1000();
		System.out.println("돌려주러 가야 하겠지만");
		Functions.sleep1000();
		System.out.println("난 좀 더 이 녀석과");
		Functions.sleep1000();
		System.out.println("같이 있고 싶거든...");
		Functions.sleep1500();
		System.out.println();
		System.out.println("... ... ... ...");
		Functions.sleep1000();
		System.out.println("집으로 가고있다..");
		Functions.sleep200();
		System.out.println("");
		System.out.println("!!!");
		System.out.println(friend + " : 앗, 아까 그 사람이다!");
		Functions.sleep1000();
		System.out.println("지금 우리 노려보고 있지 않냐?");
		Functions.sleep1500();
		System.out.println("박사 : ... ... ...");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("화니에게 들었다만");
		Functions.sleep1000();
		System.out.println("양영몬을 쓴 것 같더구나?");
		Functions.sleep1000();
		System.out.println("어디 보여다오");
		Functions.sleep1500();
		System.out.println("흐음...");
		Functions.sleep500();
		System.out.println("흙섭이에 통쿡이인가...");
		Functions.sleep1000();
		System.out.println("흐음...");
		Functions.sleep1000();
		System.out.println("그런가, 그렇다는 말인가");
		Functions.sleep1000();
		System.out.println("화니! 연구소로 돌아가자!");
		Functions.sleep1000();
		System.out.println("윤화니 : 아 네!");
		Functions.sleep1000();
		System.out.println("박사님 기다려주세요!");
		Functions.sleep1000();
		System.out.println("나중에 연구소로 오는 편이 좋겠지...?");
		Functions.sleep1000();
		System.out.println("자 그럼 또 보자");
		Functions.sleep1500();
		System.out.println("");
		System.out.println(friend + " : 뭐야 이건...");
		Functions.sleep1000();
		System.out.println("화가 났으면 화를 내든지...");
		Functions.sleep1000();
		System.out.println("게다가 포켓몬은");
		Functions.sleep1000();
		System.out.println("돌려주지 않아도 괜찮단 말인가?...");
		Functions.sleep1000();
		System.out.println(name + "...");
		Functions.sleep1000();
		System.out.println("우리도 돌아가자...");
		Functions.sleep1500();
		System.out.println();
		System.out.println("집에 돌아왔다..");
		Functions.sleep1500();
		System.out.println();
		System.out.println("엄마 : 그건 그렇고 무슨 일이니?");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("그런 일이 있었구나");
		Functions.sleep1000();
		System.out.println("하지만 너도 " + friend + "도");
		Functions.sleep1000();
		System.out.println("무사해서 다행이다");
		Functions.sleep1000();
		System.out.println();
		System.out.println("그 박사님이라는 사람 아마도");
		Functions.sleep1000();
		System.out.println("잔모래마을의 남박사님이겠구나");
		Functions.sleep1500();
		System.out.println("양영몬 연구에서는");
		Functions.sleep1000();
		System.out.println("유명한 박사님이라고 들었단다");
		Functions.sleep1000();
		System.out.println("그리고 무섭다는 소문도...");
		Functions.sleep2000();
		System.out.println();
		System.out.println(name + "아");
		Functions.sleep500();
		System.out.println("어째서 양영몬을 썼는지");
		Functions.sleep1000();
		System.out.println("정확히 설명을 드리기 위해서");
		Functions.sleep1000();
		System.out.println("잔모래마을에 가야겠구나");
		Functions.sleep1500();
		System.out.println();
		System.out.println("괜찮아!");
		Functions.sleep500();
		System.out.println("분명 이해를 해 주실거야");
		Functions.sleep1000();
		System.out.println("잔모래마을에 가는 것 자체가");
		Functions.sleep1000();
		System.out.println("일종의 모험이네?");
		Functions.sleep1000();
		System.out.println("눈 깜짝할 새 갔다오렴아!");
	}

	public void story7() {
		System.out.println("!");
		Functions.sleep300();
		System.out.println("화니 : 앗! 왔다!");
		Functions.sleep1000();
		System.out.println("나를 따라와!");
		Functions.sleep1000();
		System.out.println("박사님이 기다리고 계시니까!");
		Functions.sleep1000();
		System.out.println();
		System.out.println("봐봐! 여기가");
		Functions.sleep1000();
		System.out.println("포켓몬 연구소!");
		Functions.sleep1000();
		System.out.println("안에서...");
		Functions.sleep1500();
		System.out.println("꽈당!!!");
		Functions.sleep500();
		System.out.println(friend + " : 이건 뭐야-!");
		Functions.sleep1000();
		System.out.println("에이 " + name + "이었냐!");
		Functions.sleep1000();
		System.out.println("저 박사...");
		Functions.sleep1000();
		System.out.println("무섭다고 해야 하나 제멋대로야!");
		Functions.sleep1000();
		System.out.println("뭐 괜찮아... " + name + "!");
		Functions.sleep1000();
		System.out.println("나 간다! 그럼 이만!");
		Functions.sleep1000();
		System.out.println();
		System.out.println("화니 : 뭐야!?");
		Functions.sleep1000();
		System.out.println("네 친구는");
		Functions.sleep500();
		System.out.println("엄청 성급하구나");
		Functions.sleep1000();
		System.out.println("뭐 괜찮아");
		Functions.sleep500();
		System.out.println("안으로 들어가자");
		Functions.sleep1000();
		System.out.println("");
		System.out.println("연구소 안으로 들어왔다..");
		Functions.sleep1000();
		System.out.println("박사 : ... ... ...");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("드디어 왔느냐");
		Functions.sleep1000();
		System.out.println(name + "이라고 했지?");
		Functions.sleep1000();
		System.out.println("다시 한 번 양영몬을 보여다오");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("흐음...");
		Functions.sleep500();
		System.out.println("과연...");
		Functions.sleep500();
		System.out.println("이 양영몬은");
		Functions.sleep1000();
		System.out.println("왠지 기뻐하는 것 같아 보이는군");
		Functions.sleep1500();
		System.out.println();
		System.out.println("으음 알겠다!");
		Functions.sleep1000();
		System.out.println("그 흙섭이는");
		Functions.sleep1000();
		System.out.println("너에게 선물로 주겠다");
		Functions.sleep1000();
		System.out.println("호수에서의 일은");
		Functions.sleep1000();
		System.out.println("아까 " + friend + "로부터 들었다");
		Functions.sleep1000();
		System.out.println("처음인데도");
		Functions.sleep1000();
		System.out.println("훌륭하게 양영몬과 싸웠다고");
		Functions.sleep1000();
		System.out.println("게다가 내가 봤더니");
		Functions.sleep1000();
		System.out.println("너와 양영몬 사이에");
		Functions.sleep1000();
		System.out.println("조금이나마 유대감이 생긴 것 같더구나");
		Functions.sleep2000();
		System.out.println();
		System.out.println("그렇기에 흙섭이를");
		Functions.sleep1000();
		System.out.println("너에게 맞겨볼까 한다");
		Functions.sleep1000();
		System.out.println();
		System.out.println("화니 : 네가 포켓몬을");
		Functions.sleep1000();
		System.out.println("소중히 다루는 사람이라 다행이야!");
		Functions.sleep1000();
		System.out.println("그렇지 않았다면...");
		Functions.sleep1000();
		System.out.println("아아 말 못하겠어...");
		Functions.sleep2000();
		System.out.println();
		System.out.println("박사 : 음 흠흠");
		Functions.sleep1000();
		System.out.println("그건 그렇고 본론으로 들어가자");
		Functions.sleep1000();
		System.out.println("너에게 부탁하고 싶은 것이 있다");
		Functions.sleep2000();
		System.out.println("나는 남박사라고 한다!");
		Functions.sleep1000();
		System.out.println("양영몬 연구를 하고 있지");
		Functions.sleep1000();
		System.out.println("우선 신오지방에는");
		Functions.sleep1000();
		System.out.println("어떠한 양영몬이 있는지");
		Functions.sleep1000();
		System.out.println("그 모든 것을 알고 싶구나");
		Functions.sleep1000();
		System.out.println("그러려면 양영몬 도감에");
		Functions.sleep1000();
		System.out.println("기록해 나갈 필요가 있다!");
		Functions.sleep2000();
		System.out.println();
		System.out.println("그런 까닭으로 부탁을 하는 것이다!");
		Functions.sleep1500();
		System.out.println("이 양영몬 도감을 부탁할 테니");
		Functions.sleep1000();
		System.out.println("너는 신오지방에 있는");
		Functions.sleep1000();
		System.out.println("모든 양영몬을 보고 오너라! ...");
		Functions.sleep1000();
		System.out.println();
		System.out.println("남박사 : 그 양영몬 도감은");
		Functions.sleep1000();
		System.out.println("네가 만난 양영몬을");
		Functions.sleep1000();
		System.out.println("자동적으로 기록해 나가는");
		Functions.sleep1000();
		System.out.println("하드테크 도구다!");
		Functions.sleep1000();
		System.out.println("");
		System.out.println("그러니까 너는");
		Functions.sleep1000();
		System.out.println("다양한 장소로 가서");
		Functions.sleep1000();
		System.out.println("모든 양영몬과 만나도록 하거라!");
		Functions.sleep1500();
		System.out.println("화니 : 나도 똑같은 것을 가지고 있어!");
		Functions.sleep1500();
		System.out.println();
		System.out.println("남박사 : 양영몬과 함께");
		Functions.sleep1000();
		System.out.println("201번도로를 걷고 있을때");
		Functions.sleep1000();
		System.out.println("어떤 기분이였느냐?");
		Functions.sleep1500();
		System.out.println("나는 벌써 태어난 지");
		Functions.sleep1000();
		System.out.println("60년이라는 세월이 흘렀지만");
		Functions.sleep1000();
		System.out.println("지금도 역시 양영몬과 함께");
		Functions.sleep1000();
		System.out.println("있는 것만으로도 가슴이 뛰곤 한다");
		Functions.sleep2000();
		System.out.println();
		System.out.println("알겠느냐? 세상에는 매우");
		Functions.sleep1000();
		System.out.println("많은 양영몬들이 있다!");
		Functions.sleep1000();
		System.out.println("즉 그만큼");
		Functions.sleep500();
		System.out.println("많은 설렘이 기다리고 있다는 얘기지");
		Functions.sleep1000();
		System.out.println("자 그럼 가보거라!");
		Functions.sleep1000();
		System.out.println("지금 " + name + "의");
		Functions.sleep1000();
		System.out.println("모험이 시작되는 것이다!");
		Functions.sleep1500();
		System.out.println();
		System.out.println("화니 : 내가 처음으로 썼던");
		Functions.sleep1000();
		System.out.println("양영몬은 팽도리란다");
		Functions.sleep1000();
		System.out.println("어쩌면 네가 호수에서");
		Functions.sleep1000();
		System.out.println("팽도리를 골랐다면");
		Functions.sleep1000();
		System.out.println("우리는 같았을 텐데 말야");
		Functions.sleep1500();
		System.out.println("뭐 어쨌든 상관없겠지...");
		Functions.sleep1000();
		System.out.println();
		System.out.println("나도 박사님의 부탁을 받아서");
		Functions.sleep1000();
		System.out.println("도감의 페이지를 채우고 있어");
		Functions.sleep1000();
		System.out.println("그러니까 너랑 나랑 같은 거야");
		Functions.sleep1000();
		System.out.println("내가 너보다는 조금");
		Functions.sleep1000();
		System.out.println("선배라고 할 수 있겠지");
		Functions.sleep1500();
		System.out.println("내가 이것저것 가르쳐줄게");
		Functions.sleep1000();
		System.out.println("그럼 잘 부탁해! " + name + "!");
	}

	public void choice7() {
		Functions.sleep1000();
		System.out.println("");
		System.out.println("현재 위치 : 남박사네 연구소");
		Functions.sleep1000();
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");
		System.out.println("무엇을 할까?");
		System.out.println("1. 남박사 에게 말을건다");
		System.out.println("2. PC를 확인한다");
		System.out.println("3. 신재규 조수에게 말을건다");
		System.out.println("4. 이운호 조수에게 말을건다");
		System.out.println("5. 밖으로 나간다");
		System.out.println("▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥");

	}

	public void act7(int user) {
		if (user == 1) {
			System.out.println("남박사 : 자 그럼 가보거라!");
			Functions.sleep1000();
			System.out.println("지금 " + name + "의");
			Functions.sleep1000();
			System.out.println("모험이 시작되는 것이다!");
		} else if (user == 2) {
			System.out.println(name + "은 PC를 확인했다!");
			Functions.sleep1000();
			System.out.println("각종 전문용어나");
			Functions.sleep1000();
			System.out.println("학술용어와 같은");
			Functions.sleep1000();
			System.out.println("어려운 말들이 잔뜩 쓰여 있다");
		} else if (user == 3) {
			System.out.println("재규 : 나는 박사님의 조수입니다");
			Functions.sleep1000();
			System.out.println("당신은 남박사님을 도우니");
			Functions.sleep1000();
			System.out.println("나는 당신을 도와주도록 하죠!");
			Functions.sleep1000();
			System.out.println("하하하");
			Functions.sleep500();
			System.out.println("앞으로도 잘 부탁하겠어요!");
		} else if (user == 4) {
			System.out.println("운호 : 남박사님은 관동의");
			Functions.sleep1000();
			System.out.println("박사님과 함께 새로운");
			Functions.sleep1000();
			System.out.println("양영몬 도감을 만들었답니다!");
		}
	}

	public void story8() {
		System.out.println("!!!");
		Functions.sleep500();
		System.out.println("화니 : 맞다! " + name + "아");
		Functions.sleep1000();
		System.out.println("마박사님을 도와서");
		Functions.sleep1000();
		System.out.println("양영몬 도감을 만드는 것을");
		Functions.sleep1000();
		System.out.println("식구들에게 이야기하지 않아도 괜찮니?");
		Functions.sleep1500();
		System.out.println();
		System.out.println("멀리 가는 일도 있으니까");
		Functions.sleep1000();
		System.out.println("말을 해 두는 편이 좋다고 생각해");
		Functions.sleep1000();
		System.out.println("자 그럼 이만-!");
		Functions.sleep1000();
		System.out.println("... ...");
		Functions.sleep1000();
		System.out.println("집으로 돌아가야겠다...");
		Functions.sleep2000();
	}

	public void act8() {
		count = 0;
		while (true) {
			int i = 0;
			System.out.println("집으로 가는길");
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
					System.out.println("우성 : 왼손은 거들뿐!");
					Functions.sleep1500();
					System.out.println("농구소년(자칭 천재) 우성이가");
					Functions.sleep1000();
					System.out.println("승부를 걸어왔다!");
					Functions.sleep1000();
					System.out.println("우성이는 " + mst.MonName + "을 내보냈다!");
					Functions.sleep1000();
					bt.Turn();
				} else if (count == 2) {
					bt.Battle_Start();
					System.out.println("지석 : ... ... ... .....");
					Functions.sleep1500();
					System.out.println("조용한 지석이가");
					Functions.sleep1000();
					System.out.println("승부를 걸어왔다!");
					Functions.sleep1000();
					System.out.println("지석이는 " + mst.MonName + "을 내보냈다!");
					Functions.sleep1000();
					bt.Turn();
				} else if (count == 3) {
					bt.Battle_Start();
					System.out.println("태영 : 나랑 양영몬 승부하자!");
					Functions.sleep1500();
					System.out.println("트레이터 태영이가");
					Functions.sleep1000();
					System.out.println("승부를 걸어왔다!");
					Functions.sleep1000();
					System.out.println("태영이는 " + mst.MonName + "을 내보냈다!");
					Functions.sleep1000();
					bt.Turn();
				}
			}
			if (count >= 3) {
				System.out.println("집에 도착했다!");
				break;
			}
		}
	}

	public void story_final() {
		System.out.println("엄마 : 어서오너라 " + name);
		Functions.sleep1000();
		System.out.println("너도 양영몬도 건강하게 지냈니?");
		Functions.sleep1000();
		System.out.println("음, 무슨 일이니, " + name + "아?");
		Functions.sleep1000();
		System.out.println();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("... ... ...");
		Functions.sleep1000();
		System.out.println("그렇구나 남박사님으로부터");
		Functions.sleep1000();
		System.out.println("그런 굉장한 일을 부탁받았구나");
		Functions.sleep1500();
		System.out.println("좋-아! 열심히 해보거라-");
		Functions.sleep1000();
		System.out.println("엄마가 응원해 줄 테니까!");
		Functions.sleep1000();
		System.out.println("맞다! 좋은것이 있으니까 가져가렴");
		Functions.sleep1000();
		System.out.println("모험노트를 얻었다!");
		Functions.sleep1500();
		System.out.println("지금까지 있었던 일들은");
		Functions.sleep1000();
		System.out.println("그 모험노트를 다시 읽어보면");
		Functions.sleep1000();
		System.out.println("생각이 날 거야!");
		Functions.sleep1500();
		System.out.println();
		System.out.println("좋겠구나-! 모험 여행도 떠나고");
		Functions.sleep1000();
		System.out.println("그것도 혼자가 아니라");
		Functions.sleep1000();
		System.out.println("흙섭이와 함께잖니?");
		Functions.sleep1000();
		System.out.println("엄마가 대신 가고 싶을 정도구나");
		Functions.sleep1000();
		System.out.println("내가 무슨 소리를 하고 있냐!");
		Functions.sleep1000();
		System.out.println("음! " + name + "아");
		Functions.sleep1000();
		System.out.println("엄마는 괜찮으니까");
		Functions.sleep1000();
		System.out.println("마음껏 여행을 즐기렴!");
		Functions.sleep1000();
		System.out.println("네가 여러 일을 겪고");
		Functions.sleep1000();
		System.out.println("많은 것을 느끼는 것이");
		Functions.sleep1000();
		System.out.println("엄마의 행복이 될 테니까!");
		Functions.sleep1500();
		System.out.println();
		System.out.println("...하지만 가끔은 돌아오면 좋겠네");
		Functions.sleep1000();
		System.out.println("네가 어떤 양영몬을");
		Functions.sleep1000();
		System.out.println("잡았는지 엄마도 알고 싶으니까");
		Functions.sleep1000();
		System.out.println();
		System.out.println("※ !!!");
		Functions.sleep500();
		System.out.println(friend + "엄마 : 실례합니다");
		Functions.sleep1000();
		System.out.println("여기에 우리 " + friend + " 왔나요?");
		Functions.sleep1000();
		System.out.println("엄마 : 엥? 안 왔는데...");
		Functions.sleep1000();
		System.out.println(friend + "엄마 : 그런가요");
		Functions.sleep1000();
		System.out.println("그럼 벌써 갔나 보네");
		Functions.sleep1000();
		System.out.println("큰일이네...");
		Functions.sleep500();
		System.out.println("그 애 모험을 떠날 테니까! 라고만");
		Functions.sleep1000();
		System.out.println("이야기하고서 뛰쳐나가 버렸어요");
		Functions.sleep1000();
		System.out.println("그 애가 좀 성급하고 고집이 세거든요");
		Functions.sleep1000();
		System.out.println("그래서 이것만은 전해주고 싶었는데...");
		Functions.sleep1500();
		System.out.println();
		System.out.println("엄마 : 괜찮아요");
		Functions.sleep1000();
		System.out.println(name + "이가 전해줄 테니까요");
		Functions.sleep1000();
		System.out.println("그치? " + name + "아");
		Functions.sleep1000();
		System.out.println(friend + " : 그래?");
		Functions.sleep1000();
		System.out.println("그럼 부탁을 해도 되겠니?");
		Functions.sleep1500();
		System.out.println(name + "아");
		Functions.sleep1000();
		System.out.println("이거 " + friend + "에게 전해줘");
		Functions.sleep1000();
		System.out.println("※ 전해줄 물건을 얻었다!");
		Functions.sleep2000();
		System.out.println();
		System.out.println("엄마 : " + name + "아 잘 다녀오거라!");
		Functions.sleep1000();
		System.out.println("모험 여행 즐겁게 하고 와!");
		Functions.sleep1000();
		System.out.println(friend + "엄마 : 그럼 " + friend + "를 부탁할게!");
		Functions.sleep1000();
		System.out.println("... ... ... ... ... ...");
		Functions.sleep1000();
		System.out.println("※ 그렇게 해서 " + name + "은 여행을 떠나게 되었다");
		Functions.sleep2000();
		System.out.println("※ 앞으로 무슨일이 벌어질지는 모르지만");
		Functions.sleep2000();
		System.out.println("※ 떠나자! 양영몬스터의 세계로!!!...★");
		Functions.sleep2000();
	}
}
