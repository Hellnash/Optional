import java.util.Optional;

@SuppressWarnings("All")
public class OptionalUse {

    public static void main(String[] args) {
        Optional<Cat> myCat = findCatByName("Raj");
        //This is just like how we handled the null pointer exception
        if(myCat.isPresent())
            System.out.println(myCat.get().getAge());
        else
            System.out.println("No cat is of this name is present");

       /* To avoid the useless code created above we use or else method
        * This will give the object if it is present or new unknown cat if not */
        Cat cat = findCatByName("Raj").orElse(new Cat("Unknown", 0));
        System.out.println(cat.getAge());

        Integer catEasyAge = findCatByName("Raj").map(Cat::getAge).orElse(0);
        System.out.println(catEasyAge);
    }

   /* Instead of returning a cat we can return an optional of cat
    * which will is like and box that either contains a cat or is
    * empty so that the calling method can handle the empty case */
    public static Optional<Cat> findCatByName(String name){
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
        // return Optional.of(cat); it will raise an exception if the cat is null
        // return Optional.empty(); it will return and empty value
    }
}
