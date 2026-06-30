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

public class PvEntry_hashCode_128542717621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88859;

    public PvEntry_hashCode_128542717621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88923 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term88922 = ((Class) term88923).getDeclaredField((String) "EASY");
        ((Field) term88922).setAccessible(true);
        Object enum203 = ((Field) term88922).get((Object) null);
        Class<? extends Object> term89192 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term89191 = ((Class) term89192).getDeclaredField((String) "EXTRA");
        ((Field) term89191).setAccessible(true);
        Object enum204 = ((Field) term89191).get((Object) null);
        term88859 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term88882 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88883 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88887 = newInstance(Class.forName("java.time.LocalTime"));
        Object term88892 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88893 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88897 = newInstance(Class.forName("java.time.LocalTime"));
        Object term88902 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88903 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88907 = newInstance(Class.forName("java.time.LocalTime"));
        Object term88912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88917 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term88859, term88859.getClass(), "id", -6078481855513028760L);
        setIntField(term88859, term88859.getClass(), "pvId", 1077223540);
        setField(term88859, term88859.getClass(), "difficulty", enum203);
        setIntField(term88859, term88859.getClass(), "version", -1823813592);
        setField(term88859, term88859.getClass(), "edition", enum204);
        setIntField(term88883, term88883.getClass(), "year", 2022);
        setShortField(term88883, term88883.getClass(), "month", (short) 8);
        setShortField(term88883, term88883.getClass(), "day", (short) 16);
        setField(term88882, term88882.getClass(), "date", term88883);
        setByteField(term88887, term88887.getClass(), "hour", (byte) 4);
        setByteField(term88887, term88887.getClass(), "minute", (byte) 38);
        setByteField(term88887, term88887.getClass(), "second", (byte) 51);
        setIntField(term88887, term88887.getClass(), "nano", 348952212);
        setField(term88882, term88882.getClass(), "time", term88887);
        setField(term88859, term88859.getClass(), "demoStart", term88882);
        setIntField(term88893, term88893.getClass(), "year", 2016);
        setShortField(term88893, term88893.getClass(), "month", (short) 7);
        setShortField(term88893, term88893.getClass(), "day", (short) 21);
        setField(term88892, term88892.getClass(), "date", term88893);
        setByteField(term88897, term88897.getClass(), "hour", (byte) 22);
        setByteField(term88897, term88897.getClass(), "minute", (byte) 2);
        setByteField(term88897, term88897.getClass(), "second", (byte) 21);
        setIntField(term88897, term88897.getClass(), "nano", 729266668);
        setField(term88892, term88892.getClass(), "time", term88897);
        setField(term88859, term88859.getClass(), "demoEnd", term88892);
        setIntField(term88903, term88903.getClass(), "year", 2020);
        setShortField(term88903, term88903.getClass(), "month", (short) 5);
        setShortField(term88903, term88903.getClass(), "day", (short) 31);
        setField(term88902, term88902.getClass(), "date", term88903);
        setByteField(term88907, term88907.getClass(), "hour", (byte) 17);
        setByteField(term88907, term88907.getClass(), "minute", (byte) 5);
        setByteField(term88907, term88907.getClass(), "second", (byte) 38);
        setIntField(term88907, term88907.getClass(), "nano", 709012300);
        setField(term88902, term88902.getClass(), "time", term88907);
        setField(term88859, term88859.getClass(), "playableStart", term88902);
        setIntField(term88913, term88913.getClass(), "year", 2021);
        setShortField(term88913, term88913.getClass(), "month", (short) 7);
        setShortField(term88913, term88913.getClass(), "day", (short) 6);
        setField(term88912, term88912.getClass(), "date", term88913);
        setByteField(term88917, term88917.getClass(), "hour", (byte) 12);
        setByteField(term88917, term88917.getClass(), "minute", (byte) 46);
        setByteField(term88917, term88917.getClass(), "second", (byte) 42);
        setIntField(term88917, term88917.getClass(), "nano", 512890850);
        setField(term88912, term88912.getClass(), "time", term88917);
        setField(term88859, term88859.getClass(), "playableEnd", term88912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term88859, args);
    }

};


