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

public class AsciiDistance_main_2786816932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1482;

    public AsciiDistance_main_2786816932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1482 = (Object[]) newArray("java.lang.String", 9);
        setElement(term1482, 0, "ieCtQFdkii");
        setElement(term1482, 1, "dEnhdmILtU");
        setElement(term1482, 2, "hoicvmsovO");
        setElement(term1482, 3, "eqJfYWRaEL");
        setElement(term1482, 4, "fhkbdRViHi");
        setElement(term1482, 5, "uWHnvSvaPl");
        setElement(term1482, 6, "kBdSllIBVz");
        setElement(term1482, 7, "TJmVBGfTML");
        setElement(term1482, 8, "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.AsciiDistance");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1482;
        callMethod(klass, "main", argTypes, null, args);
    }

};


