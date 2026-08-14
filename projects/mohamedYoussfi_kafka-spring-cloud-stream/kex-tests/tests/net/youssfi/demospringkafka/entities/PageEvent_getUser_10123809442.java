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

public class PageEvent_getUser_10123809442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399;

    public PageEvent_getUser_10123809442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        Object term424 = newInstance(Class.forName("java.util.Date"));
        setField(term399, term399.getClass(), "name", "ZiaGIbnzTs");
        setField(term399, term399.getClass(), "user", "tbcdzjIfER");
        setLongField(term424, term424.getClass(), "fastTime", 1645834034896L);
        setField(term424, term424.getClass(), "cdate", null);
        setField(term399, term399.getClass(), "date", term424);
        setLongField(term399, term399.getClass(), "duration", -7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term399, args);
    }

};


