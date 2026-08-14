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

public class Film_setDuration_15617628318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2031;
     Object term2111;

    public Film_setDuration_15617628318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2032 = new Long(138235087558060686L);
        Integer term2062 = new Integer(-2015854073);
        Integer term2065 = new Integer(538259104);
        HashMap term2080 = new HashMap();
        Set<Object> term2143 =  ((Map) term2080).keySet();
        HashSet term2079 = new HashSet((Collection<? extends Object>) term2143);
        HashMap term2093 = new HashMap();
        Set<Object> term2144 =  ((Map) term2093).keySet();
        HashSet term2092 = new HashSet((Collection<? extends Object>) term2144);
        Integer term2109 = new Integer(-1963464809);
        term2031 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term2058 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2064 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term2031, term2031.getClass(), "id", term2032);
        setField(term2031, term2031.getClass(), "name", "EYtfuJaxiM");
        setField(term2031, term2031.getClass(), "description", "gCWtLVKVVe");
        setIntField(term2058, term2058.getClass(), "year", 2024);
        setShortField(term2058, term2058.getClass(), "month", (short) 8);
        setShortField(term2058, term2058.getClass(), "day", (short) 31);
        setField(term2031, term2031.getClass(), "releaseDate", term2058);
        setField(term2031, term2031.getClass(), "duration", term2062);
        setField(term2064, term2064.getClass(), "id", term2065);
        setField(term2064, term2064.getClass(), "name", "fWKJoSoCwE");
        setField(term2031, term2031.getClass(), "mpa", term2064);
        setField(term2031, term2031.getClass(), "genres", term2079);
        setField(term2031, term2031.getClass(), "likes", term2092);
        setField(term2031, term2031.getClass(), "rate", term2109);
        term2111 = new Integer(71190297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2111;
        callMethod(klass, "setDuration", argTypes, term2031, args);
    }

};


