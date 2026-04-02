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

public class ListNode_insertInMiddle_21297650953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;
     Object term254;
     Object term264;
     Object term266;

    public ListNode_insertInMiddle_21297650953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244 = newInstance(Class.forName("util.ListNode"));
        Object term246 = newInstance(Class.forName("util.ListNode"));
        Object term248 = newInstance(Class.forName("util.ListNode"));
        Object term250 = newInstance(Class.forName("util.ListNode"));
        Object term252 = newInstance(Class.forName("util.ListNode"));
        setIntField(term244, term244.getClass(), "val", -1465035361);
        setIntField(term246, term246.getClass(), "val", 1090617576);
        setIntField(term248, term248.getClass(), "val", -1547384488);
        setIntField(term250, term250.getClass(), "val", 1442160736);
        setIntField(term252, term252.getClass(), "val", 1114000454);
        setField(term252, term252.getClass(), "next", null);
        setField(term250, term250.getClass(), "next", term252);
        setField(term248, term248.getClass(), "next", term250);
        setField(term246, term246.getClass(), "next", term248);
        setField(term244, term244.getClass(), "next", term246);
        term254 = newInstance(Class.forName("util.ListNode"));
        Object term256 = newInstance(Class.forName("util.ListNode"));
        Object term258 = newInstance(Class.forName("util.ListNode"));
        Object term260 = newInstance(Class.forName("util.ListNode"));
        Object term262 = newInstance(Class.forName("util.ListNode"));
        setIntField(term254, term254.getClass(), "val", 941650513);
        setIntField(term256, term256.getClass(), "val", 444029505);
        setIntField(term258, term258.getClass(), "val", -1034506028);
        setIntField(term260, term260.getClass(), "val", -1263114719);
        setIntField(term262, term262.getClass(), "val", -894662986);
        setField(term262, term262.getClass(), "next", null);
        setField(term260, term260.getClass(), "next", term262);
        setField(term258, term258.getClass(), "next", term260);
        setField(term256, term256.getClass(), "next", term258);
        setField(term254, term254.getClass(), "next", term256);
        term264 = new Integer(-268815336);
        term266 = new Integer(-1210583429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.ListNode");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term254;
        args[1] = term264;
        args[2] = term266;
        callMethod(klass, "insertInMiddle", argTypes, term244, args);
    }

};


