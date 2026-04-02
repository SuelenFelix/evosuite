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
     Object term13552;
     Object term13553;

    public BinaryTreeInOrderTraversal_inorderTraversal_7135589191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13552 = newInstance(Class.forName("leetcode.BinaryTreeInOrderTraversal"));
        term13553 = newInstance(Class.forName("util.TreeNode"));
        Object term13555 = newInstance(Class.forName("util.TreeNode"));
        Object term13557 = newInstance(Class.forName("util.TreeNode"));
        Object term13559 = newInstance(Class.forName("util.TreeNode"));
        Object term13561 = newInstance(Class.forName("util.TreeNode"));
        Object term13563 = newInstance(Class.forName("util.TreeNode"));
        Object term13565 = newInstance(Class.forName("util.TreeNode"));
        Object term13567 = newInstance(Class.forName("util.TreeNode"));
        Object term13569 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term13553, term13553.getClass(), "val", -481394578);
        setIntField(term13555, term13555.getClass(), "val", 1440683242);
        setIntField(term13557, term13557.getClass(), "val", -1746192055);
        setIntField(term13559, term13559.getClass(), "val", -996911099);
        setIntField(term13561, term13561.getClass(), "val", -610865659);
        setField(term13561, term13561.getClass(), "left", null);
        setField(term13561, term13561.getClass(), "right", term13555);
        setField(term13559, term13559.getClass(), "left", term13561);
        setIntField(term13563, term13563.getClass(), "val", -480070896);
        setField(term13563, term13563.getClass(), "left", null);
        setField(term13563, term13563.getClass(), "right", null);
        setField(term13559, term13559.getClass(), "right", term13563);
        setField(term13557, term13557.getClass(), "left", term13559);
        setIntField(term13565, term13565.getClass(), "val", 903039854);
        setIntField(term13567, term13567.getClass(), "val", -705528573);
        setField(term13567, term13567.getClass(), "left", term13563);
        setField(term13567, term13567.getClass(), "right", term13553);
        setField(term13565, term13565.getClass(), "left", term13567);
        setIntField(term13569, term13569.getClass(), "val", 2044119255);
        setField(term13569, term13569.getClass(), "left", null);
        setField(term13569, term13569.getClass(), "right", term13555);
        setField(term13565, term13565.getClass(), "right", term13569);
        setField(term13557, term13557.getClass(), "right", term13565);
        setField(term13555, term13555.getClass(), "left", term13557);
        setField(term13555, term13555.getClass(), "right", term13565);
        setField(term13553, term13553.getClass(), "left", term13555);
        setField(term13553, term13553.getClass(), "right", term13561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.BinaryTreeInOrderTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term13553;
        callMethod(klass, "inorderTraversal", argTypes, term13552, args);
    }

};


