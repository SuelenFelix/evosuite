package ru.yandex.practicum.filmorate.controller;

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
import static ru.yandex.practicum.filmorate.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class FilmController_create_7919935491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11547;
     Object term11548;

    public FilmController_create_7919935491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11547 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        setField(term11547, term11547.getClass(), "filmService", null);
        Long term11549 = new Long(-2813493605142626659L);
        Integer term11579 = new Integer(568599855);
        term11548 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term11575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11581 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term11595 = newInstance(Class.forName("java.util.TreeSet"));
        Object term11596 = newInstance(Class.forName("java.util.TreeMap"));
        Object term11597 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term11598 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term11600 = newInstance(Class.forName("java.lang.Object"));
        Object term11601 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term11603 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term11548, term11548.getClass(), "id", term11549);
        setField(term11548, term11548.getClass(), "name", "GzFkzHGYFt");
        setField(term11548, term11548.getClass(), "description", "tShwQLRGNe");
        setIntField(term11575, term11575.getClass(), "year", 2021);
        setShortField(term11575, term11575.getClass(), "month", (short) 1);
        setShortField(term11575, term11575.getClass(), "day", (short) 18);
        setField(term11548, term11548.getClass(), "releaseDate", term11575);
        setField(term11548, term11548.getClass(), "duration", term11579);
        setIntField(term11581, term11581.getClass(), "id", -1955890973);
        setField(term11581, term11581.getClass(), "name", "LvtrsXUliU");
        setField(term11548, term11548.getClass(), "mpa", term11581);
        setField(term11596, term11596.getClass(), "comparator", null);
        setIntField(term11598, term11598.getClass(), "id", -2038273078);
        setField(term11598, term11598.getClass(), "name", null);
        setField(term11597, term11597.getClass(), "key", term11598);
        setField(term11597, term11597.getClass(), "value", term11600);
        setField(term11601, term11601.getClass(), "key", null);
        setField(term11601, term11601.getClass(), "value", term11600);
        setField(term11601, term11601.getClass(), "left", null);
        setField(term11601, term11601.getClass(), "right", null);
        setField(term11601, term11601.getClass(), "parent", term11597);
        setBooleanField(term11601, term11601.getClass(), "color", false);
        setField(term11597, term11597.getClass(), "left", term11601);
        setField(term11603, term11603.getClass(), "key", null);
        setField(term11603, term11603.getClass(), "value", term11600);
        setField(term11603, term11603.getClass(), "left", null);
        setField(term11603, term11603.getClass(), "right", null);
        setField(term11603, term11603.getClass(), "parent", term11597);
        setBooleanField(term11603, term11603.getClass(), "color", true);
        setField(term11597, term11597.getClass(), "right", term11603);
        setField(term11597, term11597.getClass(), "parent", null);
        setBooleanField(term11597, term11597.getClass(), "color", true);
        setField(term11596, term11596.getClass(), "root", term11597);
        setIntField(term11596, term11596.getClass(), "size", 9);
        setIntField(term11596, term11596.getClass(), "modCount", 9);
        setField(term11596, term11596.getClass(), "entrySet", null);
        setField(term11596, term11596.getClass(), "navigableKeySet", null);
        setField(term11596, term11596.getClass(), "descendingMap", null);
        setField(term11596, term11596.getClass(), "keySet", null);
        setField(term11596, term11596.getClass(), "values", null);
        setField(term11595, term11595.getClass(), "m", term11596);
        setField(term11548, term11548.getClass(), "genres", term11595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term11548;
        callMethod(klass, "create", argTypes, term11547, args);
    }

};


