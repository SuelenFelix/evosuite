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

public class Film_getRate_24500120913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1417;

    public Film_getRate_24500120913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1418 = new Long(1672578078364590450L);
        Integer term1448 = new Integer(-1772434990);
        Integer term1451 = new Integer(-1845499264);
        HashMap term1466 = new HashMap();
        Set<Object> term1529 =  ((Map) term1466).keySet();
        HashSet term1465 = new HashSet((Collection<? extends Object>) term1529);
        HashMap term1481 = new HashMap();
        Set<Object> term1530 =  ((Map) term1481).keySet();
        HashSet term1480 = new HashSet((Collection<? extends Object>) term1530);
        Integer term1497 = new Integer(-1263114719);
        term1417 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term1444 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1450 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term1417, term1417.getClass(), "id", term1418);
        setField(term1417, term1417.getClass(), "name", "xOcJIiQQDu");
        setField(term1417, term1417.getClass(), "description", "GVizqqzXpy");
        setIntField(term1444, term1444.getClass(), "year", 2012);
        setShortField(term1444, term1444.getClass(), "month", (short) 10);
        setShortField(term1444, term1444.getClass(), "day", (short) 1);
        setField(term1417, term1417.getClass(), "releaseDate", term1444);
        setField(term1417, term1417.getClass(), "duration", term1448);
        setField(term1450, term1450.getClass(), "id", term1451);
        setField(term1450, term1450.getClass(), "name", "JqXGgAhZPl");
        setField(term1417, term1417.getClass(), "mpa", term1450);
        setField(term1417, term1417.getClass(), "genres", term1465);
        setField(term1417, term1417.getClass(), "likes", term1480);
        setField(term1417, term1417.getClass(), "rate", term1497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRate", argTypes, term1417, args);
    }

};


