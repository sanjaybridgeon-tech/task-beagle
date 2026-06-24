package task1;



import java.util.Optional;

public class optionalQn {

    public void run() {

        Optional<String> name = getName();

        System.out.println(name.orElse("Guestdcd vedddddncveebddffffwf1000000000000"));
    }

    public Optional<String> getName() {

        return Optional.ofNullable(null);

    }
}