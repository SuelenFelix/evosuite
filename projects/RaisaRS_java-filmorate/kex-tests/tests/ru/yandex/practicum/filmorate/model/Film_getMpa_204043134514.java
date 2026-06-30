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

public class Film_getMpa_204043134514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6347;

    public Film_getMpa_204043134514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6405 = new HashMap();
        Set<Object> term6488 =  ((Map) term6405).keySet();
        HashSet term6404 = new HashSet((Collection<? extends Object>) term6488);
        HashMap term6422 = new HashMap();
        Set<Object> term6489 =  ((Map) term6422).keySet();
        HashSet term6421 = new HashSet((Collection<? extends Object>) term6489);
        term6347 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term6373 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6378 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term6347, term6347.getClass(), "id", 4474998035090263139L);
        setField(term6347, term6347.getClass(), "name", "SOrEHbcbmn");
        setField(term6347, term6347.getClass(), "description", "bnsyeQXFdu");
        setIntField(term6373, term6373.getClass(), "year", 2025);
        setShortField(term6373, term6373.getClass(), "month", (short) 11);
        setShortField(term6373, term6373.getClass(), "day", (short) 1);
        setField(term6347, term6347.getClass(), "releaseDate", term6373);
        setIntField(term6347, term6347.getClass(), "duration", 1474524152);
        setIntField(term6378, term6378.getClass(), "id", 568954359);
        setField(term6378, term6378.getClass(), "name", "BwtdjiefJn");
        setField(term6378, term6378.getClass(), "description", "jDmhBrIoDa");
        setField(term6347, term6347.getClass(), "mpa", term6378);
        setField(term6347, term6347.getClass(), "genres", term6404);
        setField(term6347, term6347.getClass(), "likes", term6421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMpa", argTypes, term6347, args);
    }

};


