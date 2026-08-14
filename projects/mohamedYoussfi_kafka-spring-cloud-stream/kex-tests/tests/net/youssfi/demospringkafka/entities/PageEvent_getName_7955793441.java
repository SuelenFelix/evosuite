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

public class PageEvent_getName_7955793441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351;

    public PageEvent_getName_7955793441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        Object term376 = newInstance(Class.forName("java.util.Date"));
        setField(term351, term351.getClass(), "name", "oVcInYnLWB");
        setField(term351, term351.getClass(), "user", "aJlieCFVtF");
        setLongField(term376, term376.getClass(), "fastTime", 1495357463288L);
        setField(term376, term376.getClass(), "cdate", null);
        setField(term351, term351.getClass(), "date", term376);
        setLongField(term351, term351.getClass(), "duration", 6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term351, args);
    }

};


