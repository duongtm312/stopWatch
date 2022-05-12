import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice!=0){
            System.out.println("Nhập lựa chọn");
            System.out.println("1: Bắt đầu");
            System.out.println("2: Kết thúc");
            System.out.println("3: Báo giờ");
            choice= scanner.nextInt();
            switch (choice){
                case 1:
                    stopWatch.start();
                    System.out.println(stopWatch.startTime);
                    break;
                case 2:
                    stopWatch.stop();
                    System.out.println(stopWatch.endTime);
                    break;
                case 3:
                    System.out.println(stopWatch.getElapsedTime());
                    break;
            }
        }

    }
}
