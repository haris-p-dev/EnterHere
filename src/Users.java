import java.math.BigInteger;

public class Users implements hasId{
    private int id;
    private String name;
    private String surname;
    private String email;
    private int telNumber;



    public Users(String name, int telNumber){        // String surname, String email  should be included
        this.id = GenerateId.generateId();
        this.name=name;
        this.telNumber = telNumber;
        //this.emai= email;
        //this.surname= surname;
    }

    @Override
    public int getId(){
     return this.id;
    }


}
