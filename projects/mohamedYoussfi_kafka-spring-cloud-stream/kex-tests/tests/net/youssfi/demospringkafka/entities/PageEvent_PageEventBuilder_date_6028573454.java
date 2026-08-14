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

public class PageEvent_PageEventBuilder_date_6028573454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;
     Object term171;

    public PageEvent_PageEventBuilder_date_6028573454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent$PageEventBuilder"));
        Object term168 = newInstance(Class.forName("java.util.Date"));
        setField(term143, term143.getClass(), "name", "SzjVpOQTyS");
        setField(term143, term143.getClass(), "user", "MjGYSRKTNF");
        setLongField(term168, term168.getClass(), "fastTime", 1610940182830L);
        setField(term168, term168.getClass(), "cdate", null);
        setField(term143, term143.getClass(), "date", term168);
        setLongField(term143, term143.getClass(), "duration", -8257434502486459194L);
        term171 = newInstance(Class.forName("java.util.Date"));
        setLongField(term171, term171.getClass(), "fastTime", 1606045635837L);
        setField(term171, term171.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent$PageEventBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term171;
        callMethod(klass, "date", argTypes, term143, args);
    }

};


