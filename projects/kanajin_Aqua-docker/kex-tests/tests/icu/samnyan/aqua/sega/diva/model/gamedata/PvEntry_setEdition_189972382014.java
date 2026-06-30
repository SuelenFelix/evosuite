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
import java.lang.String;
import java.lang.Object;

public class PvEntry_setEdition_189972382014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84610;
     Object enum190;

    public PvEntry_setEdition_189972382014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84680 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term84679 = ((Class) term84680).getDeclaredField((String) "EXTREME");
        ((Field) term84679).setAccessible(true);
        Object enum189 = ((Field) term84679).get((Object) null);
        Class<? extends Object> term84958 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term84957 = ((Class) term84958).getDeclaredField((String) "ORIGINAL");
        ((Field) term84957).setAccessible(true);
        enum190 = ((Field) term84957).get((Object) null);
        term84610 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term84639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84644 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84649 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84650 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84654 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84664 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84674 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term84610, term84610.getClass(), "id", 6041374912351843923L);
        setIntField(term84610, term84610.getClass(), "pvId", -1249782654);
        setField(term84610, term84610.getClass(), "difficulty", enum189);
        setIntField(term84610, term84610.getClass(), "version", 399302934);
        setField(term84610, term84610.getClass(), "edition", enum190);
        setIntField(term84640, term84640.getClass(), "year", 2018);
        setShortField(term84640, term84640.getClass(), "month", (short) 2);
        setShortField(term84640, term84640.getClass(), "day", (short) 4);
        setField(term84639, term84639.getClass(), "date", term84640);
        setByteField(term84644, term84644.getClass(), "hour", (byte) 5);
        setByteField(term84644, term84644.getClass(), "minute", (byte) 35);
        setByteField(term84644, term84644.getClass(), "second", (byte) 40);
        setIntField(term84644, term84644.getClass(), "nano", 354661894);
        setField(term84639, term84639.getClass(), "time", term84644);
        setField(term84610, term84610.getClass(), "demoStart", term84639);
        setIntField(term84650, term84650.getClass(), "year", 2010);
        setShortField(term84650, term84650.getClass(), "month", (short) 3);
        setShortField(term84650, term84650.getClass(), "day", (short) 23);
        setField(term84649, term84649.getClass(), "date", term84650);
        setByteField(term84654, term84654.getClass(), "hour", (byte) 17);
        setByteField(term84654, term84654.getClass(), "minute", (byte) 32);
        setByteField(term84654, term84654.getClass(), "second", (byte) 36);
        setIntField(term84654, term84654.getClass(), "nano", 470582535);
        setField(term84649, term84649.getClass(), "time", term84654);
        setField(term84610, term84610.getClass(), "demoEnd", term84649);
        setIntField(term84660, term84660.getClass(), "year", 2024);
        setShortField(term84660, term84660.getClass(), "month", (short) 9);
        setShortField(term84660, term84660.getClass(), "day", (short) 7);
        setField(term84659, term84659.getClass(), "date", term84660);
        setByteField(term84664, term84664.getClass(), "hour", (byte) 2);
        setByteField(term84664, term84664.getClass(), "minute", (byte) 37);
        setByteField(term84664, term84664.getClass(), "second", (byte) 4);
        setIntField(term84664, term84664.getClass(), "nano", 236043949);
        setField(term84659, term84659.getClass(), "time", term84664);
        setField(term84610, term84610.getClass(), "playableStart", term84659);
        setIntField(term84670, term84670.getClass(), "year", 2025);
        setShortField(term84670, term84670.getClass(), "month", (short) 7);
        setShortField(term84670, term84670.getClass(), "day", (short) 4);
        setField(term84669, term84669.getClass(), "date", term84670);
        setByteField(term84674, term84674.getClass(), "hour", (byte) 18);
        setByteField(term84674, term84674.getClass(), "minute", (byte) 13);
        setByteField(term84674, term84674.getClass(), "second", (byte) 37);
        setIntField(term84674, term84674.getClass(), "nano", 681447348);
        setField(term84669, term84669.getClass(), "time", term84674);
        setField(term84610, term84610.getClass(), "playableEnd", term84669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        Object[] args = new Object[1];
        args[0] = enum190;
        callMethod(klass, "setEdition", argTypes, term84610, args);
    }

};


