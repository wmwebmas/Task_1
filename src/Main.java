public class Main {
    public static void main(String[] args) {

        int cost = 10_000;
        int quantity = 20;


        int aviaBonus = cost / quantity;
        System.out.println("Количество бонусных миль: " + aviaBonus);
    }
}