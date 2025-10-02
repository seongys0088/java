/*
 * Account 클래스는 1개의 은행 계좌를 나타낸다. 실행 결과와 같이 출력되도록 Account 클래스를 작성하라.
 * 잔금이 인출하는 금액보다 작으면, 잔금만큼만 인출된다.
 * 
 * 잔금은 5100원입니다.
 * 잔금은 6600원입니다.
 * 1000원 인출
 * 잔금은 5600원입니다.
 */

package Chapter4;

public class Practice08 {
	int money;
	
	public Practice08(int money) {
		this.money = money;
	}
	
	void deposit(int dMoney) {
		money += dMoney;
	}
	
	void deposit(int dMoneis[]) {
		for(int i=0; i<dMoneis.length; i++) {
			money += dMoneis[i];
		}
	}
	
	int getBalance() {
		return money;
	}
	
	int withdraw(int wMoney) {
		if(wMoney <= money) {
			money -= wMoney;
			return wMoney;
		}
		else {
			wMoney = money;
			money = 0;
			return wMoney;
		}
	}
	
	public static void main(String[] args) {
		Practice08 a = new Practice08(100); // 100원을 예금하면서 계좌 생성
		a.deposit(5000); // 5000원 예금
		System.out.println("잔금은 " + a.getBalance() + "원입니다.");
		
		int bulk[] = {100, 500, 200, 700};
		a.deposit(bulk); // bulk[] 배열에 있는 모든 돈 예금
		System.out.println("잔금은 " + a.getBalance() + "원입니다.");
		
		int money = 1000;
		int wMoney = a.withdraw(money); // 1000원 인출 시도, wMoney는 실제 인출한 금액
		
		if(wMoney < money) {
			System.out.println(wMoney + "원만 인출"); // 잔금이 1000원보다 작은 경우
		}
		else {
			System.out.println(wMoney + "원 인출"); // 잔금이 1000원보다 큰 경우
		}
		
		System.out.println("잔금은 " + a.getBalance() + "원입니다.");
	}
}
