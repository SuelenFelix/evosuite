package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ArrayPartition1_arrayPairSum_10967904191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5098;
     Object term5099;

    public ArrayPartition1_arrayPairSum_10967904191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5098 = newInstance(Class.forName("leetcode.ArrayPartition1"));
        term5099 = (int[]) newIntArray(4);
        setIntElement(term5099, 0, 836734074);
        setIntElement(term5099, 1, -1747711865);
        setIntElement(term5099, 2, 682812715);
        setIntElement(term5099, 3, -1092883950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ArrayPartition1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5099;
        callMethod(klass, "arrayPairSum", argTypes, term5098, args);
    }

};


