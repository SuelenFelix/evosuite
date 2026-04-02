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

public class PalindromeLinkedList_reverseList_155926702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1171;
     Object term1172;

    public PalindromeLinkedList_reverseList_155926702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1171 = newInstance(Class.forName("leetcode.easy.PalindromeLinkedList"));
        term1172 = newInstance(Class.forName("util.ListNode"));
        Object term1174 = newInstance(Class.forName("util.ListNode"));
        Object term1176 = newInstance(Class.forName("util.ListNode"));
        Object term1178 = newInstance(Class.forName("util.ListNode"));
        Object term1180 = newInstance(Class.forName("util.ListNode"));
        setIntField(term1172, term1172.getClass(), "val", -209654048);
        setIntField(term1174, term1174.getClass(), "val", 477625804);
        setIntField(term1176, term1176.getClass(), "val", 252575029);
        setIntField(term1178, term1178.getClass(), "val", 57189932);
        setIntField(term1180, term1180.getClass(), "val", 1460722225);
        setField(term1180, term1180.getClass(), "next", null);
        setField(term1178, term1178.getClass(), "next", term1180);
        setField(term1176, term1176.getClass(), "next", term1178);
        setField(term1174, term1174.getClass(), "next", term1176);
        setField(term1172, term1172.getClass(), "next", term1174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.PalindromeLinkedList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term1172;
        callMethod(klass, "reverseList", argTypes, term1171, args);
    }

};


