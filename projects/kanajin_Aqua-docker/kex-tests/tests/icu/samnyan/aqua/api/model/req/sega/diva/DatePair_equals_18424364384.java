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

public class DatePair_equals_18424364384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term915;
     Object term936;

    public DatePair_equals_18424364384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term915 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term916 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term917 = newInstance(Class.forName("java.time.LocalDate"));
        Object term921 = newInstance(Class.forName("java.time.LocalTime"));
        Object term926 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term927 = newInstance(Class.forName("java.time.LocalDate"));
        Object term931 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term917, term917.getClass(), "year", 2010);
        setShortField(term917, term917.getClass(), "month", (short) 2);
        setShortField(term917, term917.getClass(), "day", (short) 24);
        setField(term916, term916.getClass(), "date", term917);
        setByteField(term921, term921.getClass(), "hour", (byte) 17);
        setByteField(term921, term921.getClass(), "minute", (byte) 58);
        setByteField(term921, term921.getClass(), "second", (byte) 56);
        setIntField(term921, term921.getClass(), "nano", 291725532);
        setField(term916, term916.getClass(), "time", term921);
        setField(term915, term915.getClass(), "Start", term916);
        setIntField(term927, term927.getClass(), "year", 2028);
        setShortField(term927, term927.getClass(), "month", (short) 7);
        setShortField(term927, term927.getClass(), "day", (short) 22);
        setField(term926, term926.getClass(), "date", term927);
        setByteField(term931, term931.getClass(), "hour", (byte) 18);
        setByteField(term931, term931.getClass(), "minute", (byte) 33);
        setByteField(term931, term931.getClass(), "second", (byte) 7);
        setIntField(term931, term931.getClass(), "nano", 763613074);
        setField(term926, term926.getClass(), "time", term931);
        setField(term915, term915.getClass(), "End", term926);
        term936 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term936;
        callMethod(klass, "equals", argTypes, term915, args);
    }

};


