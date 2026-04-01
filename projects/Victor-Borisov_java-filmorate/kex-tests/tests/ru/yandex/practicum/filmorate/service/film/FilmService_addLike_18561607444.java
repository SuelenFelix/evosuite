package ru.yandex.practicum.filmorate.service.film;

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
import static ru.yandex.practicum.filmorate.service.film.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class FilmService_addLike_18561607444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219;
     Object term220;
     Object term222;

    public FilmService_addLike_18561607444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.film.FilmService"));
        setField(term219, term219.getClass(), "filmStorage", null);
        setField(term219, term219.getClass(), "filmLikeStorage", null);
        setField(term219, term219.getClass(), "genreStorage", null);
        term220 = new Integer(-1685132342);
        term222 = new Integer(-1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.film.FilmService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        Object[] args = new Object[2];
        args[0] = term220;
        args[1] = term222;
        callMethod(klass, "addLike", argTypes, term219, args);
    }

};


