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
import java.util.LinkedList;
import java.lang.Integer;

public class Subsets_backtrack_10174246462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2525;
     Object term2526;
     Object term2529;
     Object term2532;
     Object term2539;

    public Subsets_backtrack_10174246462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2525 = newInstance(Class.forName("leetcode.medium.Subsets"));
        term2526 = new LinkedList();
        term2529 = new LinkedList();
        term2532 = (int[]) newIntArray(6);
        setIntElement(term2532, 0, -1292704466);
        setIntElement(term2532, 1, 1991858584);
        setIntElement(term2532, 2, -1300947782);
        setIntElement(term2532, 3, 188512644);
        setIntElement(term2532, 4, 1851127634);
        setIntElement(term2532, 5, 783730213);
        term2539 = new Integer(1815951606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.Subsets");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term2526;
        args[1] = term2529;
        args[2] = term2532;
        args[3] = term2539;
        callMethod(klass, "backtrack", argTypes, term2525, args);
    }

};


