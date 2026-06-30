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

public class PvEntry_setPlayableEnd_60239758118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87056;
     Object term87125;

    public PvEntry_setPlayableEnd_60239758118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87136 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term87135 = ((Class) term87136).getDeclaredField((String) "EXTREME");
        ((Field) term87135).setAccessible(true);
        Object enum197 = ((Field) term87135).get((Object) null);
        Class<? extends Object> term87414 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term87413 = ((Class) term87414).getDeclaredField((String) "ORIGINAL");
        ((Field) term87413).setAccessible(true);
        Object enum198 = ((Field) term87413).get((Object) null);
        term87056 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term87085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87090 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87095 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87096 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87100 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87105 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87106 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87110 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87115 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87116 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87120 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term87056, term87056.getClass(), "id", -8477368071089201577L);
        setIntField(term87056, term87056.getClass(), "pvId", 919994471);
        setField(term87056, term87056.getClass(), "difficulty", enum197);
        setIntField(term87056, term87056.getClass(), "version", 183531701);
        setField(term87056, term87056.getClass(), "edition", enum198);
        setIntField(term87086, term87086.getClass(), "year", 2021);
        setShortField(term87086, term87086.getClass(), "month", (short) 10);
        setShortField(term87086, term87086.getClass(), "day", (short) 16);
        setField(term87085, term87085.getClass(), "date", term87086);
        setByteField(term87090, term87090.getClass(), "hour", (byte) 5);
        setByteField(term87090, term87090.getClass(), "minute", (byte) 6);
        setByteField(term87090, term87090.getClass(), "second", (byte) 17);
        setIntField(term87090, term87090.getClass(), "nano", 631786532);
        setField(term87085, term87085.getClass(), "time", term87090);
        setField(term87056, term87056.getClass(), "demoStart", term87085);
        setIntField(term87096, term87096.getClass(), "year", 2027);
        setShortField(term87096, term87096.getClass(), "month", (short) 11);
        setShortField(term87096, term87096.getClass(), "day", (short) 10);
        setField(term87095, term87095.getClass(), "date", term87096);
        setByteField(term87100, term87100.getClass(), "hour", (byte) 9);
        setByteField(term87100, term87100.getClass(), "minute", (byte) 27);
        setByteField(term87100, term87100.getClass(), "second", (byte) 5);
        setIntField(term87100, term87100.getClass(), "nano", 574938581);
        setField(term87095, term87095.getClass(), "time", term87100);
        setField(term87056, term87056.getClass(), "demoEnd", term87095);
        setIntField(term87106, term87106.getClass(), "year", 2011);
        setShortField(term87106, term87106.getClass(), "month", (short) 8);
        setShortField(term87106, term87106.getClass(), "day", (short) 29);
        setField(term87105, term87105.getClass(), "date", term87106);
        setByteField(term87110, term87110.getClass(), "hour", (byte) 10);
        setByteField(term87110, term87110.getClass(), "minute", (byte) 15);
        setByteField(term87110, term87110.getClass(), "second", (byte) 18);
        setIntField(term87110, term87110.getClass(), "nano", 171360352);
        setField(term87105, term87105.getClass(), "time", term87110);
        setField(term87056, term87056.getClass(), "playableStart", term87105);
        setIntField(term87116, term87116.getClass(), "year", 2019);
        setShortField(term87116, term87116.getClass(), "month", (short) 5);
        setShortField(term87116, term87116.getClass(), "day", (short) 16);
        setField(term87115, term87115.getClass(), "date", term87116);
        setByteField(term87120, term87120.getClass(), "hour", (byte) 3);
        setByteField(term87120, term87120.getClass(), "minute", (byte) 12);
        setByteField(term87120, term87120.getClass(), "second", (byte) 27);
        setIntField(term87120, term87120.getClass(), "nano", 775737832);
        setField(term87115, term87115.getClass(), "time", term87120);
        setField(term87056, term87056.getClass(), "playableEnd", term87115);
        term87125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87130 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term87126, term87126.getClass(), "year", 2016);
        setShortField(term87126, term87126.getClass(), "month", (short) 12);
        setShortField(term87126, term87126.getClass(), "day", (short) 2);
        setField(term87125, term87125.getClass(), "date", term87126);
        setByteField(term87130, term87130.getClass(), "hour", (byte) 7);
        setByteField(term87130, term87130.getClass(), "minute", (byte) 38);
        setByteField(term87130, term87130.getClass(), "second", (byte) 49);
        setIntField(term87130, term87130.getClass(), "nano", 415044053);
        setField(term87125, term87125.getClass(), "time", term87130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term87125;
        callMethod(klass, "setPlayableEnd", argTypes, term87056, args);
    }

};


