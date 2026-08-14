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
import java.lang.Integer;

public class UnionFind_union_16159166841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14253;
     Object term14261;
     Object term14263;

    public UnionFind_union_16159166841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14253 = newInstance(Class.forName("leetcode.UnionFind"));
        int[] term14254 = (int[]) newIntArray(5);
        setIntElement(term14254, 0, 844485803);
        setIntElement(term14254, 1, -1373407191);
        setIntElement(term14254, 2, 1013516042);
        setIntElement(term14254, 3, 284652039);
        setIntElement(term14254, 4, 1163350537);
        setField(term14253, term14253.getClass(), "father", term14254);
        setIntField(term14253, term14253.getClass(), "count", -855026181);
        term14261 = new Integer(1404243357);
        term14263 = new Integer(-570134327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.UnionFind");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term14261;
        args[1] = term14263;
        callMethod(klass, "union", argTypes, term14253, args);
    }

};


