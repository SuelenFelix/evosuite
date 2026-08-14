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
import java.lang.Integer;

public class FirstAndLastPositionOfElementInSortedArray_findLeftBound_16552613172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1220;
     Object term1221;
     Object term1229;

    public FirstAndLastPositionOfElementInSortedArray_findLeftBound_16552613172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1220 = newInstance(Class.forName("leetcode.medium.FirstAndLastPositionOfElementInSortedArray"));
        term1221 = (int[]) newIntArray(7);
        setIntElement(term1221, 0, 1901317214);
        setIntElement(term1221, 1, 1166710220);
        setIntElement(term1221, 2, -1070592289);
        setIntElement(term1221, 3, -1464172784);
        setIntElement(term1221, 4, 32185364);
        setIntElement(term1221, 5, 1768204942);
        setIntElement(term1221, 6, 1252951645);
        term1229 = new Integer(574481092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.FirstAndLastPositionOfElementInSortedArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1221;
        args[1] = term1229;
        callMethod(klass, "findLeftBound", argTypes, term1220, args);
    }

};


