package homework.class실습;

public class BookMgr {
	private Book[] booklist;
	
	public BookMgr(Book[] booklist) {
		this.booklist = new Book[booklist.length];
		for(int i = 0; i < this.booklist.length; i++){
			this.booklist[i] = booklist[i];
		}
	}
	
	public void printBooklist(){
		for(int i=0; i < this.booklist.length; i++){
			System.out.println(this.booklist[i].getTitle());
		}
	}
	
	public void printTotalPrice(){
		int sum = 0;
		for(int i=0; i < this.booklist.length; i++){
			sum += this.booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의  : " + sum);

	}
}
