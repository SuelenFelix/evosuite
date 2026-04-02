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
import java.util.LinkedList;

public class ConvertBstToGreaterTree_inorder_529219352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2274;
     Object term2275;
     Object term2293;

    public ConvertBstToGreaterTree_inorder_529219352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2274 = newInstance(Class.forName("leetcode.easy.ConvertBstToGreaterTree"));
        term2275 = newInstance(Class.forName("util.TreeNode"));
        Object term2277 = newInstance(Class.forName("util.TreeNode"));
        Object term2279 = newInstance(Class.forName("util.TreeNode"));
        Object term2281 = newInstance(Class.forName("util.TreeNode"));
        Object term2283 = newInstance(Class.forName("util.TreeNode"));
        Object term2285 = newInstance(Class.forName("util.TreeNode"));
        Object term2287 = newInstance(Class.forName("util.TreeNode"));
        Object term2289 = newInstance(Class.forName("util.TreeNode"));
        Object term2291 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2275, term2275.getClass(), "val", 1638851942);
        setIntField(term2277, term2277.getClass(), "val", 1374790203);
        setIntField(term2279, term2279.getClass(), "val", 1160010161);
        setIntField(term2281, term2281.getClass(), "val", -423900705);
        setIntField(term2283, term2283.getClass(), "val", -525570815);
        setField(term2283, term2283.getClass(), "left", null);
        setField(term2283, term2283.getClass(), "right", term2277);
        setField(term2281, term2281.getClass(), "left", term2283);
        setIntField(term2285, term2285.getClass(), "val", 1607082164);
        setField(term2285, term2285.getClass(), "left", null);
        setField(term2285, term2285.getClass(), "right", null);
        setField(term2281, term2281.getClass(), "right", term2285);
        setField(term2279, term2279.getClass(), "left", term2281);
        setIntField(term2287, term2287.getClass(), "val", -370828664);
        setIntField(term2289, term2289.getClass(), "val", 1168633950);
        setField(term2289, term2289.getClass(), "left", term2285);
        setField(term2289, term2289.getClass(), "right", term2275);
        setField(term2287, term2287.getClass(), "left", term2289);
        setIntField(term2291, term2291.getClass(), "val", 754055848);
        setField(term2291, term2291.getClass(), "left", null);
        setField(term2291, term2291.getClass(), "right", term2277);
        setField(term2287, term2287.getClass(), "right", term2291);
        setField(term2279, term2279.getClass(), "right", term2287);
        setField(term2277, term2277.getClass(), "left", term2279);
        setField(term2277, term2277.getClass(), "right", term2287);
        setField(term2275, term2275.getClass(), "left", term2277);
        setField(term2275, term2275.getClass(), "right", term2283);
        term2293 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.ConvertBstToGreaterTree");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term2275;
        args[1] = term2293;
        callMethod(klass, "inorder", argTypes, term2274, args);
    }

};


