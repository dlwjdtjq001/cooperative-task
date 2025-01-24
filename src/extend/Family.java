package extend;

class GrandFather{
    public void printGrandFather(){
        System.out.println("나는 할아버지 입니다.");
    }
}
class SubFather extends GrandFather{
    public void printSubFather(){
        System.out.println("나는 아버지 입니다. 나는 할아버지로부터 상속받습니다.");
    }
    public String houseAddress = "인천";
    public String familyName = "프로그래머";

}
class Subson extends SubFather{
    public void printSon(){
        System.out.println("나는 아들입니다.\n나는 아버지로부터 상속받습니다.");
        System.out.println("나의 아버지는 " + this.familyName);
        System.out.println("나의 집은 " + this.houseAddress);
    }
}


public class Family {
    public static void main(String[] args) {
        Subson objSon = new Subson();
        objSon.printSon();
        objSon.printSubFather();
        objSon.printGrandFather();
    }
}
