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

public class UnmodifiableTimingSession_elapsedTime_93517066817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190068;

    public UnmodifiableTimingSession_elapsedTime_93517066817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190068 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableTimingSession"));
        setField(term190068, term190068.getClass(), "timingSession", null);
        setField(term190068, term190068.getClass(), "types", null);
        setField(term190068, term190068.getClass(), "counters", null);
        setField(term190068, term190068.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableTimingSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "elapsedTime", argTypes, term190068, args);
    }

};


