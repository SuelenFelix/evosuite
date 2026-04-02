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

public class DiameterOfABinaryTree_diameterOfBinaryTree_12719212941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1104;
     Object term1105;

    public DiameterOfABinaryTree_diameterOfBinaryTree_12719212941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1104 = newInstance(Class.forName("leetcode.easy.DiameterOfABinaryTree"));
        term1105 = newInstance(Class.forName("util.TreeNode"));
        Object term1107 = newInstance(Class.forName("util.TreeNode"));
        Object term1109 = newInstance(Class.forName("util.TreeNode"));
        Object term1111 = newInstance(Class.forName("util.TreeNode"));
        Object term1113 = newInstance(Class.forName("util.TreeNode"));
        Object term1115 = newInstance(Class.forName("util.TreeNode"));
        Object term1117 = newInstance(Class.forName("util.TreeNode"));
        Object term1119 = newInstance(Class.forName("util.TreeNode"));
        Object term1121 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term1105, term1105.getClass(), "val", -159494544);
        setIntField(term1107, term1107.getClass(), "val", -75206835);
        setIntField(term1109, term1109.getClass(), "val", -1618206977);
        setIntField(term1111, term1111.getClass(), "val", -1747406163);
        setIntField(term1113, term1113.getClass(), "val", 388157121);
        setField(term1113, term1113.getClass(), "left", null);
        setField(term1113, term1113.getClass(), "right", term1107);
        setField(term1111, term1111.getClass(), "left", term1113);
        setIntField(term1115, term1115.getClass(), "val", -860131894);
        setField(term1115, term1115.getClass(), "left", null);
        setField(term1115, term1115.getClass(), "right", null);
        setField(term1111, term1111.getClass(), "right", term1115);
        setField(term1109, term1109.getClass(), "left", term1111);
        setIntField(term1117, term1117.getClass(), "val", 1270666529);
        setIntField(term1119, term1119.getClass(), "val", -1146679443);
        setField(term1119, term1119.getClass(), "left", term1115);
        setField(term1119, term1119.getClass(), "right", term1105);
        setField(term1117, term1117.getClass(), "left", term1119);
        setIntField(term1121, term1121.getClass(), "val", 1684998508);
        setField(term1121, term1121.getClass(), "left", null);
        setField(term1121, term1121.getClass(), "right", term1107);
        setField(term1117, term1117.getClass(), "right", term1121);
        setField(term1109, term1109.getClass(), "right", term1117);
        setField(term1107, term1107.getClass(), "left", term1109);
        setField(term1107, term1107.getClass(), "right", term1117);
        setField(term1105, term1105.getClass(), "left", term1107);
        setField(term1105, term1105.getClass(), "right", term1113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.DiameterOfABinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term1105;
        callMethod(klass, "diameterOfBinaryTree", argTypes, term1104, args);
    }

};


