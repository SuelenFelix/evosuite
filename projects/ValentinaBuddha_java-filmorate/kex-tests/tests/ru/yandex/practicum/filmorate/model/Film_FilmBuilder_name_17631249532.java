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

public class Film_FilmBuilder_name_17631249532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2377;

    public Film_FilmBuilder_name_17631249532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2378 = new Integer(865208305);
        Integer term2408 = new Integer(-1275173084);
        term2377 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2410 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2377, term2377.getClass(), "id", term2378);
        setField(term2377, term2377.getClass(), "name", "DfISiziTgG");
        setField(term2377, term2377.getClass(), "description", "XqgfKFvPSD");
        setIntField(term2404, term2404.getClass(), "year", 2017);
        setShortField(term2404, term2404.getClass(), "month", (short) 8);
        setShortField(term2404, term2404.getClass(), "day", (short) 7);
        setField(term2377, term2377.getClass(), "releaseDate", term2404);
        setField(term2377, term2377.getClass(), "duration", term2408);
        setIntField(term2410, term2410.getClass(), "id", -6029667);
        setField(term2410, term2410.getClass(), "name", "JiVRgTZvKc");
        setField(term2377, term2377.getClass(), "mpa", term2410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XPKmummaqg";
        callMethod(klass, "name", argTypes, term2377, args);
    }

};


