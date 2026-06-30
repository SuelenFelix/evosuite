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
import java.lang.Integer;

public class PvEntry_setVersion_135209362313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84011;
     Object term84076;

    public PvEntry_setVersion_135209362313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84079 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term84078 = ((Class) term84079).getDeclaredField((String) "NORMAL");
        ((Field) term84078).setAccessible(true);
        Object enum187 = ((Field) term84078).get((Object) null);
        Class<? extends Object> term84354 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term84353 = ((Class) term84354).getDeclaredField((String) "EXTRA");
        ((Field) term84353).setAccessible(true);
        Object enum188 = ((Field) term84353).get((Object) null);
        term84011 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term84036 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84037 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84041 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84046 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84047 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84051 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84061 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84071 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term84011, term84011.getClass(), "id", -593735869267672817L);
        setIntField(term84011, term84011.getClass(), "pvId", -1264595049);
        setField(term84011, term84011.getClass(), "difficulty", enum187);
        setIntField(term84011, term84011.getClass(), "version", -2058884635);
        setField(term84011, term84011.getClass(), "edition", enum188);
        setIntField(term84037, term84037.getClass(), "year", 2023);
        setShortField(term84037, term84037.getClass(), "month", (short) 8);
        setShortField(term84037, term84037.getClass(), "day", (short) 8);
        setField(term84036, term84036.getClass(), "date", term84037);
        setByteField(term84041, term84041.getClass(), "hour", (byte) 20);
        setByteField(term84041, term84041.getClass(), "minute", (byte) 17);
        setByteField(term84041, term84041.getClass(), "second", (byte) 40);
        setIntField(term84041, term84041.getClass(), "nano", 834219024);
        setField(term84036, term84036.getClass(), "time", term84041);
        setField(term84011, term84011.getClass(), "demoStart", term84036);
        setIntField(term84047, term84047.getClass(), "year", 2012);
        setShortField(term84047, term84047.getClass(), "month", (short) 2);
        setShortField(term84047, term84047.getClass(), "day", (short) 12);
        setField(term84046, term84046.getClass(), "date", term84047);
        setByteField(term84051, term84051.getClass(), "hour", (byte) 16);
        setByteField(term84051, term84051.getClass(), "minute", (byte) 39);
        setByteField(term84051, term84051.getClass(), "second", (byte) 57);
        setIntField(term84051, term84051.getClass(), "nano", 651756700);
        setField(term84046, term84046.getClass(), "time", term84051);
        setField(term84011, term84011.getClass(), "demoEnd", term84046);
        setIntField(term84057, term84057.getClass(), "year", 2024);
        setShortField(term84057, term84057.getClass(), "month", (short) 12);
        setShortField(term84057, term84057.getClass(), "day", (short) 11);
        setField(term84056, term84056.getClass(), "date", term84057);
        setByteField(term84061, term84061.getClass(), "hour", (byte) 19);
        setByteField(term84061, term84061.getClass(), "minute", (byte) 38);
        setByteField(term84061, term84061.getClass(), "second", (byte) 23);
        setIntField(term84061, term84061.getClass(), "nano", 207336939);
        setField(term84056, term84056.getClass(), "time", term84061);
        setField(term84011, term84011.getClass(), "playableStart", term84056);
        setIntField(term84067, term84067.getClass(), "year", 2023);
        setShortField(term84067, term84067.getClass(), "month", (short) 3);
        setShortField(term84067, term84067.getClass(), "day", (short) 29);
        setField(term84066, term84066.getClass(), "date", term84067);
        setByteField(term84071, term84071.getClass(), "hour", (byte) 12);
        setByteField(term84071, term84071.getClass(), "minute", (byte) 11);
        setByteField(term84071, term84071.getClass(), "second", (byte) 3);
        setIntField(term84071, term84071.getClass(), "nano", 876063258);
        setField(term84066, term84066.getClass(), "time", term84071);
        setField(term84011, term84011.getClass(), "playableEnd", term84066);
        term84076 = new Integer(1064185088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term84076;
        callMethod(klass, "setVersion", argTypes, term84011, args);
    }

};


