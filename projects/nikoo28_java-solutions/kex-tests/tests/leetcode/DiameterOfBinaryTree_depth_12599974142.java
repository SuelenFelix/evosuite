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
import java.lang.Object;

public class DiameterOfBinaryTree_depth_12599974142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11780;
     Object term11782;

    public DiameterOfBinaryTree_depth_12599974142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11780 = newInstance(Class.forName("leetcode.DiameterOfBinaryTree"));
        setIntField(term11780, term11780.getClass(), "ans", 1744599521);
        term11782 = newInstance(Class.forName("util.TreeNode"));
        Object term11784 = newInstance(Class.forName("util.TreeNode"));
        Object term11786 = newInstance(Class.forName("util.TreeNode"));
        Object term11788 = newInstance(Class.forName("util.TreeNode"));
        Object term11790 = newInstance(Class.forName("util.TreeNode"));
        Object term11792 = newInstance(Class.forName("util.TreeNode"));
        Object term11794 = newInstance(Class.forName("util.TreeNode"));
        Object term11796 = newInstance(Class.forName("util.TreeNode"));
        Object term11798 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term11782, term11782.getClass(), "val", -985141153);
        setIntField(term11784, term11784.getClass(), "val", -1983740361);
        setIntField(term11786, term11786.getClass(), "val", -1494716341);
        setIntField(term11788, term11788.getClass(), "val", 816237851);
        setIntField(term11790, term11790.getClass(), "val", -604114341);
        setField(term11790, term11790.getClass(), "left", null);
        setField(term11790, term11790.getClass(), "right", term11784);
        setField(term11788, term11788.getClass(), "left", term11790);
        setIntField(term11792, term11792.getClass(), "val", -1745708025);
        setField(term11792, term11792.getClass(), "left", null);
        setField(term11792, term11792.getClass(), "right", null);
        setField(term11788, term11788.getClass(), "right", term11792);
        setField(term11786, term11786.getClass(), "left", term11788);
        setIntField(term11794, term11794.getClass(), "val", -1628536749);
        setIntField(term11796, term11796.getClass(), "val", -748022064);
        setField(term11796, term11796.getClass(), "left", term11792);
        setField(term11796, term11796.getClass(), "right", term11782);
        setField(term11794, term11794.getClass(), "left", term11796);
        setIntField(term11798, term11798.getClass(), "val", 1146236760);
        setField(term11798, term11798.getClass(), "left", null);
        setField(term11798, term11798.getClass(), "right", term11784);
        setField(term11794, term11794.getClass(), "right", term11798);
        setField(term11786, term11786.getClass(), "right", term11794);
        setField(term11784, term11784.getClass(), "left", term11786);
        setField(term11784, term11784.getClass(), "right", term11794);
        setField(term11782, term11782.getClass(), "left", term11784);
        setField(term11782, term11782.getClass(), "right", term11790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.DiameterOfBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term11782;
        callMethod(klass, "depth", argTypes, term11780, args);
    }

};


