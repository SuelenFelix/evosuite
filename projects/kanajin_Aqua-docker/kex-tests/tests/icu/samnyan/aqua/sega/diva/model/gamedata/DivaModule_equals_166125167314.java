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

public class DivaModule_equals_166125167314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2207492;
     Object term2207528;

    public DivaModule_equals_166125167314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2207492 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term2207507 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2207508 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2207512 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2207517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2207518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2207522 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2207492, term2207492.getClass(), "id", -1327273004);
        setField(term2207492, term2207492.getClass(), "name", "kpxqtqHoTt");
        setIntField(term2207492, term2207492.getClass(), "price", 403141431);
        setIntField(term2207508, term2207508.getClass(), "year", 2027);
        setShortField(term2207508, term2207508.getClass(), "month", (short) 10);
        setShortField(term2207508, term2207508.getClass(), "day", (short) 18);
        setField(term2207507, term2207507.getClass(), "date", term2207508);
        setByteField(term2207512, term2207512.getClass(), "hour", (byte) 4);
        setByteField(term2207512, term2207512.getClass(), "minute", (byte) 41);
        setByteField(term2207512, term2207512.getClass(), "second", (byte) 7);
        setIntField(term2207512, term2207512.getClass(), "nano", 653446129);
        setField(term2207507, term2207507.getClass(), "time", term2207512);
        setField(term2207492, term2207492.getClass(), "releaseDate", term2207507);
        setIntField(term2207518, term2207518.getClass(), "year", 2022);
        setShortField(term2207518, term2207518.getClass(), "month", (short) 7);
        setShortField(term2207518, term2207518.getClass(), "day", (short) 24);
        setField(term2207517, term2207517.getClass(), "date", term2207518);
        setByteField(term2207522, term2207522.getClass(), "hour", (byte) 11);
        setByteField(term2207522, term2207522.getClass(), "minute", (byte) 25);
        setByteField(term2207522, term2207522.getClass(), "second", (byte) 41);
        setIntField(term2207522, term2207522.getClass(), "nano", 469908493);
        setField(term2207517, term2207517.getClass(), "time", term2207522);
        setField(term2207492, term2207492.getClass(), "endDate", term2207517);
        setIntField(term2207492, term2207492.getClass(), "sortOrder", -1948852417);
        term2207528 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2207528;
        callMethod(klass, "equals", argTypes, term2207492, args);
    }

};


