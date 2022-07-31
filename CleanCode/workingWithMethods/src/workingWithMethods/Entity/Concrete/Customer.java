package workingWithMethods.Entity.Concrete;

public class Customer extends Person{
	private int cityId;

	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, String nationalId, int yearOfBirth,int cityId) {
		super(id, firstName, lastName, nationalId, yearOfBirth);
		this.cityId = cityId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
}
