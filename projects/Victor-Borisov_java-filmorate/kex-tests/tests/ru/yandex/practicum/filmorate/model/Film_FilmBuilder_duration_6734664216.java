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

public class Film_FilmBuilder_duration_6734664216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3111;
     Object term3114;

    public Film_FilmBuilder_duration_6734664216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3111 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        setField(term3111, term3111.getClass(), "id", null);
        setField(term3111, term3111.getClass(), "name", null);
        setField(term3111, term3111.getClass(), "description", null);
        setField(term3111, term3111.getClass(), "releaseDate", null);
        setIntField(term3111, term3111.getClass(), "duration", 0);
        setField(term3111, term3111.getClass(), "mpa", null);
        setField(term3111, term3111.getClass(), "genres", null);
        setIntField(term3111, term3111.getClass(), "rate", 0);
        term3114 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3114;
        callMethod(klass, "duration", argTypes, term3111, args);
    }

};


