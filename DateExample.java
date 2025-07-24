import java.text.SimpleDateFormat; // 필요한 클래스 import
import java.util.Date; // 필요한 클래스 import

public class DateExample { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        Date now = new Date(); // 값 대입



        //오후 3시 30분 출력 연습
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일 a h시 m분"); // 값 대입
        String formatted = sdf.format(now); // 변수 선언 또는 초기화
        System.out.println("현재 날짜와 시간: " + formatted); // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료

