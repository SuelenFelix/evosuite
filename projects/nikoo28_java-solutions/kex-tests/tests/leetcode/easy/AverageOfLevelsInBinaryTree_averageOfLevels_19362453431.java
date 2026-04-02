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

public class AverageOfLevelsInBinaryTree_averageOfLevels_19362453431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397;
     Object term398;

    public AverageOfLevelsInBinaryTree_averageOfLevels_19362453431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397 = newInstance(Class.forName("leetcode.easy.AverageOfLevelsInBinaryTree"));
        term398 = newInstance(Class.forName("util.TreeNode"));
        Object term400 = newInstance(Class.forName("util.TreeNode"));
        Object term402 = newInstance(Class.forName("util.TreeNode"));
        Object term404 = newInstance(Class.forName("util.TreeNode"));
        Object term406 = newInstance(Class.forName("util.TreeNode"));
        Object term408 = newInstance(Class.forName("util.TreeNode"));
        Object term410 = newInstance(Class.forName("util.TreeNode"));
        Object term412 = newInstance(Class.forName("util.TreeNode"));
        Object term414 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term398, term398.getClass(), "val", 1090617576);
        setIntField(term400, term400.getClass(), "val", -1547384488);
        setIntField(term402, term402.getClass(), "val", 1442160736);
        setIntField(term404, term404.getClass(), "val", 1114000454);
        setIntField(term406, term406.getClass(), "val", -556405712);
        setField(term406, term406.getClass(), "left", null);
        setField(term406, term406.getClass(), "right", term400);
        setField(term404, term404.getClass(), "left", term406);
        setIntField(term408, term408.getClass(), "val", 941650513);
        setField(term408, term408.getClass(), "left", null);
        setField(term408, term408.getClass(), "right", null);
        setField(term404, term404.getClass(), "right", term408);
        setField(term402, term402.getClass(), "left", term404);
        setIntField(term410, term410.getClass(), "val", -505439934);
        setIntField(term412, term412.getClass(), "val", -344842608);
        setField(term412, term412.getClass(), "left", term408);
        setField(term412, term412.getClass(), "right", term398);
        setField(term410, term410.getClass(), "left", term412);
        setIntField(term414, term414.getClass(), "val", -1772434990);
        setField(term414, term414.getClass(), "left", null);
        setField(term414, term414.getClass(), "right", term400);
        setField(term410, term410.getClass(), "right", term414);
        setField(term402, term402.getClass(), "right", term410);
        setField(term400, term400.getClass(), "left", term402);
        setField(term400, term400.getClass(), "right", term410);
        setField(term398, term398.getClass(), "left", term400);
        setField(term398, term398.getClass(), "right", term406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.AverageOfLevelsInBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term398;
        callMethod(klass, "averageOfLevels", argTypes, term397, args);
    }

};


