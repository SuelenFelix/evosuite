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

public class CountCompleteTreeNodes_leftDepth_15004641783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1290;
     Object term1291;

    public CountCompleteTreeNodes_leftDepth_15004641783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1290 = newInstance(Class.forName("leetcode.easy.CountCompleteTreeNodes"));
        term1291 = newInstance(Class.forName("util.TreeNode"));
        Object term1293 = newInstance(Class.forName("util.TreeNode"));
        Object term1295 = newInstance(Class.forName("util.TreeNode"));
        Object term1297 = newInstance(Class.forName("util.TreeNode"));
        Object term1299 = newInstance(Class.forName("util.TreeNode"));
        Object term1301 = newInstance(Class.forName("util.TreeNode"));
        Object term1303 = newInstance(Class.forName("util.TreeNode"));
        Object term1305 = newInstance(Class.forName("util.TreeNode"));
        Object term1307 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term1291, term1291.getClass(), "val", 574481092);
        setIntField(term1293, term1293.getClass(), "val", -310528004);
        setIntField(term1295, term1295.getClass(), "val", -634976996);
        setIntField(term1297, term1297.getClass(), "val", -1015274146);
        setIntField(term1299, term1299.getClass(), "val", -49052672);
        setField(term1299, term1299.getClass(), "left", null);
        setField(term1299, term1299.getClass(), "right", term1293);
        setField(term1297, term1297.getClass(), "left", term1299);
        setIntField(term1301, term1301.getClass(), "val", -2003192918);
        setField(term1301, term1301.getClass(), "left", null);
        setField(term1301, term1301.getClass(), "right", null);
        setField(term1297, term1297.getClass(), "right", term1301);
        setField(term1295, term1295.getClass(), "left", term1297);
        setIntField(term1303, term1303.getClass(), "val", 803925431);
        setIntField(term1305, term1305.getClass(), "val", 76929641);
        setField(term1305, term1305.getClass(), "left", term1301);
        setField(term1305, term1305.getClass(), "right", term1291);
        setField(term1303, term1303.getClass(), "left", term1305);
        setIntField(term1307, term1307.getClass(), "val", 339372704);
        setField(term1307, term1307.getClass(), "left", null);
        setField(term1307, term1307.getClass(), "right", term1293);
        setField(term1303, term1303.getClass(), "right", term1307);
        setField(term1295, term1295.getClass(), "right", term1303);
        setField(term1293, term1293.getClass(), "left", term1295);
        setField(term1293, term1293.getClass(), "right", term1303);
        setField(term1291, term1291.getClass(), "left", term1293);
        setField(term1291, term1291.getClass(), "right", term1299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.CountCompleteTreeNodes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term1291;
        callMethod(klass, "leftDepth", argTypes, term1290, args);
    }

};


