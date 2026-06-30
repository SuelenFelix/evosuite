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

public class GameVersion_init_8215462012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1469;

    public GameVersion_init_8215462012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1469 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1474 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1470, term1470.getClass(), "year", 2021);
        setShortField(term1470, term1470.getClass(), "month", (short) 9);
        setShortField(term1470, term1470.getClass(), "day", (short) 7);
        setField(term1469, term1469.getClass(), "date", term1470);
        setByteField(term1474, term1474.getClass(), "hour", (byte) 5);
        setByteField(term1474, term1474.getClass(), "minute", (byte) 25);
        setByteField(term1474, term1474.getClass(), "second", (byte) 7);
        setIntField(term1474, term1474.getClass(), "nano", 755924076);
        setField(term1469, term1469.getClass(), "time", term1474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[4];
        args[0] = "JDswTTCZHV";
        args[1] = "onpbIeEKoi";
        args[2] = "YRHGsAkhxb";
        args[3] = term1469;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


