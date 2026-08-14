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

public class Film_setDescription_14893539238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2431;

    public Film_setDescription_14893539238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2476 = new HashMap();
        Set<Object> term2524 =  ((Map) term2476).keySet();
        HashSet term2475 = new HashSet((Collection<? extends Object>) term2524);
        term2431 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2461 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2431, term2431.getClass(), "name", "XqgfKFvPSD");
        setField(term2431, term2431.getClass(), "description", "JiVRgTZvKc");
        setIntField(term2456, term2456.getClass(), "year", 2019);
        setShortField(term2456, term2456.getClass(), "month", (short) 2);
        setShortField(term2456, term2456.getClass(), "day", (short) 20);
        setField(term2431, term2431.getClass(), "releaseDate", term2456);
        setLongField(term2431, term2431.getClass(), "duration", -7268507582722666254L);
        setField(term2461, term2461.getClass(), "name", "XPKmummaqg");
        setLongField(term2461, term2461.getClass(), "id", 5671808784468963649L);
        setField(term2431, term2431.getClass(), "mpa", term2461);
        setField(term2431, term2431.getClass(), "genres", term2475);
        setLongField(term2431, term2431.getClass(), "id", 2297097306706899827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BKLfkLiZTH";
        callMethod(klass, "setDescription", argTypes, term2431, args);
    }

};


