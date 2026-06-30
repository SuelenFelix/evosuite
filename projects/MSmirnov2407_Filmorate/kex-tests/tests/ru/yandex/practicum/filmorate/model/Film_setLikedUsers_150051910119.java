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

public class Film_setLikedUsers_150051910119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3419;
     Object term3464;

    public Film_setLikedUsers_150051910119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3452 = new HashMap();
        Set<Object> term3490 =  ((Map) term3452).keySet();
        HashSet term3451 = new HashSet((Collection<? extends Object>) term3490);
        HashMap term3458 = new HashMap();
        Set<Object> term3491 =  ((Map) term3458).keySet();
        HashSet term3457 = new HashSet((Collection<? extends Object>) term3491);
        term3419 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3444 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3449 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term3419, term3419.getClass(), "name", "MHGKyEnwKc");
        setField(term3419, term3419.getClass(), "description", "ShIELyuULw");
        setIntField(term3444, term3444.getClass(), "year", 2017);
        setShortField(term3444, term3444.getClass(), "month", (short) 11);
        setShortField(term3444, term3444.getClass(), "day", (short) 9);
        setField(term3419, term3419.getClass(), "releaseDate", term3444);
        setLongField(term3419, term3419.getClass(), "duration", 7862575738391801707L);
        setField(term3449, term3449.getClass(), "name", null);
        setIntField(term3449, term3449.getClass(), "id", 0);
        setField(term3419, term3419.getClass(), "mpa", term3449);
        setField(term3419, term3419.getClass(), "genres", term3451);
        setField(term3419, term3419.getClass(), "likedUsers", term3457);
        setIntField(term3419, term3419.getClass(), "id", 906181092);
        HashMap term3465 = new HashMap();
        Set<Object> term3492 =  ((Map) term3465).keySet();
        term3464 = new HashSet((Collection<? extends Object>) term3492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term3464;
        callMethod(klass, "setLikedUsers", argTypes, term3419, args);
    }

};


