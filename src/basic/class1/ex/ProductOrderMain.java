package basic.class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2_000;
        productOrder1.quantity = 2;
        productOrders[0] = productOrder1;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5_000;
        productOrder2.quantity = 1;
        productOrders[1] = productOrder2;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1_500;
        productOrder3.quantity = 2;
        productOrders[2] = productOrder3;

        int totalPrice = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.printf("상품명: %s, 가격: %d, 수량: %s\n", productOrder.productName,
                productOrder.price, productOrder.quantity);
            totalPrice += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액: " + totalPrice);
    }
}