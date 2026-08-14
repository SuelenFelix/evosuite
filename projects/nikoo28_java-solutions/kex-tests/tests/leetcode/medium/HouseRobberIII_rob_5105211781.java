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

public class HouseRobberIII_rob_5105211781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3443;
     Object term3444;

    public HouseRobberIII_rob_5105211781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3443 = newInstance(Class.forName("leetcode.medium.HouseRobberIII"));
        term3444 = newInstance(Class.forName("util.TreeNode"));
        Object term3446 = newInstance(Class.forName("util.TreeNode"));
        Object term3448 = newInstance(Class.forName("util.TreeNode"));
        Object term3450 = newInstance(Class.forName("util.TreeNode"));
        Object term3452 = newInstance(Class.forName("util.TreeNode"));
        Object term3454 = newInstance(Class.forName("util.TreeNode"));
        Object term3456 = newInstance(Class.forName("util.TreeNode"));
        Object term3458 = newInstance(Class.forName("util.TreeNode"));
        Object term3460 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term3444, term3444.getClass(), "val", -232333014);
        setIntField(term3446, term3446.getClass(), "val", -139694079);
        setIntField(term3448, term3448.getClass(), "val", -1602072035);
        setIntField(term3450, term3450.getClass(), "val", 1902624392);
        setIntField(term3452, term3452.getClass(), "val", 904607217);
        setField(term3452, term3452.getClass(), "left", null);
        setField(term3452, term3452.getClass(), "right", term3446);
        setField(term3450, term3450.getClass(), "left", term3452);
        setIntField(term3454, term3454.getClass(), "val", 1124282188);
        setField(term3454, term3454.getClass(), "left", null);
        setField(term3454, term3454.getClass(), "right", null);
        setField(term3450, term3450.getClass(), "right", term3454);
        setField(term3448, term3448.getClass(), "left", term3450);
        setIntField(term3456, term3456.getClass(), "val", -2134711835);
        setIntField(term3458, term3458.getClass(), "val", -1641244494);
        setField(term3458, term3458.getClass(), "left", term3454);
        setField(term3458, term3458.getClass(), "right", term3444);
        setField(term3456, term3456.getClass(), "left", term3458);
        setIntField(term3460, term3460.getClass(), "val", 434914590);
        setField(term3460, term3460.getClass(), "left", null);
        setField(term3460, term3460.getClass(), "right", term3446);
        setField(term3456, term3456.getClass(), "right", term3460);
        setField(term3448, term3448.getClass(), "right", term3456);
        setField(term3446, term3446.getClass(), "left", term3448);
        setField(term3446, term3446.getClass(), "right", term3456);
        setField(term3444, term3444.getClass(), "left", term3446);
        setField(term3444, term3444.getClass(), "right", term3452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.HouseRobberIII");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term3444;
        callMethod(klass, "rob", argTypes, term3443, args);
    }

};


