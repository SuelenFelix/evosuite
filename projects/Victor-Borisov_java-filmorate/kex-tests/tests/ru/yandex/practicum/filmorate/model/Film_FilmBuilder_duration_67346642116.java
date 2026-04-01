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

public class Film_FilmBuilder_duration_67346642116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4218;
     Object term4221;

    public Film_FilmBuilder_duration_67346642116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4218 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        setField(term4218, term4218.getClass(), "id", null);
        setField(term4218, term4218.getClass(), "name", null);
        setField(term4218, term4218.getClass(), "description", null);
        setField(term4218, term4218.getClass(), "releaseDate", null);
        setIntField(term4218, term4218.getClass(), "duration", 0);
        setField(term4218, term4218.getClass(), "mpa", null);
        setField(term4218, term4218.getClass(), "genres", null);
        setIntField(term4218, term4218.getClass(), "rate", 0);
        term4221 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4221;
        callMethod(klass, "duration", argTypes, term4218, args);
    }

};


