import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Service service=new Service();
        List<String> invalidData = new ArrayList<>(Collections.nCopies(100, "rahul"));
        List<String> validdata = new ArrayList<>(Collections.nCopies(30, "rahul"));
        try{
            service.validate("",invalidData,15);
        } catch (Exception e) {
            System.out.println("Exception occured:"+e);
        }
        try{
            service.validate("rahul",invalidData,15);
        } catch (Exception e) {
            System.out.println("Exception occured:"+e);
        }
        try{
            service.validate("rahul",validdata,15);
        } catch (Exception e) {
            System.out.println("Exception occured:"+e);
        }
        finally {
            System.out.println("finally");
        }
    }
}
