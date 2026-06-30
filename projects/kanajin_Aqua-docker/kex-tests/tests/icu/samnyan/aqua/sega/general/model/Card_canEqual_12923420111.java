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

public class Card_canEqual_12923420111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2074;
     Object term2110;

    public Card_canEqual_12923420111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2076 = new Long(-4325723315152823407L);
        term2074 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term2090 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2091 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2095 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2101 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2105 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2074, term2074.getClass(), "id", -4325723315152823407L);
        setField(term2074, term2074.getClass(), "extId", term2076);
        setField(term2074, term2074.getClass(), "luid", "tPlsykYBqO");
        setIntField(term2091, term2091.getClass(), "year", 2023);
        setShortField(term2091, term2091.getClass(), "month", (short) 7);
        setShortField(term2091, term2091.getClass(), "day", (short) 16);
        setField(term2090, term2090.getClass(), "date", term2091);
        setByteField(term2095, term2095.getClass(), "hour", (byte) 3);
        setByteField(term2095, term2095.getClass(), "minute", (byte) 1);
        setByteField(term2095, term2095.getClass(), "second", (byte) 19);
        setIntField(term2095, term2095.getClass(), "nano", 488629554);
        setField(term2090, term2090.getClass(), "time", term2095);
        setField(term2074, term2074.getClass(), "registerTime", term2090);
        setIntField(term2101, term2101.getClass(), "year", 2018);
        setShortField(term2101, term2101.getClass(), "month", (short) 7);
        setShortField(term2101, term2101.getClass(), "day", (short) 12);
        setField(term2100, term2100.getClass(), "date", term2101);
        setByteField(term2105, term2105.getClass(), "hour", (byte) 1);
        setByteField(term2105, term2105.getClass(), "minute", (byte) 3);
        setByteField(term2105, term2105.getClass(), "second", (byte) 47);
        setIntField(term2105, term2105.getClass(), "nano", 2729929);
        setField(term2100, term2100.getClass(), "time", term2105);
        setField(term2074, term2074.getClass(), "accessTime", term2100);
        term2110 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2110;
        callMethod(klass, "canEqual", argTypes, term2074, args);
    }

};


