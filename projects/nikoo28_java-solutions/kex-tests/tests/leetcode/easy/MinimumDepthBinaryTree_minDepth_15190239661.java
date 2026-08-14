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

public class MinimumDepthBinaryTree_minDepth_15190239661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2740;
     Object term2741;

    public MinimumDepthBinaryTree_minDepth_15190239661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2740 = newInstance(Class.forName("leetcode.easy.MinimumDepthBinaryTree"));
        term2741 = newInstance(Class.forName("util.TreeNode"));
        Object term2743 = newInstance(Class.forName("util.TreeNode"));
        Object term2745 = newInstance(Class.forName("util.TreeNode"));
        Object term2747 = newInstance(Class.forName("util.TreeNode"));
        Object term2749 = newInstance(Class.forName("util.TreeNode"));
        Object term2751 = newInstance(Class.forName("util.TreeNode"));
        Object term2753 = newInstance(Class.forName("util.TreeNode"));
        Object term2755 = newInstance(Class.forName("util.TreeNode"));
        Object term2757 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2741, term2741.getClass(), "val", -1488938905);
        setIntField(term2743, term2743.getClass(), "val", 1916544127);
        setIntField(term2745, term2745.getClass(), "val", -1133405894);
        setIntField(term2747, term2747.getClass(), "val", 1289741214);
        setIntField(term2749, term2749.getClass(), "val", 243280944);
        setField(term2749, term2749.getClass(), "left", null);
        setField(term2749, term2749.getClass(), "right", term2743);
        setField(term2747, term2747.getClass(), "left", term2749);
        setIntField(term2751, term2751.getClass(), "val", 1543091617);
        setField(term2751, term2751.getClass(), "left", null);
        setField(term2751, term2751.getClass(), "right", null);
        setField(term2747, term2747.getClass(), "right", term2751);
        setField(term2745, term2745.getClass(), "left", term2747);
        setIntField(term2753, term2753.getClass(), "val", -128490829);
        setIntField(term2755, term2755.getClass(), "val", 202214133);
        setField(term2755, term2755.getClass(), "left", term2751);
        setField(term2755, term2755.getClass(), "right", term2741);
        setField(term2753, term2753.getClass(), "left", term2755);
        setIntField(term2757, term2757.getClass(), "val", -726681073);
        setField(term2757, term2757.getClass(), "left", null);
        setField(term2757, term2757.getClass(), "right", term2743);
        setField(term2753, term2753.getClass(), "right", term2757);
        setField(term2745, term2745.getClass(), "right", term2753);
        setField(term2743, term2743.getClass(), "left", term2745);
        setField(term2743, term2743.getClass(), "right", term2753);
        setField(term2741, term2741.getClass(), "left", term2743);
        setField(term2741, term2741.getClass(), "right", term2749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MinimumDepthBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term2741;
        callMethod(klass, "minDepth", argTypes, term2740, args);
    }

};


