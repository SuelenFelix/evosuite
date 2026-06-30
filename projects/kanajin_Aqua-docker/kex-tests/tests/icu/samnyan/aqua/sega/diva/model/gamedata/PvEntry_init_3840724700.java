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
import java.lang.String;
import java.lang.Object;

public class PvEntry_init_3840724700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75825;
     Object enum160;
     Object term75841;
     Object enum161;
     Object term75856;
     Object term75866;
     Object term75876;
     Object term75886;

    public PvEntry_init_3840724700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75825 = new Integer(-1549952664);
        Class<? extends Object> term75897 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term75896 = ((Class) term75897).getDeclaredField((String) "UNDEFINED");
        ((Field) term75896).setAccessible(true);
        enum160 = ((Field) term75896).get((Object) null);
        term75841 = new Integer(148394188);
        Class<? extends Object> term76204 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term76203 = ((Class) term76204).getDeclaredField((String) "ORIGINAL");
        ((Field) term76203).setAccessible(true);
        enum161 = ((Field) term76203).get((Object) null);
        term75856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75861 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term75857, term75857.getClass(), "year", 2023);
        setShortField(term75857, term75857.getClass(), "month", (short) 12);
        setShortField(term75857, term75857.getClass(), "day", (short) 12);
        setField(term75856, term75856.getClass(), "date", term75857);
        setByteField(term75861, term75861.getClass(), "hour", (byte) 0);
        setByteField(term75861, term75861.getClass(), "minute", (byte) 12);
        setByteField(term75861, term75861.getClass(), "second", (byte) 38);
        setIntField(term75861, term75861.getClass(), "nano", 430999236);
        setField(term75856, term75856.getClass(), "time", term75861);
        term75866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75871 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term75867, term75867.getClass(), "year", 2018);
        setShortField(term75867, term75867.getClass(), "month", (short) 6);
        setShortField(term75867, term75867.getClass(), "day", (short) 17);
        setField(term75866, term75866.getClass(), "date", term75867);
        setByteField(term75871, term75871.getClass(), "hour", (byte) 1);
        setByteField(term75871, term75871.getClass(), "minute", (byte) 3);
        setByteField(term75871, term75871.getClass(), "second", (byte) 5);
        setIntField(term75871, term75871.getClass(), "nano", 914834044);
        setField(term75866, term75866.getClass(), "time", term75871);
        term75876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75881 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term75877, term75877.getClass(), "year", 2021);
        setShortField(term75877, term75877.getClass(), "month", (short) 5);
        setShortField(term75877, term75877.getClass(), "day", (short) 6);
        setField(term75876, term75876.getClass(), "date", term75877);
        setByteField(term75881, term75881.getClass(), "hour", (byte) 21);
        setByteField(term75881, term75881.getClass(), "minute", (byte) 10);
        setByteField(term75881, term75881.getClass(), "second", (byte) 43);
        setIntField(term75881, term75881.getClass(), "nano", 123313014);
        setField(term75876, term75876.getClass(), "time", term75881);
        term75886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75891 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term75887, term75887.getClass(), "year", 2011);
        setShortField(term75887, term75887.getClass(), "month", (short) 6);
        setShortField(term75887, term75887.getClass(), "day", (short) 21);
        setField(term75886, term75886.getClass(), "date", term75887);
        setByteField(term75891, term75891.getClass(), "hour", (byte) 3);
        setByteField(term75891, term75891.getClass(), "minute", (byte) 19);
        setByteField(term75891, term75891.getClass(), "second", (byte) 41);
        setIntField(term75891, term75891.getClass(), "nano", 920537748);
        setField(term75886, term75886.getClass(), "time", term75891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = Class.forName("java.time.LocalDateTime");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[8];
        args[0] = term75825;
        args[1] = enum160;
        args[2] = term75841;
        args[3] = enum161;
        args[4] = term75856;
        args[5] = term75866;
        args[6] = term75876;
        args[7] = term75886;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


