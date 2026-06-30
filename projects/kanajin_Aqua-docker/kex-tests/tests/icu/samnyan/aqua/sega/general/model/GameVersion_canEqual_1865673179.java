package icu.samnyan.aqua.sega.general.model;

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
import static icu.samnyan.aqua.sega.general.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameVersion_canEqual_1865673179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201;
     Object term1248;

    public GameVersion_canEqual_1865673179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1201 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion"));
        Object term1238 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1239 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1243 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1201, term1201.getClass(), "uuid", "BndsHwAFMv");
        setField(term1201, term1201.getClass(), "romVersion", "GzFkzHGYFt");
        setField(term1201, term1201.getClass(), "dataVersion", "tShwQLRGNe");
        setIntField(term1239, term1239.getClass(), "year", 2019);
        setShortField(term1239, term1239.getClass(), "month", (short) 2);
        setShortField(term1239, term1239.getClass(), "day", (short) 21);
        setField(term1238, term1238.getClass(), "date", term1239);
        setByteField(term1243, term1243.getClass(), "hour", (byte) 5);
        setByteField(term1243, term1243.getClass(), "minute", (byte) 41);
        setByteField(term1243, term1243.getClass(), "second", (byte) 11);
        setIntField(term1243, term1243.getClass(), "nano", 859829782);
        setField(term1238, term1238.getClass(), "time", term1243);
        setField(term1201, term1201.getClass(), "lastTime", term1238);
        term1248 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1248;
        callMethod(klass, "canEqual", argTypes, term1201, args);
    }

};


