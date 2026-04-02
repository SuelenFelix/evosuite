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

public class SymmetricTree_isSymmetric_1983767691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1223;
     Object term1224;

    public SymmetricTree_isSymmetric_1983767691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1223 = newInstance(Class.forName("leetcode.easy.SymmetricTree"));
        term1224 = newInstance(Class.forName("util.TreeNode"));
        Object term1226 = newInstance(Class.forName("util.TreeNode"));
        Object term1228 = newInstance(Class.forName("util.TreeNode"));
        Object term1230 = newInstance(Class.forName("util.TreeNode"));
        Object term1232 = newInstance(Class.forName("util.TreeNode"));
        Object term1234 = newInstance(Class.forName("util.TreeNode"));
        Object term1236 = newInstance(Class.forName("util.TreeNode"));
        Object term1238 = newInstance(Class.forName("util.TreeNode"));
        Object term1240 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term1224, term1224.getClass(), "val", 1593461795);
        setIntField(term1226, term1226.getClass(), "val", 515182546);
        setIntField(term1228, term1228.getClass(), "val", -936895502);
        setIntField(term1230, term1230.getClass(), "val", -129547140);
        setIntField(term1232, term1232.getClass(), "val", 199287428);
        setField(term1232, term1232.getClass(), "left", null);
        setField(term1232, term1232.getClass(), "right", term1226);
        setField(term1230, term1230.getClass(), "left", term1232);
        setIntField(term1234, term1234.getClass(), "val", 2009020256);
        setField(term1234, term1234.getClass(), "left", null);
        setField(term1234, term1234.getClass(), "right", null);
        setField(term1230, term1230.getClass(), "right", term1234);
        setField(term1228, term1228.getClass(), "left", term1230);
        setIntField(term1236, term1236.getClass(), "val", 306847454);
        setIntField(term1238, term1238.getClass(), "val", 1745276158);
        setField(term1238, term1238.getClass(), "left", term1234);
        setField(term1238, term1238.getClass(), "right", term1224);
        setField(term1236, term1236.getClass(), "left", term1238);
        setIntField(term1240, term1240.getClass(), "val", -1195339592);
        setField(term1240, term1240.getClass(), "left", null);
        setField(term1240, term1240.getClass(), "right", term1226);
        setField(term1236, term1236.getClass(), "right", term1240);
        setField(term1228, term1228.getClass(), "right", term1236);
        setField(term1226, term1226.getClass(), "left", term1228);
        setField(term1226, term1226.getClass(), "right", term1236);
        setField(term1224, term1224.getClass(), "left", term1226);
        setField(term1224, term1224.getClass(), "right", term1232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.SymmetricTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term1224;
        callMethod(klass, "isSymmetric", argTypes, term1223, args);
    }

};


