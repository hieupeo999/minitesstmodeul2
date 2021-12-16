import com.sun.javafx.scene.control.behavior.SpinnerBehavior;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id student");
        int Length = scanner.nextInt();
        MainStudent mainStudent[] = new MainStudent[Length];
        int choice;
        do {
            System.out.println("menu");
            System.out.println("1:Hiển Thị tất cả mọi người");
            System.out.println("2:Thêm một người vào danh sách");
            System.out.println("3:Tìm vị trí một người trong danh sách");
            System.out.println("4:Xoá 1 người trong danh sách ");
            System.out.println("5:Sửa thông tin của 1 người theo mã");
            System.out.println("6:Sắp xếp danh sách theo điểm trung bình.");
            System.out.println("7:Tính tổng điểm");
            System.out.println("8:Thoát");
            System.out.println("mời bạn nhập số ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:

                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
            }


        }while (choice !=0);


    }
}
