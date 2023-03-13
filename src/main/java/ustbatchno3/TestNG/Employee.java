package ustbatchno3.TestNG;

public class Employee {
	@Test

	public static void main (String[]args) {
	Employeetable em=new Employeetable("meera",23,"developer");
	Assert.assertEquals(em.getName(),"meera");
	

}
}
