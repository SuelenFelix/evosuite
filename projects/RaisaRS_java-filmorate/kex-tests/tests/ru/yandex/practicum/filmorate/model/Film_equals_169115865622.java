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

public class Film_equals_169115865622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7560;
     Object term7663;

    public Film_equals_169115865622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7618 = new HashMap();
        Set<Object> term7704 =  ((Map) term7618).keySet();
        HashSet term7617 = new HashSet((Collection<? extends Object>) term7704);
        HashMap term7629 = new HashMap();
        Set<Object> term7705 =  ((Map) term7629).keySet();
        HashSet term7628 = new HashSet((Collection<? extends Object>) term7705);
        term7560 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term7586 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7591 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term7560, term7560.getClass(), "id", 7247160664318067468L);
        setField(term7560, term7560.getClass(), "name", "RxbhrFBjkO");
        setField(term7560, term7560.getClass(), "description", "aanyiAOJCl");
        setIntField(term7586, term7586.getClass(), "year", 2025);
        setShortField(term7586, term7586.getClass(), "month", (short) 11);
        setShortField(term7586, term7586.getClass(), "day", (short) 3);
        setField(term7560, term7560.getClass(), "releaseDate", term7586);
        setIntField(term7560, term7560.getClass(), "duration", 1557431527);
        setIntField(term7591, term7591.getClass(), "id", -1504890659);
        setField(term7591, term7591.getClass(), "name", "VDokbsCuqq");
        setField(term7591, term7591.getClass(), "description", "xClUIcPECX");
        setField(term7560, term7560.getClass(), "mpa", term7591);
        setField(term7560, term7560.getClass(), "genres", term7617);
        setField(term7560, term7560.getClass(), "likes", term7628);
        term7663 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7663;
        callMethod(klass, "equals", argTypes, term7560, args);
    }

};


