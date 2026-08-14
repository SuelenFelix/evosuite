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

public class FindTheDuplicateNumber_findDuplicatesHashSet_6397987763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4824;
     Object term4825;

    public FindTheDuplicateNumber_findDuplicatesHashSet_6397987763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4824 = newInstance(Class.forName("leetcode.medium.FindTheDuplicateNumber"));
        term4825 = (int[]) newIntArray(8);
        setIntElement(term4825, 0, -2085566906);
        setIntElement(term4825, 1, 1773193728);
        setIntElement(term4825, 2, -1341357647);
        setIntElement(term4825, 3, 138447019);
        setIntElement(term4825, 4, 114915275);
        setIntElement(term4825, 5, 338519695);
        setIntElement(term4825, 6, 2025566580);
        setIntElement(term4825, 7, -1231122778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.FindTheDuplicateNumber");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4825;
        callMethod(klass, "findDuplicatesHashSet", argTypes, term4824, args);
    }

};


