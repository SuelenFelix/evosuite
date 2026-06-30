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

public class PvEntry_setDifficulty_67793773412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83112;
     Object enum186;

    public PvEntry_setDifficulty_67793773412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83193 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term83192 = ((Class) term83193).getDeclaredField((String) "NORMAL");
        ((Field) term83192).setAccessible(true);
        Object enum184 = ((Field) term83192).get((Object) null);
        Class<? extends Object> term83468 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term83467 = ((Class) term83468).getDeclaredField((String) "ORIGINAL");
        ((Field) term83467).setAccessible(true);
        Object enum185 = ((Field) term83467).get((Object) null);
        term83112 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term83140 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83141 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83145 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83155 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83165 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83170 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83175 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term83112, term83112.getClass(), "id", 3423965054378869855L);
        setIntField(term83112, term83112.getClass(), "pvId", -534033672);
        setField(term83112, term83112.getClass(), "difficulty", enum184);
        setIntField(term83112, term83112.getClass(), "version", -1162790806);
        setField(term83112, term83112.getClass(), "edition", enum185);
        setIntField(term83141, term83141.getClass(), "year", 2028);
        setShortField(term83141, term83141.getClass(), "month", (short) 3);
        setShortField(term83141, term83141.getClass(), "day", (short) 20);
        setField(term83140, term83140.getClass(), "date", term83141);
        setByteField(term83145, term83145.getClass(), "hour", (byte) 15);
        setByteField(term83145, term83145.getClass(), "minute", (byte) 5);
        setByteField(term83145, term83145.getClass(), "second", (byte) 16);
        setIntField(term83145, term83145.getClass(), "nano", 223082659);
        setField(term83140, term83140.getClass(), "time", term83145);
        setField(term83112, term83112.getClass(), "demoStart", term83140);
        setIntField(term83151, term83151.getClass(), "year", 2019);
        setShortField(term83151, term83151.getClass(), "month", (short) 4);
        setShortField(term83151, term83151.getClass(), "day", (short) 1);
        setField(term83150, term83150.getClass(), "date", term83151);
        setByteField(term83155, term83155.getClass(), "hour", (byte) 8);
        setByteField(term83155, term83155.getClass(), "minute", (byte) 11);
        setByteField(term83155, term83155.getClass(), "second", (byte) 4);
        setIntField(term83155, term83155.getClass(), "nano", 648208624);
        setField(term83150, term83150.getClass(), "time", term83155);
        setField(term83112, term83112.getClass(), "demoEnd", term83150);
        setIntField(term83161, term83161.getClass(), "year", 2016);
        setShortField(term83161, term83161.getClass(), "month", (short) 4);
        setShortField(term83161, term83161.getClass(), "day", (short) 23);
        setField(term83160, term83160.getClass(), "date", term83161);
        setByteField(term83165, term83165.getClass(), "hour", (byte) 13);
        setByteField(term83165, term83165.getClass(), "minute", (byte) 34);
        setByteField(term83165, term83165.getClass(), "second", (byte) 22);
        setIntField(term83165, term83165.getClass(), "nano", 20103660);
        setField(term83160, term83160.getClass(), "time", term83165);
        setField(term83112, term83112.getClass(), "playableStart", term83160);
        setIntField(term83171, term83171.getClass(), "year", 2023);
        setShortField(term83171, term83171.getClass(), "month", (short) 1);
        setShortField(term83171, term83171.getClass(), "day", (short) 24);
        setField(term83170, term83170.getClass(), "date", term83171);
        setByteField(term83175, term83175.getClass(), "hour", (byte) 10);
        setByteField(term83175, term83175.getClass(), "minute", (byte) 26);
        setByteField(term83175, term83175.getClass(), "second", (byte) 14);
        setIntField(term83175, term83175.getClass(), "nano", 736807866);
        setField(term83170, term83170.getClass(), "time", term83175);
        setField(term83112, term83112.getClass(), "playableEnd", term83170);
        Class<? extends Object> term83734 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term83733 = ((Class) term83734).getDeclaredField((String) "EXTREME");
        ((Field) term83733).setAccessible(true);
        enum186 = ((Field) term83733).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Object[] args = new Object[1];
        args[0] = enum186;
        callMethod(klass, "setDifficulty", argTypes, term83112, args);
    }

};


