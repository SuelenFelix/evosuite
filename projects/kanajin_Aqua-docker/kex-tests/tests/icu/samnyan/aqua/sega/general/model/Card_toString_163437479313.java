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

public class Card_toString_163437479313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2167;

    public Card_toString_163437479313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2169 = new Long(-5476826692763582090L);
        term2167 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term2183 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2184 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2188 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2193 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2194 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2198 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2167, term2167.getClass(), "id", -5476826692763582090L);
        setField(term2167, term2167.getClass(), "extId", term2169);
        setField(term2167, term2167.getClass(), "luid", "whBvTVIIlC");
        setIntField(term2184, term2184.getClass(), "year", 2020);
        setShortField(term2184, term2184.getClass(), "month", (short) 8);
        setShortField(term2184, term2184.getClass(), "day", (short) 15);
        setField(term2183, term2183.getClass(), "date", term2184);
        setByteField(term2188, term2188.getClass(), "hour", (byte) 2);
        setByteField(term2188, term2188.getClass(), "minute", (byte) 0);
        setByteField(term2188, term2188.getClass(), "second", (byte) 38);
        setIntField(term2188, term2188.getClass(), "nano", 146431486);
        setField(term2183, term2183.getClass(), "time", term2188);
        setField(term2167, term2167.getClass(), "registerTime", term2183);
        setIntField(term2194, term2194.getClass(), "year", 2014);
        setShortField(term2194, term2194.getClass(), "month", (short) 11);
        setShortField(term2194, term2194.getClass(), "day", (short) 8);
        setField(term2193, term2193.getClass(), "date", term2194);
        setByteField(term2198, term2198.getClass(), "hour", (byte) 8);
        setByteField(term2198, term2198.getClass(), "minute", (byte) 43);
        setByteField(term2198, term2198.getClass(), "second", (byte) 32);
        setIntField(term2198, term2198.getClass(), "nano", 154434838);
        setField(term2193, term2193.getClass(), "time", term2198);
        setField(term2167, term2167.getClass(), "accessTime", term2193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2167, args);
    }

};


