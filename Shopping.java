package classOnes;

public class Shopping {

	public static void main(String[] args) {
	int itemPencil=5;
	int itemPen= 10;
	int itemBook=50;
	double totalPrice= (2*itemPencil)+ (6*itemPen)+(1*50);
	double discountPrice= totalPrice-(0.1*totalPrice);
	double amountPayable= discountPrice+(0.05*discountPrice);
	System.out.println("Net amount Payable="+ amountPayable);
	
	
	
	

	}

}
