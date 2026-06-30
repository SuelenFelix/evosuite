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

public class Film_setDuration_110156619613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4376;
     Object term4432;

    public Film_setDuration_110156619613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4377 = new Long(414749984815662075L);
        Integer term4407 = new Integer(-2068769794);
        term4376 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4403 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4409 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term4423 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4424 = newInstance(Class.forName("java.util.TreeMap"));
        Object term4425 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4426 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term4428 = newInstance(Class.forName("java.lang.Object"));
        setField(term4376, term4376.getClass(), "id", term4377);
        setField(term4376, term4376.getClass(), "name", "rYbtIDVdnd");
        setField(term4376, term4376.getClass(), "description", "UKAReurpHG");
        setIntField(term4403, term4403.getClass(), "year", 2014);
        setShortField(term4403, term4403.getClass(), "month", (short) 5);
        setShortField(term4403, term4403.getClass(), "day", (short) 21);
        setField(term4376, term4376.getClass(), "releaseDate", term4403);
        setField(term4376, term4376.getClass(), "duration", term4407);
        setIntField(term4409, term4409.getClass(), "id", -375014958);
        setField(term4409, term4409.getClass(), "name", "WVRMUmrljA");
        setField(term4376, term4376.getClass(), "mpa", term4409);
        setField(term4424, term4424.getClass(), "comparator", null);
        setIntField(term4426, term4426.getClass(), "id", 1107176718);
        setField(term4426, term4426.getClass(), "name", null);
        setField(term4425, term4425.getClass(), "key", term4426);
        setField(term4425, term4425.getClass(), "value", term4428);
        setField(term4425, term4425.getClass(), "left", null);
        setField(term4425, term4425.getClass(), "right", null);
        setField(term4425, term4425.getClass(), "parent", null);
        setBooleanField(term4425, term4425.getClass(), "color", true);
        setField(term4424, term4424.getClass(), "root", term4425);
        setIntField(term4424, term4424.getClass(), "size", 1);
        setIntField(term4424, term4424.getClass(), "modCount", 1);
        setField(term4424, term4424.getClass(), "entrySet", null);
        setField(term4424, term4424.getClass(), "navigableKeySet", null);
        setField(term4424, term4424.getClass(), "descendingMap", null);
        setField(term4424, term4424.getClass(), "keySet", null);
        setField(term4424, term4424.getClass(), "values", null);
        setField(term4423, term4423.getClass(), "m", term4424);
        setField(term4376, term4376.getClass(), "genres", term4423);
        term4432 = new Integer(-117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4432;
        callMethod(klass, "setDuration", argTypes, term4376, args);
    }

};


