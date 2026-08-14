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

public class SerializeAndDeserializeABinaryTree_preOrder_5364838213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term76;
     Object term94;

    public SerializeAndDeserializeABinaryTree_preOrder_5364838213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("leetcode.hard.SerializeAndDeserializeABinaryTree"));
        term76 = newInstance(Class.forName("util.TreeNode"));
        Object term78 = newInstance(Class.forName("util.TreeNode"));
        Object term80 = newInstance(Class.forName("util.TreeNode"));
        Object term82 = newInstance(Class.forName("util.TreeNode"));
        Object term84 = newInstance(Class.forName("util.TreeNode"));
        Object term86 = newInstance(Class.forName("util.TreeNode"));
        Object term88 = newInstance(Class.forName("util.TreeNode"));
        Object term90 = newInstance(Class.forName("util.TreeNode"));
        Object term92 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term76, term76.getClass(), "val", -6029667);
        setIntField(term78, term78.getClass(), "val", -2068769794);
        setIntField(term80, term80.getClass(), "val", -117576464);
        setIntField(term82, term82.getClass(), "val", -1007160944);
        setIntField(term84, term84.getClass(), "val", 1135664017);
        setField(term84, term84.getClass(), "left", null);
        setField(term84, term84.getClass(), "right", term78);
        setField(term82, term82.getClass(), "left", term84);
        setIntField(term86, term86.getClass(), "val", -203030934);
        setField(term86, term86.getClass(), "left", null);
        setField(term86, term86.getClass(), "right", null);
        setField(term82, term82.getClass(), "right", term86);
        setField(term80, term80.getClass(), "left", term82);
        setIntField(term88, term88.getClass(), "val", -1275173084);
        setIntField(term90, term90.getClass(), "val", -244121226);
        setField(term90, term90.getClass(), "left", term86);
        setField(term90, term90.getClass(), "right", term76);
        setField(term88, term88.getClass(), "left", term90);
        setIntField(term92, term92.getClass(), "val", 590364439);
        setField(term92, term92.getClass(), "left", null);
        setField(term92, term92.getClass(), "right", term78);
        setField(term88, term88.getClass(), "right", term92);
        setField(term80, term80.getClass(), "right", term88);
        setField(term78, term78.getClass(), "left", term80);
        setField(term78, term78.getClass(), "right", term88);
        setField(term76, term76.getClass(), "left", term78);
        setField(term76, term76.getClass(), "right", term84);
        term94 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term95 = (byte[]) newByteArray(16);
        setField(term94, term94.getClass(), "value", term95);
        setByteField(term94, term94.getClass(), "coder", (byte) 48);
        setIntField(term94, term94.getClass(), "count", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.SerializeAndDeserializeABinaryTree");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[2];
        args[0] = term76;
        args[1] = term94;
        callMethod(klass, "preOrder", argTypes, term75, args);
    }

};


