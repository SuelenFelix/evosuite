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

public class MergeTwoBinaryTrees_mergeTrees_8365618841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202;
     Object term203;
     Object term221;

    public MergeTwoBinaryTrees_mergeTrees_8365618841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202 = newInstance(Class.forName("leetcode.easy.MergeTwoBinaryTrees"));
        term203 = newInstance(Class.forName("util.TreeNode"));
        Object term205 = newInstance(Class.forName("util.TreeNode"));
        Object term207 = newInstance(Class.forName("util.TreeNode"));
        Object term209 = newInstance(Class.forName("util.TreeNode"));
        Object term211 = newInstance(Class.forName("util.TreeNode"));
        Object term213 = newInstance(Class.forName("util.TreeNode"));
        Object term215 = newInstance(Class.forName("util.TreeNode"));
        Object term217 = newInstance(Class.forName("util.TreeNode"));
        Object term219 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term203, term203.getClass(), "val", -1087774327);
        setIntField(term205, term205.getClass(), "val", -1530420153);
        setIntField(term207, term207.getClass(), "val", -469968304);
        setIntField(term209, term209.getClass(), "val", -1145578966);
        setIntField(term211, term211.getClass(), "val", 679763016);
        setField(term211, term211.getClass(), "left", null);
        setField(term211, term211.getClass(), "right", term205);
        setField(term209, term209.getClass(), "left", term211);
        setIntField(term213, term213.getClass(), "val", 1876565163);
        setField(term213, term213.getClass(), "left", null);
        setField(term213, term213.getClass(), "right", null);
        setField(term209, term209.getClass(), "right", term213);
        setField(term207, term207.getClass(), "left", term209);
        setIntField(term215, term215.getClass(), "val", -602026508);
        setIntField(term217, term217.getClass(), "val", -157887805);
        setField(term217, term217.getClass(), "left", term213);
        setField(term217, term217.getClass(), "right", term203);
        setField(term215, term215.getClass(), "left", term217);
        setIntField(term219, term219.getClass(), "val", 1962444399);
        setField(term219, term219.getClass(), "left", null);
        setField(term219, term219.getClass(), "right", term205);
        setField(term215, term215.getClass(), "right", term219);
        setField(term207, term207.getClass(), "right", term215);
        setField(term205, term205.getClass(), "left", term207);
        setField(term205, term205.getClass(), "right", term215);
        setField(term203, term203.getClass(), "left", term205);
        setField(term203, term203.getClass(), "right", term211);
        term221 = newInstance(Class.forName("util.TreeNode"));
        Object term223 = newInstance(Class.forName("util.TreeNode"));
        Object term225 = newInstance(Class.forName("util.TreeNode"));
        Object term227 = newInstance(Class.forName("util.TreeNode"));
        Object term229 = newInstance(Class.forName("util.TreeNode"));
        Object term231 = newInstance(Class.forName("util.TreeNode"));
        Object term233 = newInstance(Class.forName("util.TreeNode"));
        Object term235 = newInstance(Class.forName("util.TreeNode"));
        Object term237 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term221, term221.getClass(), "val", -817164822);
        setIntField(term223, term223.getClass(), "val", -1016503459);
        setIntField(term225, term225.getClass(), "val", -1968847291);
        setIntField(term227, term227.getClass(), "val", 579005622);
        setIntField(term229, term229.getClass(), "val", -14890619);
        setField(term229, term229.getClass(), "left", null);
        setField(term229, term229.getClass(), "right", term223);
        setField(term227, term227.getClass(), "left", term229);
        setIntField(term231, term231.getClass(), "val", -1048298087);
        setField(term231, term231.getClass(), "left", null);
        setField(term231, term231.getClass(), "right", null);
        setField(term227, term227.getClass(), "right", term231);
        setField(term225, term225.getClass(), "left", term227);
        setIntField(term233, term233.getClass(), "val", -1786399638);
        setIntField(term235, term235.getClass(), "val", 2055867847);
        setField(term235, term235.getClass(), "left", term231);
        setField(term235, term235.getClass(), "right", term221);
        setField(term233, term233.getClass(), "left", term235);
        setIntField(term237, term237.getClass(), "val", 1632125673);
        setField(term237, term237.getClass(), "left", null);
        setField(term237, term237.getClass(), "right", term223);
        setField(term233, term233.getClass(), "right", term237);
        setField(term225, term225.getClass(), "right", term233);
        setField(term223, term223.getClass(), "left", term225);
        setField(term223, term223.getClass(), "right", term233);
        setField(term221, term221.getClass(), "left", term223);
        setField(term221, term221.getClass(), "right", term229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MergeTwoBinaryTrees");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = Class.forName("util.TreeNode");
        Object[] args = new Object[2];
        args[0] = term203;
        args[1] = term221;
        callMethod(klass, "mergeTrees", argTypes, term202, args);
    }

};


