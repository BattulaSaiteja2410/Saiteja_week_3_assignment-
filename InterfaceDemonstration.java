package Week3;

public interface InterfaceDemonstration {
void move();
}
class TwoWheeler extends AbstrcationDemonstration  implements InterfaceDemonstration{
	@Override
	public void move() {
		
		System.out.println("The bike was started moving");
	}
	
	@Override
	public void vechical() {
		System.out.println("The bike is ready to ride");		
	}
}
class FourWheeler extends AbstrcationDemonstration  implements InterfaceDemonstration{
	@Override
	public void move() {
		
		System.out.println("The car was started moving");
	}
	@Override
	public void vechical() {
		System.out.println("The car is ready to ride");
	}
	
}
