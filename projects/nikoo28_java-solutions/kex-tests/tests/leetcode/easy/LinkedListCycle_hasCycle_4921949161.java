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

public class LinkedListCycle_hasCycle_4921949161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1974;
     Object term1975;

    public LinkedListCycle_hasCycle_4921949161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1974 = newInstance(Class.forName("leetcode.easy.LinkedListCycle"));
        term1975 = newInstance(Class.forName("util.ListNode"));
        Object term1977 = newInstance(Class.forName("util.ListNode"));
        Object term1979 = newInstance(Class.forName("util.ListNode"));
        Object term1981 = newInstance(Class.forName("util.ListNode"));
        Object term1983 = newInstance(Class.forName("util.ListNode"));
        setIntField(term1975, term1975.getClass(), "val", 808203320);
        setIntField(term1977, term1977.getClass(), "val", -544382127);
        setIntField(term1979, term1979.getClass(), "val", -1830198043);
        setIntField(term1981, term1981.getClass(), "val", -439048495);
        setIntField(term1983, term1983.getClass(), "val", -1849105286);
        setField(term1983, term1983.getClass(), "next", null);
        setField(term1981, term1981.getClass(), "next", term1983);
        setField(term1979, term1979.getClass(), "next", term1981);
        setField(term1977, term1977.getClass(), "next", term1979);
        setField(term1975, term1975.getClass(), "next", term1977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.LinkedListCycle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term1975;
        callMethod(klass, "hasCycle", argTypes, term1974, args);
    }

};


