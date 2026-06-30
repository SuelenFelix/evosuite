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

public class Film_createGenre_11122939413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4983;
     Object term5080;

    public Film_createGenre_11122939413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5041 = new HashMap();
        Set<Object> term5134 =  ((Map) term5041).keySet();
        HashSet term5040 = new HashSet((Collection<? extends Object>) term5134);
        HashMap term5054 = new HashMap();
        Set<Object> term5135 =  ((Map) term5054).keySet();
        HashSet term5053 = new HashSet((Collection<? extends Object>) term5135);
        term4983 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5014 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term4983, term4983.getClass(), "id", -5963439350418910964L);
        setField(term4983, term4983.getClass(), "name", "RbVQXSpxXy");
        setField(term4983, term4983.getClass(), "description", "YpJbIgJWWv");
        setIntField(term5009, term5009.getClass(), "year", 2016);
        setShortField(term5009, term5009.getClass(), "month", (short) 5);
        setShortField(term5009, term5009.getClass(), "day", (short) 28);
        setField(term4983, term4983.getClass(), "releaseDate", term5009);
        setIntField(term4983, term4983.getClass(), "duration", 97029295);
        setIntField(term5014, term5014.getClass(), "id", -1371869594);
        setField(term5014, term5014.getClass(), "name", "JppkknKVOw");
        setField(term5014, term5014.getClass(), "description", "iljANwuEjk");
        setField(term4983, term4983.getClass(), "mpa", term5014);
        setField(term4983, term4983.getClass(), "genres", term5040);
        setField(term4983, term4983.getClass(), "likes", term5053);
        term5080 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setIntField(term5080, term5080.getClass(), "id", -1588772968);
        setField(term5080, term5080.getClass(), "name", "sZdUNdggUW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Genre");
        Object[] args = new Object[1];
        args[0] = term5080;
        callMethod(klass, "createGenre", argTypes, term4983, args);
    }

};


