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

public class BinaryTreeZigzagLevelOrderTraversal_zigzagLevelOrder_11413466331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3572;
     Object term3573;

    public BinaryTreeZigzagLevelOrderTraversal_zigzagLevelOrder_11413466331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3572 = newInstance(Class.forName("leetcode.medium.BinaryTreeZigzagLevelOrderTraversal"));
        term3573 = newInstance(Class.forName("util.TreeNode"));
        Object term3575 = newInstance(Class.forName("util.TreeNode"));
        Object term3577 = newInstance(Class.forName("util.TreeNode"));
        Object term3579 = newInstance(Class.forName("util.TreeNode"));
        Object term3581 = newInstance(Class.forName("util.TreeNode"));
        Object term3583 = newInstance(Class.forName("util.TreeNode"));
        Object term3585 = newInstance(Class.forName("util.TreeNode"));
        Object term3587 = newInstance(Class.forName("util.TreeNode"));
        Object term3589 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term3573, term3573.getClass(), "val", -712023865);
        setIntField(term3575, term3575.getClass(), "val", 613256157);
        setIntField(term3577, term3577.getClass(), "val", 454242689);
        setIntField(term3579, term3579.getClass(), "val", 1798354517);
        setIntField(term3581, term3581.getClass(), "val", -1495693617);
        setField(term3581, term3581.getClass(), "left", null);
        setField(term3581, term3581.getClass(), "right", term3575);
        setField(term3579, term3579.getClass(), "left", term3581);
        setIntField(term3583, term3583.getClass(), "val", 2044137055);
        setField(term3583, term3583.getClass(), "left", null);
        setField(term3583, term3583.getClass(), "right", null);
        setField(term3579, term3579.getClass(), "right", term3583);
        setField(term3577, term3577.getClass(), "left", term3579);
        setIntField(term3585, term3585.getClass(), "val", -1458980236);
        setIntField(term3587, term3587.getClass(), "val", 890505372);
        setField(term3587, term3587.getClass(), "left", term3583);
        setField(term3587, term3587.getClass(), "right", term3573);
        setField(term3585, term3585.getClass(), "left", term3587);
        setIntField(term3589, term3589.getClass(), "val", -890538258);
        setField(term3589, term3589.getClass(), "left", null);
        setField(term3589, term3589.getClass(), "right", term3575);
        setField(term3585, term3585.getClass(), "right", term3589);
        setField(term3577, term3577.getClass(), "right", term3585);
        setField(term3575, term3575.getClass(), "left", term3577);
        setField(term3575, term3575.getClass(), "right", term3585);
        setField(term3573, term3573.getClass(), "left", term3575);
        setField(term3573, term3573.getClass(), "right", term3581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.BinaryTreeZigzagLevelOrderTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term3573;
        callMethod(klass, "zigzagLevelOrder", argTypes, term3572, args);
    }

};


