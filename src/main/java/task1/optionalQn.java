package task1;



import java.util.Optional;

public class optionalQn {

    public void run() {

        Optional<String> name = getName();

        System.out.println(name.orElse("Guessssssst"));
    }

    public Optional<String> getName() {

        return Optional.ofNullable(null);

    }
}