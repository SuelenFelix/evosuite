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

public class CountCompleteTreeNodes_countNodes_4347572721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1252;
     Object term1253;

    public CountCompleteTreeNodes_countNodes_4347572721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1252 = newInstance(Class.forName("leetcode.easy.CountCompleteTreeNodes"));
        term1253 = newInstance(Class.forName("util.TreeNode"));
        Object term1255 = newInstance(Class.forName("util.TreeNode"));
        Object term1257 = newInstance(Class.forName("util.TreeNode"));
        Object term1259 = newInstance(Class.forName("util.TreeNode"));
        Object term1261 = newInstance(Class.forName("util.TreeNode"));
        Object term1263 = newInstance(Class.forName("util.TreeNode"));
        Object term1265 = newInstance(Class.forName("util.TreeNode"));
        Object term1267 = newInstance(Class.forName("util.TreeNode"));
        Object term1269 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term1253, term1253.getClass(), "val", 474518942);
        setIntField(term1255, term1255.getClass(), "val", -1656687479);
        setIntField(term1257, term1257.getClass(), "val", -249614216);
        setIntField(term1259, term1259.getClass(), "val", 1870727665);
        setIntField(term1261, term1261.getClass(), "val", -519881101);
        setField(term1261, term1261.getClass(), "left", null);
        setField(term1261, term1261.getClass(), "right", term1255);
        setField(term1259, term1259.getClass(), "left", term1261);
        setIntField(term1263, term1263.getClass(), "val", -1533843432);
        setField(term1263, term1263.getClass(), "left", null);
        setField(term1263, term1263.getClass(), "right", null);
        setField(term1259, term1259.getClass(), "right", term1263);
        setField(term1257, term1257.getClass(), "left", term1259);
        setIntField(term1265, term1265.getClass(), "val", -919416536);
        setIntField(term1267, term1267.getClass(), "val", -43417861);
        setField(term1267, term1267.getClass(), "left", term1263);
        setField(term1267, term1267.getClass(), "right", term1253);
        setField(term1265, term1265.getClass(), "left", term1267);
        setIntField(term1269, term1269.getClass(), "val", -680920524);
        setField(term1269, term1269.getClass(), "left", null);
        setField(term1269, term1269.getClass(), "right", term1255);
        setField(term1265, term1265.getClass(), "right", term1269);
        setField(term1257, term1257.getClass(), "right", term1265);
        setField(term1255, term1255.getClass(), "left", term1257);
        setField(term1255, term1255.getClass(), "right", term1265);
        setField(term1253, term1253.getClass(), "left", term1255);
        setField(term1253, term1253.getClass(), "right", term1261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.CountCompleteTreeNodes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term1253;
        callMethod(klass, "countNodes", argTypes, term1252, args);
    }

};


