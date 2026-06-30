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

public class GameVersion_setRomVersion_17089263975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term838;

    public GameVersion_setRomVersion_17089263975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term838 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion"));
        Object term875 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term876 = newInstance(Class.forName("java.time.LocalDate"));
        Object term880 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term838, term838.getClass(), "uuid", "OWDIEULEFu");
        setField(term838, term838.getClass(), "romVersion", "dWRymuLBtr");
        setField(term838, term838.getClass(), "dataVersion", "AijpHYOFuy");
        setIntField(term876, term876.getClass(), "year", 2026);
        setShortField(term876, term876.getClass(), "month", (short) 12);
        setShortField(term876, term876.getClass(), "day", (short) 14);
        setField(term875, term875.getClass(), "date", term876);
        setByteField(term880, term880.getClass(), "hour", (byte) 16);
        setByteField(term880, term880.getClass(), "minute", (byte) 34);
        setByteField(term880, term880.getClass(), "second", (byte) 9);
        setIntField(term880, term880.getClass(), "nano", 518326996);
        setField(term875, term875.getClass(), "time", term880);
        setField(term838, term838.getClass(), "lastTime", term875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SbAoxhfrkn";
        callMethod(klass, "setRomVersion", argTypes, term838, args);
    }

};


