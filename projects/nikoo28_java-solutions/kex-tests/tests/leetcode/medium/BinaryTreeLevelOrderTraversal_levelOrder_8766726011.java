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

public class BinaryTreeLevelOrderTraversal_levelOrder_8766726011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1863;
     Object term1864;

    public BinaryTreeLevelOrderTraversal_levelOrder_8766726011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1863 = newInstance(Class.forName("leetcode.medium.BinaryTreeLevelOrderTraversal"));
        term1864 = newInstance(Class.forName("util.TreeNode"));
        Object term1866 = newInstance(Class.forName("util.TreeNode"));
        Object term1868 = newInstance(Class.forName("util.TreeNode"));
        Object term1870 = newInstance(Class.forName("util.TreeNode"));
        Object term1872 = newInstance(Class.forName("util.TreeNode"));
        Object term1874 = newInstance(Class.forName("util.TreeNode"));
        Object term1876 = newInstance(Class.forName("util.TreeNode"));
        Object term1878 = newInstance(Class.forName("util.TreeNode"));
        Object term1880 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term1864, term1864.getClass(), "val", 464181937);
        setIntField(term1866, term1866.getClass(), "val", -1455526612);
        setIntField(term1868, term1868.getClass(), "val", -941356098);
        setIntField(term1870, term1870.getClass(), "val", -201517446);
        setIntField(term1872, term1872.getClass(), "val", -97742366);
        setField(term1872, term1872.getClass(), "left", null);
        setField(term1872, term1872.getClass(), "right", term1866);
        setField(term1870, term1870.getClass(), "left", term1872);
        setIntField(term1874, term1874.getClass(), "val", -525570815);
        setField(term1874, term1874.getClass(), "left", null);
        setField(term1874, term1874.getClass(), "right", null);
        setField(term1870, term1870.getClass(), "right", term1874);
        setField(term1868, term1868.getClass(), "left", term1870);
        setIntField(term1876, term1876.getClass(), "val", 1160010161);
        setIntField(term1878, term1878.getClass(), "val", -423900705);
        setField(term1878, term1878.getClass(), "left", term1874);
        setField(term1878, term1878.getClass(), "right", term1864);
        setField(term1876, term1876.getClass(), "left", term1878);
        setIntField(term1880, term1880.getClass(), "val", 1638851942);
        setField(term1880, term1880.getClass(), "left", null);
        setField(term1880, term1880.getClass(), "right", term1866);
        setField(term1876, term1876.getClass(), "right", term1880);
        setField(term1868, term1868.getClass(), "right", term1876);
        setField(term1866, term1866.getClass(), "left", term1868);
        setField(term1866, term1866.getClass(), "right", term1876);
        setField(term1864, term1864.getClass(), "left", term1866);
        setField(term1864, term1864.getClass(), "right", term1872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.BinaryTreeLevelOrderTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term1864;
        callMethod(klass, "levelOrder", argTypes, term1863, args);
    }

};


