package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    private List<Category> categories;

    public CommerceSystem() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void start(Scanner sc) {
        while (true) {
            System.out.println("[실시간 커머스 플랫폼 메인]");
            for (int i = 0; i < categories.size(); i++) {
                Category categoryName = categories.get(i);
                System.out.println((i + 1) + ". " + categoryName.getCategory());
            }
            System.out.println("0. 종료       ㅣ 프로그램 종료");
            System.out.print("원하는 메뉴를 선택하세요: ");
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice < 0 || choice > categories.size()) {
                System.out.println("올바른 숫자를 입력해주세요.");
                continue;
            } else {
                categories.get(choice - 1).showProudct(sc);
            }
        }

    }
}
