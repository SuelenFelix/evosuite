package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UniqueMorseCodeWords_uniqueMorseCodeRepresentations_3216947511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11874;
     Object term11875;

    public UniqueMorseCodeWords_uniqueMorseCodeRepresentations_3216947511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11874 = newInstance(Class.forName("leetcode.UniqueMorseCodeWords"));
        term11875 = (Object[]) newArray("java.lang.String", 4);
        setElement(term11875, 0, "NJhGgctbdj");
        setElement(term11875, 1, "MYWYUeLGOp");
        setElement(term11875, 2, "tsTGdgQYUL");
        setElement(term11875, 3, "TtGbVmKcnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.UniqueMorseCodeWords");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term11875;
        callMethod(klass, "uniqueMorseCodeRepresentations", argTypes, term11874, args);
    }

};


