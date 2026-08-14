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
import java.lang.Object;

public class SubtreeOfAnotherTree_preOrderTraversal_15800743681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2283;
     Object term2284;

    public SubtreeOfAnotherTree_preOrderTraversal_15800743681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2283 = newInstance(Class.forName("leetcode.medium.SubtreeOfAnotherTree"));
        term2284 = newInstance(Class.forName("util.TreeNode"));
        Object term2286 = newInstance(Class.forName("util.TreeNode"));
        Object term2288 = newInstance(Class.forName("util.TreeNode"));
        Object term2290 = newInstance(Class.forName("util.TreeNode"));
        Object term2292 = newInstance(Class.forName("util.TreeNode"));
        Object term2294 = newInstance(Class.forName("util.TreeNode"));
        Object term2296 = newInstance(Class.forName("util.TreeNode"));
        Object term2298 = newInstance(Class.forName("util.TreeNode"));
        Object term2300 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2284, term2284.getClass(), "val", 963694071);
        setIntField(term2286, term2286.getClass(), "val", -995785731);
        setIntField(term2288, term2288.getClass(), "val", 1349815364);
        setIntField(term2290, term2290.getClass(), "val", 2128383340);
        setIntField(term2292, term2292.getClass(), "val", 1238598518);
        setField(term2292, term2292.getClass(), "left", null);
        setField(term2292, term2292.getClass(), "right", term2286);
        setField(term2290, term2290.getClass(), "left", term2292);
        setIntField(term2294, term2294.getClass(), "val", -246967963);
        setField(term2294, term2294.getClass(), "left", null);
        setField(term2294, term2294.getClass(), "right", null);
        setField(term2290, term2290.getClass(), "right", term2294);
        setField(term2288, term2288.getClass(), "left", term2290);
        setIntField(term2296, term2296.getClass(), "val", -829088844);
        setIntField(term2298, term2298.getClass(), "val", -31751777);
        setField(term2298, term2298.getClass(), "left", term2294);
        setField(term2298, term2298.getClass(), "right", term2284);
        setField(term2296, term2296.getClass(), "left", term2298);
        setIntField(term2300, term2300.getClass(), "val", -558146961);
        setField(term2300, term2300.getClass(), "left", null);
        setField(term2300, term2300.getClass(), "right", term2286);
        setField(term2296, term2296.getClass(), "right", term2300);
        setField(term2288, term2288.getClass(), "right", term2296);
        setField(term2286, term2286.getClass(), "left", term2288);
        setField(term2286, term2286.getClass(), "right", term2296);
        setField(term2284, term2284.getClass(), "left", term2286);
        setField(term2284, term2284.getClass(), "right", term2292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SubtreeOfAnotherTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term2284;
        callMethod(klass, "preOrderTraversal", argTypes, term2283, args);
    }

};


