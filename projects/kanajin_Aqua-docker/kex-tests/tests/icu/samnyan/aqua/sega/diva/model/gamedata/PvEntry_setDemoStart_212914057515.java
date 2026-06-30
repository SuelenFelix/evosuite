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

public class PvEntry_setDemoStart_212914057515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85223;
     Object term85289;

    public PvEntry_setDemoStart_212914057515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85300 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term85299 = ((Class) term85300).getDeclaredField((String) "EXTREME");
        ((Field) term85299).setAccessible(true);
        Object enum191 = ((Field) term85299).get((Object) null);
        Class<? extends Object> term85578 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term85577 = ((Class) term85578).getDeclaredField((String) "EXTRA");
        ((Field) term85577).setAccessible(true);
        Object enum192 = ((Field) term85577).get((Object) null);
        term85223 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term85249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85254 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85264 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85269 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85270 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85274 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85279 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85280 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85284 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term85223, term85223.getClass(), "id", 2535970782317488741L);
        setIntField(term85223, term85223.getClass(), "pvId", -1823255084);
        setField(term85223, term85223.getClass(), "difficulty", enum191);
        setIntField(term85223, term85223.getClass(), "version", 793345010);
        setField(term85223, term85223.getClass(), "edition", enum192);
        setIntField(term85250, term85250.getClass(), "year", 2025);
        setShortField(term85250, term85250.getClass(), "month", (short) 1);
        setShortField(term85250, term85250.getClass(), "day", (short) 20);
        setField(term85249, term85249.getClass(), "date", term85250);
        setByteField(term85254, term85254.getClass(), "hour", (byte) 22);
        setByteField(term85254, term85254.getClass(), "minute", (byte) 55);
        setByteField(term85254, term85254.getClass(), "second", (byte) 9);
        setIntField(term85254, term85254.getClass(), "nano", 660955568);
        setField(term85249, term85249.getClass(), "time", term85254);
        setField(term85223, term85223.getClass(), "demoStart", term85249);
        setIntField(term85260, term85260.getClass(), "year", 2014);
        setShortField(term85260, term85260.getClass(), "month", (short) 2);
        setShortField(term85260, term85260.getClass(), "day", (short) 26);
        setField(term85259, term85259.getClass(), "date", term85260);
        setByteField(term85264, term85264.getClass(), "hour", (byte) 16);
        setByteField(term85264, term85264.getClass(), "minute", (byte) 42);
        setByteField(term85264, term85264.getClass(), "second", (byte) 39);
        setIntField(term85264, term85264.getClass(), "nano", 690212071);
        setField(term85259, term85259.getClass(), "time", term85264);
        setField(term85223, term85223.getClass(), "demoEnd", term85259);
        setIntField(term85270, term85270.getClass(), "year", 2019);
        setShortField(term85270, term85270.getClass(), "month", (short) 9);
        setShortField(term85270, term85270.getClass(), "day", (short) 3);
        setField(term85269, term85269.getClass(), "date", term85270);
        setByteField(term85274, term85274.getClass(), "hour", (byte) 2);
        setByteField(term85274, term85274.getClass(), "minute", (byte) 32);
        setByteField(term85274, term85274.getClass(), "second", (byte) 30);
        setIntField(term85274, term85274.getClass(), "nano", 339846128);
        setField(term85269, term85269.getClass(), "time", term85274);
        setField(term85223, term85223.getClass(), "playableStart", term85269);
        setIntField(term85280, term85280.getClass(), "year", 2029);
        setShortField(term85280, term85280.getClass(), "month", (short) 11);
        setShortField(term85280, term85280.getClass(), "day", (short) 6);
        setField(term85279, term85279.getClass(), "date", term85280);
        setByteField(term85284, term85284.getClass(), "hour", (byte) 2);
        setByteField(term85284, term85284.getClass(), "minute", (byte) 55);
        setByteField(term85284, term85284.getClass(), "second", (byte) 43);
        setIntField(term85284, term85284.getClass(), "nano", 109400580);
        setField(term85279, term85279.getClass(), "time", term85284);
        setField(term85223, term85223.getClass(), "playableEnd", term85279);
        term85289 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85290 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85294 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term85290, term85290.getClass(), "year", 2020);
        setShortField(term85290, term85290.getClass(), "month", (short) 7);
        setShortField(term85290, term85290.getClass(), "day", (short) 24);
        setField(term85289, term85289.getClass(), "date", term85290);
        setByteField(term85294, term85294.getClass(), "hour", (byte) 22);
        setByteField(term85294, term85294.getClass(), "minute", (byte) 16);
        setByteField(term85294, term85294.getClass(), "second", (byte) 59);
        setIntField(term85294, term85294.getClass(), "nano", 588569833);
        setField(term85289, term85289.getClass(), "time", term85294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term85289;
        callMethod(klass, "setDemoStart", argTypes, term85223, args);
    }

};


