package hackerrank.datastructures.trees;

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
import static hackerrank.datastructures.trees.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IsBinarySearchTree_checkBST_1045635001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public IsBinarySearchTree_checkBST_1045635001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("hackerrank.datastructures.trees.IsBinarySearchTree"));
        term2 = newInstance(Class.forName("util.TreeNode"));
        Object term4 = newInstance(Class.forName("util.TreeNode"));
        Object term6 = newInstance(Class.forName("util.TreeNode"));
        Object term8 = newInstance(Class.forName("util.TreeNode"));
        Object term10 = newInstance(Class.forName("util.TreeNode"));
        Object term12 = newInstance(Class.forName("util.TreeNode"));
        Object term14 = newInstance(Class.forName("util.TreeNode"));
        Object term16 = newInstance(Class.forName("util.TreeNode"));
        Object term18 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2, term2.getClass(), "val", 568599855);
        setIntField(term4, term4.getClass(), "val", 1162663216);
        setIntField(term6, term6.getClass(), "val", 1484323161);
        setIntField(term8, term8.getClass(), "val", 391863371);
        setIntField(term10, term10.getClass(), "val", -1922583790);
        setField(term10, term10.getClass(), "left", null);
        setField(term10, term10.getClass(), "right", term4);
        setField(term8, term8.getClass(), "left", term10);
        setIntField(term12, term12.getClass(), "val", -1339778481);
        setField(term12, term12.getClass(), "left", null);
        setField(term12, term12.getClass(), "right", null);
        setField(term8, term8.getClass(), "right", term12);
        setField(term6, term6.getClass(), "left", term8);
        setIntField(term14, term14.getClass(), "val", -2038273078);
        setIntField(term16, term16.getClass(), "val", 1227103734);
        setField(term16, term16.getClass(), "left", term12);
        setField(term16, term16.getClass(), "right", term2);
        setField(term14, term14.getClass(), "left", term16);
        setIntField(term18, term18.getClass(), "val", -616727354);
        setField(term18, term18.getClass(), "left", null);
        setField(term18, term18.getClass(), "right", term4);
        setField(term14, term14.getClass(), "right", term18);
        setField(term6, term6.getClass(), "right", term14);
        setField(term4, term4.getClass(), "left", term6);
        setField(term4, term4.getClass(), "right", term14);
        setField(term2, term2.getClass(), "left", term4);
        setField(term2, term2.getClass(), "right", term10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.trees.IsBinarySearchTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "checkBST", argTypes, term1, args);
    }

};


