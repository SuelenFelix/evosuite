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

public class AverageOfLevelsInBinaryTree_averageOfLevels_10876542961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6808;
     Object term6809;

    public AverageOfLevelsInBinaryTree_averageOfLevels_10876542961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6808 = newInstance(Class.forName("leetcode.AverageOfLevelsInBinaryTree"));
        term6809 = newInstance(Class.forName("util.TreeNode"));
        Object term6811 = newInstance(Class.forName("util.TreeNode"));
        Object term6813 = newInstance(Class.forName("util.TreeNode"));
        Object term6815 = newInstance(Class.forName("util.TreeNode"));
        Object term6817 = newInstance(Class.forName("util.TreeNode"));
        Object term6819 = newInstance(Class.forName("util.TreeNode"));
        Object term6821 = newInstance(Class.forName("util.TreeNode"));
        Object term6823 = newInstance(Class.forName("util.TreeNode"));
        Object term6825 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term6809, term6809.getClass(), "val", 693500318);
        setIntField(term6811, term6811.getClass(), "val", 1702404702);
        setIntField(term6813, term6813.getClass(), "val", 1141592999);
        setIntField(term6815, term6815.getClass(), "val", 848113442);
        setIntField(term6817, term6817.getClass(), "val", 793974213);
        setField(term6817, term6817.getClass(), "left", null);
        setField(term6817, term6817.getClass(), "right", term6811);
        setField(term6815, term6815.getClass(), "left", term6817);
        setIntField(term6819, term6819.getClass(), "val", -126399768);
        setField(term6819, term6819.getClass(), "left", null);
        setField(term6819, term6819.getClass(), "right", null);
        setField(term6815, term6815.getClass(), "right", term6819);
        setField(term6813, term6813.getClass(), "left", term6815);
        setIntField(term6821, term6821.getClass(), "val", -568450686);
        setIntField(term6823, term6823.getClass(), "val", 1314660281);
        setField(term6823, term6823.getClass(), "left", term6819);
        setField(term6823, term6823.getClass(), "right", term6809);
        setField(term6821, term6821.getClass(), "left", term6823);
        setIntField(term6825, term6825.getClass(), "val", 722546287);
        setField(term6825, term6825.getClass(), "left", null);
        setField(term6825, term6825.getClass(), "right", term6811);
        setField(term6821, term6821.getClass(), "right", term6825);
        setField(term6813, term6813.getClass(), "right", term6821);
        setField(term6811, term6811.getClass(), "left", term6813);
        setField(term6811, term6811.getClass(), "right", term6821);
        setField(term6809, term6809.getClass(), "left", term6811);
        setField(term6809, term6809.getClass(), "right", term6817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.AverageOfLevelsInBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term6809;
        callMethod(klass, "averageOfLevels", argTypes, term6808, args);
    }

};


