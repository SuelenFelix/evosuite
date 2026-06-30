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

public class PvEntry_getPlayableEnd_9928950779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81289;

    public PvEntry_getPlayableEnd_9928950779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81356 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term81355 = ((Class) term81356).getDeclaredField((String) "EXTREME");
        ((Field) term81355).setAccessible(true);
        Object enum178 = ((Field) term81355).get((Object) null);
        Class<? extends Object> term81634 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term81633 = ((Class) term81634).getDeclaredField((String) "EXTRA");
        ((Field) term81633).setAccessible(true);
        Object enum179 = ((Field) term81633).get((Object) null);
        term81289 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term81315 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81316 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81320 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81326 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81330 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81335 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81336 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81340 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81346 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81350 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term81289, term81289.getClass(), "id", -2951854704066477061L);
        setIntField(term81289, term81289.getClass(), "pvId", 1077647088);
        setField(term81289, term81289.getClass(), "difficulty", enum178);
        setIntField(term81289, term81289.getClass(), "version", -705176810);
        setField(term81289, term81289.getClass(), "edition", enum179);
        setIntField(term81316, term81316.getClass(), "year", 2022);
        setShortField(term81316, term81316.getClass(), "month", (short) 1);
        setShortField(term81316, term81316.getClass(), "day", (short) 4);
        setField(term81315, term81315.getClass(), "date", term81316);
        setByteField(term81320, term81320.getClass(), "hour", (byte) 21);
        setByteField(term81320, term81320.getClass(), "minute", (byte) 36);
        setByteField(term81320, term81320.getClass(), "second", (byte) 43);
        setIntField(term81320, term81320.getClass(), "nano", 941221944);
        setField(term81315, term81315.getClass(), "time", term81320);
        setField(term81289, term81289.getClass(), "demoStart", term81315);
        setIntField(term81326, term81326.getClass(), "year", 2011);
        setShortField(term81326, term81326.getClass(), "month", (short) 4);
        setShortField(term81326, term81326.getClass(), "day", (short) 18);
        setField(term81325, term81325.getClass(), "date", term81326);
        setByteField(term81330, term81330.getClass(), "hour", (byte) 15);
        setByteField(term81330, term81330.getClass(), "minute", (byte) 35);
        setByteField(term81330, term81330.getClass(), "second", (byte) 7);
        setIntField(term81330, term81330.getClass(), "nano", 925983040);
        setField(term81325, term81325.getClass(), "time", term81330);
        setField(term81289, term81289.getClass(), "demoEnd", term81325);
        setIntField(term81336, term81336.getClass(), "year", 2023);
        setShortField(term81336, term81336.getClass(), "month", (short) 5);
        setShortField(term81336, term81336.getClass(), "day", (short) 19);
        setField(term81335, term81335.getClass(), "date", term81336);
        setByteField(term81340, term81340.getClass(), "hour", (byte) 20);
        setByteField(term81340, term81340.getClass(), "minute", (byte) 50);
        setByteField(term81340, term81340.getClass(), "second", (byte) 49);
        setIntField(term81340, term81340.getClass(), "nano", 806710892);
        setField(term81335, term81335.getClass(), "time", term81340);
        setField(term81289, term81289.getClass(), "playableStart", term81335);
        setIntField(term81346, term81346.getClass(), "year", 2022);
        setShortField(term81346, term81346.getClass(), "month", (short) 8);
        setShortField(term81346, term81346.getClass(), "day", (short) 3);
        setField(term81345, term81345.getClass(), "date", term81346);
        setByteField(term81350, term81350.getClass(), "hour", (byte) 18);
        setByteField(term81350, term81350.getClass(), "minute", (byte) 3);
        setByteField(term81350, term81350.getClass(), "second", (byte) 33);
        setIntField(term81350, term81350.getClass(), "nano", 770583920);
        setField(term81345, term81345.getClass(), "time", term81350);
        setField(term81289, term81289.getClass(), "playableEnd", term81345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayableEnd", argTypes, term81289, args);
    }

};


