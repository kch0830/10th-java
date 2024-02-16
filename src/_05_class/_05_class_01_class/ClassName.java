package _05_class._05_class_01_class;

public class ClassName {
    // 필드 (변수)
    public int number;
    public String name;

    // 메소드 (함수)

    // 생성자 -> 클래스명과 동일한 이름을 갖는 메서드
    // 기본 생성자 (default)
    public ClassName() {
        this.name = name;
        this.number = number;
    }


    public void testMethod() {
        System.out.println("test method!");
    }

    public static void main(String[] args) {
        //객체 생성(인스턴스화)
        ClassName test = new ClassName();

        // 필드, 메서드 사용
        test.testMethod();
        System.out.println(test.name); // 초기값 null
        System.out.println(test.number); // 초기값 0
    }
}
