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

public class SumOfLeftLeaves_sumOfLeftLeaves_18548939981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175;
     Object term176;

    public SumOfLeftLeaves_sumOfLeftLeaves_18548939981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175 = newInstance(Class.forName("leetcode.SumOfLeftLeaves"));
        term176 = newInstance(Class.forName("util.TreeNode"));
        Object term178 = newInstance(Class.forName("util.TreeNode"));
        Object term180 = newInstance(Class.forName("util.TreeNode"));
        Object term182 = newInstance(Class.forName("util.TreeNode"));
        Object term184 = newInstance(Class.forName("util.TreeNode"));
        Object term186 = newInstance(Class.forName("util.TreeNode"));
        Object term188 = newInstance(Class.forName("util.TreeNode"));
        Object term190 = newInstance(Class.forName("util.TreeNode"));
        Object term192 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term176, term176.getClass(), "val", 865208305);
        setIntField(term178, term178.getClass(), "val", -1275173084);
        setIntField(term180, term180.getClass(), "val", -244121226);
        setIntField(term182, term182.getClass(), "val", -203030934);
        setIntField(term184, term184.getClass(), "val", -1179120542);
        setField(term184, term184.getClass(), "left", null);
        setField(term184, term184.getClass(), "right", term178);
        setField(term182, term182.getClass(), "left", term184);
        setIntField(term186, term186.getClass(), "val", -1530420153);
        setField(term186, term186.getClass(), "left", null);
        setField(term186, term186.getClass(), "right", null);
        setField(term182, term182.getClass(), "right", term186);
        setField(term180, term180.getClass(), "left", term182);
        setIntField(term188, term188.getClass(), "val", 1193880199);
        setIntField(term190, term190.getClass(), "val", -1087774327);
        setField(term190, term190.getClass(), "left", term186);
        setField(term190, term190.getClass(), "right", term176);
        setField(term188, term188.getClass(), "left", term190);
        setIntField(term192, term192.getClass(), "val", -73683645);
        setField(term192, term192.getClass(), "left", null);
        setField(term192, term192.getClass(), "right", term178);
        setField(term188, term188.getClass(), "right", term192);
        setField(term180, term180.getClass(), "right", term188);
        setField(term178, term178.getClass(), "left", term180);
        setField(term178, term178.getClass(), "right", term188);
        setField(term176, term176.getClass(), "left", term178);
        setField(term176, term176.getClass(), "right", term184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.SumOfLeftLeaves");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term176;
        callMethod(klass, "sumOfLeftLeaves", argTypes, term175, args);
    }

};


