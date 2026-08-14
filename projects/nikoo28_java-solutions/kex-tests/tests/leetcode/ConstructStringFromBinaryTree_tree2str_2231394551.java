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

public class ConstructStringFromBinaryTree_tree2str_2231394551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13985;
     Object term13986;

    public ConstructStringFromBinaryTree_tree2str_2231394551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13985 = newInstance(Class.forName("leetcode.ConstructStringFromBinaryTree"));
        term13986 = newInstance(Class.forName("util.TreeNode"));
        Object term13988 = newInstance(Class.forName("util.TreeNode"));
        Object term13990 = newInstance(Class.forName("util.TreeNode"));
        Object term13992 = newInstance(Class.forName("util.TreeNode"));
        Object term13994 = newInstance(Class.forName("util.TreeNode"));
        Object term13996 = newInstance(Class.forName("util.TreeNode"));
        Object term13998 = newInstance(Class.forName("util.TreeNode"));
        Object term14000 = newInstance(Class.forName("util.TreeNode"));
        Object term14002 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term13986, term13986.getClass(), "val", 65007514);
        setIntField(term13988, term13988.getClass(), "val", 1731844126);
        setIntField(term13990, term13990.getClass(), "val", -861962061);
        setIntField(term13992, term13992.getClass(), "val", -1867124507);
        setIntField(term13994, term13994.getClass(), "val", 416116291);
        setField(term13994, term13994.getClass(), "left", null);
        setField(term13994, term13994.getClass(), "right", term13988);
        setField(term13992, term13992.getClass(), "left", term13994);
        setIntField(term13996, term13996.getClass(), "val", -807914927);
        setField(term13996, term13996.getClass(), "left", null);
        setField(term13996, term13996.getClass(), "right", null);
        setField(term13992, term13992.getClass(), "right", term13996);
        setField(term13990, term13990.getClass(), "left", term13992);
        setIntField(term13998, term13998.getClass(), "val", -2068333492);
        setIntField(term14000, term14000.getClass(), "val", 1892862475);
        setField(term14000, term14000.getClass(), "left", term13996);
        setField(term14000, term14000.getClass(), "right", term13986);
        setField(term13998, term13998.getClass(), "left", term14000);
        setIntField(term14002, term14002.getClass(), "val", 1104795023);
        setField(term14002, term14002.getClass(), "left", null);
        setField(term14002, term14002.getClass(), "right", term13988);
        setField(term13998, term13998.getClass(), "right", term14002);
        setField(term13990, term13990.getClass(), "right", term13998);
        setField(term13988, term13988.getClass(), "left", term13990);
        setField(term13988, term13988.getClass(), "right", term13998);
        setField(term13986, term13986.getClass(), "left", term13988);
        setField(term13986, term13986.getClass(), "right", term13994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ConstructStringFromBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term13986;
        callMethod(klass, "tree2str", argTypes, term13985, args);
    }

};


