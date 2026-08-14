package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class LRUCache_removeNode_4195050535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2102;
     Object term2138;

    public LRUCache_removeNode_4195050535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2124 = new HashMap();
        term2102 = newInstance(Class.forName("leetcode.medium.LRUCache"));
        Object term2103 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2106 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2109 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2112 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2115 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2118 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2121 = newInstance(Class.forName("leetcode.DoubleListNode"));
        setIntField(term2103, term2103.getClass(), "key", -2072158633);
        setIntField(term2103, term2103.getClass(), "val", -355469363);
        setIntField(term2106, term2106.getClass(), "key", 1465188553);
        setIntField(term2106, term2106.getClass(), "val", 1633913667);
        setIntField(term2109, term2109.getClass(), "key", 1292332296);
        setIntField(term2109, term2109.getClass(), "val", -1415256843);
        setIntField(term2112, term2112.getClass(), "key", 612177768);
        setIntField(term2112, term2112.getClass(), "val", -1626451656);
        setField(term2112, term2112.getClass(), "next", null);
        setField(term2112, term2112.getClass(), "prev", term2106);
        setField(term2109, term2109.getClass(), "next", term2112);
        setField(term2109, term2109.getClass(), "prev", term2106);
        setField(term2106, term2106.getClass(), "next", term2109);
        setIntField(term2115, term2115.getClass(), "key", 0);
        setIntField(term2115, term2115.getClass(), "val", 0);
        setField(term2115, term2115.getClass(), "next", null);
        setField(term2115, term2115.getClass(), "prev", null);
        setField(term2106, term2106.getClass(), "prev", term2115);
        setField(term2103, term2103.getClass(), "next", term2106);
        setIntField(term2118, term2118.getClass(), "key", -2110556060);
        setIntField(term2118, term2118.getClass(), "val", 313459791);
        setIntField(term2121, term2121.getClass(), "key", 752615112);
        setIntField(term2121, term2121.getClass(), "val", -1674430871);
        setField(term2121, term2121.getClass(), "next", term2115);
        setField(term2121, term2121.getClass(), "prev", term2118);
        setField(term2118, term2118.getClass(), "next", term2121);
        setField(term2118, term2118.getClass(), "prev", term2121);
        setField(term2103, term2103.getClass(), "prev", term2118);
        setField(term2102, term2102.getClass(), "head", term2103);
        setField(term2102, term2102.getClass(), "tail", term2118);
        setField(term2102, term2102.getClass(), "keyNodeAddressMap", term2124);
        setIntField(term2102, term2102.getClass(), "maxCapacity", 794352120);
        term2138 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2141 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2144 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2147 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2150 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2153 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2156 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2159 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2162 = newInstance(Class.forName("leetcode.DoubleListNode"));
        setIntField(term2138, term2138.getClass(), "key", 340719678);
        setIntField(term2138, term2138.getClass(), "val", 299791142);
        setIntField(term2141, term2141.getClass(), "key", 1862191391);
        setIntField(term2141, term2141.getClass(), "val", 1131398807);
        setIntField(term2144, term2144.getClass(), "key", -344907703);
        setIntField(term2144, term2144.getClass(), "val", 824341437);
        setIntField(term2147, term2147.getClass(), "key", -1794965320);
        setIntField(term2147, term2147.getClass(), "val", 520504102);
        setIntField(term2150, term2150.getClass(), "key", -457396133);
        setIntField(term2150, term2150.getClass(), "val", -1793950607);
        setField(term2150, term2150.getClass(), "next", null);
        setField(term2150, term2150.getClass(), "prev", term2141);
        setField(term2147, term2147.getClass(), "next", term2150);
        setIntField(term2153, term2153.getClass(), "key", -706253892);
        setIntField(term2153, term2153.getClass(), "val", -1341439819);
        setField(term2153, term2153.getClass(), "next", null);
        setField(term2153, term2153.getClass(), "prev", null);
        setField(term2147, term2147.getClass(), "prev", term2153);
        setField(term2144, term2144.getClass(), "next", term2147);
        setIntField(term2156, term2156.getClass(), "key", 470895808);
        setIntField(term2156, term2156.getClass(), "val", 1787325291);
        setIntField(term2159, term2159.getClass(), "key", 1470349147);
        setIntField(term2159, term2159.getClass(), "val", -255317272);
        setField(term2159, term2159.getClass(), "next", term2153);
        setField(term2159, term2159.getClass(), "prev", term2138);
        setField(term2156, term2156.getClass(), "next", term2159);
        setIntField(term2162, term2162.getClass(), "key", 1091954101);
        setIntField(term2162, term2162.getClass(), "val", 1895143076);
        setField(term2162, term2162.getClass(), "next", null);
        setField(term2162, term2162.getClass(), "prev", term2141);
        setField(term2156, term2156.getClass(), "prev", term2162);
        setField(term2144, term2144.getClass(), "prev", term2156);
        setField(term2141, term2141.getClass(), "next", term2144);
        setField(term2141, term2141.getClass(), "prev", term2156);
        setField(term2138, term2138.getClass(), "next", term2141);
        setField(term2138, term2138.getClass(), "prev", term2150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LRUCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("leetcode.DoubleListNode");
        Object[] args = new Object[1];
        args[0] = term2138;
        callMethod(klass, "removeNode", argTypes, term2102, args);
    }

};


