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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;

public class UnmodifiableTimingSession_isStarted_9124978035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182302;

    public UnmodifiableTimingSession_isStarted_9124978035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term182364 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term182363 = ((Class) term182364).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term182363).setAccessible(true);
        Object enum635 =  ((Field) term182363).get((Object) null);
        Class<? extends Object> term182591 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term182590 = ((Class) term182591).getDeclaredField((String) "CPU_TIME");
        ((Field) term182590).setAccessible(true);
        Object enum636 =  ((Field) term182590).get((Object) null);
        Class<? extends Object> term182797 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term182796 = ((Class) term182797).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term182796).setAccessible(true);
        Object enum637 =  ((Field) term182796).get((Object) null);
        ArrayList term182304 = new ArrayList();
        ((ArrayList) term182304).add(enum635);
        ((ArrayList) term182304).add(enum636);
        ((ArrayList) term182304).add(enum637);
        HashMap term182314 = new HashMap();
        Class<? extends Object> term183012 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term183011 = ((Class) term183012).getDeclaredField((String) "READY");
        ((Field) term183011).setAccessible(true);
        Object enum638 = ((Field) term183011).get((Object) null);
        Class<? extends Object> term183244 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term183243 = ((Class) term183244).getDeclaredField((String) "USER_TIME");
        ((Field) term183243).setAccessible(true);
        Object enum639 =  ((Field) term183243).get((Object) null);
        ArrayList term182331 = new ArrayList();
        ((ArrayList) term182331).add(enum636);
        ((ArrayList) term182331).add(enum635);
        ((ArrayList) term182331).add(enum639);
        ((ArrayList) term182331).add(enum639);
        ((ArrayList) term182331).add(enum635);
        ((ArrayList) term182331).add(enum635);
        ((ArrayList) term182331).add(enum639);
        HashMap term182339 = new HashMap();
        Class<? extends Object> term183453 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term183452 = ((Class) term183453).getDeclaredField((String) "FINISHED");
        ((Field) term183452).setAccessible(true);
        Object enum640 = ((Field) term183452).get((Object) null);
        term182302 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableTimingSession"));
        Object term182303 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term182303, term182303.getClass(), "types", term182304);
        setField(term182303, term182303.getClass(), "counters", term182314);
        setField(term182303, term182303.getClass(), "state", enum638);
        setField(term182302, term182302.getClass(), "timingSession", term182303);
        setField(term182302, term182302.getClass(), "types", term182331);
        setField(term182302, term182302.getClass(), "counters", term182339);
        setField(term182302, term182302.getClass(), "state", enum640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableTimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStarted", argTypes, term182302, args);
    }

};


