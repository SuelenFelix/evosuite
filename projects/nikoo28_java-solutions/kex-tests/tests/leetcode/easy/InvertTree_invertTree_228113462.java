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

public class InvertTree_invertTree_228113462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2779;
     Object term2780;

    public InvertTree_invertTree_228113462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2779 = newInstance(Class.forName("leetcode.easy.InvertTree"));
        term2780 = newInstance(Class.forName("util.TreeNode"));
        Object term2782 = newInstance(Class.forName("util.TreeNode"));
        Object term2784 = newInstance(Class.forName("util.TreeNode"));
        Object term2786 = newInstance(Class.forName("util.TreeNode"));
        Object term2788 = newInstance(Class.forName("util.TreeNode"));
        Object term2790 = newInstance(Class.forName("util.TreeNode"));
        Object term2792 = newInstance(Class.forName("util.TreeNode"));
        Object term2794 = newInstance(Class.forName("util.TreeNode"));
        Object term2796 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2780, term2780.getClass(), "val", 433248783);
        setIntField(term2782, term2782.getClass(), "val", -507944154);
        setIntField(term2784, term2784.getClass(), "val", -1736183862);
        setIntField(term2786, term2786.getClass(), "val", 897010381);
        setIntField(term2788, term2788.getClass(), "val", -15712667);
        setField(term2788, term2788.getClass(), "left", null);
        setField(term2788, term2788.getClass(), "right", term2782);
        setField(term2786, term2786.getClass(), "left", term2788);
        setIntField(term2790, term2790.getClass(), "val", 21031843);
        setField(term2790, term2790.getClass(), "left", null);
        setField(term2790, term2790.getClass(), "right", null);
        setField(term2786, term2786.getClass(), "right", term2790);
        setField(term2784, term2784.getClass(), "left", term2786);
        setIntField(term2792, term2792.getClass(), "val", -330897705);
        setIntField(term2794, term2794.getClass(), "val", 1065595802);
        setField(term2794, term2794.getClass(), "left", term2790);
        setField(term2794, term2794.getClass(), "right", term2780);
        setField(term2792, term2792.getClass(), "left", term2794);
        setIntField(term2796, term2796.getClass(), "val", 1964967720);
        setField(term2796, term2796.getClass(), "left", null);
        setField(term2796, term2796.getClass(), "right", term2782);
        setField(term2792, term2792.getClass(), "right", term2796);
        setField(term2784, term2784.getClass(), "right", term2792);
        setField(term2782, term2782.getClass(), "left", term2784);
        setField(term2782, term2782.getClass(), "right", term2792);
        setField(term2780, term2780.getClass(), "left", term2782);
        setField(term2780, term2780.getClass(), "right", term2788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.InvertTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term2780;
        callMethod(klass, "invertTree", argTypes, term2779, args);
    }

};


