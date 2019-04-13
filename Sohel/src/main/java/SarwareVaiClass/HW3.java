package SarwareVaiClass;

public class HW3 {
	
	int add;
	int balance;
	int withdrow;
	
	HW3(int add,int balance,int withdrow){
		this.add= add;
		this.balance=balance;
		this.withdrow=withdrow;
		
		
	}

	void add(){
		System.out.println(add+balance);
		
	}
	void withdrow() {
		System.out.println((add+balance)-withdrow);
		
	}

}
