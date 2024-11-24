package basic.ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = createOrder("두부", 2_000, 2);
        productOrders[1] = createOrder("김치", 5_000, 1);
        productOrders[2] = createOrder("콜라", 1_500, 2);

        printOrders(productOrders);

        System.out.println("총 결제 금액: " + getTotalAmount(productOrders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder productOrder : orders) {
            System.out.printf("상품명: %s, 가격: %d, 수량: %s\n", productOrder.productName,
                productOrder.price, productOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder productOrder : orders) {
            totalAmount += productOrder.price * productOrder.quantity;
        }
        return totalAmount;
    }
}
