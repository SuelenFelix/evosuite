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
import java.lang.Integer;

public class TrimABinarySearchTree_trimBST_19271561063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3517;
     Object term3518;
     Object term3520;

    public TrimABinarySearchTree_trimBST_19271561063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3517 = newInstance(Class.forName("leetcode.TrimABinarySearchTree"));
        term3518 = new Integer(0);
        term3520 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.TrimABinarySearchTree");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3518;
        args[2] = term3520;
        callMethod(klass, "trimBST", argTypes, term3517, args);
    }

};


