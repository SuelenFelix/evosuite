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

public class Film_setReleaseDate_149277904912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4282;
     Object term4342;

    public Film_setReleaseDate_149277904912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4283 = new Long(-8658027316505137504L);
        Integer term4313 = new Integer(-6029667);
        term4282 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4309 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4315 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term4329 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4330 = newInstance(Class.forName("java.util.TreeMap"));
        Object term4331 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4332 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term4334 = newInstance(Class.forName("java.lang.Object"));
        Object term4335 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4337 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term4282, term4282.getClass(), "id", term4283);
        setField(term4282, term4282.getClass(), "name", "ShIELyuULw");
        setField(term4282, term4282.getClass(), "description", "IpQuOGMgmj");
        setIntField(term4309, term4309.getClass(), "year", 2021);
        setShortField(term4309, term4309.getClass(), "month", (short) 9);
        setShortField(term4309, term4309.getClass(), "day", (short) 30);
        setField(term4282, term4282.getClass(), "releaseDate", term4309);
        setField(term4282, term4282.getClass(), "duration", term4313);
        setIntField(term4315, term4315.getClass(), "id", 1072005683);
        setField(term4315, term4315.getClass(), "name", "pJbnHTYrxn");
        setField(term4282, term4282.getClass(), "mpa", term4315);
        setField(term4330, term4330.getClass(), "comparator", null);
        setIntField(term4332, term4332.getClass(), "id", 1474524152);
        setField(term4332, term4332.getClass(), "name", null);
        setField(term4331, term4331.getClass(), "key", term4332);
        setField(term4331, term4331.getClass(), "value", term4334);
        setField(term4335, term4335.getClass(), "key", null);
        setField(term4335, term4335.getClass(), "value", term4334);
        setField(term4335, term4335.getClass(), "left", null);
        setField(term4335, term4335.getClass(), "right", null);
        setField(term4335, term4335.getClass(), "parent", term4331);
        setBooleanField(term4335, term4335.getClass(), "color", true);
        setField(term4331, term4331.getClass(), "left", term4335);
        setField(term4337, term4337.getClass(), "key", null);
        setField(term4337, term4337.getClass(), "value", term4334);
        setField(term4337, term4337.getClass(), "left", null);
        setField(term4337, term4337.getClass(), "right", null);
        setField(term4337, term4337.getClass(), "parent", term4331);
        setBooleanField(term4337, term4337.getClass(), "color", true);
        setField(term4331, term4331.getClass(), "right", term4337);
        setField(term4331, term4331.getClass(), "parent", null);
        setBooleanField(term4331, term4331.getClass(), "color", true);
        setField(term4330, term4330.getClass(), "root", term4331);
        setIntField(term4330, term4330.getClass(), "size", 4);
        setIntField(term4330, term4330.getClass(), "modCount", 4);
        setField(term4330, term4330.getClass(), "entrySet", null);
        setField(term4330, term4330.getClass(), "navigableKeySet", null);
        setField(term4330, term4330.getClass(), "descendingMap", null);
        setField(term4330, term4330.getClass(), "keySet", null);
        setField(term4330, term4330.getClass(), "values", null);
        setField(term4329, term4329.getClass(), "m", term4330);
        setField(term4282, term4282.getClass(), "genres", term4329);
        term4342 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term4342, term4342.getClass(), "year", 2027);
        setShortField(term4342, term4342.getClass(), "month", (short) 8);
        setShortField(term4342, term4342.getClass(), "day", (short) 25);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term4342;
        callMethod(klass, "setReleaseDate", argTypes, term4282, args);
    }

};


