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
import java.lang.Long;

public class Film_setId_126679154742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8207;
     Object term8210;

    public Film_setId_126679154742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8207 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setLongField(term8207, term8207.getClass(), "id", 0L);
        setField(term8207, term8207.getClass(), "name", null);
        setField(term8207, term8207.getClass(), "description", null);
        setField(term8207, term8207.getClass(), "releaseDate", null);
        setIntField(term8207, term8207.getClass(), "duration", 0);
        setField(term8207, term8207.getClass(), "mpa", null);
        setField(term8207, term8207.getClass(), "genres", null);
        setField(term8207, term8207.getClass(), "likes", null);
        term8210 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term8210;
        callMethod(klass, "setId", argTypes, term8207, args);
    }

};


