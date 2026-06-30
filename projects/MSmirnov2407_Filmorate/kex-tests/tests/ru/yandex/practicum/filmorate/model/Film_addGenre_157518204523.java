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

public class Film_addGenre_157518204523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3563;
     Object term3566;

    public Film_addGenre_157518204523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3563 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term3563, term3563.getClass(), "name", null);
        setField(term3563, term3563.getClass(), "description", null);
        setField(term3563, term3563.getClass(), "releaseDate", null);
        setLongField(term3563, term3563.getClass(), "duration", 0L);
        setField(term3563, term3563.getClass(), "mpa", null);
        setField(term3563, term3563.getClass(), "genres", null);
        setField(term3563, term3563.getClass(), "likedUsers", null);
        setIntField(term3563, term3563.getClass(), "id", 0);
        term3566 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3566;
        args[1] = null;
        callMethod(klass, "addGenre", argTypes, term3563, args);
    }

};


