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

public class MonitoredRunnable_run_11091095527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4688;

    public MonitoredRunnable_run_11091095527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4688 = newInstance(Class.forName("net.obvj.performetrics.monitors.MonitoredRunnable"));
        setField(term4688, term4688.getClass(), "runnable", null);
        setField(term4688, term4688.getClass(), "types", null);
        setField(term4688, term4688.getClass(), "sessions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.monitors.MonitoredRunnable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term4688, args);
    }

};


