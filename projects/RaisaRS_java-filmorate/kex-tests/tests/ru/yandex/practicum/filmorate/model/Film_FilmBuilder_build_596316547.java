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

public class Film_FilmBuilder_build_596316547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4066;

    public Film_FilmBuilder_build_596316547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4066 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term4092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4097 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term4066, term4066.getClass(), "id", -2170847986967241072L);
        setField(term4066, term4066.getClass(), "name", "WHcwFgsGFC");
        setField(term4066, term4066.getClass(), "description", "HzqpegHiRq");
        setIntField(term4092, term4092.getClass(), "year", 2029);
        setShortField(term4092, term4092.getClass(), "month", (short) 6);
        setShortField(term4092, term4092.getClass(), "day", (short) 22);
        setField(term4066, term4066.getClass(), "releaseDate", term4092);
        setIntField(term4066, term4066.getClass(), "duration", 767834723);
        setIntField(term4097, term4097.getClass(), "id", -602026508);
        setField(term4097, term4097.getClass(), "name", "jwsfVjMoJT");
        setField(term4097, term4097.getClass(), "description", "ZfdXfCCFDf");
        setField(term4066, term4066.getClass(), "mpa", term4097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4066, args);
    }

};


