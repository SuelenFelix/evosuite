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
import java.lang.Integer;

public class PvListEntry_setEdition_7603214867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327;
     Object term373;

    public PvListEntry_setEdition_7603214867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term331 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term337 = newInstance(Class.forName("java.time.LocalTime"));
        Object term342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term343 = newInstance(Class.forName("java.time.LocalDate"));
        Object term347 = newInstance(Class.forName("java.time.LocalTime"));
        Object term352 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term358 = newInstance(Class.forName("java.time.LocalTime"));
        Object term363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term368 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term327, term327.getClass(), "PVID", -117576464);
        setIntField(term327, term327.getClass(), "Version", -1007160944);
        setIntField(term327, term327.getClass(), "Edition", 1135664017);
        setIntField(term333, term333.getClass(), "year", 2021);
        setShortField(term333, term333.getClass(), "month", (short) 8);
        setShortField(term333, term333.getClass(), "day", (short) 12);
        setField(term332, term332.getClass(), "date", term333);
        setByteField(term337, term337.getClass(), "hour", (byte) 2);
        setByteField(term337, term337.getClass(), "minute", (byte) 17);
        setByteField(term337, term337.getClass(), "second", (byte) 51);
        setIntField(term337, term337.getClass(), "nano", 207375141);
        setField(term332, term332.getClass(), "time", term337);
        setField(term331, term331.getClass(), "Start", term332);
        setIntField(term343, term343.getClass(), "year", 2025);
        setShortField(term343, term343.getClass(), "month", (short) 11);
        setShortField(term343, term343.getClass(), "day", (short) 3);
        setField(term342, term342.getClass(), "date", term343);
        setByteField(term347, term347.getClass(), "hour", (byte) 21);
        setByteField(term347, term347.getClass(), "minute", (byte) 24);
        setByteField(term347, term347.getClass(), "second", (byte) 23);
        setIntField(term347, term347.getClass(), "nano", 210986721);
        setField(term342, term342.getClass(), "time", term347);
        setField(term331, term331.getClass(), "End", term342);
        setField(term327, term327.getClass(), "AdvDemo", term331);
        setIntField(term354, term354.getClass(), "year", 2016);
        setShortField(term354, term354.getClass(), "month", (short) 6);
        setShortField(term354, term354.getClass(), "day", (short) 15);
        setField(term353, term353.getClass(), "date", term354);
        setByteField(term358, term358.getClass(), "hour", (byte) 21);
        setByteField(term358, term358.getClass(), "minute", (byte) 23);
        setByteField(term358, term358.getClass(), "second", (byte) 23);
        setIntField(term358, term358.getClass(), "nano", 433372070);
        setField(term353, term353.getClass(), "time", term358);
        setField(term352, term352.getClass(), "Start", term353);
        setIntField(term364, term364.getClass(), "year", 2012);
        setShortField(term364, term364.getClass(), "month", (short) 8);
        setShortField(term364, term364.getClass(), "day", (short) 25);
        setField(term363, term363.getClass(), "date", term364);
        setByteField(term368, term368.getClass(), "hour", (byte) 19);
        setByteField(term368, term368.getClass(), "minute", (byte) 49);
        setByteField(term368, term368.getClass(), "second", (byte) 8);
        setIntField(term368, term368.getClass(), "nano", 912685024);
        setField(term363, term363.getClass(), "time", term368);
        setField(term352, term352.getClass(), "End", term363);
        setField(term327, term327.getClass(), "Playable", term352);
        term373 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term373;
        callMethod(klass, "setEdition", argTypes, term327, args);
    }

};


