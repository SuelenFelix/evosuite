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

public class Film_setName_13198311207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2327;

    public Film_setName_13198311207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2372 = new HashMap();
        Set<Object> term2420 =  ((Map) term2372).keySet();
        HashSet term2371 = new HashSet((Collection<? extends Object>) term2420);
        term2327 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2357 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2327, term2327.getClass(), "name", "GVizqqzXpy");
        setField(term2327, term2327.getClass(), "description", "JqXGgAhZPl");
        setIntField(term2352, term2352.getClass(), "year", 2024);
        setShortField(term2352, term2352.getClass(), "month", (short) 8);
        setShortField(term2352, term2352.getClass(), "day", (short) 31);
        setField(term2327, term2327.getClass(), "releaseDate", term2352);
        setLongField(term2327, term2327.getClass(), "duration", -4393710401270724527L);
        setField(term2357, term2357.getClass(), "name", "jiKYgYHqIS");
        setLongField(term2357, term2357.getClass(), "id", -4822736661741380518L);
        setField(term2327, term2327.getClass(), "mpa", term2357);
        setField(term2327, term2327.getClass(), "genres", term2371);
        setLongField(term2327, term2327.getClass(), "id", -5386201758403679145L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DfISiziTgG";
        callMethod(klass, "setName", argTypes, term2327, args);
    }

};


