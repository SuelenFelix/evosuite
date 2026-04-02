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

public class BalancedBinaryTree_isBalanced_5259383481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162;
     Object term163;

    public BalancedBinaryTree_isBalanced_5259383481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162 = newInstance(Class.forName("leetcode.easy.BalancedBinaryTree"));
        term163 = newInstance(Class.forName("util.TreeNode"));
        Object term165 = newInstance(Class.forName("util.TreeNode"));
        Object term167 = newInstance(Class.forName("util.TreeNode"));
        Object term169 = newInstance(Class.forName("util.TreeNode"));
        Object term171 = newInstance(Class.forName("util.TreeNode"));
        Object term173 = newInstance(Class.forName("util.TreeNode"));
        Object term175 = newInstance(Class.forName("util.TreeNode"));
        Object term177 = newInstance(Class.forName("util.TreeNode"));
        Object term179 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term163, term163.getClass(), "val", 597278769);
        setIntField(term165, term165.getClass(), "val", -1685132342);
        setIntField(term167, term167.getClass(), "val", -1456670397);
        setIntField(term169, term169.getClass(), "val", 1622346318);
        setIntField(term171, term171.getClass(), "val", 1048535127);
        setField(term171, term171.getClass(), "left", null);
        setField(term171, term171.getClass(), "right", term165);
        setField(term169, term169.getClass(), "left", term171);
        setIntField(term173, term173.getClass(), "val", -1007160944);
        setField(term173, term173.getClass(), "left", null);
        setField(term173, term173.getClass(), "right", null);
        setField(term169, term169.getClass(), "right", term173);
        setField(term167, term167.getClass(), "left", term169);
        setIntField(term175, term175.getClass(), "val", -2068769794);
        setIntField(term177, term177.getClass(), "val", -117576464);
        setField(term177, term177.getClass(), "left", term173);
        setField(term177, term177.getClass(), "right", term163);
        setField(term175, term175.getClass(), "left", term177);
        setIntField(term179, term179.getClass(), "val", -655067527);
        setField(term179, term179.getClass(), "left", null);
        setField(term179, term179.getClass(), "right", term165);
        setField(term175, term175.getClass(), "right", term179);
        setField(term167, term167.getClass(), "right", term175);
        setField(term165, term165.getClass(), "left", term167);
        setField(term165, term165.getClass(), "right", term175);
        setField(term163, term163.getClass(), "left", term165);
        setField(term163, term163.getClass(), "right", term171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.BalancedBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term163;
        callMethod(klass, "isBalanced", argTypes, term162, args);
    }

};


