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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class Film_getDescription_15924047394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3544;

    public Film_getDescription_15924047394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3545 = new Long(-7738503207562305297L);
        Integer term3575 = new Integer(-883034806);
        term3544 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3571 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3577 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term3591 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3592 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term3544, term3544.getClass(), "id", term3545);
        setField(term3544, term3544.getClass(), "name", "lFRJFUMVbx");
        setField(term3544, term3544.getClass(), "description", "sZdUNdggUW");
        setIntField(term3571, term3571.getClass(), "year", 2011);
        setShortField(term3571, term3571.getClass(), "month", (short) 7);
        setShortField(term3571, term3571.getClass(), "day", (short) 24);
        setField(term3544, term3544.getClass(), "releaseDate", term3571);
        setField(term3544, term3544.getClass(), "duration", term3575);
        setIntField(term3577, term3577.getClass(), "id", -505439934);
        setField(term3577, term3577.getClass(), "name", "OqbwYQfvAe");
        setField(term3544, term3544.getClass(), "mpa", term3577);
        setField(term3592, term3592.getClass(), "comparator", null);
        setField(term3592, term3592.getClass(), "root", null);
        setIntField(term3592, term3592.getClass(), "size", 0);
        setIntField(term3592, term3592.getClass(), "modCount", 0);
        setField(term3592, term3592.getClass(), "entrySet", null);
        setField(term3592, term3592.getClass(), "navigableKeySet", null);
        setField(term3592, term3592.getClass(), "descendingMap", null);
        setField(term3592, term3592.getClass(), "keySet", null);
        setField(term3592, term3592.getClass(), "values", null);
        setField(term3591, term3591.getClass(), "m", term3592);
        setField(term3544, term3544.getClass(), "genres", term3591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term3544, args);
    }

};


