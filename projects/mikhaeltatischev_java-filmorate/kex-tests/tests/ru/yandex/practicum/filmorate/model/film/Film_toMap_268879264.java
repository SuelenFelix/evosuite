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

public class Film_toMap_268879264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term440;

    public Film_toMap_268879264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term441 = new Long(1233889271256172047L);
        Integer term471 = new Integer(-6029667);
        Integer term474 = new Integer(-2068769794);
        HashMap term489 = new HashMap();
        Set<Object> term548 =  ((Map) term489).keySet();
        HashSet term488 = new HashSet((Collection<? extends Object>) term548);
        HashMap term500 = new HashMap();
        Set<Object> term549 =  ((Map) term500).keySet();
        HashSet term499 = new HashSet((Collection<? extends Object>) term549);
        Integer term516 = new Integer(1135664017);
        term440 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term467 = newInstance(Class.forName("java.time.LocalDate"));
        Object term473 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term440, term440.getClass(), "id", term441);
        setField(term440, term440.getClass(), "name", "xOEqzGAmDU");
        setField(term440, term440.getClass(), "description", "eZFUvlxvGV");
        setIntField(term467, term467.getClass(), "year", 2015);
        setShortField(term467, term467.getClass(), "month", (short) 9);
        setShortField(term467, term467.getClass(), "day", (short) 19);
        setField(term440, term440.getClass(), "releaseDate", term467);
        setField(term440, term440.getClass(), "duration", term471);
        setField(term473, term473.getClass(), "id", term474);
        setField(term473, term473.getClass(), "name", "BYqFIqCKAV");
        setField(term440, term440.getClass(), "mpa", term473);
        setField(term440, term440.getClass(), "genres", term488);
        setField(term440, term440.getClass(), "likes", term499);
        setField(term440, term440.getClass(), "rate", term516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMap", argTypes, term440, args);
    }

};


