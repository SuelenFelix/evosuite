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

public class LRUCache_put_3726902553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1999;
     Object term2035;
     Object term2037;

    public LRUCache_put_3726902553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2021 = new HashMap();
        term1999 = newInstance(Class.forName("leetcode.medium.LRUCache"));
        Object term2000 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2003 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2006 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2009 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2012 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2015 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term2018 = newInstance(Class.forName("leetcode.DoubleListNode"));
        setIntField(term2000, term2000.getClass(), "key", 1126618861);
        setIntField(term2000, term2000.getClass(), "val", 947449400);
        setIntField(term2003, term2003.getClass(), "key", -763799087);
        setIntField(term2003, term2003.getClass(), "val", 1207142014);
        setIntField(term2006, term2006.getClass(), "key", -876426634);
        setIntField(term2006, term2006.getClass(), "val", 213831054);
        setIntField(term2009, term2009.getClass(), "key", 330043745);
        setIntField(term2009, term2009.getClass(), "val", -509349195);
        setField(term2009, term2009.getClass(), "next", null);
        setField(term2009, term2009.getClass(), "prev", term2003);
        setField(term2006, term2006.getClass(), "next", term2009);
        setField(term2006, term2006.getClass(), "prev", term2003);
        setField(term2003, term2003.getClass(), "next", term2006);
        setIntField(term2012, term2012.getClass(), "key", 0);
        setIntField(term2012, term2012.getClass(), "val", 0);
        setField(term2012, term2012.getClass(), "next", null);
        setField(term2012, term2012.getClass(), "prev", null);
        setField(term2003, term2003.getClass(), "prev", term2012);
        setField(term2000, term2000.getClass(), "next", term2003);
        setIntField(term2015, term2015.getClass(), "key", 633598642);
        setIntField(term2015, term2015.getClass(), "val", 1862841859);
        setIntField(term2018, term2018.getClass(), "key", -1114668574);
        setIntField(term2018, term2018.getClass(), "val", 514511037);
        setField(term2018, term2018.getClass(), "next", term2012);
        setField(term2018, term2018.getClass(), "prev", term2015);
        setField(term2015, term2015.getClass(), "next", term2018);
        setField(term2015, term2015.getClass(), "prev", term2018);
        setField(term2000, term2000.getClass(), "prev", term2015);
        setField(term1999, term1999.getClass(), "head", term2000);
        setField(term1999, term1999.getClass(), "tail", term2015);
        setField(term1999, term1999.getClass(), "keyNodeAddressMap", term2021);
        setIntField(term1999, term1999.getClass(), "maxCapacity", 1713573821);
        term2035 = new Integer(1956590498);
        term2037 = new Integer(1467356494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LRUCache");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2035;
        args[1] = term2037;
        callMethod(klass, "put", argTypes, term1999, args);
    }

};


