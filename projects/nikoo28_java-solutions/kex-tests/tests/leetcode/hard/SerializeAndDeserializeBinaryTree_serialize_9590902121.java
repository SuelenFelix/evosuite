package leetcode.hard;

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
import static leetcode.hard.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SerializeAndDeserializeBinaryTree_serialize_9590902121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345;
     Object term346;

    public SerializeAndDeserializeBinaryTree_serialize_9590902121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345 = newInstance(Class.forName("leetcode.hard.SerializeAndDeserializeBinaryTree"));
        term346 = newInstance(Class.forName("util.TreeNode"));
        Object term348 = newInstance(Class.forName("util.TreeNode"));
        Object term350 = newInstance(Class.forName("util.TreeNode"));
        Object term352 = newInstance(Class.forName("util.TreeNode"));
        Object term354 = newInstance(Class.forName("util.TreeNode"));
        Object term356 = newInstance(Class.forName("util.TreeNode"));
        Object term358 = newInstance(Class.forName("util.TreeNode"));
        Object term360 = newInstance(Class.forName("util.TreeNode"));
        Object term362 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term346, term346.getClass(), "val", 1655935355);
        setIntField(term348, term348.getClass(), "val", -481533957);
        setIntField(term350, term350.getClass(), "val", 1240914516);
        setIntField(term352, term352.getClass(), "val", -1465035361);
        setIntField(term354, term354.getClass(), "val", 1090617576);
        setField(term354, term354.getClass(), "left", null);
        setField(term354, term354.getClass(), "right", term348);
        setField(term352, term352.getClass(), "left", term354);
        setIntField(term356, term356.getClass(), "val", -1772434990);
        setField(term356, term356.getClass(), "left", null);
        setField(term356, term356.getClass(), "right", null);
        setField(term352, term352.getClass(), "right", term356);
        setField(term350, term350.getClass(), "left", term352);
        setIntField(term358, term358.getClass(), "val", 1114000454);
        setIntField(term360, term360.getClass(), "val", -556405712);
        setField(term360, term360.getClass(), "left", term356);
        setField(term360, term360.getClass(), "right", term346);
        setField(term358, term358.getClass(), "left", term360);
        setIntField(term362, term362.getClass(), "val", -1547384488);
        setField(term362, term362.getClass(), "left", null);
        setField(term362, term362.getClass(), "right", term348);
        setField(term358, term358.getClass(), "right", term362);
        setField(term350, term350.getClass(), "right", term358);
        setField(term348, term348.getClass(), "left", term350);
        setField(term348, term348.getClass(), "right", term358);
        setField(term346, term346.getClass(), "left", term348);
        setField(term346, term346.getClass(), "right", term354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.SerializeAndDeserializeBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term346;
        callMethod(klass, "serialize", argTypes, term345, args);
    }

};


