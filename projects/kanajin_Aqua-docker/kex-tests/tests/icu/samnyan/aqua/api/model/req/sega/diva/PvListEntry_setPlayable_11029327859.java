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

public class PvListEntry_setPlayable_11029327859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442;
     Object term488;

    public PvListEntry_setPlayable_11029327859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term446 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term447 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term448 = newInstance(Class.forName("java.time.LocalDate"));
        Object term452 = newInstance(Class.forName("java.time.LocalTime"));
        Object term457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term462 = newInstance(Class.forName("java.time.LocalTime"));
        Object term467 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term473 = newInstance(Class.forName("java.time.LocalTime"));
        Object term478 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term479 = newInstance(Class.forName("java.time.LocalDate"));
        Object term483 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term442, term442.getClass(), "PVID", -203030934);
        setIntField(term442, term442.getClass(), "Version", -1179120542);
        setIntField(term442, term442.getClass(), "Edition", -73683645);
        setIntField(term448, term448.getClass(), "year", 2023);
        setShortField(term448, term448.getClass(), "month", (short) 7);
        setShortField(term448, term448.getClass(), "day", (short) 16);
        setField(term447, term447.getClass(), "date", term448);
        setByteField(term452, term452.getClass(), "hour", (byte) 3);
        setByteField(term452, term452.getClass(), "minute", (byte) 1);
        setByteField(term452, term452.getClass(), "second", (byte) 19);
        setIntField(term452, term452.getClass(), "nano", 488629554);
        setField(term447, term447.getClass(), "time", term452);
        setField(term446, term446.getClass(), "Start", term447);
        setIntField(term458, term458.getClass(), "year", 2018);
        setShortField(term458, term458.getClass(), "month", (short) 7);
        setShortField(term458, term458.getClass(), "day", (short) 12);
        setField(term457, term457.getClass(), "date", term458);
        setByteField(term462, term462.getClass(), "hour", (byte) 1);
        setByteField(term462, term462.getClass(), "minute", (byte) 3);
        setByteField(term462, term462.getClass(), "second", (byte) 47);
        setIntField(term462, term462.getClass(), "nano", 2729929);
        setField(term457, term457.getClass(), "time", term462);
        setField(term446, term446.getClass(), "End", term457);
        setField(term442, term442.getClass(), "AdvDemo", term446);
        setIntField(term469, term469.getClass(), "year", 2015);
        setShortField(term469, term469.getClass(), "month", (short) 12);
        setShortField(term469, term469.getClass(), "day", (short) 23);
        setField(term468, term468.getClass(), "date", term469);
        setByteField(term473, term473.getClass(), "hour", (byte) 14);
        setByteField(term473, term473.getClass(), "minute", (byte) 17);
        setByteField(term473, term473.getClass(), "second", (byte) 50);
        setIntField(term473, term473.getClass(), "nano", 325544804);
        setField(term468, term468.getClass(), "time", term473);
        setField(term467, term467.getClass(), "Start", term468);
        setIntField(term479, term479.getClass(), "year", 2027);
        setShortField(term479, term479.getClass(), "month", (short) 11);
        setShortField(term479, term479.getClass(), "day", (short) 8);
        setField(term478, term478.getClass(), "date", term479);
        setByteField(term483, term483.getClass(), "hour", (byte) 11);
        setByteField(term483, term483.getClass(), "minute", (byte) 59);
        setByteField(term483, term483.getClass(), "second", (byte) 14);
        setIntField(term483, term483.getClass(), "nano", 322375591);
        setField(term478, term478.getClass(), "time", term483);
        setField(term467, term467.getClass(), "End", term478);
        setField(term442, term442.getClass(), "Playable", term467);
        term488 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term494 = newInstance(Class.forName("java.time.LocalTime"));
        Object term499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term504 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term490, term490.getClass(), "year", 2020);
        setShortField(term490, term490.getClass(), "month", (short) 8);
        setShortField(term490, term490.getClass(), "day", (short) 15);
        setField(term489, term489.getClass(), "date", term490);
        setByteField(term494, term494.getClass(), "hour", (byte) 2);
        setByteField(term494, term494.getClass(), "minute", (byte) 0);
        setByteField(term494, term494.getClass(), "second", (byte) 38);
        setIntField(term494, term494.getClass(), "nano", 146431486);
        setField(term489, term489.getClass(), "time", term494);
        setField(term488, term488.getClass(), "Start", term489);
        setIntField(term500, term500.getClass(), "year", 2014);
        setShortField(term500, term500.getClass(), "month", (short) 11);
        setShortField(term500, term500.getClass(), "day", (short) 8);
        setField(term499, term499.getClass(), "date", term500);
        setByteField(term504, term504.getClass(), "hour", (byte) 8);
        setByteField(term504, term504.getClass(), "minute", (byte) 43);
        setByteField(term504, term504.getClass(), "second", (byte) 32);
        setIntField(term504, term504.getClass(), "nano", 154434838);
        setField(term499, term499.getClass(), "time", term504);
        setField(term488, term488.getClass(), "End", term499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair");
        Object[] args = new Object[1];
        args[0] = term488;
        callMethod(klass, "setPlayable", argTypes, term442, args);
    }

};


