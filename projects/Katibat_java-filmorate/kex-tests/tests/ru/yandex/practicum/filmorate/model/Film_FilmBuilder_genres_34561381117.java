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

public class Film_FilmBuilder_genres_34561381117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3287;

    public Film_FilmBuilder_genres_34561381117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3287 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        setField(term3287, term3287.getClass(), "id", null);
        setField(term3287, term3287.getClass(), "name", null);
        setField(term3287, term3287.getClass(), "description", null);
        setField(term3287, term3287.getClass(), "releaseDate", null);
        setField(term3287, term3287.getClass(), "duration", null);
        setField(term3287, term3287.getClass(), "mpa", null);
        setField(term3287, term3287.getClass(), "genres", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TreeSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "genres", argTypes, term3287, args);
    }

};


