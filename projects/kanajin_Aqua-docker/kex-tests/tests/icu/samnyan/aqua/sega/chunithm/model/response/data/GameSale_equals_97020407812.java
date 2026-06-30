package icu.samnyan.aqua.sega.chunithm.model.response.data;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameSale_equals_97020407812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329;
     Object term354;

    public GameSale_equals_97020407812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term334 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term335 = newInstance(Class.forName("java.time.LocalDate"));
        Object term339 = newInstance(Class.forName("java.time.LocalTime"));
        Object term344 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term349 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term329, term329.getClass(), "orderId", -1786399638);
        setIntField(term329, term329.getClass(), "type", 2055867847);
        setIntField(term329, term329.getClass(), "id", -1048298087);
        setIntField(term329, term329.getClass(), "rate", 292681826);
        setIntField(term335, term335.getClass(), "year", 2028);
        setShortField(term335, term335.getClass(), "month", (short) 10);
        setShortField(term335, term335.getClass(), "day", (short) 1);
        setField(term334, term334.getClass(), "date", term335);
        setByteField(term339, term339.getClass(), "hour", (byte) 17);
        setByteField(term339, term339.getClass(), "minute", (byte) 29);
        setByteField(term339, term339.getClass(), "second", (byte) 30);
        setIntField(term339, term339.getClass(), "nano", 845472306);
        setField(term334, term334.getClass(), "time", term339);
        setField(term329, term329.getClass(), "startDate", term334);
        setIntField(term345, term345.getClass(), "year", 2027);
        setShortField(term345, term345.getClass(), "month", (short) 2);
        setShortField(term345, term345.getClass(), "day", (short) 19);
        setField(term344, term344.getClass(), "date", term345);
        setByteField(term349, term349.getClass(), "hour", (byte) 17);
        setByteField(term349, term349.getClass(), "minute", (byte) 37);
        setByteField(term349, term349.getClass(), "second", (byte) 27);
        setIntField(term349, term349.getClass(), "nano", 920380537);
        setField(term344, term344.getClass(), "time", term349);
        setField(term329, term329.getClass(), "endDate", term344);
        term354 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term354;
        callMethod(klass, "equals", argTypes, term329, args);
    }

};


