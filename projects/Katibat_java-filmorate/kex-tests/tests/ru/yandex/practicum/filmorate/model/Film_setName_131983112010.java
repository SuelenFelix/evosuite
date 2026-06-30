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

public class Film_setName_131983112010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4058;

    public Film_setName_131983112010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4059 = new Long(-1610676979013636850L);
        Integer term4089 = new Integer(1048535127);
        term4058 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4085 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4091 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term4105 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4106 = newInstance(Class.forName("java.util.TreeMap"));
        Object term4107 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4108 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term4110 = newInstance(Class.forName("java.lang.Object"));
        Object term4111 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4113 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term4058, term4058.getClass(), "id", term4059);
        setField(term4058, term4058.getClass(), "name", "SFqCrhEWLm");
        setField(term4058, term4058.getClass(), "description", "GZdcJyZntS");
        setIntField(term4085, term4085.getClass(), "year", 2022);
        setShortField(term4085, term4085.getClass(), "month", (short) 10);
        setShortField(term4085, term4085.getClass(), "day", (short) 18);
        setField(term4058, term4058.getClass(), "releaseDate", term4085);
        setField(term4058, term4058.getClass(), "duration", term4089);
        setIntField(term4091, term4091.getClass(), "id", -1476117762);
        setField(term4091, term4091.getClass(), "name", "OIHoJeysUi");
        setField(term4058, term4058.getClass(), "mpa", term4091);
        setField(term4106, term4106.getClass(), "comparator", null);
        setIntField(term4108, term4108.getClass(), "id", -341962980);
        setField(term4108, term4108.getClass(), "name", null);
        setField(term4107, term4107.getClass(), "key", term4108);
        setField(term4107, term4107.getClass(), "value", term4110);
        setField(term4111, term4111.getClass(), "key", null);
        setField(term4111, term4111.getClass(), "value", term4110);
        setField(term4111, term4111.getClass(), "left", null);
        setField(term4111, term4111.getClass(), "right", null);
        setField(term4111, term4111.getClass(), "parent", term4107);
        setBooleanField(term4111, term4111.getClass(), "color", true);
        setField(term4107, term4107.getClass(), "left", term4111);
        setField(term4113, term4113.getClass(), "key", null);
        setField(term4113, term4113.getClass(), "value", term4110);
        setField(term4113, term4113.getClass(), "left", null);
        setField(term4113, term4113.getClass(), "right", null);
        setField(term4113, term4113.getClass(), "parent", term4107);
        setBooleanField(term4113, term4113.getClass(), "color", true);
        setField(term4107, term4107.getClass(), "right", term4113);
        setField(term4107, term4107.getClass(), "parent", null);
        setBooleanField(term4107, term4107.getClass(), "color", true);
        setField(term4106, term4106.getClass(), "root", term4107);
        setIntField(term4106, term4106.getClass(), "size", 5);
        setIntField(term4106, term4106.getClass(), "modCount", 5);
        setField(term4106, term4106.getClass(), "entrySet", null);
        setField(term4106, term4106.getClass(), "navigableKeySet", null);
        setField(term4106, term4106.getClass(), "descendingMap", null);
        setField(term4106, term4106.getClass(), "keySet", null);
        setField(term4106, term4106.getClass(), "values", null);
        setField(term4105, term4105.getClass(), "m", term4106);
        setField(term4058, term4058.getClass(), "genres", term4105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TwfWVQGiIj";
        callMethod(klass, "setName", argTypes, term4058, args);
    }

};


