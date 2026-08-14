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

public class Film_getReleaseDate_17490061088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term876;

    public Film_getReleaseDate_17490061088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term877 = new Long(463622836963501975L);
        Integer term907 = new Integer(2055867847);
        Integer term910 = new Integer(-1048298087);
        HashMap term925 = new HashMap();
        Set<Object> term978 =  ((Map) term925).keySet();
        HashSet term924 = new HashSet((Collection<? extends Object>) term978);
        HashMap term938 = new HashMap();
        Set<Object> term979 =  ((Map) term938).keySet();
        HashSet term937 = new HashSet((Collection<? extends Object>) term979);
        Integer term946 = new Integer(493620644);
        term876 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term903 = newInstance(Class.forName("java.time.LocalDate"));
        Object term909 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term876, term876.getClass(), "id", term877);
        setField(term876, term876.getClass(), "name", "onpbIeEKoi");
        setField(term876, term876.getClass(), "description", "YRHGsAkhxb");
        setIntField(term903, term903.getClass(), "year", 2022);
        setShortField(term903, term903.getClass(), "month", (short) 2);
        setShortField(term903, term903.getClass(), "day", (short) 25);
        setField(term876, term876.getClass(), "releaseDate", term903);
        setField(term876, term876.getClass(), "duration", term907);
        setField(term909, term909.getClass(), "id", term910);
        setField(term909, term909.getClass(), "name", "ffYhPOzlUs");
        setField(term876, term876.getClass(), "mpa", term909);
        setField(term876, term876.getClass(), "genres", term924);
        setField(term876, term876.getClass(), "likes", term937);
        setField(term876, term876.getClass(), "rate", term946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseDate", argTypes, term876, args);
    }

};


