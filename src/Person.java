public class Person {

    protected String FirstName;
    protected String LastName;
    protected String City;


    public Person(String FirstName, String LastName, String City) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.City = City;
    }

    public void nameShow(){
        System.out.println(FirstName+" "+LastName+" "+City);
    }
}
