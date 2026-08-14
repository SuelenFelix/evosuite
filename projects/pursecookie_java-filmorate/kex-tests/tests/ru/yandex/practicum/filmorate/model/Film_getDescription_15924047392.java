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

public class Film_getDescription_15924047392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1917;

    public Film_getDescription_15924047392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1962 = new HashMap();
        Set<Object> term1998 =  ((Map) term1962).keySet();
        HashSet term1961 = new HashSet((Collection<? extends Object>) term1998);
        term1917 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term1942 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1947 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term1917, term1917.getClass(), "name", "vQVyKLdtaz");
        setField(term1917, term1917.getClass(), "description", "OWKQODBLzb");
        setIntField(term1942, term1942.getClass(), "year", 2024);
        setShortField(term1942, term1942.getClass(), "month", (short) 1);
        setShortField(term1942, term1942.getClass(), "day", (short) 24);
        setField(term1917, term1917.getClass(), "releaseDate", term1942);
        setLongField(term1917, term1917.getClass(), "duration", -1832940336320585644L);
        setField(term1947, term1947.getClass(), "name", "wGmYcqUkgE");
        setLongField(term1947, term1947.getClass(), "id", -8033714905181142681L);
        setField(term1917, term1917.getClass(), "mpa", term1947);
        setField(term1917, term1917.getClass(), "genres", term1961);
        setLongField(term1917, term1917.getClass(), "id", -9040825890007374809L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term1917, args);
    }

};


