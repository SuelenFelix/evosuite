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

public class Film_getGenres_106965734830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5141;

    public Film_getGenres_106965734830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5141 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term5141, term5141.getClass(), "id", null);
        setField(term5141, term5141.getClass(), "name", null);
        setField(term5141, term5141.getClass(), "description", null);
        setField(term5141, term5141.getClass(), "releaseDate", null);
        setField(term5141, term5141.getClass(), "duration", null);
        setField(term5141, term5141.getClass(), "mpa", null);
        setField(term5141, term5141.getClass(), "genres", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenres", argTypes, term5141, args);
    }

};


