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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class TimingSession_State_3_stop_16778995192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum332;
     Object term98457;

    public TimingSession_State_3_stop_16778995192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term98499 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term98498 = ((Class) term98499).getDeclaredField((String) "FINISHED");
        ((Field) term98498).setAccessible(true);
        enum332 = ((Field) term98498).get((Object) null);
        Class<? extends Object> term98740 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term98739 = ((Class) term98740).getDeclaredField((String) "USER_TIME");
        ((Field) term98739).setAccessible(true);
        Object enum333 =  ((Field) term98739).get((Object) null);
        Class<? extends Object> term98949 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term98948 = ((Class) term98949).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term98948).setAccessible(true);
        Object enum334 =  ((Field) term98948).get((Object) null);
        Class<? extends Object> term99164 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term99163 = ((Class) term99164).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term99163).setAccessible(true);
        Object enum335 =  ((Field) term99163).get((Object) null);
        ArrayList term98458 = new ArrayList();
        ((ArrayList) term98458).add(enum333);
        ((ArrayList) term98458).add(enum333);
        ((ArrayList) term98458).add(enum333);
        ((ArrayList) term98458).add(enum333);
        ((ArrayList) term98458).add(enum334);
        ((ArrayList) term98458).add(enum335);
        HashMap term98474 = new HashMap();
        Class<? extends Object> term99391 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term99390 = ((Class) term99391).getDeclaredField((String) "FINISHED");
        ((Field) term99390).setAccessible(true);
        Object enum336 = ((Field) term99390).get((Object) null);
        term98457 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term98457, term98457.getClass(), "types", term98458);
        setField(term98457, term98457.getClass(), "counters", term98474);
        setField(term98457, term98457.getClass(), "state", enum336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession$State$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSession");
        Object[] args = new Object[1];
        args[0] = term98457;
        callMethod(klass, "stop", argTypes, enum332, args);
    }

};


