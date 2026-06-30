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

public class Film_getReleaseDate_16005712758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2569;

    public Film_getReleaseDate_16005712758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2602 = new HashMap();
        Set<Object> term2634 =  ((Map) term2602).keySet();
        HashSet term2601 = new HashSet((Collection<? extends Object>) term2634);
        HashMap term2608 = new HashMap();
        Set<Object> term2635 =  ((Map) term2608).keySet();
        HashSet term2607 = new HashSet((Collection<? extends Object>) term2635);
        term2569 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2594 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2599 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2569, term2569.getClass(), "name", "ZkMALXpEAZ");
        setField(term2569, term2569.getClass(), "description", "tXfQjSqDzN");
        setIntField(term2594, term2594.getClass(), "year", 2016);
        setShortField(term2594, term2594.getClass(), "month", (short) 6);
        setShortField(term2594, term2594.getClass(), "day", (short) 12);
        setField(term2569, term2569.getClass(), "releaseDate", term2594);
        setLongField(term2569, term2569.getClass(), "duration", 414749984815662075L);
        setField(term2599, term2599.getClass(), "name", null);
        setIntField(term2599, term2599.getClass(), "id", 0);
        setField(term2569, term2569.getClass(), "mpa", term2599);
        setField(term2569, term2569.getClass(), "genres", term2601);
        setField(term2569, term2569.getClass(), "likedUsers", term2607);
        setIntField(term2569, term2569.getClass(), "id", -1263114719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseDate", argTypes, term2569, args);
    }

};


