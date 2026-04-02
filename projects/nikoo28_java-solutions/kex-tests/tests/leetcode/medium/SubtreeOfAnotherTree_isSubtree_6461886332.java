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

public class SubtreeOfAnotherTree_isSubtree_6461886332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2302;
     Object term2303;
     Object term2321;

    public SubtreeOfAnotherTree_isSubtree_6461886332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2302 = newInstance(Class.forName("leetcode.medium.SubtreeOfAnotherTree"));
        term2303 = newInstance(Class.forName("util.TreeNode"));
        Object term2305 = newInstance(Class.forName("util.TreeNode"));
        Object term2307 = newInstance(Class.forName("util.TreeNode"));
        Object term2309 = newInstance(Class.forName("util.TreeNode"));
        Object term2311 = newInstance(Class.forName("util.TreeNode"));
        Object term2313 = newInstance(Class.forName("util.TreeNode"));
        Object term2315 = newInstance(Class.forName("util.TreeNode"));
        Object term2317 = newInstance(Class.forName("util.TreeNode"));
        Object term2319 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2303, term2303.getClass(), "val", -1777140369);
        setIntField(term2305, term2305.getClass(), "val", 993627098);
        setIntField(term2307, term2307.getClass(), "val", 872295704);
        setIntField(term2309, term2309.getClass(), "val", 86041387);
        setIntField(term2311, term2311.getClass(), "val", 1010721666);
        setField(term2311, term2311.getClass(), "left", null);
        setField(term2311, term2311.getClass(), "right", term2305);
        setField(term2309, term2309.getClass(), "left", term2311);
        setIntField(term2313, term2313.getClass(), "val", 1648665618);
        setField(term2313, term2313.getClass(), "left", null);
        setField(term2313, term2313.getClass(), "right", null);
        setField(term2309, term2309.getClass(), "right", term2313);
        setField(term2307, term2307.getClass(), "left", term2309);
        setIntField(term2315, term2315.getClass(), "val", -1703625118);
        setIntField(term2317, term2317.getClass(), "val", 1104108112);
        setField(term2317, term2317.getClass(), "left", term2313);
        setField(term2317, term2317.getClass(), "right", term2303);
        setField(term2315, term2315.getClass(), "left", term2317);
        setIntField(term2319, term2319.getClass(), "val", 27043781);
        setField(term2319, term2319.getClass(), "left", null);
        setField(term2319, term2319.getClass(), "right", term2305);
        setField(term2315, term2315.getClass(), "right", term2319);
        setField(term2307, term2307.getClass(), "right", term2315);
        setField(term2305, term2305.getClass(), "left", term2307);
        setField(term2305, term2305.getClass(), "right", term2315);
        setField(term2303, term2303.getClass(), "left", term2305);
        setField(term2303, term2303.getClass(), "right", term2311);
        term2321 = newInstance(Class.forName("util.TreeNode"));
        Object term2323 = newInstance(Class.forName("util.TreeNode"));
        Object term2325 = newInstance(Class.forName("util.TreeNode"));
        Object term2327 = newInstance(Class.forName("util.TreeNode"));
        Object term2329 = newInstance(Class.forName("util.TreeNode"));
        Object term2331 = newInstance(Class.forName("util.TreeNode"));
        Object term2333 = newInstance(Class.forName("util.TreeNode"));
        Object term2335 = newInstance(Class.forName("util.TreeNode"));
        Object term2337 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2321, term2321.getClass(), "val", 633765954);
        setIntField(term2323, term2323.getClass(), "val", 269110087);
        setIntField(term2325, term2325.getClass(), "val", 1545119095);
        setIntField(term2327, term2327.getClass(), "val", 1671229683);
        setIntField(term2329, term2329.getClass(), "val", 34167717);
        setField(term2329, term2329.getClass(), "left", null);
        setField(term2329, term2329.getClass(), "right", term2323);
        setField(term2327, term2327.getClass(), "left", term2329);
        setIntField(term2331, term2331.getClass(), "val", -1790275458);
        setField(term2331, term2331.getClass(), "left", null);
        setField(term2331, term2331.getClass(), "right", null);
        setField(term2327, term2327.getClass(), "right", term2331);
        setField(term2325, term2325.getClass(), "left", term2327);
        setIntField(term2333, term2333.getClass(), "val", 385463636);
        setIntField(term2335, term2335.getClass(), "val", -1677599962);
        setField(term2335, term2335.getClass(), "left", term2331);
        setField(term2335, term2335.getClass(), "right", term2321);
        setField(term2333, term2333.getClass(), "left", term2335);
        setIntField(term2337, term2337.getClass(), "val", -514195141);
        setField(term2337, term2337.getClass(), "left", null);
        setField(term2337, term2337.getClass(), "right", term2323);
        setField(term2333, term2333.getClass(), "right", term2337);
        setField(term2325, term2325.getClass(), "right", term2333);
        setField(term2323, term2323.getClass(), "left", term2325);
        setField(term2323, term2323.getClass(), "right", term2333);
        setField(term2321, term2321.getClass(), "left", term2323);
        setField(term2321, term2321.getClass(), "right", term2329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SubtreeOfAnotherTree");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = Class.forName("util.TreeNode");
        Object[] args = new Object[2];
        args[0] = term2303;
        args[1] = term2321;
        callMethod(klass, "isSubtree", argTypes, term2302, args);
    }

};


