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

public class Film_FilmBuilder_mpa_20827505826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2735;
     Object term2782;

    public Film_FilmBuilder_mpa_20827505826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2736 = new Integer(-1530420153);
        Integer term2766 = new Integer(-469968304);
        term2735 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2768 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2735, term2735.getClass(), "id", term2736);
        setField(term2735, term2735.getClass(), "name", "fztQhjqwdP");
        setField(term2735, term2735.getClass(), "description", "eVpkWxjuki");
        setIntField(term2762, term2762.getClass(), "year", 2017);
        setShortField(term2762, term2762.getClass(), "month", (short) 6);
        setShortField(term2762, term2762.getClass(), "day", (short) 7);
        setField(term2735, term2735.getClass(), "releaseDate", term2762);
        setField(term2735, term2735.getClass(), "duration", term2766);
        setIntField(term2768, term2768.getClass(), "id", 1135664017);
        setField(term2768, term2768.getClass(), "name", "SJiQaLvSKv");
        setField(term2735, term2735.getClass(), "mpa", term2768);
        term2782 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setIntField(term2782, term2782.getClass(), "id", 590364439);
        setField(term2782, term2782.getClass(), "name", "OEXDRUKcFl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[1];
        args[0] = term2782;
        callMethod(klass, "mpa", argTypes, term2735, args);
    }

};


