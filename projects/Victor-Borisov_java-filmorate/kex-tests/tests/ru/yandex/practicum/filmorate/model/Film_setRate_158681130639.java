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

public class Film_setRate_158681130639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6135;
     Object term6138;

    public Film_setRate_158681130639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6135 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term6135, term6135.getClass(), "id", null);
        setField(term6135, term6135.getClass(), "name", null);
        setField(term6135, term6135.getClass(), "description", null);
        setField(term6135, term6135.getClass(), "releaseDate", null);
        setIntField(term6135, term6135.getClass(), "duration", 0);
        setField(term6135, term6135.getClass(), "mpa", null);
        setField(term6135, term6135.getClass(), "genres", null);
        setIntField(term6135, term6135.getClass(), "rate", 0);
        term6138 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6138;
        callMethod(klass, "setRate", argTypes, term6135, args);
    }

};


