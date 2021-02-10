//Parent class for all 3 models of gumball machines


public class GumballMachineParent {
	
	
	protected int noOfGumballs = 0;
	protected int coinValue = 0;
	protected int costOfGumball = 0;
	
	public GumballMachineParent(int noOfGumballs) {
		// TODO Auto-generated constructor stub
		this.noOfGumballs = noOfGumballs;
	}

	
	protected int getCoinValue() {
		return coinValue;
	}


	protected void setCoinValue(int coinValue) {
		this.coinValue = coinValue;
	}

	protected void ejectGumball() {
		if(noOfGumballs>0) {
			int change = coinValue - costOfGumball;
			noOfGumballs--;
			System.out.println("Here is your gumball!!");
			if(change>0) {
				System.out.println("Please collect your change: "+change+" cents");
			}
		}
		
	}

	protected int getCostOfGumball() {
		return costOfGumball;
	}


	protected void setCostOfGumball(int costOfGumball) {
		this.costOfGumball = costOfGumball;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
