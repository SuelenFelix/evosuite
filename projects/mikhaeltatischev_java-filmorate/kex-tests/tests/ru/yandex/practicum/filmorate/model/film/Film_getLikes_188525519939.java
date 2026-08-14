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

public class Film_getLikes_188525519939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3125;

    public Film_getLikes_188525519939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3125 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        setField(term3125, term3125.getClass(), "id", null);
        setField(term3125, term3125.getClass(), "name", null);
        setField(term3125, term3125.getClass(), "description", null);
        setField(term3125, term3125.getClass(), "releaseDate", null);
        setField(term3125, term3125.getClass(), "duration", null);
        setField(term3125, term3125.getClass(), "mpa", null);
        setField(term3125, term3125.getClass(), "genres", null);
        setField(term3125, term3125.getClass(), "likes", null);
        setField(term3125, term3125.getClass(), "rate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikes", argTypes, term3125, args);
    }

};


