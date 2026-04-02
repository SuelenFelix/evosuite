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

public class AddTwoNumbers_addTwoNumbers_13574186441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2261;
     Object term2262;
     Object term2272;

    public AddTwoNumbers_addTwoNumbers_13574186441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2261 = newInstance(Class.forName("leetcode.medium.AddTwoNumbers"));
        term2262 = newInstance(Class.forName("util.ListNode"));
        Object term2264 = newInstance(Class.forName("util.ListNode"));
        Object term2266 = newInstance(Class.forName("util.ListNode"));
        Object term2268 = newInstance(Class.forName("util.ListNode"));
        Object term2270 = newInstance(Class.forName("util.ListNode"));
        setIntField(term2262, term2262.getClass(), "val", 178847646);
        setIntField(term2264, term2264.getClass(), "val", 273590437);
        setIntField(term2266, term2266.getClass(), "val", -348612876);
        setIntField(term2268, term2268.getClass(), "val", 1302807565);
        setIntField(term2270, term2270.getClass(), "val", -838848221);
        setField(term2270, term2270.getClass(), "next", null);
        setField(term2268, term2268.getClass(), "next", term2270);
        setField(term2266, term2266.getClass(), "next", term2268);
        setField(term2264, term2264.getClass(), "next", term2266);
        setField(term2262, term2262.getClass(), "next", term2264);
        term2272 = newInstance(Class.forName("util.ListNode"));
        Object term2274 = newInstance(Class.forName("util.ListNode"));
        Object term2276 = newInstance(Class.forName("util.ListNode"));
        Object term2278 = newInstance(Class.forName("util.ListNode"));
        Object term2280 = newInstance(Class.forName("util.ListNode"));
        setIntField(term2272, term2272.getClass(), "val", 1414025609);
        setIntField(term2274, term2274.getClass(), "val", 255145822);
        setIntField(term2276, term2276.getClass(), "val", -573608449);
        setIntField(term2278, term2278.getClass(), "val", -1660057757);
        setIntField(term2280, term2280.getClass(), "val", 1816273440);
        setField(term2280, term2280.getClass(), "next", null);
        setField(term2278, term2278.getClass(), "next", term2280);
        setField(term2276, term2276.getClass(), "next", term2278);
        setField(term2274, term2274.getClass(), "next", term2276);
        setField(term2272, term2272.getClass(), "next", term2274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.AddTwoNumbers");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = Class.forName("util.ListNode");
        Object[] args = new Object[2];
        args[0] = term2262;
        args[1] = term2272;
        callMethod(klass, "addTwoNumbers", argTypes, term2261, args);
    }

};


