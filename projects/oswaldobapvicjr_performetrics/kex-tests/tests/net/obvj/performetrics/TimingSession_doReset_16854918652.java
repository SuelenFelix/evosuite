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

public class TimingSession_doReset_16854918652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193634;

    public TimingSession_doReset_16854918652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term193679 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term193678 = ((Class) term193679).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term193678).setAccessible(true);
        Object enum684 =  ((Field) term193678).get((Object) null);
        Class<? extends Object> term193906 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term193905 = ((Class) term193906).getDeclaredField((String) "USER_TIME");
        ((Field) term193905).setAccessible(true);
        Object enum685 =  ((Field) term193905).get((Object) null);
        Class<? extends Object> term194115 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term194114 = ((Class) term194115).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term194114).setAccessible(true);
        Object enum686 =  ((Field) term194114).get((Object) null);
        Class<? extends Object> term194330 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term194329 = ((Class) term194330).getDeclaredField((String) "CPU_TIME");
        ((Field) term194329).setAccessible(true);
        Object enum687 =  ((Field) term194329).get((Object) null);
        ArrayList term193635 = new ArrayList();
        ((ArrayList) term193635).add(enum684);
        ((ArrayList) term193635).add(enum685);
        ((ArrayList) term193635).add(enum685);
        ((ArrayList) term193635).add(enum686);
        ((ArrayList) term193635).add(enum684);
        ((ArrayList) term193635).add(enum686);
        ((ArrayList) term193635).add(enum684);
        ((ArrayList) term193635).add(enum687);
        ((ArrayList) term193635).add(enum684);
        HashMap term193655 = new HashMap();
        Class<? extends Object> term194536 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term194535 = ((Class) term194536).getDeclaredField((String) "STARTED");
        ((Field) term194535).setAccessible(true);
        Object enum688 = ((Field) term194535).get((Object) null);
        term193634 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term193634, term193634.getClass(), "types", term193635);
        setField(term193634, term193634.getClass(), "counters", term193655);
        setField(term193634, term193634.getClass(), "state", enum688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doReset", argTypes, term193634, args);
    }

};


