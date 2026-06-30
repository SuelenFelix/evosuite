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

public class Film_FilmBuilder_toString_10302664488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4163;

    public Film_FilmBuilder_toString_10302664488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4163 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term4189 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4194 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term4163, term4163.getClass(), "id", 4044358158040652353L);
        setField(term4163, term4163.getClass(), "name", "MwwjNtdOFT");
        setField(term4163, term4163.getClass(), "description", "VYkqXKVlAJ");
        setIntField(term4189, term4189.getClass(), "year", 2011);
        setShortField(term4189, term4189.getClass(), "month", (short) 5);
        setShortField(term4189, term4189.getClass(), "day", (short) 4);
        setField(term4163, term4163.getClass(), "releaseDate", term4189);
        setIntField(term4163, term4163.getClass(), "duration", -157887805);
        setIntField(term4194, term4194.getClass(), "id", 1876565163);
        setField(term4194, term4194.getClass(), "name", "XkIoWJRNwN");
        setField(term4194, term4194.getClass(), "description", "aNWLJdrZMq");
        setField(term4163, term4163.getClass(), "mpa", term4194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4163, args);
    }

};


