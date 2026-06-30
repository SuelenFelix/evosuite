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

public class PvEntry_getVersion_13902537914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78292;

    public PvEntry_getVersion_13902537914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78356 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term78355 = ((Class) term78356).getDeclaredField((String) "EASY");
        ((Field) term78355).setAccessible(true);
        Object enum168 = ((Field) term78355).get((Object) null);
        Class<? extends Object> term78625 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term78624 = ((Class) term78625).getDeclaredField((String) "EXTRA");
        ((Field) term78624).setAccessible(true);
        Object enum169 = ((Field) term78624).get((Object) null);
        term78292 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term78315 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78316 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78320 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78326 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78330 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78335 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78336 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78340 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78346 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78350 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term78292, term78292.getClass(), "id", -6969704322644192945L);
        setIntField(term78292, term78292.getClass(), "pvId", -23054366);
        setField(term78292, term78292.getClass(), "difficulty", enum168);
        setIntField(term78292, term78292.getClass(), "version", 153009426);
        setField(term78292, term78292.getClass(), "edition", enum169);
        setIntField(term78316, term78316.getClass(), "year", 2017);
        setShortField(term78316, term78316.getClass(), "month", (short) 8);
        setShortField(term78316, term78316.getClass(), "day", (short) 6);
        setField(term78315, term78315.getClass(), "date", term78316);
        setByteField(term78320, term78320.getClass(), "hour", (byte) 22);
        setByteField(term78320, term78320.getClass(), "minute", (byte) 46);
        setByteField(term78320, term78320.getClass(), "second", (byte) 47);
        setIntField(term78320, term78320.getClass(), "nano", 782967389);
        setField(term78315, term78315.getClass(), "time", term78320);
        setField(term78292, term78292.getClass(), "demoStart", term78315);
        setIntField(term78326, term78326.getClass(), "year", 2029);
        setShortField(term78326, term78326.getClass(), "month", (short) 3);
        setShortField(term78326, term78326.getClass(), "day", (short) 3);
        setField(term78325, term78325.getClass(), "date", term78326);
        setByteField(term78330, term78330.getClass(), "hour", (byte) 2);
        setByteField(term78330, term78330.getClass(), "minute", (byte) 29);
        setByteField(term78330, term78330.getClass(), "second", (byte) 54);
        setIntField(term78330, term78330.getClass(), "nano", 846675209);
        setField(term78325, term78325.getClass(), "time", term78330);
        setField(term78292, term78292.getClass(), "demoEnd", term78325);
        setIntField(term78336, term78336.getClass(), "year", 2013);
        setShortField(term78336, term78336.getClass(), "month", (short) 1);
        setShortField(term78336, term78336.getClass(), "day", (short) 17);
        setField(term78335, term78335.getClass(), "date", term78336);
        setByteField(term78340, term78340.getClass(), "hour", (byte) 19);
        setByteField(term78340, term78340.getClass(), "minute", (byte) 49);
        setByteField(term78340, term78340.getClass(), "second", (byte) 53);
        setIntField(term78340, term78340.getClass(), "nano", 217542739);
        setField(term78335, term78335.getClass(), "time", term78340);
        setField(term78292, term78292.getClass(), "playableStart", term78335);
        setIntField(term78346, term78346.getClass(), "year", 2025);
        setShortField(term78346, term78346.getClass(), "month", (short) 8);
        setShortField(term78346, term78346.getClass(), "day", (short) 8);
        setField(term78345, term78345.getClass(), "date", term78346);
        setByteField(term78350, term78350.getClass(), "hour", (byte) 12);
        setByteField(term78350, term78350.getClass(), "minute", (byte) 29);
        setByteField(term78350, term78350.getClass(), "second", (byte) 36);
        setIntField(term78350, term78350.getClass(), "nano", 329488602);
        setField(term78345, term78345.getClass(), "time", term78350);
        setField(term78292, term78292.getClass(), "playableEnd", term78345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term78292, args);
    }

};


