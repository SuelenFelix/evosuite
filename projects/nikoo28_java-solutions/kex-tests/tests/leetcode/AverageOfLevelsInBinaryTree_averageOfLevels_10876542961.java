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
     Object term6937;
     Object term6938;

    public AverageOfLevelsInBinaryTree_averageOfLevels_10876542961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6937 = newInstance(Class.forName("leetcode.AverageOfLevelsInBinaryTree"));
        term6938 = newInstance(Class.forName("util.TreeNode"));
        Object term6940 = newInstance(Class.forName("util.TreeNode"));
        Object term6942 = newInstance(Class.forName("util.TreeNode"));
        Object term6944 = newInstance(Class.forName("util.TreeNode"));
        Object term6946 = newInstance(Class.forName("util.TreeNode"));
        Object term6948 = newInstance(Class.forName("util.TreeNode"));
        Object term6950 = newInstance(Class.forName("util.TreeNode"));
        Object term6952 = newInstance(Class.forName("util.TreeNode"));
        Object term6954 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term6938, term6938.getClass(), "val", -2121133707);
        setIntField(term6940, term6940.getClass(), "val", -1005498887);
        setIntField(term6942, term6942.getClass(), "val", 1329150584);
        setIntField(term6944, term6944.getClass(), "val", -1825382367);
        setIntField(term6946, term6946.getClass(), "val", -1791371074);
        setField(term6946, term6946.getClass(), "left", null);
        setField(term6946, term6946.getClass(), "right", term6940);
        setField(term6944, term6944.getClass(), "left", term6946);
        setIntField(term6948, term6948.getClass(), "val", -159489307);
        setField(term6948, term6948.getClass(), "left", null);
        setField(term6948, term6948.getClass(), "right", null);
        setField(term6944, term6944.getClass(), "right", term6948);
        setField(term6942, term6942.getClass(), "left", term6944);
        setIntField(term6950, term6950.getClass(), "val", -1550025613);
        setIntField(term6952, term6952.getClass(), "val", 814617314);
        setField(term6952, term6952.getClass(), "left", term6948);
        setField(term6952, term6952.getClass(), "right", term6938);
        setField(term6950, term6950.getClass(), "left", term6952);
        setIntField(term6954, term6954.getClass(), "val", -1151122332);
        setField(term6954, term6954.getClass(), "left", null);
        setField(term6954, term6954.getClass(), "right", term6940);
        setField(term6950, term6950.getClass(), "right", term6954);
        setField(term6942, term6942.getClass(), "right", term6950);
        setField(term6940, term6940.getClass(), "left", term6942);
        setField(term6940, term6940.getClass(), "right", term6950);
        setField(term6938, term6938.getClass(), "left", term6940);
        setField(term6938, term6938.getClass(), "right", term6946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.AverageOfLevelsInBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term6938;
        callMethod(klass, "averageOfLevels", argTypes, term6937, args);
    }

};


