package ru.yandex.practicum.filmorate.model;

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
import static ru.yandex.practicum.filmorate.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Film_getReleaseDate_16005712755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3369;

    public Film_getReleaseDate_16005712755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3370 = new Integer(1632125673);
        Integer term3400 = new Integer(454281060);
        LinkedHashMap term3417 = new LinkedHashMap();
        Set<Object> term3467 =  ((Map) term3417).keySet();
        LinkedHashSet term3416 = new LinkedHashSet((Collection<? extends Object>) term3467);
        term3369 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3396 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3402 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3369, term3369.getClass(), "id", term3370);
        setField(term3369, term3369.getClass(), "name", "pXOkjyeIRb");
        setField(term3369, term3369.getClass(), "description", "GgZWSjxjyE");
        setIntField(term3396, term3396.getClass(), "year", 2011);
        setShortField(term3396, term3396.getClass(), "month", (short) 7);
        setShortField(term3396, term3396.getClass(), "day", (short) 24);
        setField(term3369, term3369.getClass(), "releaseDate", term3396);
        setField(term3369, term3369.getClass(), "duration", term3400);
        setIntField(term3402, term3402.getClass(), "id", -817164822);
        setField(term3402, term3402.getClass(), "name", "EeBVbzjcCI");
        setField(term3369, term3369.getClass(), "mpa", term3402);
        setField(term3369, term3369.getClass(), "genres", term3416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseDate", argTypes, term3369, args);
    }

};


