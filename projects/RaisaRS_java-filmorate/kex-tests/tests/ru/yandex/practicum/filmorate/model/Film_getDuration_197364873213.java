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

public class Film_getDuration_197364873213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6206;

    public Film_getDuration_197364873213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6264 = new HashMap();
        Set<Object> term6345 =  ((Map) term6264).keySet();
        HashSet term6263 = new HashSet((Collection<? extends Object>) term6345);
        HashMap term6287 = new HashMap();
        Set<Object> term6346 =  ((Map) term6287).keySet();
        HashSet term6286 = new HashSet((Collection<? extends Object>) term6346);
        term6206 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term6232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6237 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term6206, term6206.getClass(), "id", 2701184207686293431L);
        setField(term6206, term6206.getClass(), "name", "UBRmXJmfrt");
        setField(term6206, term6206.getClass(), "description", "WZzvmIHhzZ");
        setIntField(term6232, term6232.getClass(), "year", 2025);
        setShortField(term6232, term6232.getClass(), "month", (short) 3);
        setShortField(term6232, term6232.getClass(), "day", (short) 8);
        setField(term6206, term6206.getClass(), "releaseDate", term6232);
        setIntField(term6206, term6206.getClass(), "duration", -1801760683);
        setIntField(term6237, term6237.getClass(), "id", 1141317871);
        setField(term6237, term6237.getClass(), "name", "doQLHkjpNm");
        setField(term6237, term6237.getClass(), "description", "lCyLIcSuom");
        setField(term6206, term6206.getClass(), "mpa", term6237);
        setField(term6206, term6206.getClass(), "genres", term6263);
        setField(term6206, term6206.getClass(), "likes", term6286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term6206, args);
    }

};


