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

public class Film_getMpa_20404313455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2163;

    public Film_getMpa_20404313455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2208 = new HashMap();
        Set<Object> term2244 =  ((Map) term2208).keySet();
        HashSet term2207 = new HashSet((Collection<? extends Object>) term2244);
        term2163 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2188 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2193 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2163, term2163.getClass(), "name", "PHvxnGHptP");
        setField(term2163, term2163.getClass(), "description", "TimdotUuNC");
        setIntField(term2188, term2188.getClass(), "year", 2015);
        setShortField(term2188, term2188.getClass(), "month", (short) 7);
        setShortField(term2188, term2188.getClass(), "day", (short) 24);
        setField(term2163, term2163.getClass(), "releaseDate", term2188);
        setLongField(term2163, term2163.getClass(), "duration", 1597484336218508869L);
        setField(term2193, term2193.getClass(), "name", "PkWMRdJcBb");
        setLongField(term2193, term2193.getClass(), "id", -685023850445639859L);
        setField(term2163, term2163.getClass(), "mpa", term2193);
        setField(term2163, term2163.getClass(), "genres", term2207);
        setLongField(term2163, term2163.getClass(), "id", -6950146046121430355L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMpa", argTypes, term2163, args);
    }

};


