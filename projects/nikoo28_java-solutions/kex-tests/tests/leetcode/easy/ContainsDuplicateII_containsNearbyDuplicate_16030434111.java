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

public class ContainsDuplicateII_containsNearbyDuplicate_16030434111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114;
     Object term115;
     Object term120;

    public ContainsDuplicateII_containsNearbyDuplicate_16030434111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114 = newInstance(Class.forName("leetcode.easy.ContainsDuplicateII"));
        term115 = (int[]) newIntArray(4);
        setIntElement(term115, 0, 568599855);
        setIntElement(term115, 1, 1162663216);
        setIntElement(term115, 2, 1484323161);
        setIntElement(term115, 3, 391863371);
        term120 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.ContainsDuplicateII");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term115;
        args[1] = term120;
        callMethod(klass, "containsNearbyDuplicate", argTypes, term114, args);
    }

};


