package Travis;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test {
    private static int i = 4;

    public  int getI(){
        return i;
    }
    public static void main(String [ ] args){
        System.out.println("SAY HELLO PEOPLE \n TEST \n TEST \n TEST \n TEST");
        System.out.println("this is I: " + i);
        person p = new person("Sebas", "Tian", 123456789, "E@mail.com");
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(p);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    private static class person{
        public String Fname;
        public String Lname;
        public int SNumber;
        public String email;

        public person(String fname, String lname, int sNumber, String Email){
            this.Fname = fname;
            this.Lname = lname;
            this.SNumber = sNumber;
            this.email = Email;
        }
    }
}
