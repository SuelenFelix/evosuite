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

public class PvListEntry_hashCode_24383011712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603;

    public PvListEntry_hashCode_24383011712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term603 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term607 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term613 = newInstance(Class.forName("java.time.LocalTime"));
        Object term618 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term619 = newInstance(Class.forName("java.time.LocalDate"));
        Object term623 = newInstance(Class.forName("java.time.LocalTime"));
        Object term628 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term634 = newInstance(Class.forName("java.time.LocalTime"));
        Object term639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term644 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term603, term603.getClass(), "PVID", 679763016);
        setIntField(term603, term603.getClass(), "Version", 1962444399);
        setIntField(term603, term603.getClass(), "Edition", 767834723);
        setIntField(term609, term609.getClass(), "year", 2011);
        setShortField(term609, term609.getClass(), "month", (short) 6);
        setShortField(term609, term609.getClass(), "day", (short) 26);
        setField(term608, term608.getClass(), "date", term609);
        setByteField(term613, term613.getClass(), "hour", (byte) 22);
        setByteField(term613, term613.getClass(), "minute", (byte) 39);
        setByteField(term613, term613.getClass(), "second", (byte) 11);
        setIntField(term613, term613.getClass(), "nano", 686293604);
        setField(term608, term608.getClass(), "time", term613);
        setField(term607, term607.getClass(), "Start", term608);
        setIntField(term619, term619.getClass(), "year", 2012);
        setShortField(term619, term619.getClass(), "month", (short) 7);
        setShortField(term619, term619.getClass(), "day", (short) 21);
        setField(term618, term618.getClass(), "date", term619);
        setByteField(term623, term623.getClass(), "hour", (byte) 13);
        setByteField(term623, term623.getClass(), "minute", (byte) 41);
        setByteField(term623, term623.getClass(), "second", (byte) 44);
        setIntField(term623, term623.getClass(), "nano", 394467282);
        setField(term618, term618.getClass(), "time", term623);
        setField(term607, term607.getClass(), "End", term618);
        setField(term603, term603.getClass(), "AdvDemo", term607);
        setIntField(term630, term630.getClass(), "year", 2025);
        setShortField(term630, term630.getClass(), "month", (short) 9);
        setShortField(term630, term630.getClass(), "day", (short) 25);
        setField(term629, term629.getClass(), "date", term630);
        setByteField(term634, term634.getClass(), "hour", (byte) 20);
        setByteField(term634, term634.getClass(), "minute", (byte) 0);
        setByteField(term634, term634.getClass(), "second", (byte) 25);
        setIntField(term634, term634.getClass(), "nano", 65871584);
        setField(term629, term629.getClass(), "time", term634);
        setField(term628, term628.getClass(), "Start", term629);
        setIntField(term640, term640.getClass(), "year", 2011);
        setShortField(term640, term640.getClass(), "month", (short) 9);
        setShortField(term640, term640.getClass(), "day", (short) 25);
        setField(term639, term639.getClass(), "date", term640);
        setByteField(term644, term644.getClass(), "hour", (byte) 16);
        setByteField(term644, term644.getClass(), "minute", (byte) 45);
        setByteField(term644, term644.getClass(), "second", (byte) 19);
        setIntField(term644, term644.getClass(), "nano", 962864785);
        setField(term639, term639.getClass(), "time", term644);
        setField(term628, term628.getClass(), "End", term639);
        setField(term603, term603.getClass(), "Playable", term628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term603, args);
    }

};


