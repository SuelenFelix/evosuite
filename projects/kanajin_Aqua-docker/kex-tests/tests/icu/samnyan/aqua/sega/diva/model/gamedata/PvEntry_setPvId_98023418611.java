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

public class PvEntry_setPvId_98023418611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82501;
     Object term82569;

    public PvEntry_setPvId_98023418611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82572 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term82571 = ((Class) term82572).getDeclaredField((String) "UNDEFINED");
        ((Field) term82571).setAccessible(true);
        Object enum182 = ((Field) term82571).get((Object) null);
        Class<? extends Object> term82856 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term82855 = ((Class) term82856).getDeclaredField((String) "EXTRA");
        ((Field) term82855).setAccessible(true);
        Object enum183 = ((Field) term82855).get((Object) null);
        term82501 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term82529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82534 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82539 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82540 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82544 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82549 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82550 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82554 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82559 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82564 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term82501, term82501.getClass(), "id", 6130232388739280211L);
        setIntField(term82501, term82501.getClass(), "pvId", 1498738343);
        setField(term82501, term82501.getClass(), "difficulty", enum182);
        setIntField(term82501, term82501.getClass(), "version", -1635571857);
        setField(term82501, term82501.getClass(), "edition", enum183);
        setIntField(term82530, term82530.getClass(), "year", 2028);
        setShortField(term82530, term82530.getClass(), "month", (short) 12);
        setShortField(term82530, term82530.getClass(), "day", (short) 2);
        setField(term82529, term82529.getClass(), "date", term82530);
        setByteField(term82534, term82534.getClass(), "hour", (byte) 18);
        setByteField(term82534, term82534.getClass(), "minute", (byte) 6);
        setByteField(term82534, term82534.getClass(), "second", (byte) 45);
        setIntField(term82534, term82534.getClass(), "nano", 967474945);
        setField(term82529, term82529.getClass(), "time", term82534);
        setField(term82501, term82501.getClass(), "demoStart", term82529);
        setIntField(term82540, term82540.getClass(), "year", 2018);
        setShortField(term82540, term82540.getClass(), "month", (short) 11);
        setShortField(term82540, term82540.getClass(), "day", (short) 11);
        setField(term82539, term82539.getClass(), "date", term82540);
        setByteField(term82544, term82544.getClass(), "hour", (byte) 11);
        setByteField(term82544, term82544.getClass(), "minute", (byte) 30);
        setByteField(term82544, term82544.getClass(), "second", (byte) 33);
        setIntField(term82544, term82544.getClass(), "nano", 101261443);
        setField(term82539, term82539.getClass(), "time", term82544);
        setField(term82501, term82501.getClass(), "demoEnd", term82539);
        setIntField(term82550, term82550.getClass(), "year", 2020);
        setShortField(term82550, term82550.getClass(), "month", (short) 1);
        setShortField(term82550, term82550.getClass(), "day", (short) 23);
        setField(term82549, term82549.getClass(), "date", term82550);
        setByteField(term82554, term82554.getClass(), "hour", (byte) 17);
        setByteField(term82554, term82554.getClass(), "minute", (byte) 24);
        setByteField(term82554, term82554.getClass(), "second", (byte) 54);
        setIntField(term82554, term82554.getClass(), "nano", 261767355);
        setField(term82549, term82549.getClass(), "time", term82554);
        setField(term82501, term82501.getClass(), "playableStart", term82549);
        setIntField(term82560, term82560.getClass(), "year", 2011);
        setShortField(term82560, term82560.getClass(), "month", (short) 1);
        setShortField(term82560, term82560.getClass(), "day", (short) 20);
        setField(term82559, term82559.getClass(), "date", term82560);
        setByteField(term82564, term82564.getClass(), "hour", (byte) 5);
        setByteField(term82564, term82564.getClass(), "minute", (byte) 23);
        setByteField(term82564, term82564.getClass(), "second", (byte) 54);
        setIntField(term82564, term82564.getClass(), "nano", 4207750);
        setField(term82559, term82559.getClass(), "time", term82564);
        setField(term82501, term82501.getClass(), "playableEnd", term82559);
        term82569 = new Integer(1407309162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82569;
        callMethod(klass, "setPvId", argTypes, term82501, args);
    }

};


