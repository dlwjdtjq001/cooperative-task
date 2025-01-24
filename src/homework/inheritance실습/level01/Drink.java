package homework.inheritance실습.level01;

public class Drink {
    private String name;
    private int price;
    private int count;

    public Drink(){};
    public Drink(String name, int price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice(){
        return this.price * this.count;
    }

    public static void printTitle(){
        System.out.printf("%-8s %-8s %-8s %-8s\n" , "상품명", "단가" , "수량" , "금액");
    }

    public void printData(){
        System.out.printf("%-8s %-8s %-8s %-8s\n" , this.name , this.price , this.count , this.getTotalPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
