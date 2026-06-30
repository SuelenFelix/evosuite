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
import java.util.LinkedList;

public class PvListRequest_init_198618581814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4091468;
     Object term4091478;
     Object term4091499;
     Object term4091502;
     Object term4091505;

    public PvListRequest_init_198618581814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4091468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4091469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4091473 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4091469, term4091469.getClass(), "year", 2019);
        setShortField(term4091469, term4091469.getClass(), "month", (short) 5);
        setShortField(term4091469, term4091469.getClass(), "day", (short) 1);
        setField(term4091468, term4091468.getClass(), "date", term4091469);
        setByteField(term4091473, term4091473.getClass(), "hour", (byte) 21);
        setByteField(term4091473, term4091473.getClass(), "minute", (byte) 25);
        setByteField(term4091473, term4091473.getClass(), "second", (byte) 13);
        setIntField(term4091473, term4091473.getClass(), "nano", 912645795);
        setField(term4091468, term4091468.getClass(), "time", term4091473);
        Object term4091481 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091485 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4091487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4091488 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4091490 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term4091481, term4091481.getClass(), "PVID", -882929627);
        setIntField(term4091481, term4091481.getClass(), "Version", -443268041);
        setIntField(term4091481, term4091481.getClass(), "Edition", 1397994879);
        setField(term4091486, term4091486.getClass(), "date", null);
        setField(term4091486, term4091486.getClass(), "time", null);
        setField(term4091485, term4091485.getClass(), "Start", term4091486);
        setField(term4091487, term4091487.getClass(), "date", null);
        setField(term4091487, term4091487.getClass(), "time", null);
        setField(term4091485, term4091485.getClass(), "End", term4091487);
        setField(term4091481, term4091481.getClass(), "AdvDemo", term4091485);
        setField(term4091489, term4091489.getClass(), "date", null);
        setField(term4091489, term4091489.getClass(), "time", null);
        setField(term4091488, term4091488.getClass(), "Start", term4091489);
        setField(term4091490, term4091490.getClass(), "date", null);
        setField(term4091490, term4091490.getClass(), "time", null);
        setField(term4091488, term4091488.getClass(), "End", term4091490);
        setField(term4091481, term4091481.getClass(), "Playable", term4091488);
        Object term4091492 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091496 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091497 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091492, term4091492.getClass(), "PVID", -1346404385);
        setIntField(term4091492, term4091492.getClass(), "Version", 1910776080);
        setIntField(term4091492, term4091492.getClass(), "Edition", -705172903);
        setField(term4091496, term4091496.getClass(), "Start", null);
        setField(term4091496, term4091496.getClass(), "End", null);
        setField(term4091492, term4091492.getClass(), "AdvDemo", term4091496);
        setField(term4091497, term4091497.getClass(), "Start", null);
        setField(term4091497, term4091497.getClass(), "End", null);
        setField(term4091492, term4091492.getClass(), "Playable", term4091497);
        term4091478 = new LinkedList();
        ((LinkedList) term4091478).add(term4091481);
        ((LinkedList) term4091478).add(term4091492);
        term4091499 = new LinkedList();
        term4091502 = new LinkedList();
        term4091505 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = Class.forName("java.util.List");
        Object[] args = new Object[5];
        args[0] = term4091468;
        args[1] = term4091478;
        args[2] = term4091499;
        args[3] = term4091502;
        args[4] = term4091505;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


