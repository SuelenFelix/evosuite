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
import java.lang.Long;

public class Film_setDuration_154355910610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2621;
     Object term2672;

    public Film_setDuration_154355910610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2666 = new HashMap();
        Set<Object> term2704 =  ((Map) term2666).keySet();
        HashSet term2665 = new HashSet((Collection<? extends Object>) term2704);
        term2621 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2651 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2621, term2621.getClass(), "name", "vjxIhXHxGR");
        setField(term2621, term2621.getClass(), "description", "QXzGXbEXMu");
        setIntField(term2646, term2646.getClass(), "year", 2025);
        setShortField(term2646, term2646.getClass(), "month", (short) 4);
        setShortField(term2646, term2646.getClass(), "day", (short) 8);
        setField(term2621, term2621.getClass(), "releaseDate", term2646);
        setLongField(term2621, term2621.getClass(), "duration", 3620247240684476031L);
        setField(term2651, term2651.getClass(), "name", "qxSDVejjiY");
        setLongField(term2651, term2651.getClass(), "id", 8313800941204938919L);
        setField(term2621, term2621.getClass(), "mpa", term2651);
        setField(term2621, term2621.getClass(), "genres", term2665);
        setLongField(term2621, term2621.getClass(), "id", -1214968196781083707L);
        term2672 = new Long(-1804015692891701666L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2672;
        callMethod(klass, "setDuration", argTypes, term2621, args);
    }

};


