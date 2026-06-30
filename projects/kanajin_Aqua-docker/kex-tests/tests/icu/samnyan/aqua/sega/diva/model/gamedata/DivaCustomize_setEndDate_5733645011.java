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
import java.lang.Object;

public class DivaCustomize_setEndDate_5733645011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29298;
     Object term29334;

    public DivaCustomize_setEndDate_5733645011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29298 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term29313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29314 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29318 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29328 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29298, term29298.getClass(), "id", -2072158633);
        setField(term29298, term29298.getClass(), "name", "YNXFGgstqj");
        setIntField(term29298, term29298.getClass(), "price", -355469363);
        setIntField(term29314, term29314.getClass(), "year", 2025);
        setShortField(term29314, term29314.getClass(), "month", (short) 11);
        setShortField(term29314, term29314.getClass(), "day", (short) 3);
        setField(term29313, term29313.getClass(), "date", term29314);
        setByteField(term29318, term29318.getClass(), "hour", (byte) 21);
        setByteField(term29318, term29318.getClass(), "minute", (byte) 24);
        setByteField(term29318, term29318.getClass(), "second", (byte) 23);
        setIntField(term29318, term29318.getClass(), "nano", 210986721);
        setField(term29313, term29313.getClass(), "time", term29318);
        setField(term29298, term29298.getClass(), "releaseDate", term29313);
        setIntField(term29324, term29324.getClass(), "year", 2016);
        setShortField(term29324, term29324.getClass(), "month", (short) 6);
        setShortField(term29324, term29324.getClass(), "day", (short) 15);
        setField(term29323, term29323.getClass(), "date", term29324);
        setByteField(term29328, term29328.getClass(), "hour", (byte) 21);
        setByteField(term29328, term29328.getClass(), "minute", (byte) 23);
        setByteField(term29328, term29328.getClass(), "second", (byte) 23);
        setIntField(term29328, term29328.getClass(), "nano", 433372070);
        setField(term29323, term29323.getClass(), "time", term29328);
        setField(term29298, term29298.getClass(), "endDate", term29323);
        setIntField(term29298, term29298.getClass(), "sortOrder", 1465188553);
        term29334 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29335 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29339 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29335, term29335.getClass(), "year", 2012);
        setShortField(term29335, term29335.getClass(), "month", (short) 8);
        setShortField(term29335, term29335.getClass(), "day", (short) 25);
        setField(term29334, term29334.getClass(), "date", term29335);
        setByteField(term29339, term29339.getClass(), "hour", (byte) 19);
        setByteField(term29339, term29339.getClass(), "minute", (byte) 49);
        setByteField(term29339, term29339.getClass(), "second", (byte) 8);
        setIntField(term29339, term29339.getClass(), "nano", 912685024);
        setField(term29334, term29334.getClass(), "time", term29339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term29334;
        callMethod(klass, "setEndDate", argTypes, term29298, args);
    }

};


