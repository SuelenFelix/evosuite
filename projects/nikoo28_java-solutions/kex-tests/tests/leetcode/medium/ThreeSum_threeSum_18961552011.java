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

public class ThreeSum_threeSum_18961552011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1135;
     Object term1136;

    public ThreeSum_threeSum_18961552011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1135 = newInstance(Class.forName("leetcode.medium.ThreeSum"));
        term1136 = (int[]) newIntArray(7);
        setIntElement(term1136, 0, 2009020256);
        setIntElement(term1136, 1, 2049577015);
        setIntElement(term1136, 2, 1236004505);
        setIntElement(term1136, 3, 1050765721);
        setIntElement(term1136, 4, 474518942);
        setIntElement(term1136, 5, -1656687479);
        setIntElement(term1136, 6, -249614216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.ThreeSum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1136;
        callMethod(klass, "threeSum", argTypes, term1135, args);
    }

};


