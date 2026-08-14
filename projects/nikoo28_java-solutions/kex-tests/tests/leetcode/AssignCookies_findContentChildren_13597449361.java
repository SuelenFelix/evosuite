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

public class AssignCookies_findContentChildren_13597449361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2100;
     Object term2101;
     Object term2103;

    public AssignCookies_findContentChildren_13597449361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2100 = newInstance(Class.forName("leetcode.AssignCookies"));
        term2101 = (int[]) newIntArray(1);
        setIntElement(term2101, 0, -129547140);
        term2103 = (int[]) newIntArray(6);
        setIntElement(term2103, 0, 199287428);
        setIntElement(term2103, 1, -1195339592);
        setIntElement(term2103, 2, -376422566);
        setIntElement(term2103, 3, 306847454);
        setIntElement(term2103, 4, 1745276158);
        setIntElement(term2103, 5, 2009020256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.AssignCookies");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2101;
        args[1] = term2103;
        callMethod(klass, "findContentChildren", argTypes, term2100, args);
    }

};


