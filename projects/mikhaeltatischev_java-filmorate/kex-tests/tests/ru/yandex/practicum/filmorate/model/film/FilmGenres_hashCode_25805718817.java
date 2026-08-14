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

public class FilmGenres_hashCode_25805718817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3265;

    public FilmGenres_hashCode_25805718817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3265 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.FilmGenres"));
        setField(term3265, term3265.getClass(), "filmId", null);
        setField(term3265, term3265.getClass(), "id", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.FilmGenres");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3265, args);
    }

};


