public class PaymentMethod {

    public static void payCash(String customerName, double amount) {
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + (int) amount + ". Thanh toán tiền mặt thành công.");
    }

    public static void payCreditCard(String customerName, double amount) {
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + (int) amount + ". Thanh toán bằng thẻ tín dụng thành công.");
    }

    public static void payMomoPayment(String customerName, double amount) {
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + (int) amount + ". Thanh toán bằng ví Momo thành công.");
    }
}
