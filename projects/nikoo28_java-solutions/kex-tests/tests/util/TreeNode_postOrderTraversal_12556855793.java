package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TreeNode_postOrderTraversal_12556855793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;

    public TreeNode_postOrderTraversal_12556855793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("util.TreeNode"));
        Object term41 = newInstance(Class.forName("util.TreeNode"));
        Object term43 = newInstance(Class.forName("util.TreeNode"));
        Object term45 = newInstance(Class.forName("util.TreeNode"));
        Object term47 = newInstance(Class.forName("util.TreeNode"));
        Object term49 = newInstance(Class.forName("util.TreeNode"));
        Object term51 = newInstance(Class.forName("util.TreeNode"));
        Object term53 = newInstance(Class.forName("util.TreeNode"));
        Object term55 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term39, term39.getClass(), "val", -6029667);
        setIntField(term41, term41.getClass(), "val", -2068769794);
        setIntField(term43, term43.getClass(), "val", -117576464);
        setIntField(term45, term45.getClass(), "val", -1007160944);
        setIntField(term47, term47.getClass(), "val", 1135664017);
        setField(term47, term47.getClass(), "left", null);
        setField(term47, term47.getClass(), "right", term41);
        setField(term45, term45.getClass(), "left", term47);
        setIntField(term49, term49.getClass(), "val", -203030934);
        setField(term49, term49.getClass(), "left", null);
        setField(term49, term49.getClass(), "right", null);
        setField(term45, term45.getClass(), "right", term49);
        setField(term43, term43.getClass(), "left", term45);
        setIntField(term51, term51.getClass(), "val", -1275173084);
        setIntField(term53, term53.getClass(), "val", -244121226);
        setField(term53, term53.getClass(), "left", term49);
        setField(term53, term53.getClass(), "right", term39);
        setField(term51, term51.getClass(), "left", term53);
        setIntField(term55, term55.getClass(), "val", 590364439);
        setField(term55, term55.getClass(), "left", null);
        setField(term55, term55.getClass(), "right", term41);
        setField(term51, term51.getClass(), "right", term55);
        setField(term43, term43.getClass(), "right", term51);
        setField(term41, term41.getClass(), "left", term43);
        setField(term41, term41.getClass(), "right", term51);
        setField(term39, term39.getClass(), "left", term41);
        setField(term39, term39.getClass(), "right", term47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.TreeNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term39;
        callMethod(klass, "postOrderTraversal", argTypes, null, args);
    }

};


