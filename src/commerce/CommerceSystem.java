package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    private List<Product> products;

    public CommerceSystem(List<Product> products) {
        this.products = products;
    }

    public void start(Scanner sc) {
        System.out.println("[실시간 커머스 플랫폼 - 전자제품]");
        for (int i = 0; i < products.size(); i++) {
            Product item = products.get(i);
            System.out.println((i + 1) + ". " + item.getProductName() + " ㅣ " + item.getPrice() + "원 ㅣ " + item.getDescription());
        }
        System.out.println("0. 종료       ㅣ 프로그램 종료");
        System.out.print("원하는 메뉴를 선택하세요: ");
        int choice = sc.nextInt();
        if (choice == 0) {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
