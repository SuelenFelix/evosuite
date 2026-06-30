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

public class Film_filmValue_10370628436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5452;

    public Film_filmValue_10370628436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5510 = new HashMap();
        Set<Object> term5591 =  ((Map) term5510).keySet();
        HashSet term5509 = new HashSet((Collection<? extends Object>) term5591);
        HashMap term5521 = new HashMap();
        Set<Object> term5592 =  ((Map) term5521).keySet();
        HashSet term5520 = new HashSet((Collection<? extends Object>) term5592);
        term5452 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5483 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term5452, term5452.getClass(), "id", 50358265865610362L);
        setField(term5452, term5452.getClass(), "name", "hOncybyCAH");
        setField(term5452, term5452.getClass(), "description", "QduALnDSVo");
        setIntField(term5478, term5478.getClass(), "year", 2023);
        setShortField(term5478, term5478.getClass(), "month", (short) 3);
        setShortField(term5478, term5478.getClass(), "day", (short) 7);
        setField(term5452, term5452.getClass(), "releaseDate", term5478);
        setIntField(term5452, term5452.getClass(), "duration", 1655935355);
        setIntField(term5483, term5483.getClass(), "id", -481533957);
        setField(term5483, term5483.getClass(), "name", "izPpKDErnQ");
        setField(term5483, term5483.getClass(), "description", "NnpwZBUTvx");
        setField(term5452, term5452.getClass(), "mpa", term5483);
        setField(term5452, term5452.getClass(), "genres", term5509);
        setField(term5452, term5452.getClass(), "likes", term5520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "filmValue", argTypes, term5452, args);
    }

};


