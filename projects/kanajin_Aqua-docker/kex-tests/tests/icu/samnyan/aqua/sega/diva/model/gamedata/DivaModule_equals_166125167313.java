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

public class DivaModule_equals_166125167313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30362;
     Object term30398;

    public DivaModule_equals_166125167313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30362 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term30377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30382 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30387 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30388 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30392 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30362, term30362.getClass(), "id", 1532723756);
        setField(term30362, term30362.getClass(), "name", "adNbqunmox");
        setIntField(term30362, term30362.getClass(), "price", -124088550);
        setIntField(term30378, term30378.getClass(), "year", 2022);
        setShortField(term30378, term30378.getClass(), "month", (short) 11);
        setShortField(term30378, term30378.getClass(), "day", (short) 10);
        setField(term30377, term30377.getClass(), "date", term30378);
        setByteField(term30382, term30382.getClass(), "hour", (byte) 20);
        setByteField(term30382, term30382.getClass(), "minute", (byte) 8);
        setByteField(term30382, term30382.getClass(), "second", (byte) 35);
        setIntField(term30382, term30382.getClass(), "nano", 658416570);
        setField(term30377, term30377.getClass(), "time", term30382);
        setField(term30362, term30362.getClass(), "releaseDate", term30377);
        setIntField(term30388, term30388.getClass(), "year", 2018);
        setShortField(term30388, term30388.getClass(), "month", (short) 11);
        setShortField(term30388, term30388.getClass(), "day", (short) 9);
        setField(term30387, term30387.getClass(), "date", term30388);
        setByteField(term30392, term30392.getClass(), "hour", (byte) 6);
        setByteField(term30392, term30392.getClass(), "minute", (byte) 8);
        setByteField(term30392, term30392.getClass(), "second", (byte) 32);
        setIntField(term30392, term30392.getClass(), "nano", 750733310);
        setField(term30387, term30387.getClass(), "time", term30392);
        setField(term30362, term30362.getClass(), "endDate", term30387);
        setIntField(term30362, term30362.getClass(), "sortOrder", 777492093);
        term30398 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30398;
        callMethod(klass, "equals", argTypes, term30362, args);
    }

};


