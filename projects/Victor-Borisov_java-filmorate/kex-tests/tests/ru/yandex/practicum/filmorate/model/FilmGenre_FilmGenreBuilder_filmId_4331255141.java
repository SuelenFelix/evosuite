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

public class FilmGenre_FilmGenreBuilder_filmId_4331255141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3753;
     Object term3758;

    public FilmGenre_FilmGenreBuilder_filmId_4331255141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3754 = new Integer(1953277050);
        Integer term3756 = new Integer(1283079251);
        term3753 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.FilmGenre$FilmGenreBuilder"));
        setField(term3753, term3753.getClass(), "filmId", term3754);
        setField(term3753, term3753.getClass(), "genreId", term3756);
        term3758 = new Integer(-523949691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.FilmGenre$FilmGenreBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3758;
        callMethod(klass, "filmId", argTypes, term3753, args);
    }

};


