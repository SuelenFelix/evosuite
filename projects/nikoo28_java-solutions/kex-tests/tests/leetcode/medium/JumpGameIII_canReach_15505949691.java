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

public class JumpGameIII_canReach_15505949691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2738;
     Object term2739;
     Object term2749;

    public JumpGameIII_canReach_15505949691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2738 = newInstance(Class.forName("leetcode.medium.JumpGameIII"));
        term2739 = (int[]) newIntArray(9);
        setIntElement(term2739, 0, -1858909368);
        setIntElement(term2739, 1, -280113263);
        setIntElement(term2739, 2, 529625347);
        setIntElement(term2739, 3, 1409095253);
        setIntElement(term2739, 4, 315179039);
        setIntElement(term2739, 5, -1835923897);
        setIntElement(term2739, 6, -341287775);
        setIntElement(term2739, 7, -1651110911);
        setIntElement(term2739, 8, -1934033808);
        term2749 = new Integer(950322609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.JumpGameIII");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2739;
        args[1] = term2749;
        callMethod(klass, "canReach", argTypes, term2738, args);
    }

};


