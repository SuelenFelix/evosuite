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

public class Film_addLike_13053394753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327;
     Object term403;

    public Film_addLike_13053394753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term328 = new Long(8428634514691209827L);
        Integer term358 = new Integer(-1456670397);
        Integer term361 = new Integer(1622346318);
        HashMap term376 = new HashMap();
        Set<Object> term438 =  ((Map) term376).keySet();
        HashSet term375 = new HashSet((Collection<? extends Object>) term438);
        HashMap term385 = new HashMap();
        Set<Object> term439 =  ((Map) term385).keySet();
        HashSet term384 = new HashSet((Collection<? extends Object>) term439);
        Integer term401 = new Integer(-655067527);
        term327 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term360 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term327, term327.getClass(), "id", term328);
        setField(term327, term327.getClass(), "name", "HyxfbSQYBe");
        setField(term327, term327.getClass(), "description", "pCTimMblYc");
        setIntField(term354, term354.getClass(), "year", 2020);
        setShortField(term354, term354.getClass(), "month", (short) 11);
        setShortField(term354, term354.getClass(), "day", (short) 22);
        setField(term327, term327.getClass(), "releaseDate", term354);
        setField(term327, term327.getClass(), "duration", term358);
        setField(term360, term360.getClass(), "id", term361);
        setField(term360, term360.getClass(), "name", "hNxWaHcfhY");
        setField(term327, term327.getClass(), "mpa", term360);
        setField(term327, term327.getClass(), "genres", term375);
        setField(term327, term327.getClass(), "likes", term384);
        setField(term327, term327.getClass(), "rate", term401);
        Long term404 = new Long(-6823727938421990489L);
        Long term406 = new Long(-484994522244390100L);
        term403 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Likes"));
        setField(term403, term403.getClass(), "userId", term404);
        setField(term403, term403.getClass(), "filmId", term406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.film.Likes");
        Object[] args = new Object[1];
        args[0] = term403;
        callMethod(klass, "addLike", argTypes, term327, args);
    }

};


