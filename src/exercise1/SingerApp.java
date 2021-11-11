package exercise1;

public class SingerApp
{
    public static void main(String[] args)
    {
        //Instantiate a Singers object

        Singers newSinger = new Singers();

        //Display object's properties

        System.out.printf("\nNew singer's properties are: %d; %s; %s; %s; %d%n%n",
                newSinger.getSingerId(), newSinger.getName(), newSinger.getAddress(),
                newSinger.getDateOfBirth(), newSinger.getNumAlbumsPublished());

        System.out.println("******************************************************\n");
        //Set the values of the instance variables.

        newSinger.setId(1);
        newSinger.setName("Bruno");
        newSinger.setAddress("941, Progress Ave, Scarborough, ON M1G 3T8");
        newSinger.setDateOfBirth("09/07/1981");
        newSinger.setNumAlbumsPublished(1);

        System.out.printf("New singer's properties are: ID: %d; Name: %s; Address: %s; Date: %s; Number of Albums: %d%n",
                newSinger.getSingerId(), newSinger.getName(), newSinger.getAddress(),
                newSinger.getDateOfBirth(), newSinger.getNumAlbumsPublished());

    }
}
