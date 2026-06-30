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
import java.lang.Integer;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Film_getDescription_15924047394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3272;

    public Film_getDescription_15924047394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3273 = new Integer(579005622);
        Integer term3303 = new Integer(-14890619);
        LinkedHashMap term3320 = new LinkedHashMap();
        Set<Object> term3368 =  ((Map) term3320).keySet();
        LinkedHashSet term3319 = new LinkedHashSet((Collection<? extends Object>) term3368);
        term3272 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3299 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3305 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3272, term3272.getClass(), "id", term3273);
        setField(term3272, term3272.getClass(), "name", "VMeAzAHwZj");
        setField(term3272, term3272.getClass(), "description", "PznxWXsZME");
        setIntField(term3299, term3299.getClass(), "year", 2017);
        setShortField(term3299, term3299.getClass(), "month", (short) 3);
        setShortField(term3299, term3299.getClass(), "day", (short) 5);
        setField(term3272, term3272.getClass(), "releaseDate", term3299);
        setField(term3272, term3272.getClass(), "duration", term3303);
        setIntField(term3305, term3305.getClass(), "id", 767834723);
        setField(term3305, term3305.getClass(), "name", "ZzIujlwVsw");
        setField(term3272, term3272.getClass(), "mpa", term3305);
        setField(term3272, term3272.getClass(), "genres", term3319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term3272, args);
    }

};


