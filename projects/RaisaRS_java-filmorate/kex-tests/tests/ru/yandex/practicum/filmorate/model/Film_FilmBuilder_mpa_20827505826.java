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

public class Film_FilmBuilder_mpa_20827505826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3923;
     Object term3980;

    public Film_FilmBuilder_mpa_20827505826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3923 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3949 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3954 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term3923, term3923.getClass(), "id", -7612550318181586304L);
        setField(term3923, term3923.getClass(), "name", "mvrkADEgpp");
        setField(term3923, term3923.getClass(), "description", "pXOkjyeIRb");
        setIntField(term3949, term3949.getClass(), "year", 2022);
        setShortField(term3949, term3949.getClass(), "month", (short) 8);
        setShortField(term3949, term3949.getClass(), "day", (short) 8);
        setField(term3923, term3923.getClass(), "releaseDate", term3949);
        setIntField(term3923, term3923.getClass(), "duration", -1145578966);
        setIntField(term3954, term3954.getClass(), "id", 679763016);
        setField(term3954, term3954.getClass(), "name", "GgZWSjxjyE");
        setField(term3954, term3954.getClass(), "description", "EeBVbzjcCI");
        setField(term3923, term3923.getClass(), "mpa", term3954);
        term3980 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setIntField(term3980, term3980.getClass(), "id", 1962444399);
        setField(term3980, term3980.getClass(), "name", "UfQtPRyWRC");
        setField(term3980, term3980.getClass(), "description", "FPvxVzzSvD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[1];
        args[0] = term3980;
        callMethod(klass, "mpa", argTypes, term3923, args);
    }

};


