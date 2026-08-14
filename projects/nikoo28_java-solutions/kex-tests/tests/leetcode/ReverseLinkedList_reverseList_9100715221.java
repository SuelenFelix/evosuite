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
import java.lang.Object;

public class ReverseLinkedList_reverseList_9100715221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10958;
     Object term10959;

    public ReverseLinkedList_reverseList_9100715221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10958 = newInstance(Class.forName("leetcode.ReverseLinkedList"));
        term10959 = newInstance(Class.forName("util.ListNode"));
        Object term10961 = newInstance(Class.forName("util.ListNode"));
        Object term10963 = newInstance(Class.forName("util.ListNode"));
        Object term10965 = newInstance(Class.forName("util.ListNode"));
        Object term10967 = newInstance(Class.forName("util.ListNode"));
        setIntField(term10959, term10959.getClass(), "val", 99032275);
        setIntField(term10961, term10961.getClass(), "val", 794098686);
        setIntField(term10963, term10963.getClass(), "val", -1671524013);
        setIntField(term10965, term10965.getClass(), "val", -438794741);
        setIntField(term10967, term10967.getClass(), "val", -1400834481);
        setField(term10967, term10967.getClass(), "next", null);
        setField(term10965, term10965.getClass(), "next", term10967);
        setField(term10963, term10963.getClass(), "next", term10965);
        setField(term10961, term10961.getClass(), "next", term10963);
        setField(term10959, term10959.getClass(), "next", term10961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ReverseLinkedList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term10959;
        callMethod(klass, "reverseList", argTypes, term10958, args);
    }

};


