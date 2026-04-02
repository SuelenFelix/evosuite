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

public class PalindromeLinkedList_isPalindrome_1974085001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1160;
     Object term1161;

    public PalindromeLinkedList_isPalindrome_1974085001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1160 = newInstance(Class.forName("leetcode.easy.PalindromeLinkedList"));
        term1161 = newInstance(Class.forName("util.ListNode"));
        Object term1163 = newInstance(Class.forName("util.ListNode"));
        Object term1165 = newInstance(Class.forName("util.ListNode"));
        Object term1167 = newInstance(Class.forName("util.ListNode"));
        Object term1169 = newInstance(Class.forName("util.ListNode"));
        setIntField(term1161, term1161.getClass(), "val", -1122880881);
        setIntField(term1163, term1163.getClass(), "val", -542712742);
        setIntField(term1165, term1165.getClass(), "val", -1254072822);
        setIntField(term1167, term1167.getClass(), "val", -1111249833);
        setIntField(term1169, term1169.getClass(), "val", -1692331299);
        setField(term1169, term1169.getClass(), "next", null);
        setField(term1167, term1167.getClass(), "next", term1169);
        setField(term1165, term1165.getClass(), "next", term1167);
        setField(term1163, term1163.getClass(), "next", term1165);
        setField(term1161, term1161.getClass(), "next", term1163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.PalindromeLinkedList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term1161;
        callMethod(klass, "isPalindrome", argTypes, term1160, args);
    }

};


