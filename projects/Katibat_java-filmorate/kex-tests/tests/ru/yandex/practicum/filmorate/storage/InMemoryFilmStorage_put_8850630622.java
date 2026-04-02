package ru.yandex.practicum.filmorate.storage;

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
import static ru.yandex.practicum.filmorate.storage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class InMemoryFilmStorage_put_8850630622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102;
     Object term113;

    public InMemoryFilmStorage_put_8850630622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term103 = new HashMap();
        HashMap term108 = new HashMap();
        term102 = newInstance(Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryFilmStorage"));
        setField(term102, term102.getClass(), "films", term103);
        setField(term102, term102.getClass(), "likes", term108);
        Long term114 = new Long(6375119433582206027L);
        Integer term144 = new Integer(1162663216);
        term113 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term160 = newInstance(Class.forName("java.util.TreeSet"));
        Object term161 = newInstance(Class.forName("java.util.TreeMap"));
        Object term162 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term163 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term165 = newInstance(Class.forName("java.lang.Object"));
        Object term166 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term168 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term113, term113.getClass(), "id", term114);
        setField(term113, term113.getClass(), "name", "hRNSzYYIrc");
        setField(term113, term113.getClass(), "description", "RMFIsYGgne");
        setIntField(term140, term140.getClass(), "year", 2016);
        setShortField(term140, term140.getClass(), "month", (short) 11);
        setShortField(term140, term140.getClass(), "day", (short) 29);
        setField(term113, term113.getClass(), "releaseDate", term140);
        setField(term113, term113.getClass(), "duration", term144);
        setIntField(term146, term146.getClass(), "id", -1955890973);
        setField(term146, term146.getClass(), "name", "NRdvgJlhkX");
        setField(term113, term113.getClass(), "mpa", term146);
        setField(term161, term161.getClass(), "comparator", null);
        setIntField(term163, term163.getClass(), "id", -2038273078);
        setField(term163, term163.getClass(), "name", null);
        setField(term162, term162.getClass(), "key", term163);
        setField(term162, term162.getClass(), "value", term165);
        setField(term166, term166.getClass(), "key", null);
        setField(term166, term166.getClass(), "value", term165);
        setField(term166, term166.getClass(), "left", null);
        setField(term166, term166.getClass(), "right", null);
        setField(term166, term166.getClass(), "parent", term162);
        setBooleanField(term166, term166.getClass(), "color", true);
        setField(term162, term162.getClass(), "left", term166);
        setField(term168, term168.getClass(), "key", null);
        setField(term168, term168.getClass(), "value", term165);
        setField(term168, term168.getClass(), "left", null);
        setField(term168, term168.getClass(), "right", null);
        setField(term168, term168.getClass(), "parent", term162);
        setBooleanField(term168, term168.getClass(), "color", true);
        setField(term162, term162.getClass(), "right", term168);
        setField(term162, term162.getClass(), "parent", null);
        setBooleanField(term162, term162.getClass(), "color", true);
        setField(term161, term161.getClass(), "root", term162);
        setIntField(term161, term161.getClass(), "size", 4);
        setIntField(term161, term161.getClass(), "modCount", 4);
        setField(term161, term161.getClass(), "entrySet", null);
        setField(term161, term161.getClass(), "navigableKeySet", null);
        setField(term161, term161.getClass(), "descendingMap", null);
        setField(term161, term161.getClass(), "keySet", null);
        setField(term161, term161.getClass(), "values", null);
        setField(term160, term160.getClass(), "m", term161);
        setField(term113, term113.getClass(), "genres", term160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryFilmStorage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term113;
        callMethod(klass, "put", argTypes, term102, args);
    }

};


