public class Main {
    public static void main(String[] args) {
        CreditPaymentService pay = new CreditPaymentService();

        float monthlyAnnuityPayment = pay.calculate(1, 1_000_000);
        System.out.println("Кредит на 1 год, платеж в месяц " + String.format("%.0f", monthlyAnnuityPayment));

        float monthlyAnnuityPayment2 = pay.calculate(2, 1_000_000);
        System.out.println("Кредит на 2 года, платеж в месяц " + String.format("%.0f", monthlyAnnuityPayment2));

        float monthlyAnnuityPayment3 = pay.calculate(3, 1_000_000);
        System.out.println("Кредит на 3 года, платеж в месяц " + String.format("%.0f", monthlyAnnuityPayment3));

        System.out.println("made by Dad, enjoy!");
    }
}
