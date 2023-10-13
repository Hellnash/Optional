@SuppressWarnings("All")
public class NullCheck {

    public static void main(String[] args) {
        Cat myCat = findCatByName("raj");
        /*null check is required to avoid any null pointer exception
        that may come if the method returns a null value*/
        if(myCat != null)
            System.out.println(myCat.getAge());
        else
            System.out.println("No cat is of this name is present");
    }

    public static Cat findCatByName(String name){
        return new Cat(name,3);
    }
}
