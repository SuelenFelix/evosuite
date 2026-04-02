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

public class InvertBinaryTree_invertTree_7696450621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10743;
     Object term10744;

    public InvertBinaryTree_invertTree_7696450621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10743 = newInstance(Class.forName("leetcode.InvertBinaryTree"));
        term10744 = newInstance(Class.forName("util.TreeNode"));
        Object term10746 = newInstance(Class.forName("util.TreeNode"));
        Object term10748 = newInstance(Class.forName("util.TreeNode"));
        Object term10750 = newInstance(Class.forName("util.TreeNode"));
        Object term10752 = newInstance(Class.forName("util.TreeNode"));
        Object term10754 = newInstance(Class.forName("util.TreeNode"));
        Object term10756 = newInstance(Class.forName("util.TreeNode"));
        Object term10758 = newInstance(Class.forName("util.TreeNode"));
        Object term10760 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term10744, term10744.getClass(), "val", 491497994);
        setIntField(term10746, term10746.getClass(), "val", 1997288643);
        setIntField(term10748, term10748.getClass(), "val", -378961519);
        setIntField(term10750, term10750.getClass(), "val", -400280008);
        setIntField(term10752, term10752.getClass(), "val", -1191957775);
        setField(term10752, term10752.getClass(), "left", null);
        setField(term10752, term10752.getClass(), "right", term10746);
        setField(term10750, term10750.getClass(), "left", term10752);
        setIntField(term10754, term10754.getClass(), "val", 1415605360);
        setField(term10754, term10754.getClass(), "left", null);
        setField(term10754, term10754.getClass(), "right", null);
        setField(term10750, term10750.getClass(), "right", term10754);
        setField(term10748, term10748.getClass(), "left", term10750);
        setIntField(term10756, term10756.getClass(), "val", 395074450);
        setIntField(term10758, term10758.getClass(), "val", -2028511200);
        setField(term10758, term10758.getClass(), "left", term10754);
        setField(term10758, term10758.getClass(), "right", term10744);
        setField(term10756, term10756.getClass(), "left", term10758);
        setIntField(term10760, term10760.getClass(), "val", 14181775);
        setField(term10760, term10760.getClass(), "left", null);
        setField(term10760, term10760.getClass(), "right", term10746);
        setField(term10756, term10756.getClass(), "right", term10760);
        setField(term10748, term10748.getClass(), "right", term10756);
        setField(term10746, term10746.getClass(), "left", term10748);
        setField(term10746, term10746.getClass(), "right", term10756);
        setField(term10744, term10744.getClass(), "left", term10746);
        setField(term10744, term10744.getClass(), "right", term10752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.InvertBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term10744;
        callMethod(klass, "invertTree", argTypes, term10743, args);
    }

};


