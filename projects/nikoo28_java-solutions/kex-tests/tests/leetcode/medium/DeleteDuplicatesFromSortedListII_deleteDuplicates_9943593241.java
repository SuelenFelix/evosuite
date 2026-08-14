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

public class DeleteDuplicatesFromSortedListII_deleteDuplicates_9943593241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540;
     Object term541;

    public DeleteDuplicatesFromSortedListII_deleteDuplicates_9943593241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term540 = newInstance(Class.forName("leetcode.medium.DeleteDuplicatesFromSortedListII"));
        term541 = newInstance(Class.forName("util.ListNode"));
        Object term543 = newInstance(Class.forName("util.ListNode"));
        Object term545 = newInstance(Class.forName("util.ListNode"));
        Object term547 = newInstance(Class.forName("util.ListNode"));
        Object term549 = newInstance(Class.forName("util.ListNode"));
        setIntField(term541, term541.getClass(), "val", -341152642);
        setIntField(term543, term543.getClass(), "val", -2015854073);
        setIntField(term545, term545.getClass(), "val", 538259104);
        setIntField(term547, term547.getClass(), "val", 96566506);
        setIntField(term549, term549.getClass(), "val", -343325701);
        setField(term549, term549.getClass(), "next", null);
        setField(term547, term547.getClass(), "next", term549);
        setField(term545, term545.getClass(), "next", term547);
        setField(term543, term543.getClass(), "next", term545);
        setField(term541, term541.getClass(), "next", term543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.DeleteDuplicatesFromSortedListII");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term541;
        callMethod(klass, "deleteDuplicates", argTypes, term540, args);
    }

};


