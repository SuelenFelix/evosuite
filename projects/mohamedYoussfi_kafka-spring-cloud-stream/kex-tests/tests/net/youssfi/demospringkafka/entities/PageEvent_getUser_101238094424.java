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

public class PageEvent_getUser_101238094424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1043;

    public PageEvent_getUser_101238094424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1043 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        setField(term1043, term1043.getClass(), "name", null);
        setField(term1043, term1043.getClass(), "user", null);
        setField(term1043, term1043.getClass(), "date", null);
        setLongField(term1043, term1043.getClass(), "duration", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term1043, args);
    }

};


