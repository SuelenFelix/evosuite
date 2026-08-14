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

public class Film_toString_21367762250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3136;

    public Film_toString_21367762250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3136 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        setField(term3136, term3136.getClass(), "id", null);
        setField(term3136, term3136.getClass(), "name", null);
        setField(term3136, term3136.getClass(), "description", null);
        setField(term3136, term3136.getClass(), "releaseDate", null);
        setField(term3136, term3136.getClass(), "duration", null);
        setField(term3136, term3136.getClass(), "mpa", null);
        setField(term3136, term3136.getClass(), "genres", null);
        setField(term3136, term3136.getClass(), "likes", null);
        setField(term3136, term3136.getClass(), "rate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3136, args);
    }

};


