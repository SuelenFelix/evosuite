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

public class Film_toString_73171229141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3621;

    public Film_toString_73171229141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3621 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term3621, term3621.getClass(), "name", null);
        setField(term3621, term3621.getClass(), "description", null);
        setField(term3621, term3621.getClass(), "releaseDate", null);
        setLongField(term3621, term3621.getClass(), "duration", 0L);
        setField(term3621, term3621.getClass(), "mpa", null);
        setField(term3621, term3621.getClass(), "genres", null);
        setField(term3621, term3621.getClass(), "likedUsers", null);
        setIntField(term3621, term3621.getClass(), "id", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3621, args);
    }

};


