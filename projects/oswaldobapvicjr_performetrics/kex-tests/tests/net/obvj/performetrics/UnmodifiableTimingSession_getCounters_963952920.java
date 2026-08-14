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

public class UnmodifiableTimingSession_getCounters_963952920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190071;

    public UnmodifiableTimingSession_getCounters_963952920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190071 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableTimingSession"));
        setField(term190071, term190071.getClass(), "timingSession", null);
        setField(term190071, term190071.getClass(), "types", null);
        setField(term190071, term190071.getClass(), "counters", null);
        setField(term190071, term190071.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableTimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCounters", argTypes, term190071, args);
    }

};


