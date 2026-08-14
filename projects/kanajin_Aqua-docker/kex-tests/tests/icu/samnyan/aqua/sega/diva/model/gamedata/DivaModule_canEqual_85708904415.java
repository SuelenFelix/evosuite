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
import java.lang.Object;

public class DivaModule_canEqual_85708904415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2207539;
     Object term2207575;

    public DivaModule_canEqual_85708904415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2207539 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term2207554 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2207555 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2207559 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2207564 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2207565 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2207569 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2207539, term2207539.getClass(), "id", -64963534);
        setField(term2207539, term2207539.getClass(), "name", "WAoPtHVKlD");
        setIntField(term2207539, term2207539.getClass(), "price", 315475593);
        setIntField(term2207555, term2207555.getClass(), "year", 2022);
        setShortField(term2207555, term2207555.getClass(), "month", (short) 1);
        setShortField(term2207555, term2207555.getClass(), "day", (short) 25);
        setField(term2207554, term2207554.getClass(), "date", term2207555);
        setByteField(term2207559, term2207559.getClass(), "hour", (byte) 8);
        setByteField(term2207559, term2207559.getClass(), "minute", (byte) 25);
        setByteField(term2207559, term2207559.getClass(), "second", (byte) 56);
        setIntField(term2207559, term2207559.getClass(), "nano", 945626598);
        setField(term2207554, term2207554.getClass(), "time", term2207559);
        setField(term2207539, term2207539.getClass(), "releaseDate", term2207554);
        setIntField(term2207565, term2207565.getClass(), "year", 2024);
        setShortField(term2207565, term2207565.getClass(), "month", (short) 7);
        setShortField(term2207565, term2207565.getClass(), "day", (short) 19);
        setField(term2207564, term2207564.getClass(), "date", term2207565);
        setByteField(term2207569, term2207569.getClass(), "hour", (byte) 2);
        setByteField(term2207569, term2207569.getClass(), "minute", (byte) 14);
        setByteField(term2207569, term2207569.getClass(), "second", (byte) 35);
        setIntField(term2207569, term2207569.getClass(), "nano", 30067823);
        setField(term2207564, term2207564.getClass(), "time", term2207569);
        setField(term2207539, term2207539.getClass(), "endDate", term2207564);
        setIntField(term2207539, term2207539.getClass(), "sortOrder", -1971255834);
        term2207575 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2207575;
        callMethod(klass, "canEqual", argTypes, term2207539, args);
    }

};


