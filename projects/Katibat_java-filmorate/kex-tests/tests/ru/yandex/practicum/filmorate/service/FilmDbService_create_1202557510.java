package ru.yandex.practicum.filmorate.service;

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
import static ru.yandex.practicum.filmorate.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class FilmDbService_create_1202557510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;

    public FilmDbService_create_1202557510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term180 = new Long(-2813493605142626659L);
        Integer term210 = new Integer(568599855);
        term179 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term212 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term226 = newInstance(Class.forName("java.util.TreeSet"));
        Object term227 = newInstance(Class.forName("java.util.TreeMap"));
        Object term228 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term229 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term231 = newInstance(Class.forName("java.lang.Object"));
        Object term232 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term234 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term179, term179.getClass(), "id", term180);
        setField(term179, term179.getClass(), "name", "SzjVpOQTyS");
        setField(term179, term179.getClass(), "description", "MjGYSRKTNF");
        setIntField(term206, term206.getClass(), "year", 2021);
        setShortField(term206, term206.getClass(), "month", (short) 1);
        setShortField(term206, term206.getClass(), "day", (short) 18);
        setField(term179, term179.getClass(), "releaseDate", term206);
        setField(term179, term179.getClass(), "duration", term210);
        setIntField(term212, term212.getClass(), "id", 568599855);
        setField(term212, term212.getClass(), "name", "hRNSzYYIrc");
        setField(term179, term179.getClass(), "mpa", term212);
        setField(term227, term227.getClass(), "comparator", null);
        setIntField(term229, term229.getClass(), "id", 1162663216);
        setField(term229, term229.getClass(), "name", null);
        setField(term228, term228.getClass(), "key", term229);
        setField(term228, term228.getClass(), "value", term231);
        setField(term232, term232.getClass(), "key", null);
        setField(term232, term232.getClass(), "value", term231);
        setField(term232, term232.getClass(), "left", null);
        setField(term232, term232.getClass(), "right", null);
        setField(term232, term232.getClass(), "parent", term228);
        setBooleanField(term232, term232.getClass(), "color", true);
        setField(term228, term228.getClass(), "left", term232);
        setField(term234, term234.getClass(), "key", null);
        setField(term234, term234.getClass(), "value", term231);
        setField(term234, term234.getClass(), "left", null);
        setField(term234, term234.getClass(), "right", null);
        setField(term234, term234.getClass(), "parent", term228);
        setBooleanField(term234, term234.getClass(), "color", true);
        setField(term228, term228.getClass(), "right", term234);
        setField(term228, term228.getClass(), "parent", null);
        setBooleanField(term228, term228.getClass(), "color", true);
        setField(term227, term227.getClass(), "root", term228);
        setIntField(term227, term227.getClass(), "size", 5);
        setIntField(term227, term227.getClass(), "modCount", 5);
        setField(term227, term227.getClass(), "entrySet", null);
        setField(term227, term227.getClass(), "navigableKeySet", null);
        setField(term227, term227.getClass(), "descendingMap", null);
        setField(term227, term227.getClass(), "keySet", null);
        setField(term227, term227.getClass(), "values", null);
        setField(term226, term226.getClass(), "m", term227);
        setField(term179, term179.getClass(), "genres", term226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmDbService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term179;
        callMethod(klass, "create", argTypes, null, args);
    }

};


