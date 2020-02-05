import org.junit.Assert;
import org.junit.Test;

public class personTest {

    @Test
    public void PersonTest(){
        Person person = new Person( "Ryan",30,"male",
                new String[] {"being a hardarse", "agile", "ssd hard drives"});


        String z = person.hello();
        Assert.assertEquals(z, "Hello, my name is Ryan and I am 30 years old. " +
                "My interests are being a hardarse, agile and ssd hard drives.");
    }


}
