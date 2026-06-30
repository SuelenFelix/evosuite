package icu.samnyan.aqua.sega.general.model;

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
import static icu.samnyan.aqua.sega.general.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Card_setRegisterTime_1857177898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1915;
     Object term1951;

    public Card_setRegisterTime_1857177898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1917 = new Long(6967924379644551255L);
        term1915 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1936 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1941 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1942 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1946 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1915, term1915.getClass(), "id", 6967924379644551255L);
        setField(term1915, term1915.getClass(), "extId", term1917);
        setField(term1915, term1915.getClass(), "luid", "uWHnvSvaPl");
        setIntField(term1932, term1932.getClass(), "year", 2016);
        setShortField(term1932, term1932.getClass(), "month", (short) 6);
        setShortField(term1932, term1932.getClass(), "day", (short) 15);
        setField(term1931, term1931.getClass(), "date", term1932);
        setByteField(term1936, term1936.getClass(), "hour", (byte) 21);
        setByteField(term1936, term1936.getClass(), "minute", (byte) 23);
        setByteField(term1936, term1936.getClass(), "second", (byte) 23);
        setIntField(term1936, term1936.getClass(), "nano", 433372070);
        setField(term1931, term1931.getClass(), "time", term1936);
        setField(term1915, term1915.getClass(), "registerTime", term1931);
        setIntField(term1942, term1942.getClass(), "year", 2012);
        setShortField(term1942, term1942.getClass(), "month", (short) 8);
        setShortField(term1942, term1942.getClass(), "day", (short) 25);
        setField(term1941, term1941.getClass(), "date", term1942);
        setByteField(term1946, term1946.getClass(), "hour", (byte) 19);
        setByteField(term1946, term1946.getClass(), "minute", (byte) 49);
        setByteField(term1946, term1946.getClass(), "second", (byte) 8);
        setIntField(term1946, term1946.getClass(), "nano", 912685024);
        setField(term1941, term1941.getClass(), "time", term1946);
        setField(term1915, term1915.getClass(), "accessTime", term1941);
        term1951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1956 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1952, term1952.getClass(), "year", 2012);
        setShortField(term1952, term1952.getClass(), "month", (short) 3);
        setShortField(term1952, term1952.getClass(), "day", (short) 27);
        setField(term1951, term1951.getClass(), "date", term1952);
        setByteField(term1956, term1956.getClass(), "hour", (byte) 17);
        setByteField(term1956, term1956.getClass(), "minute", (byte) 49);
        setByteField(term1956, term1956.getClass(), "second", (byte) 24);
        setIntField(term1956, term1956.getClass(), "nano", 530647398);
        setField(term1951, term1951.getClass(), "time", term1956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1951;
        callMethod(klass, "setRegisterTime", argTypes, term1915, args);
    }

};


