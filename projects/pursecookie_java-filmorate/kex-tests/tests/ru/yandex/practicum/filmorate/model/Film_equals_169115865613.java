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

public class Film_equals_169115865613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2906;
     Object term2957;

    public Film_equals_169115865613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2951 = new HashMap();
        Set<Object> term2988 =  ((Map) term2951).keySet();
        HashSet term2950 = new HashSet((Collection<? extends Object>) term2988);
        term2906 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2931 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2936 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2906, term2906.getClass(), "name", "yGtHPyvYiQ");
        setField(term2906, term2906.getClass(), "description", "MvRIxilFMJ");
        setIntField(term2931, term2931.getClass(), "year", 2021);
        setShortField(term2931, term2931.getClass(), "month", (short) 9);
        setShortField(term2931, term2931.getClass(), "day", (short) 6);
        setField(term2906, term2906.getClass(), "releaseDate", term2931);
        setLongField(term2906, term2906.getClass(), "duration", 7495904023107549024L);
        setField(term2936, term2936.getClass(), "name", "iNwOJRBEjp");
        setLongField(term2936, term2936.getClass(), "id", 8802866251294305945L);
        setField(term2906, term2906.getClass(), "mpa", term2936);
        setField(term2906, term2906.getClass(), "genres", term2950);
        setLongField(term2906, term2906.getClass(), "id", 4513004407927379358L);
        term2957 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2957;
        callMethod(klass, "equals", argTypes, term2906, args);
    }

};


