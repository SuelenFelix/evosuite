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

public class BalancedBinaryTree_height_3969378252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181;
     Object term182;

    public BalancedBinaryTree_height_3969378252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181 = newInstance(Class.forName("leetcode.easy.BalancedBinaryTree"));
        term182 = newInstance(Class.forName("util.TreeNode"));
        Object term184 = newInstance(Class.forName("util.TreeNode"));
        Object term186 = newInstance(Class.forName("util.TreeNode"));
        Object term188 = newInstance(Class.forName("util.TreeNode"));
        Object term190 = newInstance(Class.forName("util.TreeNode"));
        Object term192 = newInstance(Class.forName("util.TreeNode"));
        Object term194 = newInstance(Class.forName("util.TreeNode"));
        Object term196 = newInstance(Class.forName("util.TreeNode"));
        Object term198 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term182, term182.getClass(), "val", 1135664017);
        setIntField(term184, term184.getClass(), "val", 590364439);
        setIntField(term186, term186.getClass(), "val", 865208305);
        setIntField(term188, term188.getClass(), "val", -1275173084);
        setIntField(term190, term190.getClass(), "val", -244121226);
        setField(term190, term190.getClass(), "left", null);
        setField(term190, term190.getClass(), "right", term184);
        setField(term188, term188.getClass(), "left", term190);
        setIntField(term192, term192.getClass(), "val", 1193880199);
        setField(term192, term192.getClass(), "left", null);
        setField(term192, term192.getClass(), "right", null);
        setField(term188, term188.getClass(), "right", term192);
        setField(term186, term186.getClass(), "left", term188);
        setIntField(term194, term194.getClass(), "val", -73683645);
        setIntField(term196, term196.getClass(), "val", -226514366);
        setField(term196, term196.getClass(), "left", term192);
        setField(term196, term196.getClass(), "right", term182);
        setField(term194, term194.getClass(), "left", term196);
        setIntField(term198, term198.getClass(), "val", -203030934);
        setField(term198, term198.getClass(), "left", null);
        setField(term198, term198.getClass(), "right", term184);
        setField(term194, term194.getClass(), "right", term198);
        setField(term186, term186.getClass(), "right", term194);
        setField(term184, term184.getClass(), "left", term186);
        setField(term184, term184.getClass(), "right", term194);
        setField(term182, term182.getClass(), "left", term184);
        setField(term182, term182.getClass(), "right", term190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.BalancedBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term182;
        callMethod(klass, "height", argTypes, term181, args);
    }

};


