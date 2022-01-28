package site.metacoding.ex23;

public class ThreadEx01 {

    // main 스레드 시작
    public static void main(String[] args) {
        System.out.println(1);
        try {
            Thread.sleep(2000);// 밀리세컨즈 1/1000초 에러
        } catch (Exception e) { // Interrupted : 내가 일을 하고 있는데 무언가 방해한다 -> 잠잘때가아니야!하고 방해하는거

            e.printStackTrace();
        }
        System.out.println(2);
    }

}
