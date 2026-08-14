package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HouseRobberIII_travel_16896950872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3462;
     Object term3463;

    public HouseRobberIII_travel_16896950872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3462 = newInstance(Class.forName("leetcode.medium.HouseRobberIII"));
        term3463 = newInstance(Class.forName("util.TreeNode"));
        Object term3465 = newInstance(Class.forName("util.TreeNode"));
        Object term3467 = newInstance(Class.forName("util.TreeNode"));
        Object term3469 = newInstance(Class.forName("util.TreeNode"));
        Object term3471 = newInstance(Class.forName("util.TreeNode"));
        Object term3473 = newInstance(Class.forName("util.TreeNode"));
        Object term3475 = newInstance(Class.forName("util.TreeNode"));
        Object term3477 = newInstance(Class.forName("util.TreeNode"));
        Object term3479 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term3463, term3463.getClass(), "val", -489441521);
        setIntField(term3465, term3465.getClass(), "val", 225873732);
        setIntField(term3467, term3467.getClass(), "val", 529879356);
        setIntField(term3469, term3469.getClass(), "val", 18072182);
        setIntField(term3471, term3471.getClass(), "val", 1544768934);
        setField(term3471, term3471.getClass(), "left", null);
        setField(term3471, term3471.getClass(), "right", term3465);
        setField(term3469, term3469.getClass(), "left", term3471);
        setIntField(term3473, term3473.getClass(), "val", 1985432430);
        setField(term3473, term3473.getClass(), "left", null);
        setField(term3473, term3473.getClass(), "right", null);
        setField(term3469, term3469.getClass(), "right", term3473);
        setField(term3467, term3467.getClass(), "left", term3469);
        setIntField(term3475, term3475.getClass(), "val", 958132675);
        setIntField(term3477, term3477.getClass(), "val", -689879283);
        setField(term3477, term3477.getClass(), "left", term3473);
        setField(term3477, term3477.getClass(), "right", term3463);
        setField(term3475, term3475.getClass(), "left", term3477);
        setIntField(term3479, term3479.getClass(), "val", -383508597);
        setField(term3479, term3479.getClass(), "left", null);
        setField(term3479, term3479.getClass(), "right", term3465);
        setField(term3475, term3475.getClass(), "right", term3479);
        setField(term3467, term3467.getClass(), "right", term3475);
        setField(term3465, term3465.getClass(), "left", term3467);
        setField(term3465, term3465.getClass(), "right", term3475);
        setField(term3463, term3463.getClass(), "left", term3465);
        setField(term3463, term3463.getClass(), "right", term3471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.HouseRobberIII");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term3463;
        callMethod(klass, "travel", argTypes, term3462, args);
    }

};


