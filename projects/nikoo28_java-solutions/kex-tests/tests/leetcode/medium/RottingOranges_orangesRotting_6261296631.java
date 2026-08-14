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
import java.lang.Object;

public class RottingOranges_orangesRotting_6261296631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3008;
     Object term3009;

    public RottingOranges_orangesRotting_6261296631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3008 = newInstance(Class.forName("leetcode.medium.RottingOranges"));
        term3009 = (Object[]) newArray("[I", 2);
        int[] term3010 = (int[]) newIntArray(9);
        int[] term3020 = (int[]) newIntArray(6);
        setIntElement(term3010, 0, -1165271567);
        setIntElement(term3010, 1, 376834234);
        setIntElement(term3010, 2, -1911972560);
        setIntElement(term3010, 3, -642716895);
        setIntElement(term3010, 4, 1743398246);
        setIntElement(term3010, 5, -934658823);
        setIntElement(term3010, 6, 1632177303);
        setIntElement(term3010, 7, -802592348);
        setIntElement(term3010, 8, -1576584269);
        setElement(term3009, 0, term3010);
        setIntElement(term3020, 0, 1474899591);
        setIntElement(term3020, 1, 297582552);
        setIntElement(term3020, 2, -1485916498);
        setIntElement(term3020, 3, 722787672);
        setIntElement(term3020, 4, 2077491675);
        setIntElement(term3020, 5, -1728316609);
        setElement(term3009, 1, term3020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.RottingOranges");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3009;
        callMethod(klass, "orangesRotting", argTypes, term3008, args);
    }

};


