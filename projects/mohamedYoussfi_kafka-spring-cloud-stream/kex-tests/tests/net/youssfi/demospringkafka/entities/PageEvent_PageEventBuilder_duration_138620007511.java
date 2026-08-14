package net.youssfi.demospringkafka.entities;

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
import static net.youssfi.demospringkafka.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class PageEvent_PageEventBuilder_duration_138620007511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343;
     Object term345;

    public PageEvent_PageEventBuilder_duration_138620007511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent$PageEventBuilder"));
        setField(term343, term343.getClass(), "name", null);
        setField(term343, term343.getClass(), "user", null);
        setField(term343, term343.getClass(), "date", null);
        setLongField(term343, term343.getClass(), "duration", 0L);
        term345 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent$PageEventBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term345;
        callMethod(klass, "duration", argTypes, term343, args);
    }

};


