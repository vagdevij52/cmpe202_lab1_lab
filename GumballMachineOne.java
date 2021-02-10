
public class GumballMachineOne extends GumballMachineParent implements IGumballMachineCommon{

	public GumballMachineOne(int noOfGumballs) {
		super(noOfGumballs);
		setCostOfGumball(25);
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Insert Quarter");
		int coinValue = getCoinValue();
		if(coinValue>=25) {
			System.out.println("You have inserted 25 cents");
		}else {
			setCoinValue(25);
			System.out.println("You have inserted 25 cents");
		}
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		ejectGumball();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachineOne m1 = new GumballMachineOne(10);
		m1.insertQuarter();
		m1.turnCrank();
		m1.insertQuarter();
		m1.turnCrank();

	}

	

}
