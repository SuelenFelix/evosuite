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

public class Film_getDescription_15924047397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2502;

    public Film_getDescription_15924047397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2535 = new HashMap();
        Set<Object> term2567 =  ((Map) term2535).keySet();
        HashSet term2534 = new HashSet((Collection<? extends Object>) term2567);
        HashMap term2541 = new HashMap();
        Set<Object> term2568 =  ((Map) term2541).keySet();
        HashSet term2540 = new HashSet((Collection<? extends Object>) term2568);
        term2502 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2527 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2532 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2502, term2502.getClass(), "name", "iikZEapDlu");
        setField(term2502, term2502.getClass(), "description", "nhoHrZfnIN");
        setIntField(term2527, term2527.getClass(), "year", 2027);
        setShortField(term2527, term2527.getClass(), "month", (short) 11);
        setShortField(term2527, term2527.getClass(), "day", (short) 7);
        setField(term2502, term2502.getClass(), "releaseDate", term2527);
        setLongField(term2502, term2502.getClass(), "duration", -8658027316505137504L);
        setField(term2532, term2532.getClass(), "name", null);
        setIntField(term2532, term2532.getClass(), "id", 0);
        setField(term2502, term2502.getClass(), "mpa", term2532);
        setField(term2502, term2502.getClass(), "genres", term2534);
        setField(term2502, term2502.getClass(), "likedUsers", term2540);
        setIntField(term2502, term2502.getClass(), "id", -1034506028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term2502, args);
    }

};


