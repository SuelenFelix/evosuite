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

public class Film_getMpa_136159666010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2703;

    public Film_getMpa_136159666010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2736 = new HashMap();
        Set<Object> term2768 =  ((Map) term2736).keySet();
        HashSet term2735 = new HashSet((Collection<? extends Object>) term2768);
        HashMap term2742 = new HashMap();
        Set<Object> term2769 =  ((Map) term2742).keySet();
        HashSet term2741 = new HashSet((Collection<? extends Object>) term2769);
        term2703 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2733 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2703, term2703.getClass(), "name", "tlzpzIjMib");
        setField(term2703, term2703.getClass(), "description", "AZdLeSugwv");
        setIntField(term2728, term2728.getClass(), "year", 2012);
        setShortField(term2728, term2728.getClass(), "month", (short) 12);
        setShortField(term2728, term2728.getClass(), "day", (short) 5);
        setField(term2703, term2703.getClass(), "releaseDate", term2728);
        setLongField(term2703, term2703.getClass(), "duration", 305759998609888272L);
        setField(term2733, term2733.getClass(), "name", null);
        setIntField(term2733, term2733.getClass(), "id", 0);
        setField(term2703, term2703.getClass(), "mpa", term2733);
        setField(term2703, term2703.getClass(), "genres", term2735);
        setField(term2703, term2703.getClass(), "likedUsers", term2741);
        setIntField(term2703, term2703.getClass(), "id", 304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMpa", argTypes, term2703, args);
    }

};


