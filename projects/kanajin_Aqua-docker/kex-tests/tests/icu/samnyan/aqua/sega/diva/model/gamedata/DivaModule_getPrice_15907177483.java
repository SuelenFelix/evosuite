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

public class DivaModule_getPrice_15907177483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29854;

    public DivaModule_getPrice_15907177483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29854 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term29869 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29870 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29874 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29884 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29854, term29854.getClass(), "id", 1981860404);
        setField(term29854, term29854.getClass(), "name", "hlPKLObFBU");
        setIntField(term29854, term29854.getClass(), "price", 732174235);
        setIntField(term29870, term29870.getClass(), "year", 2024);
        setShortField(term29870, term29870.getClass(), "month", (short) 5);
        setShortField(term29870, term29870.getClass(), "day", (short) 6);
        setField(term29869, term29869.getClass(), "date", term29870);
        setByteField(term29874, term29874.getClass(), "hour", (byte) 20);
        setByteField(term29874, term29874.getClass(), "minute", (byte) 14);
        setByteField(term29874, term29874.getClass(), "second", (byte) 27);
        setIntField(term29874, term29874.getClass(), "nano", 900636101);
        setField(term29869, term29869.getClass(), "time", term29874);
        setField(term29854, term29854.getClass(), "releaseDate", term29869);
        setIntField(term29880, term29880.getClass(), "year", 2021);
        setShortField(term29880, term29880.getClass(), "month", (short) 4);
        setShortField(term29880, term29880.getClass(), "day", (short) 17);
        setField(term29879, term29879.getClass(), "date", term29880);
        setByteField(term29884, term29884.getClass(), "hour", (byte) 4);
        setByteField(term29884, term29884.getClass(), "minute", (byte) 11);
        setByteField(term29884, term29884.getClass(), "second", (byte) 16);
        setIntField(term29884, term29884.getClass(), "nano", 509895858);
        setField(term29879, term29879.getClass(), "time", term29884);
        setField(term29854, term29854.getClass(), "endDate", term29879);
        setIntField(term29854, term29854.getClass(), "sortOrder", 470895808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term29854, args);
    }

};


