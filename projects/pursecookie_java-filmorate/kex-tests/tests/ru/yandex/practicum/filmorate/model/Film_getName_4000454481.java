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

public class Film_getName_4000454481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1835;

    public Film_getName_4000454481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1880 = new HashMap();
        Set<Object> term1916 =  ((Map) term1880).keySet();
        HashSet term1879 = new HashSet((Collection<? extends Object>) term1916);
        term1835 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term1860 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1865 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term1835, term1835.getClass(), "name", "HqBOwkVqjD");
        setField(term1835, term1835.getClass(), "description", "MAcUBcBckh");
        setIntField(term1860, term1860.getClass(), "year", 2012);
        setShortField(term1860, term1860.getClass(), "month", (short) 10);
        setShortField(term1860, term1860.getClass(), "day", (short) 1);
        setField(term1835, term1835.getClass(), "releaseDate", term1860);
        setLongField(term1835, term1835.getClass(), "duration", 1672578078364590450L);
        setField(term1865, term1865.getClass(), "name", "oVgzLbrsFr");
        setLongField(term1865, term1865.getClass(), "id", 4949335493504695457L);
        setField(term1835, term1835.getClass(), "mpa", term1865);
        setField(term1835, term1835.getClass(), "genres", term1879);
        setLongField(term1835, term1835.getClass(), "id", -5216789073301458893L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1835, args);
    }

};


