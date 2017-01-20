public class TransferApp 
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("App Start####");
		
		Class classObj=Class.forName(args[0]);

		AbsractFundTransfer transfer=(AbsractFundTransfer)classObj.newInstance();
		transfer.doTransfer(3500,"1234","4567");

		System.out.println("App End ####");


	}
}
