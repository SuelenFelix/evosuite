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

public class FilmDbService_put_15931273341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269;

    public FilmDbService_put_15931273341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term270 = new Long(-8885298608300233488L);
        Integer term300 = new Integer(1162663216);
        term269 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term296 = newInstance(Class.forName("java.time.LocalDate"));
        Object term302 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term316 = newInstance(Class.forName("java.util.TreeSet"));
        Object term317 = newInstance(Class.forName("java.util.TreeMap"));
        Object term318 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term319 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term321 = newInstance(Class.forName("java.lang.Object"));
        Object term322 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term324 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term269, term269.getClass(), "id", term270);
        setField(term269, term269.getClass(), "name", "oVcInYnLWB");
        setField(term269, term269.getClass(), "description", "aJlieCFVtF");
        setIntField(term296, term296.getClass(), "year", 2020);
        setShortField(term296, term296.getClass(), "month", (short) 11);
        setShortField(term296, term296.getClass(), "day", (short) 22);
        setField(term269, term269.getClass(), "releaseDate", term296);
        setField(term269, term269.getClass(), "duration", term300);
        setIntField(term302, term302.getClass(), "id", -1955890973);
        setField(term302, term302.getClass(), "name", "ZiaGIbnzTs");
        setField(term269, term269.getClass(), "mpa", term302);
        setField(term317, term317.getClass(), "comparator", null);
        setIntField(term319, term319.getClass(), "id", -2038273078);
        setField(term319, term319.getClass(), "name", null);
        setField(term318, term318.getClass(), "key", term319);
        setField(term318, term318.getClass(), "value", term321);
        setField(term322, term322.getClass(), "key", null);
        setField(term322, term322.getClass(), "value", term321);
        setField(term322, term322.getClass(), "left", null);
        setField(term322, term322.getClass(), "right", null);
        setField(term322, term322.getClass(), "parent", term318);
        setBooleanField(term322, term322.getClass(), "color", true);
        setField(term318, term318.getClass(), "left", term322);
        setField(term324, term324.getClass(), "key", null);
        setField(term324, term324.getClass(), "value", term321);
        setField(term324, term324.getClass(), "left", null);
        setField(term324, term324.getClass(), "right", null);
        setField(term324, term324.getClass(), "parent", term318);
        setBooleanField(term324, term324.getClass(), "color", true);
        setField(term318, term318.getClass(), "right", term324);
        setField(term318, term318.getClass(), "parent", null);
        setBooleanField(term318, term318.getClass(), "color", true);
        setField(term317, term317.getClass(), "root", term318);
        setIntField(term317, term317.getClass(), "size", 4);
        setIntField(term317, term317.getClass(), "modCount", 4);
        setField(term317, term317.getClass(), "entrySet", null);
        setField(term317, term317.getClass(), "navigableKeySet", null);
        setField(term317, term317.getClass(), "descendingMap", null);
        setField(term317, term317.getClass(), "keySet", null);
        setField(term317, term317.getClass(), "values", null);
        setField(term316, term316.getClass(), "m", term317);
        setField(term269, term269.getClass(), "genres", term316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmDbService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term269;
        callMethod(klass, "put", argTypes, null, args);
    }

};


