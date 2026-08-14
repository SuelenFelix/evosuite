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

public class Film_getGenres_17490318026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2245;

    public Film_getGenres_17490318026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2290 = new HashMap();
        Set<Object> term2326 =  ((Map) term2290).keySet();
        HashSet term2289 = new HashSet((Collection<? extends Object>) term2326);
        term2245 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2270 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2275 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2245, term2245.getClass(), "name", "jSpAteRute");
        setField(term2245, term2245.getClass(), "description", "swZVeJAxjt");
        setIntField(term2270, term2270.getClass(), "year", 2022);
        setShortField(term2270, term2270.getClass(), "month", (short) 11);
        setShortField(term2270, term2270.getClass(), "day", (short) 16);
        setField(term2245, term2245.getClass(), "releaseDate", term2270);
        setLongField(term2245, term2245.getClass(), "duration", 1667122142089513324L);
        setField(term2275, term2275.getClass(), "name", "xOcJIiQQDu");
        setLongField(term2275, term2275.getClass(), "id", -6342139649364011743L);
        setField(term2245, term2245.getClass(), "mpa", term2275);
        setField(term2245, term2245.getClass(), "genres", term2289);
        setLongField(term2245, term2245.getClass(), "id", -4924950707540628022L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenres", argTypes, term2245, args);
    }

};


