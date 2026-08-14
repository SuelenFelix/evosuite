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
import java.lang.Integer;

public class TwoSumIV_findTarget_16623049441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13143;
     Object term13144;
     Object term13162;

    public TwoSumIV_findTarget_16623049441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13143 = newInstance(Class.forName("leetcode.TwoSumIV"));
        term13144 = newInstance(Class.forName("util.TreeNode"));
        Object term13146 = newInstance(Class.forName("util.TreeNode"));
        Object term13148 = newInstance(Class.forName("util.TreeNode"));
        Object term13150 = newInstance(Class.forName("util.TreeNode"));
        Object term13152 = newInstance(Class.forName("util.TreeNode"));
        Object term13154 = newInstance(Class.forName("util.TreeNode"));
        Object term13156 = newInstance(Class.forName("util.TreeNode"));
        Object term13158 = newInstance(Class.forName("util.TreeNode"));
        Object term13160 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term13144, term13144.getClass(), "val", 1545425140);
        setIntField(term13146, term13146.getClass(), "val", -1580765555);
        setIntField(term13148, term13148.getClass(), "val", -1295149055);
        setIntField(term13150, term13150.getClass(), "val", -769814321);
        setIntField(term13152, term13152.getClass(), "val", 114898432);
        setField(term13152, term13152.getClass(), "left", null);
        setField(term13152, term13152.getClass(), "right", term13146);
        setField(term13150, term13150.getClass(), "left", term13152);
        setIntField(term13154, term13154.getClass(), "val", -935900044);
        setField(term13154, term13154.getClass(), "left", null);
        setField(term13154, term13154.getClass(), "right", null);
        setField(term13150, term13150.getClass(), "right", term13154);
        setField(term13148, term13148.getClass(), "left", term13150);
        setIntField(term13156, term13156.getClass(), "val", 1505717672);
        setIntField(term13158, term13158.getClass(), "val", -1683274691);
        setField(term13158, term13158.getClass(), "left", term13154);
        setField(term13158, term13158.getClass(), "right", term13144);
        setField(term13156, term13156.getClass(), "left", term13158);
        setIntField(term13160, term13160.getClass(), "val", -193767503);
        setField(term13160, term13160.getClass(), "left", null);
        setField(term13160, term13160.getClass(), "right", term13146);
        setField(term13156, term13156.getClass(), "right", term13160);
        setField(term13148, term13148.getClass(), "right", term13156);
        setField(term13146, term13146.getClass(), "left", term13148);
        setField(term13146, term13146.getClass(), "right", term13156);
        setField(term13144, term13144.getClass(), "left", term13146);
        setField(term13144, term13144.getClass(), "right", term13152);
        term13162 = new Integer(1747876558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.TwoSumIV");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term13144;
        args[1] = term13162;
        callMethod(klass, "findTarget", argTypes, term13143, args);
    }

};


