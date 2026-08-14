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

public class Film_setMpa_206645532119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2145;
     Object term2221;

    public Film_setMpa_206645532119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2146 = new Long(4100236067313034103L);
        Integer term2176 = new Integer(1202361360);
        Integer term2179 = new Integer(-2015048153);
        HashMap term2194 = new HashMap();
        Set<Object> term2266 =  ((Map) term2194).keySet();
        HashSet term2193 = new HashSet((Collection<? extends Object>) term2266);
        HashMap term2211 = new HashMap();
        Set<Object> term2267 =  ((Map) term2211).keySet();
        HashSet term2210 = new HashSet((Collection<? extends Object>) term2267);
        Integer term2219 = new Integer(9726679);
        term2145 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term2172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2178 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term2145, term2145.getClass(), "id", term2146);
        setField(term2145, term2145.getClass(), "name", "ZzIujlwVsw");
        setField(term2145, term2145.getClass(), "description", "LWyEaeIyAo");
        setIntField(term2172, term2172.getClass(), "year", 2019);
        setShortField(term2172, term2172.getClass(), "month", (short) 2);
        setShortField(term2172, term2172.getClass(), "day", (short) 20);
        setField(term2145, term2145.getClass(), "releaseDate", term2172);
        setField(term2145, term2145.getClass(), "duration", term2176);
        setField(term2178, term2178.getClass(), "id", term2179);
        setField(term2178, term2178.getClass(), "name", "yVMkkQhvmN");
        setField(term2145, term2145.getClass(), "mpa", term2178);
        setField(term2145, term2145.getClass(), "genres", term2193);
        setField(term2145, term2145.getClass(), "likes", term2210);
        setField(term2145, term2145.getClass(), "rate", term2219);
        Integer term2222 = new Integer(-25637976);
        term2221 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term2221, term2221.getClass(), "id", term2222);
        setField(term2221, term2221.getClass(), "name", "FPvxVzzSvD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa");
        Object[] args = new Object[1];
        args[0] = term2221;
        callMethod(klass, "setMpa", argTypes, term2145, args);
    }

};


