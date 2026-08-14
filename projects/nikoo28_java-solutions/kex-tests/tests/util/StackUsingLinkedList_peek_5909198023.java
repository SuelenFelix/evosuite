package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StackUsingLinkedList_peek_5909198023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2284;

    public StackUsingLinkedList_peek_5909198023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2284 = newInstance(Class.forName("util.StackUsingLinkedList"));
        Object term2285 = newInstance(Class.forName("util.ListNode"));
        Object term2287 = newInstance(Class.forName("util.ListNode"));
        Object term2289 = newInstance(Class.forName("util.ListNode"));
        Object term2291 = newInstance(Class.forName("util.ListNode"));
        setIntField(term2285, term2285.getClass(), "val", -1982489643);
        setIntField(term2287, term2287.getClass(), "val", 550892835);
        setIntField(term2289, term2289.getClass(), "val", 1237549886);
        setIntField(term2291, term2291.getClass(), "val", -1945635750);
        setField(term2291, term2291.getClass(), "next", null);
        setField(term2289, term2289.getClass(), "next", term2291);
        setField(term2287, term2287.getClass(), "next", term2289);
        setField(term2285, term2285.getClass(), "next", term2287);
        setField(term2284, term2284.getClass(), "head", term2285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.StackUsingLinkedList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term2284, args);
    }

};


