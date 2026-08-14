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

public class UnmodifiableTimingSession_start_18556839163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179747;

    public UnmodifiableTimingSession_start_18556839163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term179804 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term179803 = ((Class) term179804).getDeclaredField((String) "USER_TIME");
        ((Field) term179803).setAccessible(true);
        Object enum624 =  ((Field) term179803).get((Object) null);
        Class<? extends Object> term180013 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term180012 = ((Class) term180013).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term180012).setAccessible(true);
        Object enum625 =  ((Field) term180012).get((Object) null);
        Class<? extends Object> term180240 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term180239 = ((Class) term180240).getDeclaredField((String) "CPU_TIME");
        ((Field) term180239).setAccessible(true);
        Object enum626 =  ((Field) term180239).get((Object) null);
        ArrayList term179749 = new ArrayList();
        ((ArrayList) term179749).add(enum624);
        ((ArrayList) term179749).add(enum624);
        ((ArrayList) term179749).add(enum625);
        ((ArrayList) term179749).add(enum626);
        ((ArrayList) term179749).add(enum624);
        ((ArrayList) term179749).add(enum624);
        HashMap term179759 = new HashMap();
        Class<? extends Object> term180446 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term180445 = ((Class) term180446).getDeclaredField((String) "READY");
        ((Field) term180445).setAccessible(true);
        Object enum627 = ((Field) term180445).get((Object) null);
        ArrayList term179776 = new ArrayList();
        ((ArrayList) term179776).add(enum625);
        ((ArrayList) term179776).add(enum624);
        HashMap term179780 = new HashMap();
        Class<? extends Object> term180678 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term180677 = ((Class) term180678).getDeclaredField((String) "STARTED");
        ((Field) term180677).setAccessible(true);
        Object enum628 = ((Field) term180677).get((Object) null);
        term179747 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableTimingSession"));
        Object term179748 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term179748, term179748.getClass(), "types", term179749);
        setField(term179748, term179748.getClass(), "counters", term179759);
        setField(term179748, term179748.getClass(), "state", enum627);
        setField(term179747, term179747.getClass(), "timingSession", term179748);
        setField(term179747, term179747.getClass(), "types", term179776);
        setField(term179747, term179747.getClass(), "counters", term179780);
        setField(term179747, term179747.getClass(), "state", enum628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableTimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "start", argTypes, term179747, args);
    }

};


