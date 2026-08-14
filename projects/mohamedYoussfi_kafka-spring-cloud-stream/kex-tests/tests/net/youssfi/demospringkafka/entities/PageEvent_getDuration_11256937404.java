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
import java.lang.Object;

public class PageEvent_getDuration_11256937404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495;

    public PageEvent_getDuration_11256937404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        Object term520 = newInstance(Class.forName("java.util.Date"));
        setField(term495, term495.getClass(), "name", "hNxWaHcfhY");
        setField(term495, term495.getClass(), "user", "RkybSrpybU");
        setLongField(term520, term520.getClass(), "fastTime", 1797203628025L);
        setField(term520, term520.getClass(), "cdate", null);
        setField(term495, term495.getClass(), "date", term520);
        setLongField(term495, term495.getClass(), "duration", -2813493605142626659L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term495, args);
    }

};


