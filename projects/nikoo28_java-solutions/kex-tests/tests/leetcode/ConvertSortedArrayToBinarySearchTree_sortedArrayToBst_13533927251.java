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

public class ConvertSortedArrayToBinarySearchTree_sortedArrayToBst_13533927251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4168;
     Object term4169;

    public ConvertSortedArrayToBinarySearchTree_sortedArrayToBst_13533927251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4168 = newInstance(Class.forName("leetcode.ConvertSortedArrayToBinarySearchTree"));
        term4169 = (int[]) newIntArray(5);
        setIntElement(term4169, 0, 1568948514);
        setIntElement(term4169, 1, -1511130237);
        setIntElement(term4169, 2, 452088587);
        setIntElement(term4169, 3, -1630069454);
        setIntElement(term4169, 4, 1499735894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ConvertSortedArrayToBinarySearchTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4169;
        callMethod(klass, "sortedArrayToBst", argTypes, term4168, args);
    }

};


