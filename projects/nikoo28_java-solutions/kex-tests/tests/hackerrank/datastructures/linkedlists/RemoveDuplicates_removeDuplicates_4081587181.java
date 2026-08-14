package hackerrank.datastructures.linkedlists;

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
import static hackerrank.datastructures.linkedlists.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RemoveDuplicates_removeDuplicates_4081587181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;
     Object term98;

    public RemoveDuplicates_removeDuplicates_4081587181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("hackerrank.datastructures.linkedlists.RemoveDuplicates"));
        term98 = newInstance(Class.forName("util.ListNode"));
        Object term100 = newInstance(Class.forName("util.ListNode"));
        Object term102 = newInstance(Class.forName("util.ListNode"));
        Object term104 = newInstance(Class.forName("util.ListNode"));
        Object term106 = newInstance(Class.forName("util.ListNode"));
        setIntField(term98, term98.getClass(), "val", 972867650);
        setIntField(term100, term100.getClass(), "val", 1655935355);
        setIntField(term102, term102.getClass(), "val", -481533957);
        setIntField(term104, term104.getClass(), "val", 1240914516);
        setIntField(term106, term106.getClass(), "val", -1465035361);
        setField(term106, term106.getClass(), "next", null);
        setField(term104, term104.getClass(), "next", term106);
        setField(term102, term102.getClass(), "next", term104);
        setField(term100, term100.getClass(), "next", term102);
        setField(term98, term98.getClass(), "next", term100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.linkedlists.RemoveDuplicates");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term98;
        callMethod(klass, "removeDuplicates", argTypes, term97, args);
    }

};


