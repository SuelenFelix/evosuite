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

public class Film_canEqual_17996460114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2300;
     Object term2345;

    public Film_canEqual_17996460114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2333 = new HashMap();
        Set<Object> term2366 =  ((Map) term2333).keySet();
        HashSet term2332 = new HashSet((Collection<? extends Object>) term2366);
        HashMap term2339 = new HashMap();
        Set<Object> term2367 =  ((Map) term2339).keySet();
        HashSet term2338 = new HashSet((Collection<? extends Object>) term2367);
        term2300 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2325 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2330 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2300, term2300.getClass(), "name", "DhjNLmRMCu");
        setField(term2300, term2300.getClass(), "description", "PgPzMSEjjX");
        setIntField(term2325, term2325.getClass(), "year", 2010);
        setShortField(term2325, term2325.getClass(), "month", (short) 1);
        setShortField(term2325, term2325.getClass(), "day", (short) 20);
        setField(term2300, term2300.getClass(), "releaseDate", term2325);
        setLongField(term2300, term2300.getClass(), "duration", 2443640364875054177L);
        setField(term2330, term2330.getClass(), "name", null);
        setIntField(term2330, term2330.getClass(), "id", 0);
        setField(term2300, term2300.getClass(), "mpa", term2330);
        setField(term2300, term2300.getClass(), "genres", term2332);
        setField(term2300, term2300.getClass(), "likedUsers", term2338);
        setIntField(term2300, term2300.getClass(), "id", -344842608);
        term2345 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2345;
        callMethod(klass, "canEqual", argTypes, term2300, args);
    }

};


