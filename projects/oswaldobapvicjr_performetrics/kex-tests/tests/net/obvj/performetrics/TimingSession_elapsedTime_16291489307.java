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

public class TimingSession_elapsedTime_16291489307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197136;
     Object enum702;
     Object enum703;

    public TimingSession_elapsedTime_16291489307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term197221 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term197220 = ((Class) term197221).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term197220).setAccessible(true);
        Object enum699 =  ((Field) term197220).get((Object) null);
        Class<? extends Object> term197436 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term197435 = ((Class) term197436).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term197435).setAccessible(true);
        Object enum700 =  ((Field) term197435).get((Object) null);
        ArrayList term197137 = new ArrayList();
        ((ArrayList) term197137).add(enum699);
        ((ArrayList) term197137).add(enum700);
        HashMap term197149 = new HashMap();
        Class<? extends Object> term197663 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term197662 = ((Class) term197663).getDeclaredField((String) "READY");
        ((Field) term197662).setAccessible(true);
        Object enum701 = ((Field) term197662).get((Object) null);
        term197136 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term197136, term197136.getClass(), "types", term197137);
        setField(term197136, term197136.getClass(), "counters", term197149);
        setField(term197136, term197136.getClass(), "state", enum701);
        Class<? extends Object> term197895 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term197894 = ((Class) term197895).getDeclaredField((String) "USER_TIME");
        ((Field) term197894).setAccessible(true);
        enum702 = ((Field) term197894).get((Object) null);
        Class<? extends Object> term198104 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term198103 = ((Class) term198104).getDeclaredField((String) "MILLISECONDS");
        ((Field) term198103).setAccessible(true);
        enum703 = ((Field) term198103).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = enum702;
        args[1] = enum703;
        callMethod(klass, "elapsedTime", argTypes, term197136, args);
    }

};


