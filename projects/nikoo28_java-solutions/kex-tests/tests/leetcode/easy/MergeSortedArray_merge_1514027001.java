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

public class MergeSortedArray_merge_1514027001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term928;
     Object term929;
     Object term932;
     Object term934;
     Object term943;

    public MergeSortedArray_merge_1514027001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term928 = newInstance(Class.forName("leetcode.easy.MergeSortedArray"));
        term929 = (int[]) newIntArray(2);
        setIntElement(term929, 0, -571169753);
        setIntElement(term929, 1, 318591690);
        term932 = new Integer(-165587447);
        term934 = (int[]) newIntArray(8);
        setIntElement(term934, 0, -1347358701);
        setIntElement(term934, 1, 806595993);
        setIntElement(term934, 2, 548228925);
        setIntElement(term934, 3, -749861210);
        setIntElement(term934, 4, 1694224101);
        setIntElement(term934, 5, 937859191);
        setIntElement(term934, 6, -916584829);
        setIntElement(term934, 7, -2131181468);
        term943 = new Integer(282916351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MergeSortedArray");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term929;
        args[1] = term932;
        args[2] = term934;
        args[3] = term943;
        callMethod(klass, "merge", argTypes, term928, args);
    }

};


