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

public class ConvertBstToGreaterTree_convertBST_12861997671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2255;
     Object term2256;

    public ConvertBstToGreaterTree_convertBST_12861997671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2255 = newInstance(Class.forName("leetcode.easy.ConvertBstToGreaterTree"));
        term2256 = newInstance(Class.forName("util.TreeNode"));
        Object term2258 = newInstance(Class.forName("util.TreeNode"));
        Object term2260 = newInstance(Class.forName("util.TreeNode"));
        Object term2262 = newInstance(Class.forName("util.TreeNode"));
        Object term2264 = newInstance(Class.forName("util.TreeNode"));
        Object term2266 = newInstance(Class.forName("util.TreeNode"));
        Object term2268 = newInstance(Class.forName("util.TreeNode"));
        Object term2270 = newInstance(Class.forName("util.TreeNode"));
        Object term2272 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2256, term2256.getClass(), "val", -1831826725);
        setIntField(term2258, term2258.getClass(), "val", 752152965);
        setIntField(term2260, term2260.getClass(), "val", -1577069773);
        setIntField(term2262, term2262.getClass(), "val", -266625190);
        setIntField(term2264, term2264.getClass(), "val", 489201218);
        setField(term2264, term2264.getClass(), "left", null);
        setField(term2264, term2264.getClass(), "right", term2258);
        setField(term2262, term2262.getClass(), "left", term2264);
        setIntField(term2266, term2266.getClass(), "val", -97742366);
        setField(term2266, term2266.getClass(), "left", null);
        setField(term2266, term2266.getClass(), "right", null);
        setField(term2262, term2262.getClass(), "right", term2266);
        setField(term2260, term2260.getClass(), "left", term2262);
        setIntField(term2268, term2268.getClass(), "val", -941356098);
        setIntField(term2270, term2270.getClass(), "val", -201517446);
        setField(term2270, term2270.getClass(), "left", term2266);
        setField(term2270, term2270.getClass(), "right", term2256);
        setField(term2268, term2268.getClass(), "left", term2270);
        setIntField(term2272, term2272.getClass(), "val", 464181937);
        setField(term2272, term2272.getClass(), "left", null);
        setField(term2272, term2272.getClass(), "right", term2258);
        setField(term2268, term2268.getClass(), "right", term2272);
        setField(term2260, term2260.getClass(), "right", term2268);
        setField(term2258, term2258.getClass(), "left", term2260);
        setField(term2258, term2258.getClass(), "right", term2268);
        setField(term2256, term2256.getClass(), "left", term2258);
        setField(term2256, term2256.getClass(), "right", term2264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.ConvertBstToGreaterTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term2256;
        callMethod(klass, "convertBST", argTypes, term2255, args);
    }

};


