package site.metacoding.ex23;

public class ThreadEx02 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            Thread.sleep(1000);
            System.out.println("메인스레드:" + i);
        }
    }
}
