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

public class Film_setGenres_51507491347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3133;

    public Film_setGenres_51507491347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3133 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        setField(term3133, term3133.getClass(), "id", null);
        setField(term3133, term3133.getClass(), "name", null);
        setField(term3133, term3133.getClass(), "description", null);
        setField(term3133, term3133.getClass(), "releaseDate", null);
        setField(term3133, term3133.getClass(), "duration", null);
        setField(term3133, term3133.getClass(), "mpa", null);
        setField(term3133, term3133.getClass(), "genres", null);
        setField(term3133, term3133.getClass(), "likes", null);
        setField(term3133, term3133.getClass(), "rate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGenres", argTypes, term3133, args);
    }

};


