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

public class GameVersion_hashCode_106628198710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1279;

    public GameVersion_hashCode_106628198710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1279 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion"));
        Object term1316 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1321 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1279, term1279.getClass(), "uuid", "LvtrsXUliU");
        setField(term1279, term1279.getClass(), "romVersion", "xLbjWUgOIL");
        setField(term1279, term1279.getClass(), "dataVersion", "jDtqGUpnZN");
        setIntField(term1317, term1317.getClass(), "year", 2018);
        setShortField(term1317, term1317.getClass(), "month", (short) 9);
        setShortField(term1317, term1317.getClass(), "day", (short) 28);
        setField(term1316, term1316.getClass(), "date", term1317);
        setByteField(term1321, term1321.getClass(), "hour", (byte) 3);
        setByteField(term1321, term1321.getClass(), "minute", (byte) 37);
        setByteField(term1321, term1321.getClass(), "second", (byte) 46);
        setIntField(term1321, term1321.getClass(), "nano", 763326845);
        setField(term1316, term1316.getClass(), "time", term1321);
        setField(term1279, term1279.getClass(), "lastTime", term1316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1279, args);
    }

};


