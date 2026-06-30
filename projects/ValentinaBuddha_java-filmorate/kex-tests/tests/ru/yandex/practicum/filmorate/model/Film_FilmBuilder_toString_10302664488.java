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

public class Film_FilmBuilder_toString_10302664488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2913;

    public Film_FilmBuilder_toString_10302664488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2914 = new Integer(1962444399);
        Integer term2944 = new Integer(767834723);
        term2913 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2946 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2913, term2913.getClass(), "id", term2914);
        setField(term2913, term2913.getClass(), "name", "iNwOJRBEjp");
        setField(term2913, term2913.getClass(), "description", "XylxrMBraH");
        setIntField(term2940, term2940.getClass(), "year", 2015);
        setShortField(term2940, term2940.getClass(), "month", (short) 9);
        setShortField(term2940, term2940.getClass(), "day", (short) 15);
        setField(term2913, term2913.getClass(), "releaseDate", term2940);
        setField(term2913, term2913.getClass(), "duration", term2944);
        setIntField(term2946, term2946.getClass(), "id", -1275173084);
        setField(term2946, term2946.getClass(), "name", "pORebkoRdD");
        setField(term2913, term2913.getClass(), "mpa", term2946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2913, args);
    }

};


