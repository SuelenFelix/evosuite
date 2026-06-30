package icu.samnyan.aqua.api.model.req.sega.diva;

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
import static icu.samnyan.aqua.api.model.req.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DatePair_canEqual_16483682295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term937;
     Object term958;

    public DatePair_canEqual_16483682295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term937 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term938 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term939 = newInstance(Class.forName("java.time.LocalDate"));
        Object term943 = newInstance(Class.forName("java.time.LocalTime"));
        Object term948 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term949 = newInstance(Class.forName("java.time.LocalDate"));
        Object term953 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term939, term939.getClass(), "year", 2011);
        setShortField(term939, term939.getClass(), "month", (short) 8);
        setShortField(term939, term939.getClass(), "day", (short) 1);
        setField(term938, term938.getClass(), "date", term939);
        setByteField(term943, term943.getClass(), "hour", (byte) 7);
        setByteField(term943, term943.getClass(), "minute", (byte) 2);
        setByteField(term943, term943.getClass(), "second", (byte) 46);
        setIntField(term943, term943.getClass(), "nano", 187178462);
        setField(term938, term938.getClass(), "time", term943);
        setField(term937, term937.getClass(), "Start", term938);
        setIntField(term949, term949.getClass(), "year", 2020);
        setShortField(term949, term949.getClass(), "month", (short) 9);
        setShortField(term949, term949.getClass(), "day", (short) 3);
        setField(term948, term948.getClass(), "date", term949);
        setByteField(term953, term953.getClass(), "hour", (byte) 10);
        setByteField(term953, term953.getClass(), "minute", (byte) 44);
        setByteField(term953, term953.getClass(), "second", (byte) 5);
        setIntField(term953, term953.getClass(), "nano", 572560230);
        setField(term948, term948.getClass(), "time", term953);
        setField(term937, term937.getClass(), "End", term948);
        term958 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term958;
        callMethod(klass, "canEqual", argTypes, term937, args);
    }

};


