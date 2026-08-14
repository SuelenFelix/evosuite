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

public class UnmodifiableTimingSession_elapsedTime_172647942518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190069;

    public UnmodifiableTimingSession_elapsedTime_172647942518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190069 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableTimingSession"));
        setField(term190069, term190069.getClass(), "timingSession", null);
        setField(term190069, term190069.getClass(), "types", null);
        setField(term190069, term190069.getClass(), "counters", null);
        setField(term190069, term190069.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableTimingSession");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "elapsedTime", argTypes, term190069, args);
    }

};


