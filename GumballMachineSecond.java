
public class GumballMachineSecond extends GumballMachineParent implements IGumballMachineCommon{

	
	public GumballMachineSecond(int noOfGumballs) {
		super(noOfGumballs);
		setCoinValue(50);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		int coinValue = getCoinValue();
		if(coinValue>=50) {
			System.out.println("You have inserted 50 cents");
		}else {
			setCoinValue(25);
		}
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachineSecond m2 = new GumballMachineSecond(10);
		m2.insertQuarter();
		m2.turnCrank();

	}

	

}
