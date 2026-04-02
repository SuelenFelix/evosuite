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

public class MaximumLevelSumOfABinaryTree_maxLevelSum_5566126371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3861;
     Object term3862;

    public MaximumLevelSumOfABinaryTree_maxLevelSum_5566126371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3861 = newInstance(Class.forName("leetcode.medium.MaximumLevelSumOfABinaryTree"));
        term3862 = newInstance(Class.forName("util.TreeNode"));
        Object term3864 = newInstance(Class.forName("util.TreeNode"));
        Object term3866 = newInstance(Class.forName("util.TreeNode"));
        Object term3868 = newInstance(Class.forName("util.TreeNode"));
        Object term3870 = newInstance(Class.forName("util.TreeNode"));
        Object term3872 = newInstance(Class.forName("util.TreeNode"));
        Object term3874 = newInstance(Class.forName("util.TreeNode"));
        Object term3876 = newInstance(Class.forName("util.TreeNode"));
        Object term3878 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term3862, term3862.getClass(), "val", -2137419728);
        setIntField(term3864, term3864.getClass(), "val", 1558810715);
        setIntField(term3866, term3866.getClass(), "val", -382652403);
        setIntField(term3868, term3868.getClass(), "val", -2126539433);
        setIntField(term3870, term3870.getClass(), "val", 196952878);
        setField(term3870, term3870.getClass(), "left", null);
        setField(term3870, term3870.getClass(), "right", term3864);
        setField(term3868, term3868.getClass(), "left", term3870);
        setIntField(term3872, term3872.getClass(), "val", -1763480506);
        setField(term3872, term3872.getClass(), "left", null);
        setField(term3872, term3872.getClass(), "right", null);
        setField(term3868, term3868.getClass(), "right", term3872);
        setField(term3866, term3866.getClass(), "left", term3868);
        setIntField(term3874, term3874.getClass(), "val", -1514240086);
        setIntField(term3876, term3876.getClass(), "val", 2052244839);
        setField(term3876, term3876.getClass(), "left", term3872);
        setField(term3876, term3876.getClass(), "right", term3862);
        setField(term3874, term3874.getClass(), "left", term3876);
        setIntField(term3878, term3878.getClass(), "val", 802673242);
        setField(term3878, term3878.getClass(), "left", null);
        setField(term3878, term3878.getClass(), "right", term3864);
        setField(term3874, term3874.getClass(), "right", term3878);
        setField(term3866, term3866.getClass(), "right", term3874);
        setField(term3864, term3864.getClass(), "left", term3866);
        setField(term3864, term3864.getClass(), "right", term3874);
        setField(term3862, term3862.getClass(), "left", term3864);
        setField(term3862, term3862.getClass(), "right", term3870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MaximumLevelSumOfABinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term3862;
        callMethod(klass, "maxLevelSum", argTypes, term3861, args);
    }

};


