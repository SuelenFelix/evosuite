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

public class Film_getName_4000454486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2435;

    public Film_getName_4000454486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2468 = new HashMap();
        Set<Object> term2500 =  ((Map) term2468).keySet();
        HashSet term2467 = new HashSet((Collection<? extends Object>) term2500);
        HashMap term2474 = new HashMap();
        Set<Object> term2501 =  ((Map) term2474).keySet();
        HashSet term2473 = new HashSet((Collection<? extends Object>) term2501);
        term2435 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2465 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2435, term2435.getClass(), "name", "XJJNClzHRf");
        setField(term2435, term2435.getClass(), "description", "HDaezxQfQR");
        setIntField(term2460, term2460.getClass(), "year", 2016);
        setShortField(term2460, term2460.getClass(), "month", (short) 7);
        setShortField(term2460, term2460.getClass(), "day", (short) 6);
        setField(term2435, term2435.getClass(), "releaseDate", term2460);
        setLongField(term2435, term2435.getClass(), "duration", 2062173786000223358L);
        setField(term2465, term2465.getClass(), "name", null);
        setIntField(term2465, term2465.getClass(), "id", 0);
        setField(term2435, term2435.getClass(), "mpa", term2465);
        setField(term2435, term2435.getClass(), "genres", term2467);
        setField(term2435, term2435.getClass(), "likedUsers", term2473);
        setIntField(term2435, term2435.getClass(), "id", 444029505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term2435, args);
    }

};


