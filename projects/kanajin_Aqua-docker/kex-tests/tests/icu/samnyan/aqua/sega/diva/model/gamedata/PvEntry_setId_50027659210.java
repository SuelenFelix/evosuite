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
import java.lang.Long;

public class PvEntry_setId_50027659210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81890;
     Object term81958;

    public PvEntry_setId_50027659210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81961 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term81960 = ((Class) term81961).getDeclaredField((String) "NORMAL");
        ((Field) term81960).setAccessible(true);
        Object enum180 = ((Field) term81960).get((Object) null);
        Class<? extends Object> term82236 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term82235 = ((Class) term82236).getDeclaredField((String) "ORIGINAL");
        ((Field) term82235).setAccessible(true);
        Object enum181 = ((Field) term82235).get((Object) null);
        term81890 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term81918 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81923 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81933 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81938 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81939 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81943 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81948 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81949 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81953 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term81890, term81890.getClass(), "id", 174253963298276221L);
        setIntField(term81890, term81890.getClass(), "pvId", -1584779593);
        setField(term81890, term81890.getClass(), "difficulty", enum180);
        setIntField(term81890, term81890.getClass(), "version", 303007547);
        setField(term81890, term81890.getClass(), "edition", enum181);
        setIntField(term81919, term81919.getClass(), "year", 2011);
        setShortField(term81919, term81919.getClass(), "month", (short) 10);
        setShortField(term81919, term81919.getClass(), "day", (short) 10);
        setField(term81918, term81918.getClass(), "date", term81919);
        setByteField(term81923, term81923.getClass(), "hour", (byte) 5);
        setByteField(term81923, term81923.getClass(), "minute", (byte) 26);
        setByteField(term81923, term81923.getClass(), "second", (byte) 16);
        setIntField(term81923, term81923.getClass(), "nano", 858245653);
        setField(term81918, term81918.getClass(), "time", term81923);
        setField(term81890, term81890.getClass(), "demoStart", term81918);
        setIntField(term81929, term81929.getClass(), "year", 2011);
        setShortField(term81929, term81929.getClass(), "month", (short) 3);
        setShortField(term81929, term81929.getClass(), "day", (short) 25);
        setField(term81928, term81928.getClass(), "date", term81929);
        setByteField(term81933, term81933.getClass(), "hour", (byte) 20);
        setByteField(term81933, term81933.getClass(), "minute", (byte) 10);
        setByteField(term81933, term81933.getClass(), "second", (byte) 51);
        setIntField(term81933, term81933.getClass(), "nano", 162102574);
        setField(term81928, term81928.getClass(), "time", term81933);
        setField(term81890, term81890.getClass(), "demoEnd", term81928);
        setIntField(term81939, term81939.getClass(), "year", 2027);
        setShortField(term81939, term81939.getClass(), "month", (short) 8);
        setShortField(term81939, term81939.getClass(), "day", (short) 16);
        setField(term81938, term81938.getClass(), "date", term81939);
        setByteField(term81943, term81943.getClass(), "hour", (byte) 8);
        setByteField(term81943, term81943.getClass(), "minute", (byte) 3);
        setByteField(term81943, term81943.getClass(), "second", (byte) 15);
        setIntField(term81943, term81943.getClass(), "nano", 332963320);
        setField(term81938, term81938.getClass(), "time", term81943);
        setField(term81890, term81890.getClass(), "playableStart", term81938);
        setIntField(term81949, term81949.getClass(), "year", 2021);
        setShortField(term81949, term81949.getClass(), "month", (short) 11);
        setShortField(term81949, term81949.getClass(), "day", (short) 12);
        setField(term81948, term81948.getClass(), "date", term81949);
        setByteField(term81953, term81953.getClass(), "hour", (byte) 0);
        setByteField(term81953, term81953.getClass(), "minute", (byte) 51);
        setByteField(term81953, term81953.getClass(), "second", (byte) 55);
        setIntField(term81953, term81953.getClass(), "nano", 745543124);
        setField(term81948, term81948.getClass(), "time", term81953);
        setField(term81890, term81890.getClass(), "playableEnd", term81948);
        term81958 = new Long(3713624957161771816L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term81958;
        callMethod(klass, "setId", argTypes, term81890, args);
    }

};


