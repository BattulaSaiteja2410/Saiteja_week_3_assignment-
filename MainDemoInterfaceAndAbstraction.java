package Week3;

public class MainDemoInterfaceAndAbstraction {
public static void main(String[] args) {
	AbstrcationDemonstration car=new FourWheeler(); 
	AbstrcationDemonstration bike=new TwoWheeler();
	car.start();
	car.vechical();
	
	bike.start();
	bike.vechical();
		
}
}
