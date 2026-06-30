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
import java.lang.Integer;

public class DivaModule_setId_3242355727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30038;
     Object term30074;

    public DivaModule_setId_3242355727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30038 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term30053 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30054 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30058 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30063 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30064 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30068 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30038, term30038.getClass(), "id", -865722613);
        setField(term30038, term30038.getClass(), "name", "YNVbzJpOdk");
        setIntField(term30038, term30038.getClass(), "price", -1551355284);
        setIntField(term30054, term30054.getClass(), "year", 2025);
        setShortField(term30054, term30054.getClass(), "month", (short) 3);
        setShortField(term30054, term30054.getClass(), "day", (short) 28);
        setField(term30053, term30053.getClass(), "date", term30054);
        setByteField(term30058, term30058.getClass(), "hour", (byte) 19);
        setByteField(term30058, term30058.getClass(), "minute", (byte) 56);
        setByteField(term30058, term30058.getClass(), "second", (byte) 52);
        setIntField(term30058, term30058.getClass(), "nano", 738558930);
        setField(term30053, term30053.getClass(), "time", term30058);
        setField(term30038, term30038.getClass(), "releaseDate", term30053);
        setIntField(term30064, term30064.getClass(), "year", 2024);
        setShortField(term30064, term30064.getClass(), "month", (short) 2);
        setShortField(term30064, term30064.getClass(), "day", (short) 29);
        setField(term30063, term30063.getClass(), "date", term30064);
        setByteField(term30068, term30068.getClass(), "hour", (byte) 17);
        setByteField(term30068, term30068.getClass(), "minute", (byte) 54);
        setByteField(term30068, term30068.getClass(), "second", (byte) 21);
        setIntField(term30068, term30068.getClass(), "nano", 605973408);
        setField(term30063, term30063.getClass(), "time", term30068);
        setField(term30038, term30038.getClass(), "endDate", term30063);
        setIntField(term30038, term30038.getClass(), "sortOrder", -1381970335);
        term30074 = new Integer(1213549815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30074;
        callMethod(klass, "setId", argTypes, term30038, args);
    }

};


