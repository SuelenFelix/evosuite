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

public class Film_equals_16911586563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2232;
     Object term2277;

    public Film_equals_16911586563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2265 = new HashMap();
        Set<Object> term2298 =  ((Map) term2265).keySet();
        HashSet term2264 = new HashSet((Collection<? extends Object>) term2298);
        HashMap term2271 = new HashMap();
        Set<Object> term2299 =  ((Map) term2271).keySet();
        HashSet term2270 = new HashSet((Collection<? extends Object>) term2299);
        term2232 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2262 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2232, term2232.getClass(), "name", "OqbwYQfvAe");
        setField(term2232, term2232.getClass(), "description", "tRxZafjqIx");
        setIntField(term2257, term2257.getClass(), "year", 2018);
        setShortField(term2257, term2257.getClass(), "month", (short) 7);
        setShortField(term2257, term2257.getClass(), "day", (short) 11);
        setField(term2232, term2232.getClass(), "releaseDate", term2257);
        setLongField(term2232, term2232.getClass(), "duration", 7994303628307559416L);
        setField(term2262, term2262.getClass(), "name", null);
        setIntField(term2262, term2262.getClass(), "id", 0);
        setField(term2232, term2232.getClass(), "mpa", term2262);
        setField(term2232, term2232.getClass(), "genres", term2264);
        setField(term2232, term2232.getClass(), "likedUsers", term2270);
        setIntField(term2232, term2232.getClass(), "id", -505439934);
        term2277 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2277;
        callMethod(klass, "equals", argTypes, term2232, args);
    }

};


