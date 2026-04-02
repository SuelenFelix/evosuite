package leetcode.hard;

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
import static leetcode.hard.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SerializeAndDeserializeABinaryTree_inOrder_18858043692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term21;
     Object term39;

    public SerializeAndDeserializeABinaryTree_inOrder_18858043692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20 = newInstance(Class.forName("leetcode.hard.SerializeAndDeserializeABinaryTree"));
        term21 = newInstance(Class.forName("util.TreeNode"));
        Object term23 = newInstance(Class.forName("util.TreeNode"));
        Object term25 = newInstance(Class.forName("util.TreeNode"));
        Object term27 = newInstance(Class.forName("util.TreeNode"));
        Object term29 = newInstance(Class.forName("util.TreeNode"));
        Object term31 = newInstance(Class.forName("util.TreeNode"));
        Object term33 = newInstance(Class.forName("util.TreeNode"));
        Object term35 = newInstance(Class.forName("util.TreeNode"));
        Object term37 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term21, term21.getClass(), "val", 1725571209);
        setIntField(term23, term23.getClass(), "val", -522618178);
        setIntField(term25, term25.getClass(), "val", 1134449235);
        setIntField(term27, term27.getClass(), "val", -883034806);
        setIntField(term29, term29.getClass(), "val", 1585847225);
        setField(term29, term29.getClass(), "left", null);
        setField(term29, term29.getClass(), "right", term23);
        setField(term27, term27.getClass(), "left", term29);
        setIntField(term31, term31.getClass(), "val", 1048535127);
        setField(term31, term31.getClass(), "left", null);
        setField(term31, term31.getClass(), "right", null);
        setField(term27, term27.getClass(), "right", term31);
        setField(term25, term25.getClass(), "left", term27);
        setIntField(term33, term33.getClass(), "val", -1456670397);
        setIntField(term35, term35.getClass(), "val", 1622346318);
        setField(term35, term35.getClass(), "left", term31);
        setField(term35, term35.getClass(), "right", term21);
        setField(term33, term33.getClass(), "left", term35);
        setIntField(term37, term37.getClass(), "val", 597278769);
        setField(term37, term37.getClass(), "left", null);
        setField(term37, term37.getClass(), "right", term23);
        setField(term33, term33.getClass(), "right", term37);
        setField(term25, term25.getClass(), "right", term33);
        setField(term23, term23.getClass(), "left", term25);
        setField(term23, term23.getClass(), "right", term33);
        setField(term21, term21.getClass(), "left", term23);
        setField(term21, term21.getClass(), "right", term29);
        term39 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term40 = (byte[]) newByteArray(16);
        setField(term39, term39.getClass(), "value", term40);
        setByteField(term39, term39.getClass(), "coder", (byte) 47);
        setIntField(term39, term39.getClass(), "count", -655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.SerializeAndDeserializeABinaryTree");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[2];
        args[0] = term21;
        args[1] = term39;
        callMethod(klass, "inOrder", argTypes, term20, args);
    }

};


