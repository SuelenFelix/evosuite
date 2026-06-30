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
import java.lang.Integer;

public class Film_addGenre_15751820452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2141;
     Object term2186;

    public Film_addGenre_15751820452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2174 = new HashMap();
        Set<Object> term2220 =  ((Map) term2174).keySet();
        HashSet term2173 = new HashSet((Collection<? extends Object>) term2220);
        HashMap term2180 = new HashMap();
        Set<Object> term2221 =  ((Map) term2180).keySet();
        HashSet term2179 = new HashSet((Collection<? extends Object>) term2221);
        term2141 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2166 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2171 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2141, term2141.getClass(), "name", "vKQukfbJUd");
        setField(term2141, term2141.getClass(), "description", "lFRJFUMVbx");
        setIntField(term2166, term2166.getClass(), "year", 2019);
        setShortField(term2166, term2166.getClass(), "month", (short) 10);
        setShortField(term2166, term2166.getClass(), "day", (short) 10);
        setField(term2141, term2141.getClass(), "releaseDate", term2166);
        setLongField(term2141, term2141.getClass(), "duration", 5953383087795962419L);
        setField(term2171, term2171.getClass(), "name", null);
        setIntField(term2171, term2171.getClass(), "id", 0);
        setField(term2141, term2141.getClass(), "mpa", term2171);
        setField(term2141, term2141.getClass(), "genres", term2173);
        setField(term2141, term2141.getClass(), "likedUsers", term2179);
        setIntField(term2141, term2141.getClass(), "id", -1772434990);
        term2186 = new Integer(-1845499264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2186;
        args[1] = "sZdUNdggUW";
        callMethod(klass, "addGenre", argTypes, term2141, args);
    }

};


