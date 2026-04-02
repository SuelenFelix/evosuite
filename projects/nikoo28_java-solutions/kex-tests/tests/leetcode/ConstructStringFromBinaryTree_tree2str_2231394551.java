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

public class ConstructStringFromBinaryTree_tree2str_2231394551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13429;
     Object term13430;

    public ConstructStringFromBinaryTree_tree2str_2231394551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13429 = newInstance(Class.forName("leetcode.ConstructStringFromBinaryTree"));
        term13430 = newInstance(Class.forName("util.TreeNode"));
        Object term13432 = newInstance(Class.forName("util.TreeNode"));
        Object term13434 = newInstance(Class.forName("util.TreeNode"));
        Object term13436 = newInstance(Class.forName("util.TreeNode"));
        Object term13438 = newInstance(Class.forName("util.TreeNode"));
        Object term13440 = newInstance(Class.forName("util.TreeNode"));
        Object term13442 = newInstance(Class.forName("util.TreeNode"));
        Object term13444 = newInstance(Class.forName("util.TreeNode"));
        Object term13446 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term13430, term13430.getClass(), "val", 65321166);
        setIntField(term13432, term13432.getClass(), "val", -2114805689);
        setIntField(term13434, term13434.getClass(), "val", 400772784);
        setIntField(term13436, term13436.getClass(), "val", 46781158);
        setIntField(term13438, term13438.getClass(), "val", -1987966813);
        setField(term13438, term13438.getClass(), "left", null);
        setField(term13438, term13438.getClass(), "right", term13432);
        setField(term13436, term13436.getClass(), "left", term13438);
        setIntField(term13440, term13440.getClass(), "val", -1581022727);
        setField(term13440, term13440.getClass(), "left", null);
        setField(term13440, term13440.getClass(), "right", null);
        setField(term13436, term13436.getClass(), "right", term13440);
        setField(term13434, term13434.getClass(), "left", term13436);
        setIntField(term13442, term13442.getClass(), "val", 546963992);
        setIntField(term13444, term13444.getClass(), "val", 1377120507);
        setField(term13444, term13444.getClass(), "left", term13440);
        setField(term13444, term13444.getClass(), "right", term13430);
        setField(term13442, term13442.getClass(), "left", term13444);
        setIntField(term13446, term13446.getClass(), "val", 1778126559);
        setField(term13446, term13446.getClass(), "left", null);
        setField(term13446, term13446.getClass(), "right", term13432);
        setField(term13442, term13442.getClass(), "right", term13446);
        setField(term13434, term13434.getClass(), "right", term13442);
        setField(term13432, term13432.getClass(), "left", term13434);
        setField(term13432, term13432.getClass(), "right", term13442);
        setField(term13430, term13430.getClass(), "left", term13432);
        setField(term13430, term13430.getClass(), "right", term13438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ConstructStringFromBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term13430;
        callMethod(klass, "tree2str", argTypes, term13429, args);
    }

};


