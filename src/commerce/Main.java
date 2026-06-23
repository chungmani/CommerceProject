package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CommerceSystem commerce = new CommerceSystem();

        // 카테고리 생성
        Category category1 = new Category("전자제품");
        Category category2 = new Category("의류");
        Category category3 = new Category("식품");

        // 상품 생성
        Product product1 = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 10);
        Product product2 = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 10);
        Product product3 = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 5);
        Product product4 = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 20);

        // 카테고리 추가
        commerce.addCategory(category1);
        commerce.addCategory(category2);
        commerce.addCategory(category3);

        // 카테고리에 상품 추가
        category1.addProduct(product1);
        category1.addProduct(product2);
        category1.addProduct(product3);
        category1.addProduct(product4);

        commerce.start(sc);

    }
}
