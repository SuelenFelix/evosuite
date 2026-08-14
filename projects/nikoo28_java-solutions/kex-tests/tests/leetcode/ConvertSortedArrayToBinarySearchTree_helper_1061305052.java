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
import java.lang.Integer;

public class ConvertSortedArrayToBinarySearchTree_helper_1061305052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4180;
     Object term4181;
     Object term4185;
     Object term4187;

    public ConvertSortedArrayToBinarySearchTree_helper_1061305052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4180 = newInstance(Class.forName("leetcode.ConvertSortedArrayToBinarySearchTree"));
        term4181 = (int[]) newIntArray(3);
        setIntElement(term4181, 0, 716486048);
        setIntElement(term4181, 1, -466708718);
        setIntElement(term4181, 2, 1038029515);
        term4185 = new Integer(1137154606);
        term4187 = new Integer(-100681578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ConvertSortedArrayToBinarySearchTree");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term4181;
        args[1] = term4185;
        args[2] = term4187;
        callMethod(klass, "helper", argTypes, term4180, args);
    }

};


