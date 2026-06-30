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

public class GameVersion_getRomVersion_11363197711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508;

    public GameVersion_getRomVersion_11363197711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term508 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion"));
        Object term545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term550 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term508, term508.getClass(), "uuid", "tbcdzjIfER");
        setField(term508, term508.getClass(), "romVersion", "HyxfbSQYBe");
        setField(term508, term508.getClass(), "dataVersion", "pCTimMblYc");
        setIntField(term546, term546.getClass(), "year", 2021);
        setShortField(term546, term546.getClass(), "month", (short) 1);
        setShortField(term546, term546.getClass(), "day", (short) 18);
        setField(term545, term545.getClass(), "date", term546);
        setByteField(term550, term550.getClass(), "hour", (byte) 13);
        setByteField(term550, term550.getClass(), "minute", (byte) 38);
        setByteField(term550, term550.getClass(), "second", (byte) 26);
        setIntField(term550, term550.getClass(), "nano", 544608644);
        setField(term545, term545.getClass(), "time", term550);
        setField(term508, term508.getClass(), "lastTime", term545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRomVersion", argTypes, term508, args);
    }

};


