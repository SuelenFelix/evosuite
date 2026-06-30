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

public class GameVersion_equals_6175953128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1123;
     Object term1170;

    public GameVersion_equals_6175953128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1123 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion"));
        Object term1160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1165 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1123, term1123.getClass(), "uuid", "UlajhuVLaP");
        setField(term1123, term1123.getClass(), "romVersion", "gGSMzuGICf");
        setField(term1123, term1123.getClass(), "dataVersion", "hxCBltsObl");
        setIntField(term1161, term1161.getClass(), "year", 2022);
        setShortField(term1161, term1161.getClass(), "month", (short) 11);
        setShortField(term1161, term1161.getClass(), "day", (short) 16);
        setField(term1160, term1160.getClass(), "date", term1161);
        setByteField(term1165, term1165.getClass(), "hour", (byte) 15);
        setByteField(term1165, term1165.getClass(), "minute", (byte) 54);
        setByteField(term1165, term1165.getClass(), "second", (byte) 2);
        setIntField(term1165, term1165.getClass(), "nano", 733274103);
        setField(term1160, term1160.getClass(), "time", term1165);
        setField(term1123, term1123.getClass(), "lastTime", term1160);
        term1170 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1170;
        callMethod(klass, "equals", argTypes, term1123, args);
    }

};


