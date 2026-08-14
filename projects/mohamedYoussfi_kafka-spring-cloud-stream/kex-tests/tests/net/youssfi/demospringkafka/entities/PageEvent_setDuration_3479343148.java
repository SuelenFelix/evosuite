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
import java.lang.Long;

public class PageEvent_setDuration_3479343148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733;
     Object term761;

    public PageEvent_setDuration_3479343148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term733 = newInstance(Class.forName("net.youssfi.demospringkafka.entities.PageEvent"));
        Object term758 = newInstance(Class.forName("java.util.Date"));
        setField(term733, term733.getClass(), "name", "OWDIEULEFu");
        setField(term733, term733.getClass(), "user", "dWRymuLBtr");
        setLongField(term758, term758.getClass(), "fastTime", 1863631094992L);
        setField(term758, term758.getClass(), "cdate", null);
        setField(term733, term733.getClass(), "date", term758);
        setLongField(term733, term733.getClass(), "duration", -5476826692763582090L);
        term761 = new Long(-872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.youssfi.demospringkafka.entities.PageEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term761;
        callMethod(klass, "setDuration", argTypes, term733, args);
    }

};


