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
import java.util.LinkedList;

public class TwoSumIV_inorder_3716626832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12574;
     Object term12575;
     Object term12593;

    public TwoSumIV_inorder_3716626832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12574 = newInstance(Class.forName("leetcode.TwoSumIV"));
        term12575 = newInstance(Class.forName("util.TreeNode"));
        Object term12577 = newInstance(Class.forName("util.TreeNode"));
        Object term12579 = newInstance(Class.forName("util.TreeNode"));
        Object term12581 = newInstance(Class.forName("util.TreeNode"));
        Object term12583 = newInstance(Class.forName("util.TreeNode"));
        Object term12585 = newInstance(Class.forName("util.TreeNode"));
        Object term12587 = newInstance(Class.forName("util.TreeNode"));
        Object term12589 = newInstance(Class.forName("util.TreeNode"));
        Object term12591 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term12575, term12575.getClass(), "val", 786551253);
        setIntField(term12577, term12577.getClass(), "val", -104779523);
        setIntField(term12579, term12579.getClass(), "val", 749289511);
        setIntField(term12581, term12581.getClass(), "val", -414437174);
        setIntField(term12583, term12583.getClass(), "val", -860227615);
        setField(term12583, term12583.getClass(), "left", null);
        setField(term12583, term12583.getClass(), "right", term12577);
        setField(term12581, term12581.getClass(), "left", term12583);
        setIntField(term12585, term12585.getClass(), "val", -553500478);
        setField(term12585, term12585.getClass(), "left", null);
        setField(term12585, term12585.getClass(), "right", null);
        setField(term12581, term12581.getClass(), "right", term12585);
        setField(term12579, term12579.getClass(), "left", term12581);
        setIntField(term12587, term12587.getClass(), "val", 1496590861);
        setIntField(term12589, term12589.getClass(), "val", 1046957508);
        setField(term12589, term12589.getClass(), "left", term12585);
        setField(term12589, term12589.getClass(), "right", term12575);
        setField(term12587, term12587.getClass(), "left", term12589);
        setIntField(term12591, term12591.getClass(), "val", -1696192372);
        setField(term12591, term12591.getClass(), "left", null);
        setField(term12591, term12591.getClass(), "right", term12577);
        setField(term12587, term12587.getClass(), "right", term12591);
        setField(term12579, term12579.getClass(), "right", term12587);
        setField(term12577, term12577.getClass(), "left", term12579);
        setField(term12577, term12577.getClass(), "right", term12587);
        setField(term12575, term12575.getClass(), "left", term12577);
        setField(term12575, term12575.getClass(), "right", term12583);
        term12593 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.TwoSumIV");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term12575;
        args[1] = term12593;
        callMethod(klass, "inorder", argTypes, term12574, args);
    }

};


