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

public class NextGreaterElement1_nextGreaterElement_16233817461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5109;
     Object term5110;
     Object term5118;

    public NextGreaterElement1_nextGreaterElement_16233817461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5109 = newInstance(Class.forName("leetcode.NextGreaterElement1"));
        term5110 = (int[]) newIntArray(7);
        setIntElement(term5110, 0, 950385621);
        setIntElement(term5110, 1, -232352320);
        setIntElement(term5110, 2, -232333014);
        setIntElement(term5110, 3, -139694079);
        setIntElement(term5110, 4, -1602072035);
        setIntElement(term5110, 5, 1902624392);
        setIntElement(term5110, 6, 904607217);
        term5118 = (int[]) newIntArray(4);
        setIntElement(term5118, 0, 434914590);
        setIntElement(term5118, 1, 1983756621);
        setIntElement(term5118, 2, -2134711835);
        setIntElement(term5118, 3, -1641244494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.NextGreaterElement1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term5110;
        args[1] = term5118;
        callMethod(klass, "nextGreaterElement", argTypes, term5109, args);
    }

};


