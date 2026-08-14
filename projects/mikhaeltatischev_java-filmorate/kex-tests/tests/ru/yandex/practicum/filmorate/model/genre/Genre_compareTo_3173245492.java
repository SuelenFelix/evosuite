package ru.yandex.practicum.filmorate.model.genre;

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
import static ru.yandex.practicum.filmorate.model.genre.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Genre_compareTo_3173245492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;
     Object term43;

    public Genre_compareTo_3173245492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29 = new Integer(1162663216);
        term28 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.genre.Genre"));
        setField(term28, term28.getClass(), "id", term29);
        setField(term28, term28.getClass(), "name", "sjlJAEtRrb");
        Integer term44 = new Integer(1484323161);
        term43 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.genre.Genre"));
        setField(term43, term43.getClass(), "id", term44);
        setField(term43, term43.getClass(), "name", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.genre.Genre");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.genre.Genre");
        Object[] args = new Object[1];
        args[0] = term43;
        callMethod(klass, "compareTo", argTypes, term28, args);
    }

};


