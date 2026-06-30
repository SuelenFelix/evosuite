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

public class DivaModule_setReleaseDate_65286545710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30202;
     Object term30238;

    public DivaModule_setReleaseDate_65286545710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30202 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term30217 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30218 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30222 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30232 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30202, term30202.getClass(), "id", 1543696412);
        setField(term30202, term30202.getClass(), "name", "InNyZMCrst");
        setIntField(term30202, term30202.getClass(), "price", -1385748168);
        setIntField(term30218, term30218.getClass(), "year", 2028);
        setShortField(term30218, term30218.getClass(), "month", (short) 1);
        setShortField(term30218, term30218.getClass(), "day", (short) 18);
        setField(term30217, term30217.getClass(), "date", term30218);
        setByteField(term30222, term30222.getClass(), "hour", (byte) 12);
        setByteField(term30222, term30222.getClass(), "minute", (byte) 4);
        setByteField(term30222, term30222.getClass(), "second", (byte) 39);
        setIntField(term30222, term30222.getClass(), "nano", 651287093);
        setField(term30217, term30217.getClass(), "time", term30222);
        setField(term30202, term30202.getClass(), "releaseDate", term30217);
        setIntField(term30228, term30228.getClass(), "year", 2027);
        setShortField(term30228, term30228.getClass(), "month", (short) 7);
        setShortField(term30228, term30228.getClass(), "day", (short) 23);
        setField(term30227, term30227.getClass(), "date", term30228);
        setByteField(term30232, term30232.getClass(), "hour", (byte) 12);
        setByteField(term30232, term30232.getClass(), "minute", (byte) 6);
        setByteField(term30232, term30232.getClass(), "second", (byte) 19);
        setIntField(term30232, term30232.getClass(), "nano", 8025683);
        setField(term30227, term30227.getClass(), "time", term30232);
        setField(term30202, term30202.getClass(), "endDate", term30227);
        setIntField(term30202, term30202.getClass(), "sortOrder", -270592367);
        term30238 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30239 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30243 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30239, term30239.getClass(), "year", 2018);
        setShortField(term30239, term30239.getClass(), "month", (short) 2);
        setShortField(term30239, term30239.getClass(), "day", (short) 14);
        setField(term30238, term30238.getClass(), "date", term30239);
        setByteField(term30243, term30243.getClass(), "hour", (byte) 2);
        setByteField(term30243, term30243.getClass(), "minute", (byte) 40);
        setByteField(term30243, term30243.getClass(), "second", (byte) 48);
        setIntField(term30243, term30243.getClass(), "nano", 371006728);
        setField(term30238, term30238.getClass(), "time", term30243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term30238;
        callMethod(klass, "setReleaseDate", argTypes, term30202, args);
    }

};


