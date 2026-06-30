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

public class Film_getReleaseDate_160057127512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6092;

    public Film_getReleaseDate_160057127512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6150 = new HashMap();
        Set<Object> term6204 =  ((Map) term6150).keySet();
        HashSet term6149 = new HashSet((Collection<? extends Object>) term6204);
        HashMap term6159 = new HashMap();
        Set<Object> term6205 =  ((Map) term6159).keySet();
        HashSet term6158 = new HashSet((Collection<? extends Object>) term6205);
        term6092 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term6118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6123 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term6092, term6092.getClass(), "id", -8652538484981166496L);
        setField(term6092, term6092.getClass(), "name", "vOuMEpOQAg");
        setField(term6092, term6092.getClass(), "description", "SIODFGaQhr");
        setIntField(term6118, term6118.getClass(), "year", 2014);
        setShortField(term6118, term6118.getClass(), "month", (short) 5);
        setShortField(term6118, term6118.getClass(), "day", (short) 21);
        setField(term6092, term6092.getClass(), "releaseDate", term6118);
        setIntField(term6092, term6092.getClass(), "duration", -1476117762);
        setIntField(term6123, term6123.getClass(), "id", -341962980);
        setField(term6123, term6123.getClass(), "name", "qYzsiuXOgS");
        setField(term6123, term6123.getClass(), "description", "bxrCBbrrct");
        setField(term6092, term6092.getClass(), "mpa", term6123);
        setField(term6092, term6092.getClass(), "genres", term6149);
        setField(term6092, term6092.getClass(), "likes", term6158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseDate", argTypes, term6092, args);
    }

};


