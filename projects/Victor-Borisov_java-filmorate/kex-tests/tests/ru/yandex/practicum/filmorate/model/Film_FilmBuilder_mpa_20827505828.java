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

public class Film_FilmBuilder_mpa_20827505828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3247;

    public Film_FilmBuilder_mpa_20827505828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3247 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        setField(term3247, term3247.getClass(), "id", null);
        setField(term3247, term3247.getClass(), "name", null);
        setField(term3247, term3247.getClass(), "description", null);
        setField(term3247, term3247.getClass(), "releaseDate", null);
        setIntField(term3247, term3247.getClass(), "duration", 0);
        setField(term3247, term3247.getClass(), "mpa", null);
        setField(term3247, term3247.getClass(), "genres", null);
        setIntField(term3247, term3247.getClass(), "rate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mpa", argTypes, term3247, args);
    }

};


