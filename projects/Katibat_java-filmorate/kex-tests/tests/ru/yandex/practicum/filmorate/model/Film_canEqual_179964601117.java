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

public class Film_canEqual_179964601117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4761;
     Object term4821;

    public Film_canEqual_179964601117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4762 = new Long(-5248475803419977214L);
        Integer term4792 = new Integer(865208305);
        term4761 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4794 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term4808 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4809 = newInstance(Class.forName("java.util.TreeMap"));
        Object term4810 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4811 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term4813 = newInstance(Class.forName("java.lang.Object"));
        Object term4814 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4816 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term4761, term4761.getClass(), "id", term4762);
        setField(term4761, term4761.getClass(), "name", "ywmcuThdfL");
        setField(term4761, term4761.getClass(), "description", "GBOEuByOfr");
        setIntField(term4788, term4788.getClass(), "year", 2013);
        setShortField(term4788, term4788.getClass(), "month", (short) 3);
        setShortField(term4788, term4788.getClass(), "day", (short) 8);
        setField(term4761, term4761.getClass(), "releaseDate", term4788);
        setField(term4761, term4761.getClass(), "duration", term4792);
        setIntField(term4794, term4794.getClass(), "id", -25637976);
        setField(term4794, term4794.getClass(), "name", "NHbOFFjyVK");
        setField(term4761, term4761.getClass(), "mpa", term4794);
        setField(term4809, term4809.getClass(), "comparator", null);
        setIntField(term4811, term4811.getClass(), "id", 202001407);
        setField(term4811, term4811.getClass(), "name", null);
        setField(term4810, term4810.getClass(), "key", term4811);
        setField(term4810, term4810.getClass(), "value", term4813);
        setField(term4814, term4814.getClass(), "key", null);
        setField(term4814, term4814.getClass(), "value", term4813);
        setField(term4814, term4814.getClass(), "left", null);
        setField(term4814, term4814.getClass(), "right", null);
        setField(term4814, term4814.getClass(), "parent", term4810);
        setBooleanField(term4814, term4814.getClass(), "color", false);
        setField(term4810, term4810.getClass(), "left", term4814);
        setField(term4816, term4816.getClass(), "key", null);
        setField(term4816, term4816.getClass(), "value", term4813);
        setField(term4816, term4816.getClass(), "left", null);
        setField(term4816, term4816.getClass(), "right", null);
        setField(term4816, term4816.getClass(), "parent", term4810);
        setBooleanField(term4816, term4816.getClass(), "color", true);
        setField(term4810, term4810.getClass(), "right", term4816);
        setField(term4810, term4810.getClass(), "parent", null);
        setBooleanField(term4810, term4810.getClass(), "color", true);
        setField(term4809, term4809.getClass(), "root", term4810);
        setIntField(term4809, term4809.getClass(), "size", 6);
        setIntField(term4809, term4809.getClass(), "modCount", 6);
        setField(term4809, term4809.getClass(), "entrySet", null);
        setField(term4809, term4809.getClass(), "navigableKeySet", null);
        setField(term4809, term4809.getClass(), "descendingMap", null);
        setField(term4809, term4809.getClass(), "keySet", null);
        setField(term4809, term4809.getClass(), "values", null);
        setField(term4808, term4808.getClass(), "m", term4809);
        setField(term4761, term4761.getClass(), "genres", term4808);
        term4821 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4821;
        callMethod(klass, "canEqual", argTypes, term4761, args);
    }

};


