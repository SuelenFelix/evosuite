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

public class Film_setReleaseDate_14927790499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2535;
     Object term2586;

    public Film_setReleaseDate_14927790499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2580 = new HashMap();
        Set<Object> term2620 =  ((Map) term2580).keySet();
        HashSet term2579 = new HashSet((Collection<? extends Object>) term2620);
        term2535 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2565 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2535, term2535.getClass(), "name", "SPpkrGcPRr");
        setField(term2535, term2535.getClass(), "description", "sEccwbJKYE");
        setIntField(term2560, term2560.getClass(), "year", 2027);
        setShortField(term2560, term2560.getClass(), "month", (short) 3);
        setShortField(term2560, term2560.getClass(), "day", (short) 14);
        setField(term2535, term2535.getClass(), "releaseDate", term2560);
        setLongField(term2535, term2535.getClass(), "duration", -900457279156388404L);
        setField(term2565, term2565.getClass(), "name", "AWRooQKkdW");
        setLongField(term2565, term2565.getClass(), "id", 1084801489398441516L);
        setField(term2535, term2535.getClass(), "mpa", term2565);
        setField(term2535, term2535.getClass(), "genres", term2579);
        setLongField(term2535, term2535.getClass(), "id", 6273754186658578034L);
        term2586 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2586, term2586.getClass(), "year", 2018);
        setShortField(term2586, term2586.getClass(), "month", (short) 9);
        setShortField(term2586, term2586.getClass(), "day", (short) 27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2586;
        callMethod(klass, "setReleaseDate", argTypes, term2535, args);
    }

};


