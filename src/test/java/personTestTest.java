import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class personTestTest {

    Person person= new Person("Ryan", 30, "male",
                   new String[]{"being a hardarse", "agile", "ssd hard drives"});



    @Test
    void name() {

        assertEquals(person.getName(), "Ryan");

    }

    @Test
    void age() {

        assertEquals(person.getAge(), 30);
    }

    @Test
    void gender() {

        assertEquals(person.getGender(), "male");
    }

   @Test
  void interests() {
      Assert.assertEquals(new String[]{"being a hardarse", "agile", "ssd hard drives"}, person.interests);
   }

}
