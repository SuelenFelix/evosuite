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

public class Film_hashCode_29708206853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3139;

    public Film_hashCode_29708206853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3139 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        setField(term3139, term3139.getClass(), "id", null);
        setField(term3139, term3139.getClass(), "name", null);
        setField(term3139, term3139.getClass(), "description", null);
        setField(term3139, term3139.getClass(), "releaseDate", null);
        setField(term3139, term3139.getClass(), "duration", null);
        setField(term3139, term3139.getClass(), "mpa", null);
        setField(term3139, term3139.getClass(), "genres", null);
        setField(term3139, term3139.getClass(), "likes", null);
        setField(term3139, term3139.getClass(), "rate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3139, args);
    }

};


