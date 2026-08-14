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

public class TimingSession_State_3_start_6727831991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum330;
     Object term97902;

    public TimingSession_State_3_start_6727831991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97965 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term97964 = ((Class) term97965).getDeclaredField((String) "FINISHED");
        ((Field) term97964).setAccessible(true);
        enum330 = ((Field) term97964).get((Object) null);
        ArrayList term97903 = new ArrayList();
        HashMap term97907 = new HashMap();
        Class<? extends Object> term98206 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term98205 = ((Class) term98206).getDeclaredField((String) "STARTED");
        ((Field) term98205).setAccessible(true);
        Object enum331 = ((Field) term98205).get((Object) null);
        term97902 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term97902, term97902.getClass(), "types", term97903);
        setField(term97902, term97902.getClass(), "counters", term97907);
        setField(term97902, term97902.getClass(), "state", enum331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession$State$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSession");
        Object[] args = new Object[1];
        args[0] = term97902;
        callMethod(klass, "start", argTypes, enum330, args);
    }

};


