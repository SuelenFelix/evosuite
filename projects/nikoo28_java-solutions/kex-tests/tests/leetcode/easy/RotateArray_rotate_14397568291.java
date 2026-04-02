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
import java.lang.Integer;

public class RotateArray_rotate_14397568291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1852;
     Object term1853;
     Object term1862;

    public RotateArray_rotate_14397568291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1852 = newInstance(Class.forName("leetcode.easy.RotateArray"));
        term1853 = (int[]) newIntArray(8);
        setIntElement(term1853, 0, -350454594);
        setIntElement(term1853, 1, -1148142995);
        setIntElement(term1853, 2, -233024044);
        setIntElement(term1853, 3, 1820784228);
        setIntElement(term1853, 4, 1390820006);
        setIntElement(term1853, 5, -828982065);
        setIntElement(term1853, 6, 1221443226);
        setIntElement(term1853, 7, 908108726);
        term1862 = new Integer(1023209512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.RotateArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1853;
        args[1] = term1862;
        callMethod(klass, "rotate", argTypes, term1852, args);
    }

};


