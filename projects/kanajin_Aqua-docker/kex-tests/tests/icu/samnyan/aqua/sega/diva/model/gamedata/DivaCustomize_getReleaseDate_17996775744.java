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

public class DivaCustomize_getReleaseDate_17996775744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28940;

    public DivaCustomize_getReleaseDate_17996775744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28940 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term28955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28960 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28970 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28940, term28940.getClass(), "id", -1220630391);
        setField(term28940, term28940.getClass(), "name", "yjmUdvwSdd");
        setIntField(term28940, term28940.getClass(), "price", -995822131);
        setIntField(term28956, term28956.getClass(), "year", 2012);
        setShortField(term28956, term28956.getClass(), "month", (short) 2);
        setShortField(term28956, term28956.getClass(), "day", (short) 19);
        setField(term28955, term28955.getClass(), "date", term28956);
        setByteField(term28960, term28960.getClass(), "hour", (byte) 8);
        setByteField(term28960, term28960.getClass(), "minute", (byte) 4);
        setByteField(term28960, term28960.getClass(), "second", (byte) 43);
        setIntField(term28960, term28960.getClass(), "nano", 114930008);
        setField(term28955, term28955.getClass(), "time", term28960);
        setField(term28940, term28940.getClass(), "releaseDate", term28955);
        setIntField(term28966, term28966.getClass(), "year", 2017);
        setShortField(term28966, term28966.getClass(), "month", (short) 6);
        setShortField(term28966, term28966.getClass(), "day", (short) 8);
        setField(term28965, term28965.getClass(), "date", term28966);
        setByteField(term28970, term28970.getClass(), "hour", (byte) 0);
        setByteField(term28970, term28970.getClass(), "minute", (byte) 18);
        setByteField(term28970, term28970.getClass(), "second", (byte) 55);
        setIntField(term28970, term28970.getClass(), "nano", 680586717);
        setField(term28965, term28965.getClass(), "time", term28970);
        setField(term28940, term28940.getClass(), "endDate", term28965);
        setIntField(term28940, term28940.getClass(), "sortOrder", -687282231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseDate", argTypes, term28940, args);
    }

};


