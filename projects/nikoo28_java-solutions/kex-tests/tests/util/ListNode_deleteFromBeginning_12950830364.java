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

public class ListNode_deleteFromBeginning_12950830364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268;
     Object term278;

    public ListNode_deleteFromBeginning_12950830364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268 = newInstance(Class.forName("util.ListNode"));
        Object term270 = newInstance(Class.forName("util.ListNode"));
        Object term272 = newInstance(Class.forName("util.ListNode"));
        Object term274 = newInstance(Class.forName("util.ListNode"));
        Object term276 = newInstance(Class.forName("util.ListNode"));
        setIntField(term268, term268.getClass(), "val", -663691365);
        setIntField(term270, term270.getClass(), "val", 339854490);
        setIntField(term272, term272.getClass(), "val", -615654495);
        setIntField(term274, term274.getClass(), "val", -1476117762);
        setIntField(term276, term276.getClass(), "val", -341962980);
        setField(term276, term276.getClass(), "next", null);
        setField(term274, term274.getClass(), "next", term276);
        setField(term272, term272.getClass(), "next", term274);
        setField(term270, term270.getClass(), "next", term272);
        setField(term268, term268.getClass(), "next", term270);
        term278 = newInstance(Class.forName("util.ListNode"));
        Object term280 = newInstance(Class.forName("util.ListNode"));
        Object term282 = newInstance(Class.forName("util.ListNode"));
        Object term284 = newInstance(Class.forName("util.ListNode"));
        Object term286 = newInstance(Class.forName("util.ListNode"));
        setIntField(term278, term278.getClass(), "val", -893623680);
        setIntField(term280, term280.getClass(), "val", -1963434938);
        setIntField(term282, term282.getClass(), "val", 906181092);
        setIntField(term284, term284.getClass(), "val", 1045657203);
        setIntField(term286, term286.getClass(), "val", 1386130016);
        setField(term286, term286.getClass(), "next", null);
        setField(term284, term284.getClass(), "next", term286);
        setField(term282, term282.getClass(), "next", term284);
        setField(term280, term280.getClass(), "next", term282);
        setField(term278, term278.getClass(), "next", term280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.ListNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.ListNode");
        Object[] args = new Object[1];
        args[0] = term278;
        callMethod(klass, "deleteFromBeginning", argTypes, term268, args);
    }

};


