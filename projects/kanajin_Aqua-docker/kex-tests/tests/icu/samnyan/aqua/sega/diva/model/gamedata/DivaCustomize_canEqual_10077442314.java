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

public class DivaCustomize_canEqual_10077442314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29449;
     Object term29485;

    public DivaCustomize_canEqual_10077442314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29449 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term29464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29469 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29479 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29449, term29449.getClass(), "id", -1005024758);
        setField(term29449, term29449.getClass(), "name", "lohegbXyjA");
        setIntField(term29449, term29449.getClass(), "price", 2634669);
        setIntField(term29465, term29465.getClass(), "year", 2010);
        setShortField(term29465, term29465.getClass(), "month", (short) 1);
        setShortField(term29465, term29465.getClass(), "day", (short) 17);
        setField(term29464, term29464.getClass(), "date", term29465);
        setByteField(term29469, term29469.getClass(), "hour", (byte) 13);
        setByteField(term29469, term29469.getClass(), "minute", (byte) 5);
        setByteField(term29469, term29469.getClass(), "second", (byte) 51);
        setIntField(term29469, term29469.getClass(), "nano", 362260580);
        setField(term29464, term29464.getClass(), "time", term29469);
        setField(term29449, term29449.getClass(), "releaseDate", term29464);
        setIntField(term29475, term29475.getClass(), "year", 2010);
        setShortField(term29475, term29475.getClass(), "month", (short) 9);
        setShortField(term29475, term29475.getClass(), "day", (short) 28);
        setField(term29474, term29474.getClass(), "date", term29475);
        setByteField(term29479, term29479.getClass(), "hour", (byte) 6);
        setByteField(term29479, term29479.getClass(), "minute", (byte) 4);
        setByteField(term29479, term29479.getClass(), "second", (byte) 54);
        setIntField(term29479, term29479.getClass(), "nano", 604713782);
        setField(term29474, term29474.getClass(), "time", term29479);
        setField(term29449, term29449.getClass(), "endDate", term29474);
        setIntField(term29449, term29449.getClass(), "sortOrder", -1912429941);
        term29485 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29485;
        callMethod(klass, "canEqual", argTypes, term29449, args);
    }

};


