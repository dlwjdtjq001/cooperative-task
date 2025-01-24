package homework.inheritance실습.level01;

public class Alcohol extends Drink {

    private double alcper;

    public Alcohol(String name, int price, int count, double alcper){
        super.setName(name);
        super.setPrice(price);
        super.setCount(count);
        this.alcper = alcper;
    }

    public static void printTitle() {
        System.out.printf("%-10s %-10s %-10s %-10s\n" , "상품명(도수[%])", "단가" , "수량" , "금액");
    }

    @Override
    public void printData() {
        System.out.printf("%-10s %-10s %-10s %-10s\n" , super.getName()+"("+this.alcper+")" , super.getPrice() , super.getCount() , super.getTotalPrice());
    }
}
