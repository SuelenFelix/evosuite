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

public class PeakIndexInAMountainArray_peakIndexInMountainArray_7478313161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13806;
     Object term13807;

    public PeakIndexInAMountainArray_peakIndexInMountainArray_7478313161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13806 = newInstance(Class.forName("leetcode.PeakIndexInAMountainArray"));
        term13807 = (int[]) newIntArray(4);
        setIntElement(term13807, 0, 1015444772);
        setIntElement(term13807, 1, -815684619);
        setIntElement(term13807, 2, -471499395);
        setIntElement(term13807, 3, -663671886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.PeakIndexInAMountainArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term13807;
        callMethod(klass, "peakIndexInMountainArray", argTypes, term13806, args);
    }

};


