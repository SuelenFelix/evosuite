package net.obvj.performetrics.monitors;

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
import static net.obvj.performetrics.monitors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class MonitoredRunnable_run_11091095523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3044;

    public MonitoredRunnable_run_11091095523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3121 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term3120 = ((Class) term3121).getDeclaredField((String) "CPU_TIME");
        ((Field) term3120).setAccessible(true);
        Object enum12 =  ((Field) term3120).get((Object) null);
        Class<? extends Object> term3327 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term3326 = ((Class) term3327).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term3326).setAccessible(true);
        Object enum13 =  ((Field) term3326).get((Object) null);
        Class<? extends Object> term3542 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term3541 = ((Class) term3542).getDeclaredField((String) "USER_TIME");
        ((Field) term3541).setAccessible(true);
        Object enum14 =  ((Field) term3541).get((Object) null);
        Class<? extends Object> term3751 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term3750 = ((Class) term3751).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term3750).setAccessible(true);
        Object enum15 =  ((Field) term3750).get((Object) null);
        ArrayList term3045 = new ArrayList();
        ((ArrayList) term3045).add(enum12);
        ((ArrayList) term3045).add(enum13);
        ((ArrayList) term3045).add(enum13);
        ((ArrayList) term3045).add(enum14);
        ((ArrayList) term3045).add(enum15);
        ArrayList term3068 = new ArrayList();
        ((ArrayList) term3068).add((Object)null);
        ((ArrayList) term3068).add((Object)null);
        HashMap term3071 = new HashMap();
        Class<? extends Object> term3978 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term3977 = ((Class) term3978).getDeclaredField((String) "READY");
        ((Field) term3977).setAccessible(true);
        Object enum16 = ((Field) term3977).get((Object) null);
        Object term3067 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term3067, term3067.getClass(), "types", term3068);
        setField(term3067, term3067.getClass(), "counters", term3071);
        setField(term3067, term3067.getClass(), "state", enum16);
        ArrayList term3079 = new ArrayList();
        ((ArrayList) term3079).add((Object)null);
        ((ArrayList) term3079).add((Object)null);
        ((ArrayList) term3079).add((Object)null);
        HashMap term3082 = new HashMap();
        Class<? extends Object> term4210 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term4209 = ((Class) term4210).getDeclaredField((String) "STARTED");
        ((Field) term4209).setAccessible(true);
        Object enum17 = ((Field) term4209).get((Object) null);
        Object term3078 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term3078, term3078.getClass(), "types", term3079);
        setField(term3078, term3078.getClass(), "counters", term3082);
        setField(term3078, term3078.getClass(), "state", enum17);
        ArrayList term3090 = new ArrayList();
        ((ArrayList) term3090).add((Object)null);
        HashMap term3093 = new HashMap();
        Class<? extends Object> term4448 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term4447 = ((Class) term4448).getDeclaredField((String) "FINISHED");
        ((Field) term4447).setAccessible(true);
        Object enum18 = ((Field) term4447).get((Object) null);
        Object term3089 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term3089, term3089.getClass(), "types", term3090);
        setField(term3089, term3089.getClass(), "counters", term3093);
        setField(term3089, term3089.getClass(), "state", enum18);
        ArrayList term3101 = new ArrayList();
        HashMap term3104 = new HashMap();
        Object term3100 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term3100, term3100.getClass(), "types", term3101);
        setField(term3100, term3100.getClass(), "counters", term3104);
        setField(term3100, term3100.getClass(), "state", enum16);
        ArrayList term3110 = new ArrayList();
        ((ArrayList) term3110).add((Object)null);
        ((ArrayList) term3110).add((Object)null);
        HashMap term3113 = new HashMap();
        Object term3109 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term3109, term3109.getClass(), "types", term3110);
        setField(term3109, term3109.getClass(), "counters", term3113);
        setField(term3109, term3109.getClass(), "state", enum16);
        ArrayList term3065 = new ArrayList();
        ((ArrayList) term3065).add(term3067);
        ((ArrayList) term3065).add(term3078);
        ((ArrayList) term3065).add(term3089);
        ((ArrayList) term3065).add(term3100);
        ((ArrayList) term3065).add(term3109);
        term3044 = newInstance(Class.forName("net.obvj.performetrics.monitors.MonitoredRunnable"));
        setField(term3044, term3044.getClass(), "runnable", null);
        setField(term3044, term3044.getClass(), "types", term3045);
        setField(term3044, term3044.getClass(), "sessions", term3065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.monitors.MonitoredRunnable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term3044, args);
    }

};


