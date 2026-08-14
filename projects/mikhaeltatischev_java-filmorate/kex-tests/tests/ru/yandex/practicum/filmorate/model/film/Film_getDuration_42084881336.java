package ru.yandex.practicum.filmorate.model.film;

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
import static ru.yandex.practicum.filmorate.model.film.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Film_getDuration_42084881336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3122;

    public Film_getDuration_42084881336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3122 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        setField(term3122, term3122.getClass(), "id", null);
        setField(term3122, term3122.getClass(), "name", null);
        setField(term3122, term3122.getClass(), "description", null);
        setField(term3122, term3122.getClass(), "releaseDate", null);
        setField(term3122, term3122.getClass(), "duration", null);
        setField(term3122, term3122.getClass(), "mpa", null);
        setField(term3122, term3122.getClass(), "genres", null);
        setField(term3122, term3122.getClass(), "likes", null);
        setField(term3122, term3122.getClass(), "rate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term3122, args);
    }

};


