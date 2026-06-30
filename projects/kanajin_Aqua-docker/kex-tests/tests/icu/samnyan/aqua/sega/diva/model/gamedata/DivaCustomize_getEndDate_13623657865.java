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

public class DivaCustomize_getEndDate_13623657865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28986;

    public DivaCustomize_getEndDate_13623657865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28986 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term29001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29006 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29016 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28986, term28986.getClass(), "id", 1200440315);
        setField(term28986, term28986.getClass(), "name", "COsGswsrtI");
        setIntField(term28986, term28986.getClass(), "price", 40571662);
        setIntField(term29002, term29002.getClass(), "year", 2015);
        setShortField(term29002, term29002.getClass(), "month", (short) 9);
        setShortField(term29002, term29002.getClass(), "day", (short) 16);
        setField(term29001, term29001.getClass(), "date", term29002);
        setByteField(term29006, term29006.getClass(), "hour", (byte) 6);
        setByteField(term29006, term29006.getClass(), "minute", (byte) 19);
        setByteField(term29006, term29006.getClass(), "second", (byte) 42);
        setIntField(term29006, term29006.getClass(), "nano", 630084975);
        setField(term29001, term29001.getClass(), "time", term29006);
        setField(term28986, term28986.getClass(), "releaseDate", term29001);
        setIntField(term29012, term29012.getClass(), "year", 2029);
        setShortField(term29012, term29012.getClass(), "month", (short) 6);
        setShortField(term29012, term29012.getClass(), "day", (short) 23);
        setField(term29011, term29011.getClass(), "date", term29012);
        setByteField(term29016, term29016.getClass(), "hour", (byte) 21);
        setByteField(term29016, term29016.getClass(), "minute", (byte) 55);
        setByteField(term29016, term29016.getClass(), "second", (byte) 27);
        setIntField(term29016, term29016.getClass(), "nano", 66889274);
        setField(term29011, term29011.getClass(), "time", term29016);
        setField(term28986, term28986.getClass(), "endDate", term29011);
        setIntField(term28986, term28986.getClass(), "sortOrder", 1863910269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term28986, args);
    }

};


