package _02_controll_statement;
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        // 문자열 (String) 객체 배교
        System.out.println("이름을 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("name 값 확인 : "+ name);

        // 문자열 (.equals() 메서드 사용)
        if (name.equals("곽찬혁")) {
            System.out.println("환영합니다.");
        } else {
            System.out.println("이름을 다시 입력하세요");
        }
        // - '==' 연산자 => 두 객체의 참조 비교 (동일한 메모리 위치 가르키는지 확인)
        // = '.equals()' => 두 객체의 내용이 동일한지 비교
        // "문자열 리터럴"의 경우 Java 에서 특별 취급
        // 동일한 문자열 리터럴이 사용되는 경우, Java 컴파일러는 문자열 풀(String poll)이라는 공유된 메미로 영역에 해당 문자열 저장

        // 문자열 "동적 할당"의 경우, new String(...) 을 이용해서 새로운 문자열 객체를 생성 => 서로 다른 객체를 가리킴


        // switch - case 문
        // - 각 case 문의 break 문으로 선택 사항, break 문 생략시 바로 밑의 case 문으로 넘어감
        String dayOfWeek;
        int day = 4;

        switch (day) {
            case 1:
                dayOfWeek = "일요일";
                        break;
            case 2:
                dayOfWeek = "월요일";
                        break;
            case 3:
                dayOfWeek = "화요일";
                        break;
            case 4:
            case 5:
            case 6:
            case 7:
                dayOfWeek = "수 ~ 토요일";
                        break;
            default:
                dayOfWeek = "잘못된 입력입니다.";
        }
        System.out.println(dayOfWeek);
    }


}
