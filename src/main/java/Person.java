public class Person {

    String name;
    int age;
    String gender;
    String[] interests;

    {

    }

    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;

    }
    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public String[] getInterests(){
        return  interests;
    }


    public String hello(){

        //hello method
        String message = "Hello, my name is "+ name+" and I am "+age+" years old. My interests are "+interests[0]+", "+interests[1]+" and "+interests[2]+".";

        return message;
    }
}
