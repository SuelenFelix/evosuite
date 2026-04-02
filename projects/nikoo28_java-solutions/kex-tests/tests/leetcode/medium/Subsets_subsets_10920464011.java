package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Subsets_subsets_10920464011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2505;
     Object term2506;

    public Subsets_subsets_10920464011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2505 = newInstance(Class.forName("leetcode.medium.Subsets"));
        term2506 = (int[]) newIntArray(9);
        setIntElement(term2506, 0, -585773976);
        setIntElement(term2506, 1, 852806940);
        setIntElement(term2506, 2, 698551724);
        setIntElement(term2506, 3, -1631048635);
        setIntElement(term2506, 4, 1342808731);
        setIntElement(term2506, 5, -64893740);
        setIntElement(term2506, 6, -222012928);
        setIntElement(term2506, 7, -146564963);
        setIntElement(term2506, 8, -83178716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.Subsets");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2506;
        callMethod(klass, "subsets", argTypes, term2505, args);
    }

};


