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

public class DiameterOfBinaryTree_diameterOfBinaryTree_12330122181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11760;
     Object term11762;

    public DiameterOfBinaryTree_diameterOfBinaryTree_12330122181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11760 = newInstance(Class.forName("leetcode.DiameterOfBinaryTree"));
        setIntField(term11760, term11760.getClass(), "ans", 2087429143);
        term11762 = newInstance(Class.forName("util.TreeNode"));
        Object term11764 = newInstance(Class.forName("util.TreeNode"));
        Object term11766 = newInstance(Class.forName("util.TreeNode"));
        Object term11768 = newInstance(Class.forName("util.TreeNode"));
        Object term11770 = newInstance(Class.forName("util.TreeNode"));
        Object term11772 = newInstance(Class.forName("util.TreeNode"));
        Object term11774 = newInstance(Class.forName("util.TreeNode"));
        Object term11776 = newInstance(Class.forName("util.TreeNode"));
        Object term11778 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term11762, term11762.getClass(), "val", -1892890104);
        setIntField(term11764, term11764.getClass(), "val", 2003356558);
        setIntField(term11766, term11766.getClass(), "val", -638126185);
        setIntField(term11768, term11768.getClass(), "val", 28070985);
        setIntField(term11770, term11770.getClass(), "val", 334110739);
        setField(term11770, term11770.getClass(), "left", null);
        setField(term11770, term11770.getClass(), "right", term11764);
        setField(term11768, term11768.getClass(), "left", term11770);
        setIntField(term11772, term11772.getClass(), "val", 1543539715);
        setField(term11772, term11772.getClass(), "left", null);
        setField(term11772, term11772.getClass(), "right", null);
        setField(term11768, term11768.getClass(), "right", term11772);
        setField(term11766, term11766.getClass(), "left", term11768);
        setIntField(term11774, term11774.getClass(), "val", 529595969);
        setIntField(term11776, term11776.getClass(), "val", -1548733886);
        setField(term11776, term11776.getClass(), "left", term11772);
        setField(term11776, term11776.getClass(), "right", term11762);
        setField(term11774, term11774.getClass(), "left", term11776);
        setIntField(term11778, term11778.getClass(), "val", -1724529322);
        setField(term11778, term11778.getClass(), "left", null);
        setField(term11778, term11778.getClass(), "right", term11764);
        setField(term11774, term11774.getClass(), "right", term11778);
        setField(term11766, term11766.getClass(), "right", term11774);
        setField(term11764, term11764.getClass(), "left", term11766);
        setField(term11764, term11764.getClass(), "right", term11774);
        setField(term11762, term11762.getClass(), "left", term11764);
        setField(term11762, term11762.getClass(), "right", term11770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.DiameterOfBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term11762;
        callMethod(klass, "diameterOfBinaryTree", argTypes, term11760, args);
    }

};


