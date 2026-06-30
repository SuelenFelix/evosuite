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

public class Film_hashCode_12424719815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2368;

    public Film_hashCode_12424719815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2401 = new HashMap();
        Set<Object> term2433 =  ((Map) term2401).keySet();
        HashSet term2400 = new HashSet((Collection<? extends Object>) term2433);
        HashMap term2407 = new HashMap();
        Set<Object> term2434 =  ((Map) term2407).keySet();
        HashSet term2406 = new HashSet((Collection<? extends Object>) term2434);
        term2368 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2393 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2398 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2368, term2368.getClass(), "name", "wzsPSPcRdj");
        setField(term2368, term2368.getClass(), "description", "kGMQdqJYyB");
        setIntField(term2393, term2393.getClass(), "year", 2015);
        setShortField(term2393, term2393.getClass(), "month", (short) 12);
        setShortField(term2393, term2393.getClass(), "day", (short) 23);
        setField(term2368, term2368.getClass(), "releaseDate", term2393);
        setLongField(term2368, term2368.getClass(), "duration", -1610676979013636850L);
        setField(term2398, term2398.getClass(), "name", null);
        setIntField(term2398, term2398.getClass(), "id", 0);
        setField(term2368, term2368.getClass(), "mpa", term2398);
        setField(term2368, term2368.getClass(), "genres", term2400);
        setField(term2368, term2368.getClass(), "likedUsers", term2406);
        setIntField(term2368, term2368.getClass(), "id", 941650513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2368, args);
    }

};


