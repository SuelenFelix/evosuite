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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Film_deleteGenre_13426214225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5281;
     Object term5386;

    public Film_deleteGenre_13426214225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5339 = new HashMap();
        Set<Object> term5440 =  ((Map) term5339).keySet();
        HashSet term5338 = new HashSet((Collection<? extends Object>) term5440);
        HashMap term5352 = new HashMap();
        Set<Object> term5441 =  ((Map) term5352).keySet();
        HashSet term5351 = new HashSet((Collection<? extends Object>) term5441);
        term5281 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5307 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5312 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term5281, term5281.getClass(), "id", 7862575738391801707L);
        setField(term5281, term5281.getClass(), "name", "ZkMALXpEAZ");
        setField(term5281, term5281.getClass(), "description", "tXfQjSqDzN");
        setIntField(term5307, term5307.getClass(), "year", 2027);
        setShortField(term5307, term5307.getClass(), "month", (short) 10);
        setShortField(term5307, term5307.getClass(), "day", (short) 4);
        setField(term5281, term5281.getClass(), "releaseDate", term5307);
        setIntField(term5281, term5281.getClass(), "duration", 1551099402);
        setIntField(term5312, term5312.getClass(), "id", -2027534003);
        setField(term5312, term5312.getClass(), "name", "BjugTaMcxJ");
        setField(term5312, term5312.getClass(), "description", "vGiuZVPJNH");
        setField(term5281, term5281.getClass(), "mpa", term5312);
        setField(term5281, term5281.getClass(), "genres", term5338);
        setField(term5281, term5281.getClass(), "likes", term5351);
        term5386 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setIntField(term5386, term5386.getClass(), "id", 972867650);
        setField(term5386, term5386.getClass(), "name", "FwPbDZcHmB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Genre");
        Object[] args = new Object[1];
        args[0] = term5386;
        callMethod(klass, "deleteGenre", argTypes, term5281, args);
    }

};


