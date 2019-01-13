import java.util.List;

public class Service {

    public void validate(String name, List<String> data, int age) throws NameNotFoundException,ListTooLargeException,InvalidAgeException {

        if ("".equals(name)) {
            throw new NameNotFoundException("Name is empty!");
        }

        if (data.size() > 50) {
            throw new ListTooLargeException("List can't exceed 50 items!");
        }

        if(age < 18){
            throw new InvalidAgeException("not valid age");
        }
    }
}