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

public class Film_setReleaseDate_149277904936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3604;

    public Film_setReleaseDate_149277904936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3604 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        setField(term3604, term3604.getClass(), "name", null);
        setField(term3604, term3604.getClass(), "description", null);
        setField(term3604, term3604.getClass(), "releaseDate", null);
        setLongField(term3604, term3604.getClass(), "duration", 0L);
        setField(term3604, term3604.getClass(), "mpa", null);
        setField(term3604, term3604.getClass(), "genres", null);
        setField(term3604, term3604.getClass(), "likedUsers", null);
        setIntField(term3604, term3604.getClass(), "id", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setReleaseDate", argTypes, term3604, args);
    }

};


