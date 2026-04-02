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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class Film_equals_169115865616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4670;
     Object term4730;

    public Film_equals_169115865616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4671 = new Long(-8654565919063661957L);
        Integer term4701 = new Integer(590364439);
        term4670 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4697 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4703 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term4717 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4718 = newInstance(Class.forName("java.util.TreeMap"));
        Object term4719 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4720 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term4722 = newInstance(Class.forName("java.lang.Object"));
        Object term4723 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4725 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term4670, term4670.getClass(), "id", term4671);
        setField(term4670, term4670.getClass(), "name", "beAMpkroCQ");
        setField(term4670, term4670.getClass(), "description", "uSUvKAyuvd");
        setIntField(term4697, term4697.getClass(), "year", 2023);
        setShortField(term4697, term4697.getClass(), "month", (short) 9);
        setShortField(term4697, term4697.getClass(), "day", (short) 22);
        setField(term4670, term4670.getClass(), "releaseDate", term4697);
        setField(term4670, term4670.getClass(), "duration", term4701);
        setIntField(term4703, term4703.getClass(), "id", -2063457669);
        setField(term4703, term4703.getClass(), "name", "onQLVONGuf");
        setField(term4670, term4670.getClass(), "mpa", term4703);
        setField(term4718, term4718.getClass(), "comparator", null);
        setIntField(term4720, term4720.getClass(), "id", -1565502840);
        setField(term4720, term4720.getClass(), "name", null);
        setField(term4719, term4719.getClass(), "key", term4720);
        setField(term4719, term4719.getClass(), "value", term4722);
        setField(term4723, term4723.getClass(), "key", null);
        setField(term4723, term4723.getClass(), "value", term4722);
        setField(term4723, term4723.getClass(), "left", null);
        setField(term4723, term4723.getClass(), "right", null);
        setField(term4723, term4723.getClass(), "parent", term4719);
        setBooleanField(term4723, term4723.getClass(), "color", true);
        setField(term4719, term4719.getClass(), "left", term4723);
        setField(term4725, term4725.getClass(), "key", null);
        setField(term4725, term4725.getClass(), "value", term4722);
        setField(term4725, term4725.getClass(), "left", null);
        setField(term4725, term4725.getClass(), "right", null);
        setField(term4725, term4725.getClass(), "parent", term4719);
        setBooleanField(term4725, term4725.getClass(), "color", true);
        setField(term4719, term4719.getClass(), "right", term4725);
        setField(term4719, term4719.getClass(), "parent", null);
        setBooleanField(term4719, term4719.getClass(), "color", true);
        setField(term4718, term4718.getClass(), "root", term4719);
        setIntField(term4718, term4718.getClass(), "size", 5);
        setIntField(term4718, term4718.getClass(), "modCount", 5);
        setField(term4718, term4718.getClass(), "entrySet", null);
        setField(term4718, term4718.getClass(), "navigableKeySet", null);
        setField(term4718, term4718.getClass(), "descendingMap", null);
        setField(term4718, term4718.getClass(), "keySet", null);
        setField(term4718, term4718.getClass(), "values", null);
        setField(term4717, term4717.getClass(), "m", term4718);
        setField(term4670, term4670.getClass(), "genres", term4717);
        term4730 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4730;
        callMethod(klass, "equals", argTypes, term4670, args);
    }

};


