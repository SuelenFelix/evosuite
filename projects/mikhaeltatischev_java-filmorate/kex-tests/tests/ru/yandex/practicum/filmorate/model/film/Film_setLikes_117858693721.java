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

public class Film_setLikes_117858693721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2394;
     Object term2459;

    public Film_setLikes_117858693721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2395 = new Long(-1677189124507026637L);
        Integer term2425 = new Integer(-430151637);
        Integer term2428 = new Integer(-1697741339);
        HashMap term2443 = new HashMap();
        Set<Object> term2539 =  ((Map) term2443).keySet();
        HashSet term2442 = new HashSet((Collection<? extends Object>) term2539);
        HashMap term2449 = new HashMap();
        Set<Object> term2540 =  ((Map) term2449).keySet();
        HashSet term2448 = new HashSet((Collection<? extends Object>) term2540);
        Integer term2457 = new Integer(98922530);
        term2394 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term2421 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2427 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term2394, term2394.getClass(), "id", term2395);
        setField(term2394, term2394.getClass(), "name", "ZfdXfCCFDf");
        setField(term2394, term2394.getClass(), "description", "MwwjNtdOFT");
        setIntField(term2421, term2421.getClass(), "year", 2018);
        setShortField(term2421, term2421.getClass(), "month", (short) 9);
        setShortField(term2421, term2421.getClass(), "day", (short) 27);
        setField(term2394, term2394.getClass(), "releaseDate", term2421);
        setField(term2394, term2394.getClass(), "duration", term2425);
        setField(term2427, term2427.getClass(), "id", term2428);
        setField(term2427, term2427.getClass(), "name", "VYkqXKVlAJ");
        setField(term2394, term2394.getClass(), "mpa", term2427);
        setField(term2394, term2394.getClass(), "genres", term2442);
        setField(term2394, term2394.getClass(), "likes", term2448);
        setField(term2394, term2394.getClass(), "rate", term2457);
        HashMap term2460 = new HashMap();
        Set<Object> term2541 =  ((Map) term2460).keySet();
        term2459 = new HashSet((Collection<? extends Object>) term2541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term2459;
        callMethod(klass, "setLikes", argTypes, term2394, args);
    }

};


