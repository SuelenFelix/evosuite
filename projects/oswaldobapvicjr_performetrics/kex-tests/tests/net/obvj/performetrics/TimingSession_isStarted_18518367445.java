package net.obvj.performetrics;

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
import static net.obvj.performetrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class TimingSession_isStarted_18518367445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195745;

    public TimingSession_isStarted_18518367445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term195776 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term195775 = ((Class) term195776).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term195775).setAccessible(true);
        Object enum693 =  ((Field) term195775).get((Object) null);
        ArrayList term195746 = new ArrayList();
        ((ArrayList) term195746).add(enum693);
        HashMap term195754 = new HashMap();
        Class<? extends Object> term195991 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term195990 = ((Class) term195991).getDeclaredField((String) "READY");
        ((Field) term195990).setAccessible(true);
        Object enum694 = ((Field) term195990).get((Object) null);
        term195745 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term195745, term195745.getClass(), "types", term195746);
        setField(term195745, term195745.getClass(), "counters", term195754);
        setField(term195745, term195745.getClass(), "state", enum694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStarted", argTypes, term195745, args);
    }

};


