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

public class CopyListWithRandomPointer_copyRandomList_21458727581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1545;
     Object term1546;

    public CopyListWithRandomPointer_copyRandomList_21458727581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1545 = newInstance(Class.forName("leetcode.medium.CopyListWithRandomPointer"));
        term1546 = newInstance(Class.forName("util.Node"));
        Object term1548 = newInstance(Class.forName("util.Node"));
        Object term1550 = newInstance(Class.forName("util.Node"));
        Object term1552 = newInstance(Class.forName("util.Node"));
        Object term1554 = newInstance(Class.forName("util.Node"));
        Object term1556 = newInstance(Class.forName("util.Node"));
        Object term1558 = newInstance(Class.forName("util.Node"));
        Object term1560 = newInstance(Class.forName("util.Node"));
        Object term1562 = newInstance(Class.forName("util.Node"));
        setIntField(term1546, term1546.getClass(), "val", -100825168);
        setIntField(term1548, term1548.getClass(), "val", 768407648);
        setIntField(term1550, term1550.getClass(), "val", -350454594);
        setIntField(term1552, term1552.getClass(), "val", -1148142995);
        setIntField(term1554, term1554.getClass(), "val", -233024044);
        setField(term1554, term1554.getClass(), "next", null);
        setField(term1554, term1554.getClass(), "random", term1548);
        setField(term1552, term1552.getClass(), "next", term1554);
        setIntField(term1556, term1556.getClass(), "val", 908108726);
        setField(term1556, term1556.getClass(), "next", null);
        setField(term1556, term1556.getClass(), "random", null);
        setField(term1552, term1552.getClass(), "random", term1556);
        setField(term1550, term1550.getClass(), "next", term1552);
        setIntField(term1558, term1558.getClass(), "val", -828982065);
        setIntField(term1560, term1560.getClass(), "val", 1221443226);
        setField(term1560, term1560.getClass(), "next", term1556);
        setField(term1560, term1560.getClass(), "random", term1546);
        setField(term1558, term1558.getClass(), "next", term1560);
        setIntField(term1562, term1562.getClass(), "val", 1820784228);
        setField(term1562, term1562.getClass(), "next", null);
        setField(term1562, term1562.getClass(), "random", term1548);
        setField(term1558, term1558.getClass(), "random", term1562);
        setField(term1550, term1550.getClass(), "random", term1558);
        setField(term1548, term1548.getClass(), "next", term1550);
        setField(term1548, term1548.getClass(), "random", term1558);
        setField(term1546, term1546.getClass(), "next", term1548);
        setField(term1546, term1546.getClass(), "random", term1554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.CopyListWithRandomPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.Node");
        Object[] args = new Object[1];
        args[0] = term1546;
        callMethod(klass, "copyRandomList", argTypes, term1545, args);
    }

};


