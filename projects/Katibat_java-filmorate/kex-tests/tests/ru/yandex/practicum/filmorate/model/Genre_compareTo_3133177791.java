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

public class Genre_compareTo_3133177791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349;
     Object term363;

    public Genre_compareTo_3133177791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setIntField(term349, term349.getClass(), "id", 1134449235);
        setField(term349, term349.getClass(), "name", "uuaPigETmJ");
        term363 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setIntField(term363, term363.getClass(), "id", -883034806);
        setField(term363, term363.getClass(), "name", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Genre");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Genre");
        Object[] args = new Object[1];
        args[0] = term363;
        callMethod(klass, "compareTo", argTypes, term349, args);
    }

};


