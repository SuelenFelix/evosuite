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

public class PvEntry_setPlayableStart_202228599617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86433;
     Object term86502;

    public PvEntry_setPlayableStart_202228599617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86513 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term86512 = ((Class) term86513).getDeclaredField((String) "EXTREME");
        ((Field) term86512).setAccessible(true);
        Object enum195 = ((Field) term86512).get((Object) null);
        Class<? extends Object> term86791 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term86790 = ((Class) term86791).getDeclaredField((String) "ORIGINAL");
        ((Field) term86790).setAccessible(true);
        Object enum196 = ((Field) term86790).get((Object) null);
        term86433 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term86462 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86463 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86467 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86472 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86473 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86477 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86482 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86483 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86487 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86492 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86493 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86497 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term86433, term86433.getClass(), "id", 24067105862153728L);
        setIntField(term86433, term86433.getClass(), "pvId", 1523896653);
        setField(term86433, term86433.getClass(), "difficulty", enum195);
        setIntField(term86433, term86433.getClass(), "version", -1731921726);
        setField(term86433, term86433.getClass(), "edition", enum196);
        setIntField(term86463, term86463.getClass(), "year", 2020);
        setShortField(term86463, term86463.getClass(), "month", (short) 10);
        setShortField(term86463, term86463.getClass(), "day", (short) 2);
        setField(term86462, term86462.getClass(), "date", term86463);
        setByteField(term86467, term86467.getClass(), "hour", (byte) 1);
        setByteField(term86467, term86467.getClass(), "minute", (byte) 41);
        setByteField(term86467, term86467.getClass(), "second", (byte) 48);
        setIntField(term86467, term86467.getClass(), "nano", 834720747);
        setField(term86462, term86462.getClass(), "time", term86467);
        setField(term86433, term86433.getClass(), "demoStart", term86462);
        setIntField(term86473, term86473.getClass(), "year", 2022);
        setShortField(term86473, term86473.getClass(), "month", (short) 3);
        setShortField(term86473, term86473.getClass(), "day", (short) 31);
        setField(term86472, term86472.getClass(), "date", term86473);
        setByteField(term86477, term86477.getClass(), "hour", (byte) 3);
        setByteField(term86477, term86477.getClass(), "minute", (byte) 43);
        setByteField(term86477, term86477.getClass(), "second", (byte) 28);
        setIntField(term86477, term86477.getClass(), "nano", 772790770);
        setField(term86472, term86472.getClass(), "time", term86477);
        setField(term86433, term86433.getClass(), "demoEnd", term86472);
        setIntField(term86483, term86483.getClass(), "year", 2010);
        setShortField(term86483, term86483.getClass(), "month", (short) 5);
        setShortField(term86483, term86483.getClass(), "day", (short) 19);
        setField(term86482, term86482.getClass(), "date", term86483);
        setByteField(term86487, term86487.getClass(), "hour", (byte) 12);
        setByteField(term86487, term86487.getClass(), "minute", (byte) 17);
        setByteField(term86487, term86487.getClass(), "second", (byte) 52);
        setIntField(term86487, term86487.getClass(), "nano", 273610077);
        setField(term86482, term86482.getClass(), "time", term86487);
        setField(term86433, term86433.getClass(), "playableStart", term86482);
        setIntField(term86493, term86493.getClass(), "year", 2017);
        setShortField(term86493, term86493.getClass(), "month", (short) 4);
        setShortField(term86493, term86493.getClass(), "day", (short) 5);
        setField(term86492, term86492.getClass(), "date", term86493);
        setByteField(term86497, term86497.getClass(), "hour", (byte) 15);
        setByteField(term86497, term86497.getClass(), "minute", (byte) 9);
        setByteField(term86497, term86497.getClass(), "second", (byte) 36);
        setIntField(term86497, term86497.getClass(), "nano", 504876449);
        setField(term86492, term86492.getClass(), "time", term86497);
        setField(term86433, term86433.getClass(), "playableEnd", term86492);
        term86502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86507 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term86503, term86503.getClass(), "year", 2013);
        setShortField(term86503, term86503.getClass(), "month", (short) 9);
        setShortField(term86503, term86503.getClass(), "day", (short) 27);
        setField(term86502, term86502.getClass(), "date", term86503);
        setByteField(term86507, term86507.getClass(), "hour", (byte) 9);
        setByteField(term86507, term86507.getClass(), "minute", (byte) 30);
        setByteField(term86507, term86507.getClass(), "second", (byte) 6);
        setIntField(term86507, term86507.getClass(), "nano", 647438502);
        setField(term86502, term86502.getClass(), "time", term86507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term86502;
        callMethod(klass, "setPlayableStart", argTypes, term86433, args);
    }

};


