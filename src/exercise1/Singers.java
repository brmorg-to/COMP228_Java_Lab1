package exercise1;

public class Singers
{
    //declare instance variables
    private int singerId;
    private String name;
    private String address;
    private String dateOfBirth;
    private int numAlbumsPublished;

    //Constructors to build a Singers object with no arguments, 1, 2, 3, 4, and 5 arguments

    //No arguments
    public Singers(){}

    //Constructor 1 argument
    public Singers(int singerId)
    {
            this.singerId = singerId;
    }

    //Constructor 2 arguments
    public Singers(int singerId, String name)
    {
        this.singerId = singerId;
        this.name = name;
    }

    //Constructor 3 arguments
    public Singers(int singerId, String name, String address)
    {
        this.singerId = singerId;
        this.name = name;
        this.address = address;
    }

    //Constructor 4 arguments
    public Singers(int singerId, String name, String address, String dateOfBirth)
    {
        this.singerId = singerId;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    //Constructor 5 arguments
    public Singers(int singerId, String name, String address, String dateOfBirth, int numAlbumsPublished)
    {
        this.singerId = singerId;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numAlbumsPublished = numAlbumsPublished;
    }

    //Create Setters

    public void setId(int singerId)
    {
        this.singerId = singerId;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNumAlbumsPublished(int numAlbumsPublished)
    {
        this.numAlbumsPublished = numAlbumsPublished;
    }

    public void setAllVariables(int singerId, String name, String address, String dateOfBirth, int numAlbumsPublished)
    {
        this.singerId = singerId;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numAlbumsPublished = numAlbumsPublished;
    }

    //Create getters

    public int getSingerId() {
        return singerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumAlbumsPublished() {
        return numAlbumsPublished;
    }
}//End of class Singers
