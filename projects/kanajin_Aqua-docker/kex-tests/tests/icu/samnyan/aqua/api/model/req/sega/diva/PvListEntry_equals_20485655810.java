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

public class PvListEntry_equals_20485655810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509;
     Object term555;

    public PvListEntry_equals_20485655810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term509 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term513 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term514 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term515 = newInstance(Class.forName("java.time.LocalDate"));
        Object term519 = newInstance(Class.forName("java.time.LocalTime"));
        Object term524 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term529 = newInstance(Class.forName("java.time.LocalTime"));
        Object term534 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term540 = newInstance(Class.forName("java.time.LocalTime"));
        Object term545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term550 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term509, term509.getClass(), "PVID", -226514366);
        setIntField(term509, term509.getClass(), "Version", 1193880199);
        setIntField(term509, term509.getClass(), "Edition", -1087774327);
        setIntField(term515, term515.getClass(), "year", 2020);
        setShortField(term515, term515.getClass(), "month", (short) 5);
        setShortField(term515, term515.getClass(), "day", (short) 18);
        setField(term514, term514.getClass(), "date", term515);
        setByteField(term519, term519.getClass(), "hour", (byte) 5);
        setByteField(term519, term519.getClass(), "minute", (byte) 46);
        setByteField(term519, term519.getClass(), "second", (byte) 13);
        setIntField(term519, term519.getClass(), "nano", 45893173);
        setField(term514, term514.getClass(), "time", term519);
        setField(term513, term513.getClass(), "Start", term514);
        setIntField(term525, term525.getClass(), "year", 2017);
        setShortField(term525, term525.getClass(), "month", (short) 4);
        setShortField(term525, term525.getClass(), "day", (short) 3);
        setField(term524, term524.getClass(), "date", term525);
        setByteField(term529, term529.getClass(), "hour", (byte) 6);
        setByteField(term529, term529.getClass(), "minute", (byte) 51);
        setByteField(term529, term529.getClass(), "second", (byte) 10);
        setIntField(term529, term529.getClass(), "nano", 316377166);
        setField(term524, term524.getClass(), "time", term529);
        setField(term513, term513.getClass(), "End", term524);
        setField(term509, term509.getClass(), "AdvDemo", term513);
        setIntField(term536, term536.getClass(), "year", 2027);
        setShortField(term536, term536.getClass(), "month", (short) 8);
        setShortField(term536, term536.getClass(), "day", (short) 23);
        setField(term535, term535.getClass(), "date", term536);
        setByteField(term540, term540.getClass(), "hour", (byte) 15);
        setByteField(term540, term540.getClass(), "minute", (byte) 12);
        setByteField(term540, term540.getClass(), "second", (byte) 6);
        setIntField(term540, term540.getClass(), "nano", 541218258);
        setField(term535, term535.getClass(), "time", term540);
        setField(term534, term534.getClass(), "Start", term535);
        setIntField(term546, term546.getClass(), "year", 2013);
        setShortField(term546, term546.getClass(), "month", (short) 5);
        setShortField(term546, term546.getClass(), "day", (short) 26);
        setField(term545, term545.getClass(), "date", term546);
        setByteField(term550, term550.getClass(), "hour", (byte) 4);
        setByteField(term550, term550.getClass(), "minute", (byte) 39);
        setByteField(term550, term550.getClass(), "second", (byte) 5);
        setIntField(term550, term550.getClass(), "nano", 392869354);
        setField(term545, term545.getClass(), "time", term550);
        setField(term534, term534.getClass(), "End", term545);
        setField(term509, term509.getClass(), "Playable", term534);
        term555 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term555;
        callMethod(klass, "equals", argTypes, term509, args);
    }

};


