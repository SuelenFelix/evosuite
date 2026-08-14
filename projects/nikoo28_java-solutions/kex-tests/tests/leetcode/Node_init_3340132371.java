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
import java.lang.Object;

public class Node_init_3340132371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7086;
     Object term7088;
     Object term7106;

    public Node_init_3340132371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7086 = new Integer(1086709736);
        term7088 = newInstance(Class.forName("leetcode.Node"));
        Object term7090 = newInstance(Class.forName("leetcode.Node"));
        Object term7092 = newInstance(Class.forName("leetcode.Node"));
        Object term7094 = newInstance(Class.forName("leetcode.Node"));
        Object term7096 = newInstance(Class.forName("leetcode.Node"));
        Object term7098 = newInstance(Class.forName("leetcode.Node"));
        Object term7100 = newInstance(Class.forName("leetcode.Node"));
        Object term7102 = newInstance(Class.forName("leetcode.Node"));
        Object term7104 = newInstance(Class.forName("leetcode.Node"));
        setIntField(term7088, term7088.getClass(), "val", -1606698075);
        setIntField(term7090, term7090.getClass(), "val", 90996421);
        setIntField(term7092, term7092.getClass(), "val", -1805802783);
        setIntField(term7094, term7094.getClass(), "val", -529831900);
        setIntField(term7096, term7096.getClass(), "val", 1574493440);
        setField(term7096, term7096.getClass(), "next", null);
        setField(term7096, term7096.getClass(), "random", term7090);
        setField(term7094, term7094.getClass(), "next", term7096);
        setIntField(term7098, term7098.getClass(), "val", 212698793);
        setField(term7098, term7098.getClass(), "next", null);
        setField(term7098, term7098.getClass(), "random", null);
        setField(term7094, term7094.getClass(), "random", term7098);
        setField(term7092, term7092.getClass(), "next", term7094);
        setIntField(term7100, term7100.getClass(), "val", 694100722);
        setIntField(term7102, term7102.getClass(), "val", -680529431);
        setField(term7102, term7102.getClass(), "next", term7098);
        setField(term7102, term7102.getClass(), "random", term7088);
        setField(term7100, term7100.getClass(), "next", term7102);
        setIntField(term7104, term7104.getClass(), "val", 1854694585);
        setField(term7104, term7104.getClass(), "next", null);
        setField(term7104, term7104.getClass(), "random", term7090);
        setField(term7100, term7100.getClass(), "random", term7104);
        setField(term7092, term7092.getClass(), "random", term7100);
        setField(term7090, term7090.getClass(), "next", term7092);
        setField(term7090, term7090.getClass(), "random", term7100);
        setField(term7088, term7088.getClass(), "next", term7090);
        setField(term7088, term7088.getClass(), "random", term7096);
        term7106 = newInstance(Class.forName("leetcode.Node"));
        Object term7108 = newInstance(Class.forName("leetcode.Node"));
        Object term7110 = newInstance(Class.forName("leetcode.Node"));
        Object term7112 = newInstance(Class.forName("leetcode.Node"));
        Object term7114 = newInstance(Class.forName("leetcode.Node"));
        Object term7116 = newInstance(Class.forName("leetcode.Node"));
        Object term7118 = newInstance(Class.forName("leetcode.Node"));
        Object term7120 = newInstance(Class.forName("leetcode.Node"));
        Object term7122 = newInstance(Class.forName("leetcode.Node"));
        setIntField(term7106, term7106.getClass(), "val", 1169519385);
        setIntField(term7108, term7108.getClass(), "val", 1846078344);
        setIntField(term7110, term7110.getClass(), "val", 1692543802);
        setIntField(term7112, term7112.getClass(), "val", 376341151);
        setIntField(term7114, term7114.getClass(), "val", -1607267243);
        setField(term7114, term7114.getClass(), "next", null);
        setField(term7114, term7114.getClass(), "random", term7108);
        setField(term7112, term7112.getClass(), "next", term7114);
        setIntField(term7116, term7116.getClass(), "val", -91068927);
        setField(term7116, term7116.getClass(), "next", null);
        setField(term7116, term7116.getClass(), "random", null);
        setField(term7112, term7112.getClass(), "random", term7116);
        setField(term7110, term7110.getClass(), "next", term7112);
        setIntField(term7118, term7118.getClass(), "val", 258334639);
        setIntField(term7120, term7120.getClass(), "val", 1432187207);
        setField(term7120, term7120.getClass(), "next", term7116);
        setField(term7120, term7120.getClass(), "random", term7106);
        setField(term7118, term7118.getClass(), "next", term7120);
        setIntField(term7122, term7122.getClass(), "val", 1641377218);
        setField(term7122, term7122.getClass(), "next", null);
        setField(term7122, term7122.getClass(), "random", term7108);
        setField(term7118, term7118.getClass(), "random", term7122);
        setField(term7110, term7110.getClass(), "random", term7118);
        setField(term7108, term7108.getClass(), "next", term7110);
        setField(term7108, term7108.getClass(), "random", term7118);
        setField(term7106, term7106.getClass(), "next", term7108);
        setField(term7106, term7106.getClass(), "random", term7114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("leetcode.Node");
        argTypes[2] = Class.forName("leetcode.Node");
        Object[] args = new Object[3];
        args[0] = term7086;
        args[1] = term7088;
        args[2] = term7106;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


