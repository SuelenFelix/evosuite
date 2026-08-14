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

public class DiameterOfBinaryTree_depth_12599974142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12244;
     Object term12246;

    public DiameterOfBinaryTree_depth_12599974142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12244 = newInstance(Class.forName("leetcode.DiameterOfBinaryTree"));
        setIntField(term12244, term12244.getClass(), "ans", 523197189);
        term12246 = newInstance(Class.forName("util.TreeNode"));
        Object term12248 = newInstance(Class.forName("util.TreeNode"));
        Object term12250 = newInstance(Class.forName("util.TreeNode"));
        Object term12252 = newInstance(Class.forName("util.TreeNode"));
        Object term12254 = newInstance(Class.forName("util.TreeNode"));
        Object term12256 = newInstance(Class.forName("util.TreeNode"));
        Object term12258 = newInstance(Class.forName("util.TreeNode"));
        Object term12260 = newInstance(Class.forName("util.TreeNode"));
        Object term12262 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term12246, term12246.getClass(), "val", 658684460);
        setIntField(term12248, term12248.getClass(), "val", 2073367039);
        setIntField(term12250, term12250.getClass(), "val", -365877126);
        setIntField(term12252, term12252.getClass(), "val", 251018856);
        setIntField(term12254, term12254.getClass(), "val", -1965331640);
        setField(term12254, term12254.getClass(), "left", null);
        setField(term12254, term12254.getClass(), "right", term12248);
        setField(term12252, term12252.getClass(), "left", term12254);
        setIntField(term12256, term12256.getClass(), "val", -1031499401);
        setField(term12256, term12256.getClass(), "left", null);
        setField(term12256, term12256.getClass(), "right", null);
        setField(term12252, term12252.getClass(), "right", term12256);
        setField(term12250, term12250.getClass(), "left", term12252);
        setIntField(term12258, term12258.getClass(), "val", 373110517);
        setIntField(term12260, term12260.getClass(), "val", -1632703926);
        setField(term12260, term12260.getClass(), "left", term12256);
        setField(term12260, term12260.getClass(), "right", term12246);
        setField(term12258, term12258.getClass(), "left", term12260);
        setIntField(term12262, term12262.getClass(), "val", -514392629);
        setField(term12262, term12262.getClass(), "left", null);
        setField(term12262, term12262.getClass(), "right", term12248);
        setField(term12258, term12258.getClass(), "right", term12262);
        setField(term12250, term12250.getClass(), "right", term12258);
        setField(term12248, term12248.getClass(), "left", term12250);
        setField(term12248, term12248.getClass(), "right", term12258);
        setField(term12246, term12246.getClass(), "left", term12248);
        setField(term12246, term12246.getClass(), "right", term12254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.DiameterOfBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term12246;
        callMethod(klass, "depth", argTypes, term12244, args);
    }

};


