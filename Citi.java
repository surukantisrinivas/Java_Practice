public class Citi extends AbstractFundTransfer 
{
	public void transfer(int amount,String srcAc,String destAc)
	{
		if(amount<0){
			status=false;
		}else{
			status =true;
		}

		System.out.println("Performing Citi Transfer" +amount +"="+srcAc+destAc));
	}
}
