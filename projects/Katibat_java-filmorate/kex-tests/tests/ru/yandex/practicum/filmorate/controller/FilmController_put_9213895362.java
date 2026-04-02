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

public class FilmController_put_9213895362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11638;
     Object term11639;

    public FilmController_put_9213895362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11638 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        setField(term11638, term11638.getClass(), "filmService", null);
        Long term11640 = new Long(-8885298608300233488L);
        Integer term11670 = new Integer(1162663216);
        term11639 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term11666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11672 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term11686 = newInstance(Class.forName("java.util.TreeSet"));
        Object term11687 = newInstance(Class.forName("java.util.TreeMap"));
        Object term11688 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term11689 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term11691 = newInstance(Class.forName("java.lang.Object"));
        Object term11692 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term11694 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term11639, term11639.getClass(), "id", term11640);
        setField(term11639, term11639.getClass(), "name", "MLqYREekMl");
        setField(term11639, term11639.getClass(), "description", "ytSBIKXogI");
        setIntField(term11666, term11666.getClass(), "year", 2020);
        setShortField(term11666, term11666.getClass(), "month", (short) 11);
        setShortField(term11666, term11666.getClass(), "day", (short) 22);
        setField(term11639, term11639.getClass(), "releaseDate", term11666);
        setField(term11639, term11639.getClass(), "duration", term11670);
        setIntField(term11672, term11672.getClass(), "id", -1685132342);
        setField(term11672, term11672.getClass(), "name", "nHXjMycHlU");
        setField(term11639, term11639.getClass(), "mpa", term11672);
        setField(term11687, term11687.getClass(), "comparator", null);
        setIntField(term11689, term11689.getClass(), "id", 1622346318);
        setField(term11689, term11689.getClass(), "name", null);
        setField(term11688, term11688.getClass(), "key", term11689);
        setField(term11688, term11688.getClass(), "value", term11691);
        setField(term11692, term11692.getClass(), "key", null);
        setField(term11692, term11692.getClass(), "value", term11691);
        setField(term11692, term11692.getClass(), "left", null);
        setField(term11692, term11692.getClass(), "right", null);
        setField(term11692, term11692.getClass(), "parent", term11688);
        setBooleanField(term11692, term11692.getClass(), "color", true);
        setField(term11688, term11688.getClass(), "left", term11692);
        setField(term11694, term11694.getClass(), "key", null);
        setField(term11694, term11694.getClass(), "value", term11691);
        setField(term11694, term11694.getClass(), "left", null);
        setField(term11694, term11694.getClass(), "right", null);
        setField(term11694, term11694.getClass(), "parent", term11688);
        setBooleanField(term11694, term11694.getClass(), "color", true);
        setField(term11688, term11688.getClass(), "right", term11694);
        setField(term11688, term11688.getClass(), "parent", null);
        setBooleanField(term11688, term11688.getClass(), "color", true);
        setField(term11687, term11687.getClass(), "root", term11688);
        setIntField(term11687, term11687.getClass(), "size", 4);
        setIntField(term11687, term11687.getClass(), "modCount", 4);
        setField(term11687, term11687.getClass(), "entrySet", null);
        setField(term11687, term11687.getClass(), "navigableKeySet", null);
        setField(term11687, term11687.getClass(), "descendingMap", null);
        setField(term11687, term11687.getClass(), "keySet", null);
        setField(term11687, term11687.getClass(), "values", null);
        setField(term11686, term11686.getClass(), "m", term11687);
        setField(term11639, term11639.getClass(), "genres", term11686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term11639;
        callMethod(klass, "put", argTypes, term11638, args);
    }

};


