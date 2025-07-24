import java.util.ArrayList; // 필요한 클래스 import

public class ArrayListExample { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        ArrayList<String> fruits = new ArrayList<>(); // 값 대입
        fruits.add("사과");
        fruits.add("포도");
        fruits.add("딸기");

        fruits.clear();
        fruits.add("포도");
        fruits.add("딸기");

        System.out.println("fruits.size():"+fruits.size());
        fruits.remove(0);

        for (String fr : fruits){
            System.out.println("과일 종류: " + fr);
        }
    } // 코드 블록 종료
} // 코드 블록 종료