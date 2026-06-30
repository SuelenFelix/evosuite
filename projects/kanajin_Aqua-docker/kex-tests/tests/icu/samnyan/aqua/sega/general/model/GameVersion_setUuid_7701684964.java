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

public class GameVersion_setUuid_7701684964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term739;

    public GameVersion_setUuid_7701684964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term739 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion"));
        Object term776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term781 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term739, term739.getClass(), "uuid", "flxyYxBRtu");
        setField(term739, term739.getClass(), "romVersion", "OclPbYPkcH");
        setField(term739, term739.getClass(), "dataVersion", "IoAlmYsBwc");
        setIntField(term777, term777.getClass(), "year", 2022);
        setShortField(term777, term777.getClass(), "month", (short) 2);
        setShortField(term777, term777.getClass(), "day", (short) 26);
        setField(term776, term776.getClass(), "date", term777);
        setByteField(term781, term781.getClass(), "hour", (byte) 11);
        setByteField(term781, term781.getClass(), "minute", (byte) 42);
        setByteField(term781, term781.getClass(), "second", (byte) 15);
        setIntField(term781, term781.getClass(), "nano", 377731937);
        setField(term776, term776.getClass(), "time", term781);
        setField(term739, term739.getClass(), "lastTime", term776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        callMethod(klass, "setUuid", argTypes, term739, args);
    }

};


