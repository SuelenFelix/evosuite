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
import java.lang.Integer;

public class SearchA2DMatrix_searchPotentialRow_397346792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2363;
     Object term2364;
     Object term2377;

    public SearchA2DMatrix_searchPotentialRow_397346792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2363 = newInstance(Class.forName("leetcode.medium.SearchA2DMatrix"));
        term2364 = (Object[]) newArray("[I", 3);
        int[] term2365 = (int[]) newIntArray(2);
        int[] term2368 = (int[]) newIntArray(2);
        int[] term2371 = (int[]) newIntArray(5);
        setIntElement(term2365, 0, 1053773809);
        setIntElement(term2365, 1, 924127883);
        setElement(term2364, 0, term2365);
        setIntElement(term2368, 0, -751079123);
        setIntElement(term2368, 1, -110837188);
        setElement(term2364, 1, term2368);
        setIntElement(term2371, 0, -271094506);
        setIntElement(term2371, 1, 455632030);
        setIntElement(term2371, 2, -1632929393);
        setIntElement(term2371, 3, -431440129);
        setIntElement(term2371, 4, -763576148);
        setElement(term2364, 2, term2371);
        term2377 = new Integer(1568948514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SearchA2DMatrix");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2364;
        args[1] = term2377;
        callMethod(klass, "searchPotentialRow", argTypes, term2363, args);
    }

};


