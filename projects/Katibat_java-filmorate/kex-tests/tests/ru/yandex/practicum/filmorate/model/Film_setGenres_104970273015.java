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

public class Film_setGenres_104970273015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4576;
     Object term4636;

    public Film_setGenres_104970273015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4577 = new Long(305759998609888272L);
        Integer term4607 = new Integer(1135664017);
        term4576 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4603 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4609 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term4623 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4624 = newInstance(Class.forName("java.util.TreeMap"));
        Object term4625 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4626 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term4628 = newInstance(Class.forName("java.lang.Object"));
        Object term4629 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4631 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term4576, term4576.getClass(), "id", term4577);
        setField(term4576, term4576.getClass(), "name", "WZzvmIHhzZ");
        setField(term4576, term4576.getClass(), "description", "doQLHkjpNm");
        setIntField(term4603, term4603.getClass(), "year", 2025);
        setShortField(term4603, term4603.getClass(), "month", (short) 11);
        setShortField(term4603, term4603.getClass(), "day", (short) 1);
        setField(term4576, term4576.getClass(), "releaseDate", term4603);
        setField(term4576, term4576.getClass(), "duration", term4607);
        setIntField(term4609, term4609.getClass(), "id", 96566506);
        setField(term4609, term4609.getClass(), "name", "lCyLIcSuom");
        setField(term4576, term4576.getClass(), "mpa", term4609);
        setField(term4624, term4624.getClass(), "comparator", null);
        setIntField(term4626, term4626.getClass(), "id", -343325701);
        setField(term4626, term4626.getClass(), "name", null);
        setField(term4625, term4625.getClass(), "key", term4626);
        setField(term4625, term4625.getClass(), "value", term4628);
        setField(term4629, term4629.getClass(), "key", null);
        setField(term4629, term4629.getClass(), "value", term4628);
        setField(term4629, term4629.getClass(), "left", null);
        setField(term4629, term4629.getClass(), "right", null);
        setField(term4629, term4629.getClass(), "parent", term4625);
        setBooleanField(term4629, term4629.getClass(), "color", true);
        setField(term4625, term4625.getClass(), "left", term4629);
        setField(term4631, term4631.getClass(), "key", null);
        setField(term4631, term4631.getClass(), "value", term4628);
        setField(term4631, term4631.getClass(), "left", null);
        setField(term4631, term4631.getClass(), "right", null);
        setField(term4631, term4631.getClass(), "parent", term4625);
        setBooleanField(term4631, term4631.getClass(), "color", true);
        setField(term4625, term4625.getClass(), "right", term4631);
        setField(term4625, term4625.getClass(), "parent", null);
        setBooleanField(term4625, term4625.getClass(), "color", true);
        setField(term4624, term4624.getClass(), "root", term4625);
        setIntField(term4624, term4624.getClass(), "size", 6);
        setIntField(term4624, term4624.getClass(), "modCount", 6);
        setField(term4624, term4624.getClass(), "entrySet", null);
        setField(term4624, term4624.getClass(), "navigableKeySet", null);
        setField(term4624, term4624.getClass(), "descendingMap", null);
        setField(term4624, term4624.getClass(), "keySet", null);
        setField(term4624, term4624.getClass(), "values", null);
        setField(term4623, term4623.getClass(), "m", term4624);
        setField(term4576, term4576.getClass(), "genres", term4623);
        term4636 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4637 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term4637, term4637.getClass(), "comparator", null);
        setField(term4637, term4637.getClass(), "root", null);
        setIntField(term4637, term4637.getClass(), "size", 0);
        setIntField(term4637, term4637.getClass(), "modCount", 0);
        setField(term4637, term4637.getClass(), "entrySet", null);
        setField(term4637, term4637.getClass(), "navigableKeySet", null);
        setField(term4637, term4637.getClass(), "descendingMap", null);
        setField(term4637, term4637.getClass(), "keySet", null);
        setField(term4637, term4637.getClass(), "values", null);
        setField(term4636, term4636.getClass(), "m", term4637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TreeSet");
        Object[] args = new Object[1];
        args[0] = term4636;
        callMethod(klass, "setGenres", argTypes, term4576, args);
    }

};


