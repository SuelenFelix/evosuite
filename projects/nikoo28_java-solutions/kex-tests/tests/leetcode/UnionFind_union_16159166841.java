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
     Object term13707;
     Object term13718;
     Object term13720;

    public UnionFind_union_16159166841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13707 = newInstance(Class.forName("leetcode.UnionFind"));
        int[] term13708 = (int[]) newIntArray(8);
        setIntElement(term13708, 0, -123945804);
        setIntElement(term13708, 1, 2133669766);
        setIntElement(term13708, 2, -1423215684);
        setIntElement(term13708, 3, -1096652631);
        setIntElement(term13708, 4, 1116810901);
        setIntElement(term13708, 5, 1944430959);
        setIntElement(term13708, 6, 98801346);
        setIntElement(term13708, 7, 2133290622);
        setField(term13707, term13707.getClass(), "father", term13708);
        setIntField(term13707, term13707.getClass(), "count", -164869996);
        term13718 = new Integer(1415001538);
        term13720 = new Integer(1738077695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.UnionFind");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term13718;
        args[1] = term13720;
        callMethod(klass, "union", argTypes, term13707, args);
    }

};


