import javax.xml.namespace.QName;

public class Profile {
    int id;
    String profileEdit;
    String name;
    String Address;
    int mobile;
    String logOut;

    public Profile(){
        //System.out.println("Consturactor blok 1 çalıştı.");
    }

    public Profile(int id, String name, String Adress, int mobile, String logOut){
        this.id = id;
        this.name = name;
        this.Address = Adress;
        this.mobile = mobile;
        this.logOut = logOut;
    }
}
