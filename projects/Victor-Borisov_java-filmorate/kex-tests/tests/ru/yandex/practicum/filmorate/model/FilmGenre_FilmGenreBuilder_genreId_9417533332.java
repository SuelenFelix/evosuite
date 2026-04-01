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

public class FilmGenre_FilmGenreBuilder_genreId_9417533332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3760;
     Object term3765;

    public FilmGenre_FilmGenreBuilder_genreId_9417533332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3761 = new Integer(1398204340);
        Integer term3763 = new Integer(229204365);
        term3760 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.FilmGenre$FilmGenreBuilder"));
        setField(term3760, term3760.getClass(), "filmId", term3761);
        setField(term3760, term3760.getClass(), "genreId", term3763);
        term3765 = new Integer(-461771056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.FilmGenre$FilmGenreBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3765;
        callMethod(klass, "genreId", argTypes, term3760, args);
    }

};


