import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";
        String[] textArray = text.split(" ");
        Person[] peopleArray=new Person[textArray.length];
        for(int i=0;i< textArray.length;i++){
            String firstName = textArray[i].split("\\.")[0];
            String lastName = textArray[i].split("\\.")[1].split("\\/")[0];
            String city=textArray[i].split("\\/")[1];
            Person person=new Person(firstName, lastName, city);
            for (int j=i; j< textArray.length; j++) {
                peopleArray[j] = person;
            }
        }
        for(int i=0; i<peopleArray.length;i++){
          peopleArray[i].nameShow();
        }
    }
}