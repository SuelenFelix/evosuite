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

public class TwoSum_twoSumBruteForce_2128595851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533;
     Object term534;
     Object term541;

    public TwoSum_twoSumBruteForce_2128595851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term533 = newInstance(Class.forName("leetcode.easy.TwoSum"));
        term534 = (int[]) newIntArray(6);
        setIntElement(term534, 0, 1596213415);
        setIntElement(term534, 1, -268815336);
        setIntElement(term534, 2, -1210583429);
        setIntElement(term534, 3, -663691365);
        setIntElement(term534, 4, 339854490);
        setIntElement(term534, 5, -615654495);
        term541 = new Integer(-1476117762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.TwoSum");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term534;
        args[1] = term541;
        callMethod(klass, "twoSumBruteForce", argTypes, term533, args);
    }

};


