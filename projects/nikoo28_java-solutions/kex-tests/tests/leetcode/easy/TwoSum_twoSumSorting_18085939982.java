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

public class TwoSum_twoSumSorting_18085939982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549;
     Object term550;
     Object term556;

    public TwoSum_twoSumSorting_18085939982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term549 = newInstance(Class.forName("leetcode.easy.TwoSum"));
        term550 = (int[]) newIntArray(5);
        setIntElement(term550, 0, -341962980);
        setIntElement(term550, 1, 1532716628);
        setIntElement(term550, 2, -1801760683);
        setIntElement(term550, 3, 1141317871);
        setIntElement(term550, 4, 890669485);
        term556 = new Integer(691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.TwoSum");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term550;
        args[1] = term556;
        callMethod(klass, "twoSumSorting", argTypes, term549, args);
    }

};


