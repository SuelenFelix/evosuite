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
import java.lang.Object;

public class Film_FilmBuilder_releaseDate_1450949264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3723;
     Object term3780;

    public Film_FilmBuilder_releaseDate_1450949264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3723 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3754 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term3723, term3723.getClass(), "id", -6645965768855543712L);
        setField(term3723, term3723.getClass(), "name", "gCWtLVKVVe");
        setField(term3723, term3723.getClass(), "description", "fWKJoSoCwE");
        setIntField(term3749, term3749.getClass(), "year", 2017);
        setShortField(term3749, term3749.getClass(), "month", (short) 6);
        setShortField(term3749, term3749.getClass(), "day", (short) 7);
        setField(term3723, term3723.getClass(), "releaseDate", term3749);
        setIntField(term3723, term3723.getClass(), "duration", -226514366);
        setIntField(term3754, term3754.getClass(), "id", 1193880199);
        setField(term3754, term3754.getClass(), "name", "wfaXBpWAUH");
        setField(term3754, term3754.getClass(), "description", "VMeAzAHwZj");
        setField(term3723, term3723.getClass(), "mpa", term3754);
        term3780 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3780, term3780.getClass(), "year", 2023);
        setShortField(term3780, term3780.getClass(), "month", (short) 8);
        setShortField(term3780, term3780.getClass(), "day", (short) 12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term3780;
        callMethod(klass, "releaseDate", argTypes, term3723, args);
    }

};


