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

public class BinaryTreeRightSideView_rightSideView_12331236971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226;
     Object term227;

    public BinaryTreeRightSideView_rightSideView_12331236971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226 = newInstance(Class.forName("leetcode.medium.BinaryTreeRightSideView"));
        term227 = newInstance(Class.forName("util.TreeNode"));
        Object term229 = newInstance(Class.forName("util.TreeNode"));
        Object term231 = newInstance(Class.forName("util.TreeNode"));
        Object term233 = newInstance(Class.forName("util.TreeNode"));
        Object term235 = newInstance(Class.forName("util.TreeNode"));
        Object term237 = newInstance(Class.forName("util.TreeNode"));
        Object term239 = newInstance(Class.forName("util.TreeNode"));
        Object term241 = newInstance(Class.forName("util.TreeNode"));
        Object term243 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term227, term227.getClass(), "val", -1016503459);
        setIntField(term229, term229.getClass(), "val", -1968847291);
        setIntField(term231, term231.getClass(), "val", 579005622);
        setIntField(term233, term233.getClass(), "val", -14890619);
        setIntField(term235, term235.getClass(), "val", 1632125673);
        setField(term235, term235.getClass(), "left", null);
        setField(term235, term235.getClass(), "right", term229);
        setField(term233, term233.getClass(), "left", term235);
        setIntField(term237, term237.getClass(), "val", 292681826);
        setField(term237, term237.getClass(), "left", null);
        setField(term237, term237.getClass(), "right", null);
        setField(term233, term233.getClass(), "right", term237);
        setField(term231, term231.getClass(), "left", term233);
        setIntField(term239, term239.getClass(), "val", 2055867847);
        setIntField(term241, term241.getClass(), "val", -1048298087);
        setField(term241, term241.getClass(), "left", term237);
        setField(term241, term241.getClass(), "right", term227);
        setField(term239, term239.getClass(), "left", term241);
        setIntField(term243, term243.getClass(), "val", 454281060);
        setField(term243, term243.getClass(), "left", null);
        setField(term243, term243.getClass(), "right", term229);
        setField(term239, term239.getClass(), "right", term243);
        setField(term231, term231.getClass(), "right", term239);
        setField(term229, term229.getClass(), "left", term231);
        setField(term229, term229.getClass(), "right", term239);
        setField(term227, term227.getClass(), "left", term229);
        setField(term227, term227.getClass(), "right", term235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.BinaryTreeRightSideView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term227;
        callMethod(klass, "rightSideView", argTypes, term226, args);
    }

};


