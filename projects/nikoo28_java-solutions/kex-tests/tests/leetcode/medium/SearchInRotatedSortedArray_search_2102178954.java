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

public class SearchInRotatedSortedArray_search_2102178954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term727;
     Object term728;
     Object term732;

    public SearchInRotatedSortedArray_search_2102178954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term727 = newInstance(Class.forName("leetcode.medium.SearchInRotatedSortedArray"));
        term728 = (int[]) newIntArray(3);
        setIntElement(term728, 0, -1410220680);
        setIntElement(term728, 1, 389427431);
        setIntElement(term728, 2, -1945706126);
        term732 = new Integer(1152356969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SearchInRotatedSortedArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term728;
        args[1] = term732;
        callMethod(klass, "search", argTypes, term727, args);
    }

};


