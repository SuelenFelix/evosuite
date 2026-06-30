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

public class FilmLike_setFilmId_19265609045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2543;
     Object term2548;

    public FilmLike_setFilmId_19265609045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2544 = new Integer(1551099402);
        Integer term2546 = new Integer(-2027534003);
        term2543 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.FilmLike"));
        setField(term2543, term2543.getClass(), "userId", term2544);
        setField(term2543, term2543.getClass(), "filmId", term2546);
        term2548 = new Integer(1063420942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.FilmLike");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2548;
        callMethod(klass, "setFilmId", argTypes, term2543, args);
    }

};


