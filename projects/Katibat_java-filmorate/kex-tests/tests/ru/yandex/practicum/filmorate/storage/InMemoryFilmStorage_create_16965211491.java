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

public class InMemoryFilmStorage_create_16965211491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term12;

    public InMemoryFilmStorage_create_16965211491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        HashMap term7 = new HashMap();
        term1 = newInstance(Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryFilmStorage"));
        setField(term1, term1.getClass(), "films", term2);
        setField(term1, term1.getClass(), "likes", term7);
        Long term13 = new Long(2442117782898005296L);
        Integer term43 = new Integer(568599855);
        term12 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term39 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term59 = newInstance(Class.forName("java.util.TreeSet"));
        Object term60 = newInstance(Class.forName("java.util.TreeMap"));
        Object term61 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term62 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term64 = newInstance(Class.forName("java.lang.Object"));
        Object term65 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term67 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term12, term12.getClass(), "id", term13);
        setField(term12, term12.getClass(), "name", "PAEBtnZtTD");
        setField(term12, term12.getClass(), "description", "sjlJAEtRrb");
        setIntField(term39, term39.getClass(), "year", 2012);
        setShortField(term39, term39.getClass(), "month", (short) 8);
        setShortField(term39, term39.getClass(), "day", (short) 25);
        setField(term12, term12.getClass(), "releaseDate", term39);
        setField(term12, term12.getClass(), "duration", term43);
        setIntField(term45, term45.getClass(), "id", 568599855);
        setField(term45, term45.getClass(), "name", "MuLcgQHgqz");
        setField(term12, term12.getClass(), "mpa", term45);
        setField(term60, term60.getClass(), "comparator", null);
        setIntField(term62, term62.getClass(), "id", 1162663216);
        setField(term62, term62.getClass(), "name", null);
        setField(term61, term61.getClass(), "key", term62);
        setField(term61, term61.getClass(), "value", term64);
        setField(term65, term65.getClass(), "key", null);
        setField(term65, term65.getClass(), "value", term64);
        setField(term65, term65.getClass(), "left", null);
        setField(term65, term65.getClass(), "right", null);
        setField(term65, term65.getClass(), "parent", term61);
        setBooleanField(term65, term65.getClass(), "color", true);
        setField(term61, term61.getClass(), "left", term65);
        setField(term67, term67.getClass(), "key", null);
        setField(term67, term67.getClass(), "value", term64);
        setField(term67, term67.getClass(), "left", null);
        setField(term67, term67.getClass(), "right", null);
        setField(term67, term67.getClass(), "parent", term61);
        setBooleanField(term67, term67.getClass(), "color", true);
        setField(term61, term61.getClass(), "right", term67);
        setField(term61, term61.getClass(), "parent", null);
        setBooleanField(term61, term61.getClass(), "color", true);
        setField(term60, term60.getClass(), "root", term61);
        setIntField(term60, term60.getClass(), "size", 5);
        setIntField(term60, term60.getClass(), "modCount", 5);
        setField(term60, term60.getClass(), "entrySet", null);
        setField(term60, term60.getClass(), "navigableKeySet", null);
        setField(term60, term60.getClass(), "descendingMap", null);
        setField(term60, term60.getClass(), "keySet", null);
        setField(term60, term60.getClass(), "values", null);
        setField(term59, term59.getClass(), "m", term60);
        setField(term12, term12.getClass(), "genres", term59);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryFilmStorage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term12;
        callMethod(klass, "create", argTypes, term1, args);
    }

};


