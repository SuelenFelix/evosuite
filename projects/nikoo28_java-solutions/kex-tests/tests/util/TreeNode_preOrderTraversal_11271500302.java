package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TreeNode_preOrderTraversal_11271500302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;

    public TreeNode_preOrderTraversal_11271500302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = newInstance(Class.forName("util.TreeNode"));
        Object term23 = newInstance(Class.forName("util.TreeNode"));
        Object term25 = newInstance(Class.forName("util.TreeNode"));
        Object term27 = newInstance(Class.forName("util.TreeNode"));
        Object term29 = newInstance(Class.forName("util.TreeNode"));
        Object term31 = newInstance(Class.forName("util.TreeNode"));
        Object term33 = newInstance(Class.forName("util.TreeNode"));
        Object term35 = newInstance(Class.forName("util.TreeNode"));
        Object term37 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term21, term21.getClass(), "val", -522618178);
        setIntField(term23, term23.getClass(), "val", 1134449235);
        setIntField(term25, term25.getClass(), "val", -883034806);
        setIntField(term27, term27.getClass(), "val", 1585847225);
        setIntField(term29, term29.getClass(), "val", 597278769);
        setField(term29, term29.getClass(), "left", null);
        setField(term29, term29.getClass(), "right", term23);
        setField(term27, term27.getClass(), "left", term29);
        setIntField(term31, term31.getClass(), "val", -655067527);
        setField(term31, term31.getClass(), "left", null);
        setField(term31, term31.getClass(), "right", null);
        setField(term27, term27.getClass(), "right", term31);
        setField(term25, term25.getClass(), "left", term27);
        setIntField(term33, term33.getClass(), "val", 1622346318);
        setIntField(term35, term35.getClass(), "val", 1048535127);
        setField(term35, term35.getClass(), "left", term31);
        setField(term35, term35.getClass(), "right", term21);
        setField(term33, term33.getClass(), "left", term35);
        setIntField(term37, term37.getClass(), "val", -1685132342);
        setField(term37, term37.getClass(), "left", null);
        setField(term37, term37.getClass(), "right", term23);
        setField(term33, term33.getClass(), "right", term37);
        setField(term25, term25.getClass(), "right", term33);
        setField(term23, term23.getClass(), "left", term25);
        setField(term23, term23.getClass(), "right", term33);
        setField(term21, term21.getClass(), "left", term23);
        setField(term21, term21.getClass(), "right", term29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.TreeNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term21;
        callMethod(klass, "preOrderTraversal", argTypes, null, args);
    }

};


