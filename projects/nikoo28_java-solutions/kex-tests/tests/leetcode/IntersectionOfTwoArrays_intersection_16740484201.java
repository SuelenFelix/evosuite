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

public class IntersectionOfTwoArrays_intersection_16740484201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11737;
     Object term11738;
     Object term11745;

    public IntersectionOfTwoArrays_intersection_16740484201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11737 = newInstance(Class.forName("leetcode.IntersectionOfTwoArrays"));
        term11738 = (int[]) newIntArray(6);
        setIntElement(term11738, 0, 2003356558);
        setIntElement(term11738, 1, -638126185);
        setIntElement(term11738, 2, 28070985);
        setIntElement(term11738, 3, 334110739);
        setIntElement(term11738, 4, -1724529322);
        setIntElement(term11738, 5, 1843465187);
        term11745 = (int[]) newIntArray(7);
        setIntElement(term11745, 0, 529595969);
        setIntElement(term11745, 1, -1548733886);
        setIntElement(term11745, 2, 1543539715);
        setIntElement(term11745, 3, 1744599521);
        setIntElement(term11745, 4, -985141153);
        setIntElement(term11745, 5, -1983740361);
        setIntElement(term11745, 6, -1494716341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.IntersectionOfTwoArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term11738;
        args[1] = term11745;
        callMethod(klass, "intersection", argTypes, term11737, args);
    }

};


