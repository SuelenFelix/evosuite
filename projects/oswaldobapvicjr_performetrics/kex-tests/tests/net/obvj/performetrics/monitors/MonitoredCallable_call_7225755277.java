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

public class MonitoredCallable_call_7225755277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1643;

    public MonitoredCallable_call_7225755277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1643 = newInstance(Class.forName("net.obvj.performetrics.monitors.MonitoredCallable"));
        setField(term1643, term1643.getClass(), "callable", null);
        setField(term1643, term1643.getClass(), "types", null);
        setField(term1643, term1643.getClass(), "sessions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.monitors.MonitoredCallable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "call", argTypes, term1643, args);
    }

};


