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

public class Film_FilmBuilder_id_14495830201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2380;
     Object term2440;

    public Film_FilmBuilder_id_14495830201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2381 = new Long(4784595517102746672L);
        Integer term2411 = new Integer(568599855);
        term2380 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2413 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term2427 = newInstance(Class.forName("java.util.TreeSet"));
        Object term2428 = newInstance(Class.forName("java.util.TreeMap"));
        Object term2429 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2430 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term2432 = newInstance(Class.forName("java.lang.Object"));
        Object term2433 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2435 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term2380, term2380.getClass(), "id", term2381);
        setField(term2380, term2380.getClass(), "name", "JqXGgAhZPl");
        setField(term2380, term2380.getClass(), "description", "jiKYgYHqIS");
        setIntField(term2407, term2407.getClass(), "year", 2012);
        setShortField(term2407, term2407.getClass(), "month", (short) 9);
        setShortField(term2407, term2407.getClass(), "day", (short) 11);
        setField(term2380, term2380.getClass(), "releaseDate", term2407);
        setField(term2380, term2380.getClass(), "duration", term2411);
        setIntField(term2413, term2413.getClass(), "id", -6029667);
        setField(term2413, term2413.getClass(), "name", "DfISiziTgG");
        setField(term2380, term2380.getClass(), "mpa", term2413);
        setField(term2428, term2428.getClass(), "comparator", null);
        setIntField(term2430, term2430.getClass(), "id", -1007160944);
        setField(term2430, term2430.getClass(), "name", null);
        setField(term2429, term2429.getClass(), "key", term2430);
        setField(term2429, term2429.getClass(), "value", term2432);
        setField(term2433, term2433.getClass(), "key", null);
        setField(term2433, term2433.getClass(), "value", term2432);
        setField(term2433, term2433.getClass(), "left", null);
        setField(term2433, term2433.getClass(), "right", null);
        setField(term2433, term2433.getClass(), "parent", term2429);
        setBooleanField(term2433, term2433.getClass(), "color", true);
        setField(term2429, term2429.getClass(), "left", term2433);
        setField(term2435, term2435.getClass(), "key", null);
        setField(term2435, term2435.getClass(), "value", term2432);
        setField(term2435, term2435.getClass(), "left", null);
        setField(term2435, term2435.getClass(), "right", null);
        setField(term2435, term2435.getClass(), "parent", term2429);
        setBooleanField(term2435, term2435.getClass(), "color", true);
        setField(term2429, term2429.getClass(), "right", term2435);
        setField(term2429, term2429.getClass(), "parent", null);
        setBooleanField(term2429, term2429.getClass(), "color", true);
        setField(term2428, term2428.getClass(), "root", term2429);
        setIntField(term2428, term2428.getClass(), "size", 5);
        setIntField(term2428, term2428.getClass(), "modCount", 5);
        setField(term2428, term2428.getClass(), "entrySet", null);
        setField(term2428, term2428.getClass(), "navigableKeySet", null);
        setField(term2428, term2428.getClass(), "descendingMap", null);
        setField(term2428, term2428.getClass(), "keySet", null);
        setField(term2428, term2428.getClass(), "values", null);
        setField(term2427, term2427.getClass(), "m", term2428);
        setField(term2380, term2380.getClass(), "genres", term2427);
        term2440 = new Long(-7612550318181586304L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2440;
        callMethod(klass, "id", argTypes, term2380, args);
    }

};


