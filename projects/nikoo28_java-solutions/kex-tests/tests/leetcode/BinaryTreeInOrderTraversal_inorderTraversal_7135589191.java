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

public class BinaryTreeInOrderTraversal_inorderTraversal_7135589191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14108;
     Object term14109;

    public BinaryTreeInOrderTraversal_inorderTraversal_7135589191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14108 = newInstance(Class.forName("leetcode.BinaryTreeInOrderTraversal"));
        term14109 = newInstance(Class.forName("util.TreeNode"));
        Object term14111 = newInstance(Class.forName("util.TreeNode"));
        Object term14113 = newInstance(Class.forName("util.TreeNode"));
        Object term14115 = newInstance(Class.forName("util.TreeNode"));
        Object term14117 = newInstance(Class.forName("util.TreeNode"));
        Object term14119 = newInstance(Class.forName("util.TreeNode"));
        Object term14121 = newInstance(Class.forName("util.TreeNode"));
        Object term14123 = newInstance(Class.forName("util.TreeNode"));
        Object term14125 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term14109, term14109.getClass(), "val", 98801346);
        setIntField(term14111, term14111.getClass(), "val", 2133290622);
        setIntField(term14113, term14113.getClass(), "val", -164869996);
        setIntField(term14115, term14115.getClass(), "val", 1415001538);
        setIntField(term14117, term14117.getClass(), "val", 1738077695);
        setField(term14117, term14117.getClass(), "left", null);
        setField(term14117, term14117.getClass(), "right", term14111);
        setField(term14115, term14115.getClass(), "left", term14117);
        setIntField(term14119, term14119.getClass(), "val", -1542292796);
        setField(term14119, term14119.getClass(), "left", null);
        setField(term14119, term14119.getClass(), "right", null);
        setField(term14115, term14115.getClass(), "right", term14119);
        setField(term14113, term14113.getClass(), "left", term14115);
        setIntField(term14121, term14121.getClass(), "val", 1272985537);
        setIntField(term14123, term14123.getClass(), "val", -785719854);
        setField(term14123, term14123.getClass(), "left", term14119);
        setField(term14123, term14123.getClass(), "right", term14109);
        setField(term14121, term14121.getClass(), "left", term14123);
        setIntField(term14125, term14125.getClass(), "val", -1351117314);
        setField(term14125, term14125.getClass(), "left", null);
        setField(term14125, term14125.getClass(), "right", term14111);
        setField(term14121, term14121.getClass(), "right", term14125);
        setField(term14113, term14113.getClass(), "right", term14121);
        setField(term14111, term14111.getClass(), "left", term14113);
        setField(term14111, term14111.getClass(), "right", term14121);
        setField(term14109, term14109.getClass(), "left", term14111);
        setField(term14109, term14109.getClass(), "right", term14117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.BinaryTreeInOrderTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term14109;
        callMethod(klass, "inorderTraversal", argTypes, term14108, args);
    }

};


