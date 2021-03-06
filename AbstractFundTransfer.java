public abstract class AbstractFundTransfer
{
	protected boolean status;

	public abstract void transfer(int amount,String srcAc,String destAc);
	
	public void printStatus(){
		if(status){
			System.out.println("Transfer successfull...");
		}
		else {
			System.out.println("Transfer Failed...");
		}
	}
	public void doTansfer(int amount,String srcAc,String destAc){
		transfer(amount,srcAc,destAc);

		printStatus();
	}
}