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

public class DiameterOfBinaryTree_diameterOfBinaryTree_12330122181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12224;
     Object term12226;

    public DiameterOfBinaryTree_diameterOfBinaryTree_12330122181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12224 = newInstance(Class.forName("leetcode.DiameterOfBinaryTree"));
        setIntField(term12224, term12224.getClass(), "ans", -1103257588);
        term12226 = newInstance(Class.forName("util.TreeNode"));
        Object term12228 = newInstance(Class.forName("util.TreeNode"));
        Object term12230 = newInstance(Class.forName("util.TreeNode"));
        Object term12232 = newInstance(Class.forName("util.TreeNode"));
        Object term12234 = newInstance(Class.forName("util.TreeNode"));
        Object term12236 = newInstance(Class.forName("util.TreeNode"));
        Object term12238 = newInstance(Class.forName("util.TreeNode"));
        Object term12240 = newInstance(Class.forName("util.TreeNode"));
        Object term12242 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term12226, term12226.getClass(), "val", 1463219831);
        setIntField(term12228, term12228.getClass(), "val", -1516863216);
        setIntField(term12230, term12230.getClass(), "val", 1392468004);
        setIntField(term12232, term12232.getClass(), "val", -1568339070);
        setIntField(term12234, term12234.getClass(), "val", -1427059961);
        setField(term12234, term12234.getClass(), "left", null);
        setField(term12234, term12234.getClass(), "right", term12228);
        setField(term12232, term12232.getClass(), "left", term12234);
        setIntField(term12236, term12236.getClass(), "val", 2130990985);
        setField(term12236, term12236.getClass(), "left", null);
        setField(term12236, term12236.getClass(), "right", null);
        setField(term12232, term12232.getClass(), "right", term12236);
        setField(term12230, term12230.getClass(), "left", term12232);
        setIntField(term12238, term12238.getClass(), "val", -1661685401);
        setIntField(term12240, term12240.getClass(), "val", 1427434947);
        setField(term12240, term12240.getClass(), "left", term12236);
        setField(term12240, term12240.getClass(), "right", term12226);
        setField(term12238, term12238.getClass(), "left", term12240);
        setIntField(term12242, term12242.getClass(), "val", 1120685189);
        setField(term12242, term12242.getClass(), "left", null);
        setField(term12242, term12242.getClass(), "right", term12228);
        setField(term12238, term12238.getClass(), "right", term12242);
        setField(term12230, term12230.getClass(), "right", term12238);
        setField(term12228, term12228.getClass(), "left", term12230);
        setField(term12228, term12228.getClass(), "right", term12238);
        setField(term12226, term12226.getClass(), "left", term12228);
        setField(term12226, term12226.getClass(), "right", term12234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.DiameterOfBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term12226;
        callMethod(klass, "diameterOfBinaryTree", argTypes, term12224, args);
    }

};


