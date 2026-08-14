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
import java.lang.Integer;

public class RangeSumOfBST_rangeSumBST_16314207021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1633;
     Object term1634;
     Object term1652;
     Object term1654;

    public RangeSumOfBST_rangeSumBST_16314207021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1633 = newInstance(Class.forName("leetcode.easy.RangeSumOfBST"));
        term1634 = newInstance(Class.forName("util.TreeNode"));
        Object term1636 = newInstance(Class.forName("util.TreeNode"));
        Object term1638 = newInstance(Class.forName("util.TreeNode"));
        Object term1640 = newInstance(Class.forName("util.TreeNode"));
        Object term1642 = newInstance(Class.forName("util.TreeNode"));
        Object term1644 = newInstance(Class.forName("util.TreeNode"));
        Object term1646 = newInstance(Class.forName("util.TreeNode"));
        Object term1648 = newInstance(Class.forName("util.TreeNode"));
        Object term1650 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term1634, term1634.getClass(), "val", 1209799204);
        setIntField(term1636, term1636.getClass(), "val", 1094107751);
        setIntField(term1638, term1638.getClass(), "val", 844222656);
        setIntField(term1640, term1640.getClass(), "val", -18216811);
        setIntField(term1642, term1642.getClass(), "val", -1813280137);
        setField(term1642, term1642.getClass(), "left", null);
        setField(term1642, term1642.getClass(), "right", term1636);
        setField(term1640, term1640.getClass(), "left", term1642);
        setIntField(term1644, term1644.getClass(), "val", 1116576792);
        setField(term1644, term1644.getClass(), "left", null);
        setField(term1644, term1644.getClass(), "right", null);
        setField(term1640, term1640.getClass(), "right", term1644);
        setField(term1638, term1638.getClass(), "left", term1640);
        setIntField(term1646, term1646.getClass(), "val", -390501023);
        setIntField(term1648, term1648.getClass(), "val", -1667482829);
        setField(term1648, term1648.getClass(), "left", term1644);
        setField(term1648, term1648.getClass(), "right", term1634);
        setField(term1646, term1646.getClass(), "left", term1648);
        setIntField(term1650, term1650.getClass(), "val", 719656595);
        setField(term1650, term1650.getClass(), "left", null);
        setField(term1650, term1650.getClass(), "right", term1636);
        setField(term1646, term1646.getClass(), "right", term1650);
        setField(term1638, term1638.getClass(), "right", term1646);
        setField(term1636, term1636.getClass(), "left", term1638);
        setField(term1636, term1636.getClass(), "right", term1646);
        setField(term1634, term1634.getClass(), "left", term1636);
        setField(term1634, term1634.getClass(), "right", term1642);
        term1652 = new Integer(-942194446);
        term1654 = new Integer(-938508470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.RangeSumOfBST");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1634;
        args[1] = term1652;
        args[2] = term1654;
        callMethod(klass, "rangeSumBST", argTypes, term1633, args);
    }

};


