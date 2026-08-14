package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MergeSort_merge_13765744602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2197;
     Object term2206;
     Object term2210;
     Object term2217;
     Object term2219;

    public MergeSort_merge_13765744602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2197 = (int[]) newIntArray(8);
        setIntElement(term2197, 0, 433248783);
        setIntElement(term2197, 1, -507944154);
        setIntElement(term2197, 2, -1736183862);
        setIntElement(term2197, 3, 897010381);
        setIntElement(term2197, 4, -15712667);
        setIntElement(term2197, 5, 1964967720);
        setIntElement(term2197, 6, 1351900243);
        setIntElement(term2197, 7, -330897705);
        term2206 = (int[]) newIntArray(3);
        setIntElement(term2206, 0, 1065595802);
        setIntElement(term2206, 1, 21031843);
        setIntElement(term2206, 2, -380787857);
        term2210 = (int[]) newIntArray(6);
        setIntElement(term2210, 0, 319853052);
        setIntElement(term2210, 1, -1097563716);
        setIntElement(term2210, 2, 1572907769);
        setIntElement(term2210, 3, 1608016787);
        setIntElement(term2210, 4, -516303035);
        setIntElement(term2210, 5, -2143043890);
        term2217 = new Integer(-2138825831);
        term2219 = new Integer(1454781562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.MergeSort");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term2197;
        args[1] = term2206;
        args[2] = term2210;
        args[3] = term2217;
        args[4] = term2219;
        callMethod(klass, "merge", argTypes, null, args);
    }

};


