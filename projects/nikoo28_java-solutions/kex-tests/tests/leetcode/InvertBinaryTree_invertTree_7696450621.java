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

public class InvertBinaryTree_invertTree_7696450621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11068;
     Object term11069;

    public InvertBinaryTree_invertTree_7696450621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11068 = newInstance(Class.forName("leetcode.InvertBinaryTree"));
        term11069 = newInstance(Class.forName("util.TreeNode"));
        Object term11071 = newInstance(Class.forName("util.TreeNode"));
        Object term11073 = newInstance(Class.forName("util.TreeNode"));
        Object term11075 = newInstance(Class.forName("util.TreeNode"));
        Object term11077 = newInstance(Class.forName("util.TreeNode"));
        Object term11079 = newInstance(Class.forName("util.TreeNode"));
        Object term11081 = newInstance(Class.forName("util.TreeNode"));
        Object term11083 = newInstance(Class.forName("util.TreeNode"));
        Object term11085 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term11069, term11069.getClass(), "val", -972516789);
        setIntField(term11071, term11071.getClass(), "val", 720077443);
        setIntField(term11073, term11073.getClass(), "val", -884523977);
        setIntField(term11075, term11075.getClass(), "val", -1396233580);
        setIntField(term11077, term11077.getClass(), "val", -654234892);
        setField(term11077, term11077.getClass(), "left", null);
        setField(term11077, term11077.getClass(), "right", term11071);
        setField(term11075, term11075.getClass(), "left", term11077);
        setIntField(term11079, term11079.getClass(), "val", 1235809050);
        setField(term11079, term11079.getClass(), "left", null);
        setField(term11079, term11079.getClass(), "right", null);
        setField(term11075, term11075.getClass(), "right", term11079);
        setField(term11073, term11073.getClass(), "left", term11075);
        setIntField(term11081, term11081.getClass(), "val", -1143749623);
        setIntField(term11083, term11083.getClass(), "val", 1961561878);
        setField(term11083, term11083.getClass(), "left", term11079);
        setField(term11083, term11083.getClass(), "right", term11069);
        setField(term11081, term11081.getClass(), "left", term11083);
        setIntField(term11085, term11085.getClass(), "val", -50930731);
        setField(term11085, term11085.getClass(), "left", null);
        setField(term11085, term11085.getClass(), "right", term11071);
        setField(term11081, term11081.getClass(), "right", term11085);
        setField(term11073, term11073.getClass(), "right", term11081);
        setField(term11071, term11071.getClass(), "left", term11073);
        setField(term11071, term11071.getClass(), "right", term11081);
        setField(term11069, term11069.getClass(), "left", term11071);
        setField(term11069, term11069.getClass(), "right", term11077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.InvertBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term11069;
        callMethod(klass, "invertTree", argTypes, term11068, args);
    }

};


