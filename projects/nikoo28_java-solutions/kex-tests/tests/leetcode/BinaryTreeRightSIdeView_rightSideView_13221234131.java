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

public class BinaryTreeRightSIdeView_rightSideView_13221234131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1276;
     Object term1277;

    public BinaryTreeRightSIdeView_rightSideView_13221234131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1276 = newInstance(Class.forName("leetcode.BinaryTreeRightSIdeView"));
        term1277 = newInstance(Class.forName("util.TreeNode"));
        Object term1279 = newInstance(Class.forName("util.TreeNode"));
        Object term1281 = newInstance(Class.forName("util.TreeNode"));
        Object term1283 = newInstance(Class.forName("util.TreeNode"));
        Object term1285 = newInstance(Class.forName("util.TreeNode"));
        Object term1287 = newInstance(Class.forName("util.TreeNode"));
        Object term1289 = newInstance(Class.forName("util.TreeNode"));
        Object term1291 = newInstance(Class.forName("util.TreeNode"));
        Object term1293 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term1277, term1277.getClass(), "val", 96566506);
        setIntField(term1279, term1279.getClass(), "val", -343325701);
        setIntField(term1281, term1281.getClass(), "val", 107945604);
        setIntField(term1283, term1283.getClass(), "val", -1963464809);
        setIntField(term1285, term1285.getClass(), "val", 71190297);
        setField(term1285, term1285.getClass(), "left", null);
        setField(term1285, term1285.getClass(), "right", term1279);
        setField(term1283, term1283.getClass(), "left", term1285);
        setIntField(term1287, term1287.getClass(), "val", 2095798786);
        setField(term1287, term1287.getClass(), "left", null);
        setField(term1287, term1287.getClass(), "right", null);
        setField(term1283, term1283.getClass(), "right", term1287);
        setField(term1281, term1281.getClass(), "left", term1283);
        setIntField(term1289, term1289.getClass(), "val", -2063457669);
        setIntField(term1291, term1291.getClass(), "val", -1222006000);
        setField(term1291, term1291.getClass(), "left", term1287);
        setField(term1291, term1291.getClass(), "right", term1277);
        setField(term1289, term1289.getClass(), "left", term1291);
        setIntField(term1293, term1293.getClass(), "val", 1202361360);
        setField(term1293, term1293.getClass(), "left", null);
        setField(term1293, term1293.getClass(), "right", term1279);
        setField(term1289, term1289.getClass(), "right", term1293);
        setField(term1281, term1281.getClass(), "right", term1289);
        setField(term1279, term1279.getClass(), "left", term1281);
        setField(term1279, term1279.getClass(), "right", term1289);
        setField(term1277, term1277.getClass(), "left", term1279);
        setField(term1277, term1277.getClass(), "right", term1285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.BinaryTreeRightSIdeView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term1277;
        callMethod(klass, "rightSideView", argTypes, term1276, args);
    }

};


