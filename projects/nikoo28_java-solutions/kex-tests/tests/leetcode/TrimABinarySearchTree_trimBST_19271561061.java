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
import java.lang.Integer;

public class TrimABinarySearchTree_trimBST_19271561061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3494;
     Object term3495;
     Object term3513;
     Object term3515;

    public TrimABinarySearchTree_trimBST_19271561061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3494 = newInstance(Class.forName("leetcode.TrimABinarySearchTree"));
        term3495 = newInstance(Class.forName("util.TreeNode"));
        Object term3497 = newInstance(Class.forName("util.TreeNode"));
        Object term3499 = newInstance(Class.forName("util.TreeNode"));
        Object term3501 = newInstance(Class.forName("util.TreeNode"));
        Object term3503 = newInstance(Class.forName("util.TreeNode"));
        Object term3505 = newInstance(Class.forName("util.TreeNode"));
        Object term3507 = newInstance(Class.forName("util.TreeNode"));
        Object term3509 = newInstance(Class.forName("util.TreeNode"));
        Object term3511 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term3495, term3495.getClass(), "val", 864645689);
        setIntField(term3497, term3497.getClass(), "val", 279384872);
        setIntField(term3499, term3499.getClass(), "val", 1427305953);
        setIntField(term3501, term3501.getClass(), "val", -781832877);
        setIntField(term3503, term3503.getClass(), "val", 797203987);
        setField(term3503, term3503.getClass(), "left", null);
        setField(term3503, term3503.getClass(), "right", term3497);
        setField(term3501, term3501.getClass(), "left", term3503);
        setIntField(term3505, term3505.getClass(), "val", 1706047059);
        setField(term3505, term3505.getClass(), "left", null);
        setField(term3505, term3505.getClass(), "right", null);
        setField(term3501, term3501.getClass(), "right", term3505);
        setField(term3499, term3499.getClass(), "left", term3501);
        setIntField(term3507, term3507.getClass(), "val", 1709474063);
        setIntField(term3509, term3509.getClass(), "val", 1406617209);
        setField(term3509, term3509.getClass(), "left", term3505);
        setField(term3509, term3509.getClass(), "right", term3495);
        setField(term3507, term3507.getClass(), "left", term3509);
        setIntField(term3511, term3511.getClass(), "val", 1973060703);
        setField(term3511, term3511.getClass(), "left", null);
        setField(term3511, term3511.getClass(), "right", term3497);
        setField(term3507, term3507.getClass(), "right", term3511);
        setField(term3499, term3499.getClass(), "right", term3507);
        setField(term3497, term3497.getClass(), "left", term3499);
        setField(term3497, term3497.getClass(), "right", term3507);
        setField(term3495, term3495.getClass(), "left", term3497);
        setField(term3495, term3495.getClass(), "right", term3503);
        term3513 = new Integer(590451710);
        term3515 = new Integer(-1999787419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.TrimABinarySearchTree");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3495;
        args[1] = term3513;
        args[2] = term3515;
        callMethod(klass, "trimBST", argTypes, term3494, args);
    }

};


