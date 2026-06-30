package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Object;

public class Festa_init_155067311828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27985;
     Object term27987;
     Object enum57;
     Object enum58;
     Object term28049;
     Object term28051;
     Object term28053;
     Object term28063;
     Object term28073;

    public Festa_init_155067311828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27985 = new Integer(-1539747985);
        term27987 = new Boolean(false);
        Class<? extends Object> term28094 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term28093 = ((Class) term28094).getDeclaredField((String) "PINK_FESTA");
        ((Field) term28093).setAccessible(true);
        enum57 = ((Field) term28093).get((Object) null);
        Class<? extends Object> term28376 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term28375 = ((Class) term28376).getDeclaredField((String) "HARD");
        ((Field) term28375).setAccessible(true);
        enum58 = ((Field) term28375).get((Object) null);
        term28049 = new Integer(487369012);
        term28051 = new Integer(-179238712);
        term28053 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28054 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28058 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28054, term28054.getClass(), "year", 2015);
        setShortField(term28054, term28054.getClass(), "month", (short) 4);
        setShortField(term28054, term28054.getClass(), "day", (short) 14);
        setField(term28053, term28053.getClass(), "date", term28054);
        setByteField(term28058, term28058.getClass(), "hour", (byte) 18);
        setByteField(term28058, term28058.getClass(), "minute", (byte) 24);
        setByteField(term28058, term28058.getClass(), "second", (byte) 32);
        setIntField(term28058, term28058.getClass(), "nano", 369233818);
        setField(term28053, term28053.getClass(), "time", term28058);
        term28063 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28064 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28068 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28064, term28064.getClass(), "year", 2022);
        setShortField(term28064, term28064.getClass(), "month", (short) 2);
        setShortField(term28064, term28064.getClass(), "day", (short) 26);
        setField(term28063, term28063.getClass(), "date", term28064);
        setByteField(term28068, term28068.getClass(), "hour", (byte) 11);
        setByteField(term28068, term28068.getClass(), "minute", (byte) 42);
        setByteField(term28068, term28068.getClass(), "second", (byte) 15);
        setIntField(term28068, term28068.getClass(), "nano", 377731937);
        setField(term28063, term28063.getClass(), "time", term28068);
        term28073 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28074 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28078 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28074, term28074.getClass(), "year", 2026);
        setShortField(term28074, term28074.getClass(), "month", (short) 12);
        setShortField(term28074, term28074.getClass(), "day", (short) 14);
        setField(term28073, term28073.getClass(), "date", term28074);
        setByteField(term28078, term28078.getClass(), "hour", (byte) 16);
        setByteField(term28078, term28078.getClass(), "minute", (byte) 34);
        setByteField(term28078, term28078.getClass(), "second", (byte) 9);
        setIntField(term28078, term28078.getClass(), "nano", 518326996);
        setField(term28073, term28073.getClass(), "time", term28078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[12];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.Integer");
        argTypes[8] = Class.forName("java.lang.Integer");
        argTypes[9] = Class.forName("java.time.LocalDateTime");
        argTypes[10] = Class.forName("java.time.LocalDateTime");
        argTypes[11] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[12];
        args[0] = term27985;
        args[1] = term27987;
        args[2] = "reGIMbnrGF";
        args[3] = enum57;
        args[4] = enum58;
        args[5] = "yquSngBHqd";
        args[6] = "ZSdaJkZZPm";
        args[7] = term28049;
        args[8] = term28051;
        args[9] = term28053;
        args[10] = term28063;
        args[11] = term28073;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


