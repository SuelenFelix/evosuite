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

public class Film_setId_20778854814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1531;
     Object term1611;

    public Film_setId_20778854814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1532 = new Long(-685023850445639859L);
        Integer term1562 = new Integer(-894662986);
        Integer term1565 = new Integer(304775596);
        HashMap term1580 = new HashMap();
        Set<Object> term1643 =  ((Map) term1580).keySet();
        HashSet term1579 = new HashSet((Collection<? extends Object>) term1643);
        HashMap term1597 = new HashMap();
        Set<Object> term1644 =  ((Map) term1597).keySet();
        HashSet term1596 = new HashSet((Collection<? extends Object>) term1644);
        Integer term1609 = new Integer(-1210583429);
        term1531 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term1558 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1564 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term1531, term1531.getClass(), "id", term1532);
        setField(term1531, term1531.getClass(), "name", "BKLfkLiZTH");
        setField(term1531, term1531.getClass(), "description", "SPpkrGcPRr");
        setIntField(term1558, term1558.getClass(), "year", 2024);
        setShortField(term1558, term1558.getClass(), "month", (short) 1);
        setShortField(term1558, term1558.getClass(), "day", (short) 24);
        setField(term1531, term1531.getClass(), "releaseDate", term1558);
        setField(term1531, term1531.getClass(), "duration", term1562);
        setField(term1564, term1564.getClass(), "id", term1565);
        setField(term1564, term1564.getClass(), "name", "sEccwbJKYE");
        setField(term1531, term1531.getClass(), "mpa", term1564);
        setField(term1531, term1531.getClass(), "genres", term1579);
        setField(term1531, term1531.getClass(), "likes", term1596);
        setField(term1531, term1531.getClass(), "rate", term1609);
        term1611 = new Long(-5386201758403679145L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1611;
        callMethod(klass, "setId", argTypes, term1531, args);
    }

};


