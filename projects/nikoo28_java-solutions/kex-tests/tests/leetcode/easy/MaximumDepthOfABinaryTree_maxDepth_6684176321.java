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
import java.lang.Object;

public class MaximumDepthOfABinaryTree_maxDepth_6684176321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2596;
     Object term2597;

    public MaximumDepthOfABinaryTree_maxDepth_6684176321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2596 = newInstance(Class.forName("leetcode.easy.MaximumDepthOfABinaryTree"));
        term2597 = newInstance(Class.forName("util.TreeNode"));
        Object term2599 = newInstance(Class.forName("util.TreeNode"));
        Object term2601 = newInstance(Class.forName("util.TreeNode"));
        Object term2603 = newInstance(Class.forName("util.TreeNode"));
        Object term2605 = newInstance(Class.forName("util.TreeNode"));
        Object term2607 = newInstance(Class.forName("util.TreeNode"));
        Object term2609 = newInstance(Class.forName("util.TreeNode"));
        Object term2611 = newInstance(Class.forName("util.TreeNode"));
        Object term2613 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2597, term2597.getClass(), "val", -1867239125);
        setIntField(term2599, term2599.getClass(), "val", 952869601);
        setIntField(term2601, term2601.getClass(), "val", 91958879);
        setIntField(term2603, term2603.getClass(), "val", -645429025);
        setIntField(term2605, term2605.getClass(), "val", -688213483);
        setField(term2605, term2605.getClass(), "left", null);
        setField(term2605, term2605.getClass(), "right", term2599);
        setField(term2603, term2603.getClass(), "left", term2605);
        setIntField(term2607, term2607.getClass(), "val", 354196060);
        setField(term2607, term2607.getClass(), "left", null);
        setField(term2607, term2607.getClass(), "right", null);
        setField(term2603, term2603.getClass(), "right", term2607);
        setField(term2601, term2601.getClass(), "left", term2603);
        setIntField(term2609, term2609.getClass(), "val", 1003743923);
        setIntField(term2611, term2611.getClass(), "val", 1887772522);
        setField(term2611, term2611.getClass(), "left", term2607);
        setField(term2611, term2611.getClass(), "right", term2597);
        setField(term2609, term2609.getClass(), "left", term2611);
        setIntField(term2613, term2613.getClass(), "val", 644154104);
        setField(term2613, term2613.getClass(), "left", null);
        setField(term2613, term2613.getClass(), "right", term2599);
        setField(term2609, term2609.getClass(), "right", term2613);
        setField(term2601, term2601.getClass(), "right", term2609);
        setField(term2599, term2599.getClass(), "left", term2601);
        setField(term2599, term2599.getClass(), "right", term2609);
        setField(term2597, term2597.getClass(), "left", term2599);
        setField(term2597, term2597.getClass(), "right", term2605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MaximumDepthOfABinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term2597;
        callMethod(klass, "maxDepth", argTypes, term2596, args);
    }

};


