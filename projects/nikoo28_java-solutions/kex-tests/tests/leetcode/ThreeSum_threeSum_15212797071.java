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

public class ThreeSum_threeSum_15212797071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11531;
     Object term11532;

    public ThreeSum_threeSum_15212797071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11531 = newInstance(Class.forName("leetcode.ThreeSum"));
        term11532 = (int[]) newIntArray(8);
        setIntElement(term11532, 0, -1828855069);
        setIntElement(term11532, 1, -1213694931);
        setIntElement(term11532, 2, -1255656944);
        setIntElement(term11532, 3, -377697034);
        setIntElement(term11532, 4, 1102778743);
        setIntElement(term11532, 5, 1300928519);
        setIntElement(term11532, 6, 338172676);
        setIntElement(term11532, 7, -1896960942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ThreeSum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term11532;
        callMethod(klass, "threeSum", argTypes, term11531, args);
    }

};


