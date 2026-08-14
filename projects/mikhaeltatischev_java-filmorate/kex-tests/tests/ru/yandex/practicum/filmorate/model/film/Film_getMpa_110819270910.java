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

public class Film_getMpa_110819270910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1077;

    public Film_getMpa_110819270910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1078 = new Long(-7291743527973326814L);
        Integer term1108 = new Integer(-1371869594);
        Integer term1111 = new Integer(-2095575670);
        HashMap term1126 = new HashMap();
        Set<Object> term1197 =  ((Map) term1126).keySet();
        HashSet term1125 = new HashSet((Collection<? extends Object>) term1197);
        HashMap term1147 = new HashMap();
        Set<Object> term1198 =  ((Map) term1147).keySet();
        HashSet term1146 = new HashSet((Collection<? extends Object>) term1198);
        Integer term1165 = new Integer(1540719661);
        term1077 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term1104 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1110 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term1077, term1077.getClass(), "id", term1078);
        setField(term1077, term1077.getClass(), "name", "eqJfYWRaEL");
        setField(term1077, term1077.getClass(), "description", "fhkbdRViHi");
        setIntField(term1104, term1104.getClass(), "year", 2026);
        setShortField(term1104, term1104.getClass(), "month", (short) 12);
        setShortField(term1104, term1104.getClass(), "day", (short) 13);
        setField(term1077, term1077.getClass(), "releaseDate", term1104);
        setField(term1077, term1077.getClass(), "duration", term1108);
        setField(term1110, term1110.getClass(), "id", term1111);
        setField(term1110, term1110.getClass(), "name", "uWHnvSvaPl");
        setField(term1077, term1077.getClass(), "mpa", term1110);
        setField(term1077, term1077.getClass(), "genres", term1125);
        setField(term1077, term1077.getClass(), "likes", term1146);
        setField(term1077, term1077.getClass(), "rate", term1165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMpa", argTypes, term1077, args);
    }

};


