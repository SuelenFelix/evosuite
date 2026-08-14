package ru.yandex.practicum.filmorate.model.film;

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
import static ru.yandex.practicum.filmorate.model.film.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Film_setRate_100841960922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2542;
     Object term2622;

    public Film_setRate_100841960922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2543 = new Long(8863790908271299748L);
        Integer term2573 = new Integer(-1388471422);
        Integer term2576 = new Integer(-1498296052);
        HashMap term2591 = new HashMap();
        Set<Object> term2654 =  ((Map) term2591).keySet();
        HashSet term2590 = new HashSet((Collection<? extends Object>) term2654);
        HashMap term2602 = new HashMap();
        Set<Object> term2655 =  ((Map) term2602).keySet();
        HashSet term2601 = new HashSet((Collection<? extends Object>) term2655);
        Integer term2620 = new Integer(1830648570);
        term2542 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term2569 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2575 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term2542, term2542.getClass(), "id", term2543);
        setField(term2542, term2542.getClass(), "name", "XkIoWJRNwN");
        setField(term2542, term2542.getClass(), "description", "aNWLJdrZMq");
        setIntField(term2569, term2569.getClass(), "year", 2025);
        setShortField(term2569, term2569.getClass(), "month", (short) 4);
        setShortField(term2569, term2569.getClass(), "day", (short) 8);
        setField(term2542, term2542.getClass(), "releaseDate", term2569);
        setField(term2542, term2542.getClass(), "duration", term2573);
        setField(term2575, term2575.getClass(), "id", term2576);
        setField(term2575, term2575.getClass(), "name", "HHmNoYxIGj");
        setField(term2542, term2542.getClass(), "mpa", term2575);
        setField(term2542, term2542.getClass(), "genres", term2590);
        setField(term2542, term2542.getClass(), "likes", term2601);
        setField(term2542, term2542.getClass(), "rate", term2620);
        term2622 = new Integer(-227365013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2622;
        callMethod(klass, "setRate", argTypes, term2542, args);
    }

};


