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
     Object term379;
     Object term380;

    public SerializeAndDeserializeBinaryTree_serialize_9590902121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379 = newInstance(Class.forName("leetcode.hard.SerializeAndDeserializeBinaryTree"));
        term380 = newInstance(Class.forName("util.TreeNode"));
        Object term382 = newInstance(Class.forName("util.TreeNode"));
        Object term384 = newInstance(Class.forName("util.TreeNode"));
        Object term386 = newInstance(Class.forName("util.TreeNode"));
        Object term388 = newInstance(Class.forName("util.TreeNode"));
        Object term390 = newInstance(Class.forName("util.TreeNode"));
        Object term392 = newInstance(Class.forName("util.TreeNode"));
        Object term394 = newInstance(Class.forName("util.TreeNode"));
        Object term396 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term380, term380.getClass(), "val", -481533957);
        setIntField(term382, term382.getClass(), "val", 1240914516);
        setIntField(term384, term384.getClass(), "val", -1465035361);
        setIntField(term386, term386.getClass(), "val", 1090617576);
        setIntField(term388, term388.getClass(), "val", -1547384488);
        setField(term388, term388.getClass(), "left", null);
        setField(term388, term388.getClass(), "right", term382);
        setField(term386, term386.getClass(), "left", term388);
        setIntField(term390, term390.getClass(), "val", -1845499264);
        setField(term390, term390.getClass(), "left", null);
        setField(term390, term390.getClass(), "right", null);
        setField(term386, term386.getClass(), "right", term390);
        setField(term384, term384.getClass(), "left", term386);
        setIntField(term392, term392.getClass(), "val", -556405712);
        setIntField(term394, term394.getClass(), "val", -1772434990);
        setField(term394, term394.getClass(), "left", term390);
        setField(term394, term394.getClass(), "right", term380);
        setField(term392, term392.getClass(), "left", term394);
        setIntField(term396, term396.getClass(), "val", 1442160736);
        setField(term396, term396.getClass(), "left", null);
        setField(term396, term396.getClass(), "right", term382);
        setField(term392, term392.getClass(), "right", term396);
        setField(term384, term384.getClass(), "right", term392);
        setField(term382, term382.getClass(), "left", term384);
        setField(term382, term382.getClass(), "right", term392);
        setField(term380, term380.getClass(), "left", term382);
        setField(term380, term380.getClass(), "right", term388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.SerializeAndDeserializeBinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term380;
        callMethod(klass, "serialize", argTypes, term379, args);
    }

};


