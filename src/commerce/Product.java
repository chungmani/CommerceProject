package commerce;

public class Product {
    private String productName;
    private int price;
    private String description;
    private int stock;

    public Product(String productName, int price, String description, int stock) {
        this.productName = productName;

        if (price < 0) {
            System.out.println("가격은 0보다 작을 수 없습니다.");
            throw new IllegalArgumentException();
        } else {
            this.price = price;
        }

        this.description = description;

        if (stock < 0) {
            System.out.println("재고는 0보다 작을 수 없습니다.");
            throw new IllegalArgumentException();
        } else {
            this.stock = stock;
        }
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("가격은 0보다 작을수 없습니다.");
        } else {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("재고는 0보다 작을 수 없습니다.");
        } else {
            this.stock = stock;
        }
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
