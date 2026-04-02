package leetcode.hard;

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
import static leetcode.hard.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SlidingWindowMaximum_maxSlidingWindow_19811964611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term505;
     Object term506;
     Object term516;

    public SlidingWindowMaximum_maxSlidingWindow_19811964611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term505 = newInstance(Class.forName("leetcode.hard.SlidingWindowMaximum"));
        term506 = (int[]) newIntArray(9);
        setIntElement(term506, 0, -1476117762);
        setIntElement(term506, 1, -341962980);
        setIntElement(term506, 2, 1532716628);
        setIntElement(term506, 3, -1801760683);
        setIntElement(term506, 4, 1141317871);
        setIntElement(term506, 5, 890669485);
        setIntElement(term506, 6, 691577392);
        setIntElement(term506, 7, -893623680);
        setIntElement(term506, 8, -1963434938);
        term516 = new Integer(906181092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.SlidingWindowMaximum");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term506;
        args[1] = term516;
        callMethod(klass, "maxSlidingWindow", argTypes, term505, args);
    }

};


