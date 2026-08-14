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

public class MinimumSizeSubarraySum_minSubArrayLen_11930388541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4785;
     Object term4786;
     Object term4788;

    public MinimumSizeSubarraySum_minSubArrayLen_11930388541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4785 = newInstance(Class.forName("leetcode.medium.MinimumSizeSubarraySum"));
        term4786 = new Integer(1717232691);
        term4788 = (int[]) newIntArray(6);
        setIntElement(term4788, 0, -938127737);
        setIntElement(term4788, 1, -1408678076);
        setIntElement(term4788, 2, 1201413899);
        setIntElement(term4788, 3, -376722373);
        setIntElement(term4788, 4, 1180687854);
        setIntElement(term4788, 5, 328631288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MinimumSizeSubarraySum");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term4786;
        args[1] = term4788;
        callMethod(klass, "minSubArrayLen", argTypes, term4785, args);
    }

};


