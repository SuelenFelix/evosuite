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
import java.util.LinkedList;
import java.lang.Object;

public class LeafSimilar_traverse_18193799072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2963;
     Object term2964;
     Object term2967;

    public LeafSimilar_traverse_18193799072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2963 = newInstance(Class.forName("leetcode.LeafSimilar"));
        term2964 = new LinkedList();
        term2967 = newInstance(Class.forName("util.TreeNode"));
        Object term2969 = newInstance(Class.forName("util.TreeNode"));
        Object term2971 = newInstance(Class.forName("util.TreeNode"));
        Object term2973 = newInstance(Class.forName("util.TreeNode"));
        Object term2975 = newInstance(Class.forName("util.TreeNode"));
        Object term2977 = newInstance(Class.forName("util.TreeNode"));
        Object term2979 = newInstance(Class.forName("util.TreeNode"));
        Object term2981 = newInstance(Class.forName("util.TreeNode"));
        Object term2983 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2967, term2967.getClass(), "val", 43258317);
        setIntField(term2969, term2969.getClass(), "val", 1707220033);
        setIntField(term2971, term2971.getClass(), "val", -1792504217);
        setIntField(term2973, term2973.getClass(), "val", 1824538861);
        setIntField(term2975, term2975.getClass(), "val", 499519708);
        setField(term2975, term2975.getClass(), "left", null);
        setField(term2975, term2975.getClass(), "right", term2969);
        setField(term2973, term2973.getClass(), "left", term2975);
        setIntField(term2977, term2977.getClass(), "val", -1831826725);
        setField(term2977, term2977.getClass(), "left", null);
        setField(term2977, term2977.getClass(), "right", null);
        setField(term2973, term2973.getClass(), "right", term2977);
        setField(term2971, term2971.getClass(), "left", term2973);
        setIntField(term2979, term2979.getClass(), "val", 888506903);
        setIntField(term2981, term2981.getClass(), "val", 200252898);
        setField(term2981, term2981.getClass(), "left", term2977);
        setField(term2981, term2981.getClass(), "right", term2967);
        setField(term2979, term2979.getClass(), "left", term2981);
        setIntField(term2983, term2983.getClass(), "val", 1501165033);
        setField(term2983, term2983.getClass(), "left", null);
        setField(term2983, term2983.getClass(), "right", term2969);
        setField(term2979, term2979.getClass(), "right", term2983);
        setField(term2971, term2971.getClass(), "right", term2979);
        setField(term2969, term2969.getClass(), "left", term2971);
        setField(term2969, term2969.getClass(), "right", term2979);
        setField(term2967, term2967.getClass(), "left", term2969);
        setField(term2967, term2967.getClass(), "right", term2975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.LeafSimilar");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("util.TreeNode");
        Object[] args = new Object[2];
        args[0] = term2964;
        args[1] = term2967;
        callMethod(klass, "traverse", argTypes, term2963, args);
    }

};


