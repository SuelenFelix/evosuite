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
import java.lang.Integer;

public class ListNode_deleteFromMiddle_18576196266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308;
     Object term318;
     Object term328;

    public ListNode_deleteFromMiddle_18576196266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308 = newInstance(Class.forName("util.ListNode"));
        Object term310 = newInstance(Class.forName("util.ListNode"));
        Object term312 = newInstance(Class.forName("util.ListNode"));
        Object term314 = newInstance(Class.forName("util.ListNode"));
        Object term316 = newInstance(Class.forName("util.ListNode"));
        setIntField(term308, term308.getClass(), "val", 1555897383);
        setIntField(term310, term310.getClass(), "val", 202001407);
        setIntField(term312, term312.getClass(), "val", 158873461);
        setIntField(term314, term314.getClass(), "val", -430151637);
        setIntField(term316, term316.getClass(), "val", -1697741339);
        setField(term316, term316.getClass(), "next", null);
        setField(term314, term314.getClass(), "next", term316);
        setField(term312, term312.getClass(), "next", term314);
        setField(term310, term310.getClass(), "next", term312);
        setField(term308, term308.getClass(), "next", term310);
        term318 = newInstance(Class.forName("util.ListNode"));
        Object term320 = newInstance(Class.forName("util.ListNode"));
        Object term322 = newInstance(Class.forName("util.ListNode"));
        Object term324 = newInstance(Class.forName("util.ListNode"));
        Object term326 = newInstance(Class.forName("util.ListNode"));
        setIntField(term318, term318.getClass(), "val", 1830648570);
        setIntField(term320, term320.getClass(), "val", -227365013);
        setIntField(term322, term322.getClass(), "val", 11724947);
        setIntField(term324, term324.getClass(), "val", 1953277050);
        setIntField(term326, term326.getClass(), "val", 1283079251);
        setField(term326, term326.getClass(), "next", null);
        setField(term324, term324.getClass(), "next", term326);
        setField(term322, term322.getClass(), "next", term324);
        setField(term320, term320.getClass(), "next", term322);
        setField(term318, term318.getClass(), "next", term320);
        term328 = new Integer(1384592638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.ListNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term318;
        args[1] = term328;
        callMethod(klass, "deleteFromMiddle", argTypes, term308, args);
    }

};


