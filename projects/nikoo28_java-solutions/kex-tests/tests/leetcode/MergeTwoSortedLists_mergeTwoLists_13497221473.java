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

public class MergeTwoSortedLists_mergeTwoLists_13497221473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13257;

    public MergeTwoSortedLists_mergeTwoLists_13497221473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13257 = newInstance(Class.forName("leetcode.MergeTwoSortedLists"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MergeTwoSortedLists");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = Class.forName("util.ListNode");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "mergeTwoLists", argTypes, term13257, args);
    }

};


