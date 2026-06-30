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

public class Film_toString_73171229137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4820;

    public Film_toString_73171229137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4820 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term4820, term4820.getClass(), "id", null);
        setField(term4820, term4820.getClass(), "name", null);
        setField(term4820, term4820.getClass(), "description", null);
        setField(term4820, term4820.getClass(), "releaseDate", null);
        setField(term4820, term4820.getClass(), "duration", null);
        setField(term4820, term4820.getClass(), "mpa", null);
        setField(term4820, term4820.getClass(), "genres", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4820, args);
    }

};


