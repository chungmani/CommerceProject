package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category {
    private List<Product> products;
    private String category;

    public Category(String category) {
        this.category = category;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showProudct(Scanner sc) {
        System.out.println("[ " + category + " 카테고리 ]");
        for (int i = 0; i < products.size(); i++) {
            Product item = products.get(i);
            System.out.println((i + 1) + ". " + item.getProductName() + " ㅣ " + item.getPrice() + "원 ㅣ " + item.getDescription());
        }
        System.out.println("0. 뒤로가기");
        System.out.print("원하는 메뉴를 선택하세요: ");
        int choice = sc.nextInt();
        if (choice == 0) {
            return;
        } else if (choice < 0 || choice > products.size()) {
            System.out.println("올바른 숫자를 넣어주세요");
            return;
        } else {
            System.out.println(choice + ". " + products.get(choice - 1).getProductName() + " ㅣ " + products.get(choice - 1).getPrice() + "원 ㅣ " + products.get(choice - 1).getDescription() + " ㅣ 재고: " + products.get(choice -1).getStock() +"개");
        }
    }

    public String getCategory() {
        return category;
    }
}
