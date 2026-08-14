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

public class WordLadder_main_4823169952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2482;

    public WordLadder_main_4823169952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2482 = (Object[]) newArray("java.lang.String", 8);
        setElement(term2482, 0, "swZVeJAxjt");
        setElement(term2482, 1, "xOcJIiQQDu");
        setElement(term2482, 2, "GVizqqzXpy");
        setElement(term2482, 3, "JqXGgAhZPl");
        setElement(term2482, 4, "jiKYgYHqIS");
        setElement(term2482, 5, "DfISiziTgG");
        setElement(term2482, 6, "XqgfKFvPSD");
        setElement(term2482, 7, "JiVRgTZvKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.WordLadder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2482;
        callMethod(klass, "main", argTypes, null, args);
    }

};


