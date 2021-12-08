public class CreditPaymentService {
    public float calculate(int creditTerm, long loanAmount) {
        //зададим ставку процента
        float bid = (float) 9.99;
        //введем вспомогательные переменные: а - количество месяцев в году, b - а*100, с - просто 1
        int a = 12;
        int b = 1200;
        int c = 1;
        //переведем годы кредита в месяцы кредита
        int numberOfMonths = (creditTerm * a);
        //так как формула многоэтажная, декомпозируем. тут - числитель:
        float up = loanAmount*bid/b;
        //тут знаменатель. по частям:
        double downPart1 = c + bid/b;
        double downPart2 = Math.pow(downPart1, numberOfMonths);
        double downPart3 = c / downPart2;
        double downPart4 = c - downPart3;
        double monthlyAnnuityPayment = up/downPart4;
        return (float) monthlyAnnuityPayment;
    }
}
