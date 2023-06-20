public class Programmer {

private String name;
private int age;
private boolean wearsGlasses;


    public void drinkCoffe () {
    System.out.println("Espresso is the secret!");
}

public void printDetails () {
    System.out.println(name + " is a " + age + "-yo programmer");
}

public void hasGlasses () {
    System.out.println("Is " + name + " wearing glasses? " + wearsGlasses);
}

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }


    public void setAge (int age) {
        this.age = age;
    }

    public void setWearsGlasses (boolean wearsGlasses) {
        this.wearsGlasses = wearsGlasses;
    }

    public int getAge () {
        return age;
    }

    public boolean getWearsGlasses () {
        return wearsGlasses;
    }


}








