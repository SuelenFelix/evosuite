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

public class LRUCache_addToHead_16593755014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2039;
     Object term2075;

    public LRUCache_addToHead_16593755014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2061 = new HashMap();
        term2039 = newInstance(Class.forName("leetcode.medium.LRUCache"));
        Object term2040 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2043 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2046 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2049 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2052 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2055 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2058 = newInstance(Class.forName("leetcode.DoubleListNode"));
        setIntField(term2040, term2040.getClass(), "key", -26316536);
        setIntField(term2040, term2040.getClass(), "val", 1716165145);
        setIntField(term2043, term2043.getClass(), "key", 1692937831);
        setIntField(term2043, term2043.getClass(), "val", -1539747985);
        setIntField(term2046, term2046.getClass(), "key", -1982489643);
        setIntField(term2046, term2046.getClass(), "val", 550892835);
        setIntField(term2049, term2049.getClass(), "key", 1237549886);
        setIntField(term2049, term2049.getClass(), "val", -1945635750);
        setField(term2049, term2049.getClass(), "next", null);
        setField(term2049, term2049.getClass(), "prev", term2043);
        setField(term2046, term2046.getClass(), "next", term2049);
        setField(term2046, term2046.getClass(), "prev", term2043);
        setField(term2043, term2043.getClass(), "next", term2046);
        setIntField(term2052, term2052.getClass(), "key", 0);
        setIntField(term2052, term2052.getClass(), "val", 0);
        setField(term2052, term2052.getClass(), "next", null);
        setField(term2052, term2052.getClass(), "prev", null);
        setField(term2043, term2043.getClass(), "prev", term2052);
        setField(term2040, term2040.getClass(), "next", term2043);
        setIntField(term2055, term2055.getClass(), "key", -1271375703);
        setIntField(term2055, term2055.getClass(), "val", 1136208236);
        setIntField(term2058, term2058.getClass(), "key", -1220630391);
        setIntField(term2058, term2058.getClass(), "val", -995822131);
        setField(term2058, term2058.getClass(), "next", term2052);
        setField(term2058, term2058.getClass(), "prev", term2055);
        setField(term2055, term2055.getClass(), "next", term2058);
        setField(term2055, term2055.getClass(), "prev", term2058);
        setField(term2040, term2040.getClass(), "prev", term2055);
        setField(term2039, term2039.getClass(), "head", term2040);
        setField(term2039, term2039.getClass(), "tail", term2055);
        setField(term2039, term2039.getClass(), "keyNodeAddressMap", term2061);
        setIntField(term2039, term2039.getClass(), "maxCapacity", -687282231);
        term2075 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2078 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2081 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2084 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2087 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2090 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2093 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2096 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2099 = newInstance(Class.forName("leetcode.DoubleListNode"));
        setIntField(term2075, term2075.getClass(), "key", 1200440315);
        setIntField(term2075, term2075.getClass(), "val", 40571662);
        setIntField(term2078, term2078.getClass(), "key", 1863910269);
        setIntField(term2078, term2078.getClass(), "val", 864645689);
        setIntField(term2081, term2081.getClass(), "key", 279384872);
        setIntField(term2081, term2081.getClass(), "val", 1427305953);
        setIntField(term2084, term2084.getClass(), "key", -781832877);
        setIntField(term2084, term2084.getClass(), "val", 797203987);
        setIntField(term2087, term2087.getClass(), "key", 1973060703);
        setIntField(term2087, term2087.getClass(), "val", -138239905);
        setField(term2087, term2087.getClass(), "next", null);
        setField(term2087, term2087.getClass(), "prev", term2078);
        setField(term2084, term2084.getClass(), "next", term2087);
        setIntField(term2090, term2090.getClass(), "key", -1079020032);
        setIntField(term2090, term2090.getClass(), "val", -1973791064);
        setField(term2090, term2090.getClass(), "next", null);
        setField(term2090, term2090.getClass(), "prev", null);
        setField(term2084, term2084.getClass(), "prev", term2090);
        setField(term2081, term2081.getClass(), "next", term2084);
        setIntField(term2093, term2093.getClass(), "key", -1999787419);
        setIntField(term2093, term2093.getClass(), "val", -1224443634);
        setIntField(term2096, term2096.getClass(), "key", 1048451946);
        setIntField(term2096, term2096.getClass(), "val", 5603560);
        setField(term2096, term2096.getClass(), "next", term2090);
        setField(term2096, term2096.getClass(), "prev", term2075);
        setField(term2093, term2093.getClass(), "next", term2096);
        setIntField(term2099, term2099.getClass(), "key", 1709474063);
        setIntField(term2099, term2099.getClass(), "val", 1406617209);
        setField(term2099, term2099.getClass(), "next", null);
        setField(term2099, term2099.getClass(), "prev", term2078);
        setField(term2093, term2093.getClass(), "prev", term2099);
        setField(term2081, term2081.getClass(), "prev", term2093);
        setField(term2078, term2078.getClass(), "next", term2081);
        setField(term2078, term2078.getClass(), "prev", term2093);
        setField(term2075, term2075.getClass(), "next", term2078);
        setField(term2075, term2075.getClass(), "prev", term2087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LRUCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("leetcode.DoubleListNode");
        Object[] args = new Object[1];
        args[0] = term2075;
        callMethod(klass, "addToHead", argTypes, term2039, args);
    }

};


