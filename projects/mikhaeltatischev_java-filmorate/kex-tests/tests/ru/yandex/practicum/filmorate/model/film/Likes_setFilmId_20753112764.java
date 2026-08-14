package ru.yandex.practicum.filmorate.model.film;

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
import static ru.yandex.practicum.filmorate.model.film.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Likes_setFilmId_20753112764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3159;
     Object term3164;

    public Likes_setFilmId_20753112764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3160 = new Long(2209808079059619773L);
        Long term3162 = new Long(8403492202041709902L);
        term3159 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Likes"));
        setField(term3159, term3159.getClass(), "userId", term3160);
        setField(term3159, term3159.getClass(), "filmId", term3162);
        term3164 = new Long(-113028659747841511L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Likes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3164;
        callMethod(klass, "setFilmId", argTypes, term3159, args);
    }

};


