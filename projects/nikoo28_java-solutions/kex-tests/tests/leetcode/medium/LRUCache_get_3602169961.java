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
import java.lang.Integer;

public class LRUCache_get_3602169961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1898;
     Object term1934;

    public LRUCache_get_3602169961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1920 = new HashMap();
        term1898 = newInstance(Class.forName("leetcode.medium.LRUCache"));
        Object term1899 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1902 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1905 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1908 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1911 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1914 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1917 = newInstance(Class.forName("leetcode.DoubleListNode"));
        setIntField(term1899, term1899.getClass(), "key", -1867239125);
        setIntField(term1899, term1899.getClass(), "val", 952869601);
        setIntField(term1902, term1902.getClass(), "key", 91958879);
        setIntField(term1902, term1902.getClass(), "val", -645429025);
        setIntField(term1905, term1905.getClass(), "key", -688213483);
        setIntField(term1905, term1905.getClass(), "val", 644154104);
        setIntField(term1908, term1908.getClass(), "key", 76650923);
        setIntField(term1908, term1908.getClass(), "val", 1003743923);
        setField(term1908, term1908.getClass(), "next", null);
        setField(term1908, term1908.getClass(), "prev", term1902);
        setField(term1905, term1905.getClass(), "next", term1908);
        setField(term1905, term1905.getClass(), "prev", term1902);
        setField(term1902, term1902.getClass(), "next", term1905);
        setIntField(term1911, term1911.getClass(), "key", 0);
        setIntField(term1911, term1911.getClass(), "val", 0);
        setField(term1911, term1911.getClass(), "next", null);
        setField(term1911, term1911.getClass(), "prev", null);
        setField(term1902, term1902.getClass(), "prev", term1911);
        setField(term1899, term1899.getClass(), "next", term1902);
        setIntField(term1914, term1914.getClass(), "key", 4900410);
        setIntField(term1914, term1914.getClass(), "val", -1252345779);
        setIntField(term1917, term1917.getClass(), "key", -2063365430);
        setIntField(term1917, term1917.getClass(), "val", 812570053);
        setField(term1917, term1917.getClass(), "next", term1911);
        setField(term1917, term1917.getClass(), "prev", term1914);
        setField(term1914, term1914.getClass(), "next", term1917);
        setField(term1914, term1914.getClass(), "prev", term1917);
        setField(term1899, term1899.getClass(), "prev", term1914);
        setField(term1898, term1898.getClass(), "head", term1899);
        setField(term1898, term1898.getClass(), "tail", term1914);
        setField(term1898, term1898.getClass(), "keyNodeAddressMap", term1920);
        setIntField(term1898, term1898.getClass(), "maxCapacity", -1488938905);
        term1934 = new Integer(1916544127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LRUCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1934;
        callMethod(klass, "get", argTypes, term1898, args);
    }

};


