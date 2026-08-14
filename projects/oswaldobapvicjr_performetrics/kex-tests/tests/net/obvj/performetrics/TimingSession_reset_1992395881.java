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

public class TimingSession_reset_1992395881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192503;

    public TimingSession_reset_1992395881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term192546 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term192545 = ((Class) term192546).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term192545).setAccessible(true);
        Object enum679 =  ((Field) term192545).get((Object) null);
        Class<? extends Object> term192761 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term192760 = ((Class) term192761).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term192760).setAccessible(true);
        Object enum680 =  ((Field) term192760).get((Object) null);
        Class<? extends Object> term192988 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term192987 = ((Class) term192988).getDeclaredField((String) "CPU_TIME");
        ((Field) term192987).setAccessible(true);
        Object enum681 =  ((Field) term192987).get((Object) null);
        Class<? extends Object> term193194 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term193193 = ((Class) term193194).getDeclaredField((String) "USER_TIME");
        ((Field) term193193).setAccessible(true);
        Object enum682 =  ((Field) term193193).get((Object) null);
        ArrayList term192504 = new ArrayList();
        ((ArrayList) term192504).add(enum679);
        ((ArrayList) term192504).add(enum680);
        ((ArrayList) term192504).add(enum681);
        ((ArrayList) term192504).add(enum682);
        ((ArrayList) term192504).add(enum679);
        ((ArrayList) term192504).add(enum680);
        ((ArrayList) term192504).add(enum682);
        ((ArrayList) term192504).add(enum681);
        HashMap term192524 = new HashMap();
        Class<? extends Object> term193403 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term193402 = ((Class) term193403).getDeclaredField((String) "READY");
        ((Field) term193402).setAccessible(true);
        Object enum683 = ((Field) term193402).get((Object) null);
        term192503 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term192503, term192503.getClass(), "types", term192504);
        setField(term192503, term192503.getClass(), "counters", term192524);
        setField(term192503, term192503.getClass(), "state", enum683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term192503, args);
    }

};


