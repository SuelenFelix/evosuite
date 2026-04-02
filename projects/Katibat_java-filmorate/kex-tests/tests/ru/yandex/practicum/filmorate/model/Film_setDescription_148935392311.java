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

public class Film_setDescription_148935392311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4170;

    public Film_setDescription_148935392311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4171 = new Long(2062173786000223358L);
        Integer term4201 = new Integer(-655067527);
        term4170 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4203 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term4217 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4218 = newInstance(Class.forName("java.util.TreeMap"));
        Object term4219 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4220 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term4222 = newInstance(Class.forName("java.lang.Object"));
        Object term4223 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4225 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term4170, term4170.getClass(), "id", term4171);
        setField(term4170, term4170.getClass(), "name", "gUvcueTURF");
        setField(term4170, term4170.getClass(), "description", "EwQBhZjCIT");
        setIntField(term4197, term4197.getClass(), "year", 2015);
        setShortField(term4197, term4197.getClass(), "month", (short) 3);
        setShortField(term4197, term4197.getClass(), "day", (short) 10);
        setField(term4170, term4170.getClass(), "releaseDate", term4197);
        setField(term4170, term4170.getClass(), "duration", term4201);
        setIntField(term4203, term4203.getClass(), "id", 691577392);
        setField(term4203, term4203.getClass(), "name", "aSkmSwTnEw");
        setField(term4170, term4170.getClass(), "mpa", term4203);
        setField(term4218, term4218.getClass(), "comparator", null);
        setIntField(term4220, term4220.getClass(), "id", -893623680);
        setField(term4220, term4220.getClass(), "name", null);
        setField(term4219, term4219.getClass(), "key", term4220);
        setField(term4219, term4219.getClass(), "value", term4222);
        setField(term4223, term4223.getClass(), "key", null);
        setField(term4223, term4223.getClass(), "value", term4222);
        setField(term4223, term4223.getClass(), "left", null);
        setField(term4223, term4223.getClass(), "right", null);
        setField(term4223, term4223.getClass(), "parent", term4219);
        setBooleanField(term4223, term4223.getClass(), "color", true);
        setField(term4219, term4219.getClass(), "left", term4223);
        setField(term4225, term4225.getClass(), "key", null);
        setField(term4225, term4225.getClass(), "value", term4222);
        setField(term4225, term4225.getClass(), "left", null);
        setField(term4225, term4225.getClass(), "right", null);
        setField(term4225, term4225.getClass(), "parent", term4219);
        setBooleanField(term4225, term4225.getClass(), "color", true);
        setField(term4219, term4219.getClass(), "right", term4225);
        setField(term4219, term4219.getClass(), "parent", null);
        setBooleanField(term4219, term4219.getClass(), "color", true);
        setField(term4218, term4218.getClass(), "root", term4219);
        setIntField(term4218, term4218.getClass(), "size", 5);
        setIntField(term4218, term4218.getClass(), "modCount", 5);
        setField(term4218, term4218.getClass(), "entrySet", null);
        setField(term4218, term4218.getClass(), "navigableKeySet", null);
        setField(term4218, term4218.getClass(), "descendingMap", null);
        setField(term4218, term4218.getClass(), "keySet", null);
        setField(term4218, term4218.getClass(), "values", null);
        setField(term4217, term4217.getClass(), "m", term4218);
        setField(term4170, term4170.getClass(), "genres", term4217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MHGKyEnwKc";
        callMethod(klass, "setDescription", argTypes, term4170, args);
    }

};


