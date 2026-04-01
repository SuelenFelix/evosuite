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

public class Film_FilmBuilder_rate_149614476719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3742;
     Object term3745;

    public Film_FilmBuilder_rate_149614476719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3742 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        setField(term3742, term3742.getClass(), "id", null);
        setField(term3742, term3742.getClass(), "name", null);
        setField(term3742, term3742.getClass(), "description", null);
        setField(term3742, term3742.getClass(), "releaseDate", null);
        setIntField(term3742, term3742.getClass(), "duration", 0);
        setField(term3742, term3742.getClass(), "mpa", null);
        setField(term3742, term3742.getClass(), "genres", null);
        setIntField(term3742, term3742.getClass(), "rate", 0);
        term3745 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3745;
        callMethod(klass, "rate", argTypes, term3742, args);
    }

};


