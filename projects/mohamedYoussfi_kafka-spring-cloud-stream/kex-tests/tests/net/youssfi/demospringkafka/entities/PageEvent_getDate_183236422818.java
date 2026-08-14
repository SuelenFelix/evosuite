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

public class PageEvent_getDate_183236422818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1031;

    public PageEvent_getDate_183236422818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1031 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        setField(term1031, term1031.getClass(), "name", null);
        setField(term1031, term1031.getClass(), "user", null);
        setField(term1031, term1031.getClass(), "date", null);
        setLongField(term1031, term1031.getClass(), "duration", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term1031, args);
    }

};


