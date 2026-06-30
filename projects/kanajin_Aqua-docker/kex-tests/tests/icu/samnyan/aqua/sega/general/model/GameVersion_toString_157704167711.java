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

public class GameVersion_toString_157704167711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1356;

    public GameVersion_toString_157704167711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1356 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion"));
        Object term1393 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1394 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1398 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1356, term1356.getClass(), "uuid", "nGKItKLYNC");
        setField(term1356, term1356.getClass(), "romVersion", "UiUYnPrcCi");
        setField(term1356, term1356.getClass(), "dataVersion", "UoYtihxVaS");
        setIntField(term1394, term1394.getClass(), "year", 2012);
        setShortField(term1394, term1394.getClass(), "month", (short) 9);
        setShortField(term1394, term1394.getClass(), "day", (short) 11);
        setField(term1393, term1393.getClass(), "date", term1394);
        setByteField(term1398, term1398.getClass(), "hour", (byte) 22);
        setByteField(term1398, term1398.getClass(), "minute", (byte) 10);
        setByteField(term1398, term1398.getClass(), "second", (byte) 8);
        setIntField(term1398, term1398.getClass(), "nano", 380008862);
        setField(term1393, term1393.getClass(), "time", term1398);
        setField(term1356, term1356.getClass(), "lastTime", term1393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1356, args);
    }

};


