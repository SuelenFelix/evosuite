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

public class RotateImage_rotate2_11297452241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2939;
     Object term2940;

    public RotateImage_rotate2_11297452241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2939 = newInstance(Class.forName("leetcode.medium.RotateImage"));
        term2940 = (Object[]) newArray("[I", 9);
        int[] term2941 = (int[]) newIntArray(5);
        int[] term2947 = (int[]) newIntArray(1);
        int[] term2949 = (int[]) newIntArray(1);
        int[] term2951 = (int[]) newIntArray(7);
        int[] term2959 = (int[]) newIntArray(8);
        int[] term2968 = (int[]) newIntArray(2);
        int[] term2971 = (int[]) newIntArray(0);
        int[] term2972 = (int[]) newIntArray(3);
        int[] term2976 = (int[]) newIntArray(0);
        setIntElement(term2941, 0, 2073858334);
        setIntElement(term2941, 1, -1693535639);
        setIntElement(term2941, 2, 1344744036);
        setIntElement(term2941, 3, -98060427);
        setIntElement(term2941, 4, -1272268399);
        setElement(term2940, 0, term2941);
        setIntElement(term2947, 0, 1120271104);
        setElement(term2940, 1, term2947);
        setIntElement(term2949, 0, -128435804);
        setElement(term2940, 2, term2949);
        setIntElement(term2951, 0, 2136158480);
        setIntElement(term2951, 1, 2118747457);
        setIntElement(term2951, 2, 1868344256);
        setIntElement(term2951, 3, 1857693976);
        setIntElement(term2951, 4, 1631305277);
        setIntElement(term2951, 5, 162113491);
        setIntElement(term2951, 6, -932147928);
        setElement(term2940, 3, term2951);
        setIntElement(term2959, 0, 487369012);
        setIntElement(term2959, 1, -179238712);
        setIntElement(term2959, 2, -2018735535);
        setIntElement(term2959, 3, -658524954);
        setIntElement(term2959, 4, -2009613557);
        setIntElement(term2959, 5, 654195547);
        setIntElement(term2959, 6, 1622857008);
        setIntElement(term2959, 7, 934338954);
        setElement(term2940, 4, term2959);
        setIntElement(term2968, 0, 598635505);
        setIntElement(term2968, 1, -944986533);
        setElement(term2940, 5, term2968);
        setElement(term2940, 6, term2971);
        setIntElement(term2972, 0, 1894454926);
        setIntElement(term2972, 1, 1415142780);
        setIntElement(term2972, 2, -574105759);
        setElement(term2940, 7, term2972);
        setElement(term2940, 8, term2976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.RotateImage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2940;
        callMethod(klass, "rotate2", argTypes, term2939, args);
    }

};


