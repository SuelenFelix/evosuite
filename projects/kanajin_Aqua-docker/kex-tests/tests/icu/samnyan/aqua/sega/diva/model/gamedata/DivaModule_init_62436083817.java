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
import java.lang.Integer;
import java.lang.Object;

public class DivaModule_init_62436083817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30548;
     Object term30562;
     Object term30564;
     Object term30574;
     Object term30584;

    public DivaModule_init_62436083817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30548 = new Integer(-314165467);
        term30562 = new Integer(963694071);
        term30564 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30565 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30569 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30565, term30565.getClass(), "year", 2011);
        setShortField(term30565, term30565.getClass(), "month", (short) 4);
        setShortField(term30565, term30565.getClass(), "day", (short) 19);
        setField(term30564, term30564.getClass(), "date", term30565);
        setByteField(term30569, term30569.getClass(), "hour", (byte) 12);
        setByteField(term30569, term30569.getClass(), "minute", (byte) 0);
        setByteField(term30569, term30569.getClass(), "second", (byte) 14);
        setIntField(term30569, term30569.getClass(), "nano", 849079063);
        setField(term30564, term30564.getClass(), "time", term30569);
        term30574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30579 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30575, term30575.getClass(), "year", 2014);
        setShortField(term30575, term30575.getClass(), "month", (short) 8);
        setShortField(term30575, term30575.getClass(), "day", (short) 17);
        setField(term30574, term30574.getClass(), "date", term30575);
        setByteField(term30579, term30579.getClass(), "hour", (byte) 19);
        setByteField(term30579, term30579.getClass(), "minute", (byte) 32);
        setByteField(term30579, term30579.getClass(), "second", (byte) 5);
        setIntField(term30579, term30579.getClass(), "nano", 604713831);
        setField(term30574, term30574.getClass(), "time", term30579);
        term30584 = new Integer(-995785731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term30548;
        args[1] = "jcrJhyEbDI";
        args[2] = term30562;
        args[3] = term30564;
        args[4] = term30574;
        args[5] = term30584;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


