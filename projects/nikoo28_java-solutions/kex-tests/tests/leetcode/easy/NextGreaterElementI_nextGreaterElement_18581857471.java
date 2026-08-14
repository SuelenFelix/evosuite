package leetcode.easy;

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
import static leetcode.easy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NextGreaterElementI_nextGreaterElement_18581857471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1613;
     Object term1614;
     Object term1618;

    public NextGreaterElementI_nextGreaterElement_18581857471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1613 = newInstance(Class.forName("leetcode.easy.NextGreaterElementI"));
        term1614 = (int[]) newIntArray(3);
        setIntElement(term1614, 0, -288604325);
        setIntElement(term1614, 1, -1268314569);
        setIntElement(term1614, 2, 877649659);
        term1618 = (int[]) newIntArray(5);
        setIntElement(term1618, 0, -1332748804);
        setIntElement(term1618, 1, 1774507971);
        setIntElement(term1618, 2, -1420269858);
        setIntElement(term1618, 3, -2119545015);
        setIntElement(term1618, 4, 1272542218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.NextGreaterElementI");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1614;
        args[1] = term1618;
        callMethod(klass, "nextGreaterElement", argTypes, term1613, args);
    }

};


