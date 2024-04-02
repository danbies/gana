package object_class;
//은행계좌 클래스(신한은행) 
//클래스:객체를 만든다.
public class Account {
	//구성요소 : 필드, 메소드(객체가 하는 일), 생성자(초기화)
	//멤버변수(필드): 클래스가 가지고 있는 변수
	static final String BANKNAME="신한은행"; //정적멤버변수
	String accountNo; //계좌번호 -인스턴스 멤버변수
	String ownerName; //예금주이름 -인스턴스 멤버변수
	int balance; //잔액
	
	//생성자:객체를 생성하는 동시에 초기화하는 것. 생성자를 만들었으면 빈 생성자가 안 만들어진다.
	public Account(String accNo, String owName, int bal) {
		accountNo=accNo;
		ownerName=owName;
		balance=bal;
	}
	//멤버변수와 매개변수의 값이 같을 경우
	/*public Account(String accountNo, String ownerName, int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}*/
	
	//생성자
	public Account() {
		
	}
	
	//메소드(기능):클래스가 갖고 있는 기능
	//예금한다 메서드
	void deposit(int amount) {
		balance+=amount; //balance=balance+amount;
	}
	
	//인출한다 메서드
	int withdraw(int amount) throws Exception{
		if (balance < amount ) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance-=amount; //balance=balance-amount;
		return amount; 
	}
	//클래스는 객체를 만드는 것
	//메서드는 기능이다.
	//메서드 괄호 안에 있는 매개변수는 외부로부터 불러오는 값
	//예외처리 > throws Exception

	public int getBalance() {
}
}
