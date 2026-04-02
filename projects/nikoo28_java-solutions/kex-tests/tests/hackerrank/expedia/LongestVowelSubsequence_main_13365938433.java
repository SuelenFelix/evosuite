package hackerrank.expedia;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static hackerrank.expedia.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LongestVowelSubsequence_main_13365938433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640;

    public LongestVowelSubsequence_main_13365938433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term640 = (Object[]) newArray("java.lang.String", 6);
        setElement(term640, 0, "IoAlmYsBwc");
        setElement(term640, 1, "TEParAifyi");
        setElement(term640, 2, "OWDIEULEFu");
        setElement(term640, 3, "dWRymuLBtr");
        setElement(term640, 4, "AijpHYOFuy");
        setElement(term640, 5, "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.expedia.LongestVowelSubsequence");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term640;
        callMethod(klass, "main", argTypes, null, args);
    }

};


