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

public class PvListEntry_getPVID_2427692710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public PvListEntry_getPVID_2427692710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term5 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term6 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term27 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1, term1.getClass(), "PVID", 568599855);
        setIntField(term1, term1.getClass(), "Version", 1162663216);
        setIntField(term1, term1.getClass(), "Edition", 1484323161);
        setIntField(term7, term7.getClass(), "year", 2012);
        setShortField(term7, term7.getClass(), "month", (short) 8);
        setShortField(term7, term7.getClass(), "day", (short) 25);
        setField(term6, term6.getClass(), "date", term7);
        setByteField(term11, term11.getClass(), "hour", (byte) 5);
        setByteField(term11, term11.getClass(), "minute", (byte) 20);
        setByteField(term11, term11.getClass(), "second", (byte) 50);
        setIntField(term11, term11.getClass(), "nano", 345595912);
        setField(term6, term6.getClass(), "time", term11);
        setField(term5, term5.getClass(), "Start", term6);
        setIntField(term17, term17.getClass(), "year", 2021);
        setShortField(term17, term17.getClass(), "month", (short) 1);
        setShortField(term17, term17.getClass(), "day", (short) 18);
        setField(term16, term16.getClass(), "date", term17);
        setByteField(term21, term21.getClass(), "hour", (byte) 13);
        setByteField(term21, term21.getClass(), "minute", (byte) 38);
        setByteField(term21, term21.getClass(), "second", (byte) 26);
        setIntField(term21, term21.getClass(), "nano", 544608644);
        setField(term16, term16.getClass(), "time", term21);
        setField(term5, term5.getClass(), "End", term16);
        setField(term1, term1.getClass(), "AdvDemo", term5);
        setIntField(term28, term28.getClass(), "year", 2015);
        setShortField(term28, term28.getClass(), "month", (short) 9);
        setShortField(term28, term28.getClass(), "day", (short) 19);
        setField(term27, term27.getClass(), "date", term28);
        setByteField(term32, term32.getClass(), "hour", (byte) 9);
        setByteField(term32, term32.getClass(), "minute", (byte) 4);
        setByteField(term32, term32.getClass(), "second", (byte) 10);
        setIntField(term32, term32.getClass(), "nano", 401765865);
        setField(term27, term27.getClass(), "time", term32);
        setField(term26, term26.getClass(), "Start", term27);
        setIntField(term38, term38.getClass(), "year", 2015);
        setShortField(term38, term38.getClass(), "month", (short) 4);
        setShortField(term38, term38.getClass(), "day", (short) 14);
        setField(term37, term37.getClass(), "date", term38);
        setByteField(term42, term42.getClass(), "hour", (byte) 18);
        setByteField(term42, term42.getClass(), "minute", (byte) 24);
        setByteField(term42, term42.getClass(), "second", (byte) 32);
        setIntField(term42, term42.getClass(), "nano", 369233818);
        setField(term37, term37.getClass(), "time", term42);
        setField(term26, term26.getClass(), "End", term37);
        setField(term1, term1.getClass(), "Playable", term26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPVID", argTypes, term1, args);
    }

};


