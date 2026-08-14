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

public class FindAllDuplicatesInAnArray_findDuplicatesLinearSpace_16167403282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4461;
     Object term4462;

    public FindAllDuplicatesInAnArray_findDuplicatesLinearSpace_16167403282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4461 = newInstance(Class.forName("leetcode.medium.FindAllDuplicatesInAnArray"));
        term4462 = (int[]) newIntArray(9);
        setIntElement(term4462, 0, -994742871);
        setIntElement(term4462, 1, -222412326);
        setIntElement(term4462, 2, -299497261);
        setIntElement(term4462, 3, -23054366);
        setIntElement(term4462, 4, 153009426);
        setIntElement(term4462, 5, 185751892);
        setIntElement(term4462, 6, 1068256001);
        setIntElement(term4462, 7, 1139078354);
        setIntElement(term4462, 8, -691164974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.FindAllDuplicatesInAnArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4462;
        callMethod(klass, "findDuplicatesLinearSpace", argTypes, term4461, args);
    }

};


