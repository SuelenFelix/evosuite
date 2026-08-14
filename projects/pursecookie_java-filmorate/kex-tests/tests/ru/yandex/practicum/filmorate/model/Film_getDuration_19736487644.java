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

public class Film_getDuration_19736487644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2081;

    public Film_getDuration_19736487644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2126 = new HashMap();
        Set<Object> term2162 =  ((Map) term2126).keySet();
        HashSet term2125 = new HashSet((Collection<? extends Object>) term2162);
        term2081 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2106 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2111 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2081, term2081.getClass(), "name", "bWWfajKbEX");
        setField(term2081, term2081.getClass(), "description", "cAPeiZHKGJ");
        setIntField(term2106, term2106.getClass(), "year", 2029);
        setShortField(term2106, term2106.getClass(), "month", (short) 8);
        setShortField(term2106, term2106.getClass(), "day", (short) 28);
        setField(term2081, term2081.getClass(), "releaseDate", term2106);
        setLongField(term2081, term2081.getClass(), "duration", 7276637106827860087L);
        setField(term2111, term2111.getClass(), "name", "LvJFtLBaxj");
        setLongField(term2111, term2111.getClass(), "id", -3936701866695933852L);
        setField(term2081, term2081.getClass(), "mpa", term2111);
        setField(term2081, term2081.getClass(), "genres", term2125);
        setLongField(term2081, term2081.getClass(), "id", 1215116475929634177L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term2081, args);
    }

};


