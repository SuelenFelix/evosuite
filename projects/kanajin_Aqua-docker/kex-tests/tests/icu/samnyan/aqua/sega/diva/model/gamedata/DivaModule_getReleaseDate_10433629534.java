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

public class DivaModule_getReleaseDate_10433629534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29900;

    public DivaModule_getReleaseDate_10433629534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29900 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term29915 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29916 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29920 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29925 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29926 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29930 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29900, term29900.getClass(), "id", 1787325291);
        setField(term29900, term29900.getClass(), "name", "oNGVAyjCob");
        setIntField(term29900, term29900.getClass(), "price", 1470349147);
        setIntField(term29916, term29916.getClass(), "year", 2011);
        setShortField(term29916, term29916.getClass(), "month", (short) 6);
        setShortField(term29916, term29916.getClass(), "day", (short) 26);
        setField(term29915, term29915.getClass(), "date", term29916);
        setByteField(term29920, term29920.getClass(), "hour", (byte) 22);
        setByteField(term29920, term29920.getClass(), "minute", (byte) 39);
        setByteField(term29920, term29920.getClass(), "second", (byte) 11);
        setIntField(term29920, term29920.getClass(), "nano", 686293604);
        setField(term29915, term29915.getClass(), "time", term29920);
        setField(term29900, term29900.getClass(), "releaseDate", term29915);
        setIntField(term29926, term29926.getClass(), "year", 2012);
        setShortField(term29926, term29926.getClass(), "month", (short) 7);
        setShortField(term29926, term29926.getClass(), "day", (short) 21);
        setField(term29925, term29925.getClass(), "date", term29926);
        setByteField(term29930, term29930.getClass(), "hour", (byte) 13);
        setByteField(term29930, term29930.getClass(), "minute", (byte) 41);
        setByteField(term29930, term29930.getClass(), "second", (byte) 44);
        setIntField(term29930, term29930.getClass(), "nano", 394467282);
        setField(term29925, term29925.getClass(), "time", term29930);
        setField(term29900, term29900.getClass(), "endDate", term29925);
        setIntField(term29900, term29900.getClass(), "sortOrder", -255317272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseDate", argTypes, term29900, args);
    }

};


