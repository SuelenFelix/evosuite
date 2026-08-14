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
import java.util.LinkedList;
import java.lang.Integer;

public class IsBinarySearchTree_helper_8920088752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term21;
     Object term39;

    public IsBinarySearchTree_helper_8920088752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20 = newInstance(Class.forName("hackerrank.datastructures.trees.IsBinarySearchTree"));
        term21 = newInstance(Class.forName("util.TreeNode"));
        Object term23 = newInstance(Class.forName("util.TreeNode"));
        Object term25 = newInstance(Class.forName("util.TreeNode"));
        Object term27 = newInstance(Class.forName("util.TreeNode"));
        Object term29 = newInstance(Class.forName("util.TreeNode"));
        Object term31 = newInstance(Class.forName("util.TreeNode"));
        Object term33 = newInstance(Class.forName("util.TreeNode"));
        Object term35 = newInstance(Class.forName("util.TreeNode"));
        Object term37 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term21, term21.getClass(), "val", 1725571209);
        setIntField(term23, term23.getClass(), "val", -522618178);
        setIntField(term25, term25.getClass(), "val", 1134449235);
        setIntField(term27, term27.getClass(), "val", -883034806);
        setIntField(term29, term29.getClass(), "val", 1585847225);
        setField(term29, term29.getClass(), "left", null);
        setField(term29, term29.getClass(), "right", term23);
        setField(term27, term27.getClass(), "left", term29);
        setIntField(term31, term31.getClass(), "val", 1048535127);
        setField(term31, term31.getClass(), "left", null);
        setField(term31, term31.getClass(), "right", null);
        setField(term27, term27.getClass(), "right", term31);
        setField(term25, term25.getClass(), "left", term27);
        setIntField(term33, term33.getClass(), "val", -1456670397);
        setIntField(term35, term35.getClass(), "val", 1622346318);
        setField(term35, term35.getClass(), "left", term31);
        setField(term35, term35.getClass(), "right", term21);
        setField(term33, term33.getClass(), "left", term35);
        setIntField(term37, term37.getClass(), "val", 597278769);
        setField(term37, term37.getClass(), "left", null);
        setField(term37, term37.getClass(), "right", term23);
        setField(term33, term33.getClass(), "right", term37);
        setField(term25, term25.getClass(), "right", term33);
        setField(term23, term23.getClass(), "left", term25);
        setField(term23, term23.getClass(), "right", term33);
        setField(term21, term21.getClass(), "left", term23);
        setField(term21, term21.getClass(), "right", term29);
        Integer term42 = new Integer(568599855);
        Integer term45 = new Integer(1162663216);
        Integer term48 = new Integer(1484323161);
        Integer term51 = new Integer(391863371);
        term39 = new LinkedList();
        ((LinkedList) term39).add(term42);
        ((LinkedList) term39).add(term45);
        ((LinkedList) term39).add(term48);
        ((LinkedList) term39).add(term51);
        ((LinkedList) term39).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.trees.IsBinarySearchTree");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term21;
        args[1] = term39;
        callMethod(klass, "helper", argTypes, term20, args);
    }

};


