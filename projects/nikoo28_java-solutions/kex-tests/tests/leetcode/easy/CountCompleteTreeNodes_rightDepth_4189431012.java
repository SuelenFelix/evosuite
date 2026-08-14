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

public class CountCompleteTreeNodes_rightDepth_4189431012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1271;
     Object term1272;

    public CountCompleteTreeNodes_rightDepth_4189431012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1271 = newInstance(Class.forName("leetcode.easy.CountCompleteTreeNodes"));
        term1272 = newInstance(Class.forName("util.TreeNode"));
        Object term1274 = newInstance(Class.forName("util.TreeNode"));
        Object term1276 = newInstance(Class.forName("util.TreeNode"));
        Object term1278 = newInstance(Class.forName("util.TreeNode"));
        Object term1280 = newInstance(Class.forName("util.TreeNode"));
        Object term1282 = newInstance(Class.forName("util.TreeNode"));
        Object term1284 = newInstance(Class.forName("util.TreeNode"));
        Object term1286 = newInstance(Class.forName("util.TreeNode"));
        Object term1288 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term1272, term1272.getClass(), "val", -123338791);
        setIntField(term1274, term1274.getClass(), "val", -1467089634);
        setIntField(term1276, term1276.getClass(), "val", 413548937);
        setIntField(term1278, term1278.getClass(), "val", 1901317214);
        setIntField(term1280, term1280.getClass(), "val", 1166710220);
        setField(term1280, term1280.getClass(), "left", null);
        setField(term1280, term1280.getClass(), "right", term1274);
        setField(term1278, term1278.getClass(), "left", term1280);
        setIntField(term1282, term1282.getClass(), "val", 1252951645);
        setField(term1282, term1282.getClass(), "left", null);
        setField(term1282, term1282.getClass(), "right", null);
        setField(term1278, term1278.getClass(), "right", term1282);
        setField(term1276, term1276.getClass(), "left", term1278);
        setIntField(term1284, term1284.getClass(), "val", 32185364);
        setIntField(term1286, term1286.getClass(), "val", 1768204942);
        setField(term1286, term1286.getClass(), "left", term1282);
        setField(term1286, term1286.getClass(), "right", term1272);
        setField(term1284, term1284.getClass(), "left", term1286);
        setIntField(term1288, term1288.getClass(), "val", -1070592289);
        setField(term1288, term1288.getClass(), "left", null);
        setField(term1288, term1288.getClass(), "right", term1274);
        setField(term1284, term1284.getClass(), "right", term1288);
        setField(term1276, term1276.getClass(), "right", term1284);
        setField(term1274, term1274.getClass(), "left", term1276);
        setField(term1274, term1274.getClass(), "right", term1284);
        setField(term1272, term1272.getClass(), "left", term1274);
        setField(term1272, term1272.getClass(), "right", term1280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.CountCompleteTreeNodes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term1272;
        callMethod(klass, "rightDepth", argTypes, term1271, args);
    }

};


