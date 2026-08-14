package org.codefx.demo.effective_java._03_04_05_singleton_utilities_di;

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
import static org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class EventBusUser_useBus_4321078121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4034;

    public EventBusUser_useBus_4321078121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4034 = newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.EventBusUser"));
        Object term4035 = newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.EventBus"));
        setField(term4035, term4035.getClass(), "state", "xxtlPwDYFs");
        setField(term4034, term4034.getClass(), "bus", term4035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.EventBusUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "useBus", argTypes, term4034, args);
    }

};


