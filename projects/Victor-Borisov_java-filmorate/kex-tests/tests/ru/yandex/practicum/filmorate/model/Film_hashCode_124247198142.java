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

public class Film_hashCode_124247198142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6146;

    public Film_hashCode_124247198142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6146 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term6146, term6146.getClass(), "id", null);
        setField(term6146, term6146.getClass(), "name", null);
        setField(term6146, term6146.getClass(), "description", null);
        setField(term6146, term6146.getClass(), "releaseDate", null);
        setIntField(term6146, term6146.getClass(), "duration", 0);
        setField(term6146, term6146.getClass(), "mpa", null);
        setField(term6146, term6146.getClass(), "genres", null);
        setIntField(term6146, term6146.getClass(), "rate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6146, args);
    }

};


