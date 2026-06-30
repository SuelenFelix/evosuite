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

public class DivaModule_canEqual_85708904414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30409;
     Object term30445;

    public DivaModule_canEqual_85708904414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30409 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term30424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30429 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30439 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30409, term30409.getClass(), "id", 1414025609);
        setField(term30409, term30409.getClass(), "name", "ImSBmTIdsP");
        setIntField(term30409, term30409.getClass(), "price", 255145822);
        setIntField(term30425, term30425.getClass(), "year", 2010);
        setShortField(term30425, term30425.getClass(), "month", (short) 2);
        setShortField(term30425, term30425.getClass(), "day", (short) 24);
        setField(term30424, term30424.getClass(), "date", term30425);
        setByteField(term30429, term30429.getClass(), "hour", (byte) 17);
        setByteField(term30429, term30429.getClass(), "minute", (byte) 58);
        setByteField(term30429, term30429.getClass(), "second", (byte) 56);
        setIntField(term30429, term30429.getClass(), "nano", 291725532);
        setField(term30424, term30424.getClass(), "time", term30429);
        setField(term30409, term30409.getClass(), "releaseDate", term30424);
        setIntField(term30435, term30435.getClass(), "year", 2028);
        setShortField(term30435, term30435.getClass(), "month", (short) 7);
        setShortField(term30435, term30435.getClass(), "day", (short) 22);
        setField(term30434, term30434.getClass(), "date", term30435);
        setByteField(term30439, term30439.getClass(), "hour", (byte) 18);
        setByteField(term30439, term30439.getClass(), "minute", (byte) 33);
        setByteField(term30439, term30439.getClass(), "second", (byte) 7);
        setIntField(term30439, term30439.getClass(), "nano", 763613074);
        setField(term30434, term30434.getClass(), "time", term30439);
        setField(term30409, term30409.getClass(), "endDate", term30434);
        setIntField(term30409, term30409.getClass(), "sortOrder", -573608449);
        term30445 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30445;
        callMethod(klass, "canEqual", argTypes, term30409, args);
    }

};


