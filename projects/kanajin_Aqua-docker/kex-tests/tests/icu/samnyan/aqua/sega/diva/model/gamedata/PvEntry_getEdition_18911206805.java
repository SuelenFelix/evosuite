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

public class PvEntry_getEdition_18911206805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78881;

    public PvEntry_getEdition_18911206805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78948 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term78947 = ((Class) term78948).getDeclaredField((String) "EXTREME");
        ((Field) term78947).setAccessible(true);
        Object enum170 = ((Field) term78947).get((Object) null);
        Class<? extends Object> term79226 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term79225 = ((Class) term79226).getDeclaredField((String) "EXTRA");
        ((Field) term79225).setAccessible(true);
        Object enum171 = ((Field) term79225).get((Object) null);
        term78881 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term78907 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78908 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78912 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78922 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78927 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78928 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78932 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78937 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78938 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78942 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term78881, term78881.getClass(), "id", -6685235643232255177L);
        setIntField(term78881, term78881.getClass(), "pvId", 185751892);
        setField(term78881, term78881.getClass(), "difficulty", enum170);
        setIntField(term78881, term78881.getClass(), "version", 1068256001);
        setField(term78881, term78881.getClass(), "edition", enum171);
        setIntField(term78908, term78908.getClass(), "year", 2024);
        setShortField(term78908, term78908.getClass(), "month", (short) 7);
        setShortField(term78908, term78908.getClass(), "day", (short) 29);
        setField(term78907, term78907.getClass(), "date", term78908);
        setByteField(term78912, term78912.getClass(), "hour", (byte) 19);
        setByteField(term78912, term78912.getClass(), "minute", (byte) 15);
        setByteField(term78912, term78912.getClass(), "second", (byte) 16);
        setIntField(term78912, term78912.getClass(), "nano", 554834199);
        setField(term78907, term78907.getClass(), "time", term78912);
        setField(term78881, term78881.getClass(), "demoStart", term78907);
        setIntField(term78918, term78918.getClass(), "year", 2018);
        setShortField(term78918, term78918.getClass(), "month", (short) 2);
        setShortField(term78918, term78918.getClass(), "day", (short) 13);
        setField(term78917, term78917.getClass(), "date", term78918);
        setByteField(term78922, term78922.getClass(), "hour", (byte) 15);
        setByteField(term78922, term78922.getClass(), "minute", (byte) 1);
        setByteField(term78922, term78922.getClass(), "second", (byte) 45);
        setIntField(term78922, term78922.getClass(), "nano", 380020898);
        setField(term78917, term78917.getClass(), "time", term78922);
        setField(term78881, term78881.getClass(), "demoEnd", term78917);
        setIntField(term78928, term78928.getClass(), "year", 2022);
        setShortField(term78928, term78928.getClass(), "month", (short) 8);
        setShortField(term78928, term78928.getClass(), "day", (short) 30);
        setField(term78927, term78927.getClass(), "date", term78928);
        setByteField(term78932, term78932.getClass(), "hour", (byte) 3);
        setByteField(term78932, term78932.getClass(), "minute", (byte) 13);
        setByteField(term78932, term78932.getClass(), "second", (byte) 34);
        setIntField(term78932, term78932.getClass(), "nano", 69286341);
        setField(term78927, term78927.getClass(), "time", term78932);
        setField(term78881, term78881.getClass(), "playableStart", term78927);
        setIntField(term78938, term78938.getClass(), "year", 2013);
        setShortField(term78938, term78938.getClass(), "month", (short) 5);
        setShortField(term78938, term78938.getClass(), "day", (short) 14);
        setField(term78937, term78937.getClass(), "date", term78938);
        setByteField(term78942, term78942.getClass(), "hour", (byte) 12);
        setByteField(term78942, term78942.getClass(), "minute", (byte) 8);
        setByteField(term78942, term78942.getClass(), "second", (byte) 12);
        setIntField(term78942, term78942.getClass(), "nano", 597594916);
        setField(term78937, term78937.getClass(), "time", term78942);
        setField(term78881, term78881.getClass(), "playableEnd", term78937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEdition", argTypes, term78881, args);
    }

};


