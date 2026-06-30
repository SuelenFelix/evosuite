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

public class PvListEntry_getVersion_18631164461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;

    public PvListEntry_getVersion_18631164461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term51 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term52 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67 = newInstance(Class.forName("java.time.LocalTime"));
        Object term72 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term73 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47, term47.getClass(), "PVID", 391863371);
        setIntField(term47, term47.getClass(), "Version", -1922583790);
        setIntField(term47, term47.getClass(), "Edition", -616727354);
        setIntField(term53, term53.getClass(), "year", 2022);
        setShortField(term53, term53.getClass(), "month", (short) 2);
        setShortField(term53, term53.getClass(), "day", (short) 26);
        setField(term52, term52.getClass(), "date", term53);
        setByteField(term57, term57.getClass(), "hour", (byte) 11);
        setByteField(term57, term57.getClass(), "minute", (byte) 42);
        setByteField(term57, term57.getClass(), "second", (byte) 15);
        setIntField(term57, term57.getClass(), "nano", 377731937);
        setField(term52, term52.getClass(), "time", term57);
        setField(term51, term51.getClass(), "Start", term52);
        setIntField(term63, term63.getClass(), "year", 2026);
        setShortField(term63, term63.getClass(), "month", (short) 12);
        setShortField(term63, term63.getClass(), "day", (short) 14);
        setField(term62, term62.getClass(), "date", term63);
        setByteField(term67, term67.getClass(), "hour", (byte) 16);
        setByteField(term67, term67.getClass(), "minute", (byte) 34);
        setByteField(term67, term67.getClass(), "second", (byte) 9);
        setIntField(term67, term67.getClass(), "nano", 518326996);
        setField(term62, term62.getClass(), "time", term67);
        setField(term51, term51.getClass(), "End", term62);
        setField(term47, term47.getClass(), "AdvDemo", term51);
        setIntField(term74, term74.getClass(), "year", 2025);
        setShortField(term74, term74.getClass(), "month", (short) 4);
        setShortField(term74, term74.getClass(), "day", (short) 24);
        setField(term73, term73.getClass(), "date", term74);
        setByteField(term78, term78.getClass(), "hour", (byte) 18);
        setByteField(term78, term78.getClass(), "minute", (byte) 11);
        setByteField(term78, term78.getClass(), "second", (byte) 40);
        setIntField(term78, term78.getClass(), "nano", 137454929);
        setField(term73, term73.getClass(), "time", term78);
        setField(term72, term72.getClass(), "Start", term73);
        setIntField(term84, term84.getClass(), "year", 2024);
        setShortField(term84, term84.getClass(), "month", (short) 1);
        setShortField(term84, term84.getClass(), "day", (short) 24);
        setField(term83, term83.getClass(), "date", term84);
        setByteField(term88, term88.getClass(), "hour", (byte) 20);
        setByteField(term88, term88.getClass(), "minute", (byte) 28);
        setByteField(term88, term88.getClass(), "second", (byte) 39);
        setIntField(term88, term88.getClass(), "nano", 952728177);
        setField(term83, term83.getClass(), "time", term88);
        setField(term72, term72.getClass(), "End", term83);
        setField(term47, term47.getClass(), "Playable", term72);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term47, args);
    }

};


