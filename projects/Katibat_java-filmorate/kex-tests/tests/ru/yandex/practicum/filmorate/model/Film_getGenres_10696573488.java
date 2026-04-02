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

public class Film_getGenres_10696573488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3880;

    public Film_getGenres_10696573488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3881 = new Long(5953383087795962419L);
        Integer term3911 = new Integer(-1456670397);
        term3880 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3907 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3913 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term3927 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3928 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3929 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3930 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term3932 = newInstance(Class.forName("java.lang.Object"));
        Object term3933 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3935 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term3880, term3880.getClass(), "id", term3881);
        setField(term3880, term3880.getClass(), "name", "vGiuZVPJNH");
        setField(term3880, term3880.getClass(), "description", "tlzpzIjMib");
        setIntField(term3907, term3907.getClass(), "year", 2027);
        setShortField(term3907, term3907.getClass(), "month", (short) 10);
        setShortField(term3907, term3907.getClass(), "day", (short) 4);
        setField(term3880, term3880.getClass(), "releaseDate", term3907);
        setField(term3880, term3880.getClass(), "duration", term3911);
        setIntField(term3913, term3913.getClass(), "id", 304775596);
        setField(term3913, term3913.getClass(), "name", "AZdLeSugwv");
        setField(term3880, term3880.getClass(), "mpa", term3913);
        setField(term3928, term3928.getClass(), "comparator", null);
        setIntField(term3930, term3930.getClass(), "id", -1347665717);
        setField(term3930, term3930.getClass(), "name", null);
        setField(term3929, term3929.getClass(), "key", term3930);
        setField(term3929, term3929.getClass(), "value", term3932);
        setField(term3933, term3933.getClass(), "key", null);
        setField(term3933, term3933.getClass(), "value", term3932);
        setField(term3933, term3933.getClass(), "left", null);
        setField(term3933, term3933.getClass(), "right", null);
        setField(term3933, term3933.getClass(), "parent", term3929);
        setBooleanField(term3933, term3933.getClass(), "color", true);
        setField(term3929, term3929.getClass(), "left", term3933);
        setField(term3935, term3935.getClass(), "key", null);
        setField(term3935, term3935.getClass(), "value", term3932);
        setField(term3935, term3935.getClass(), "left", null);
        setField(term3935, term3935.getClass(), "right", null);
        setField(term3935, term3935.getClass(), "parent", term3929);
        setBooleanField(term3935, term3935.getClass(), "color", false);
        setField(term3929, term3929.getClass(), "right", term3935);
        setField(term3929, term3929.getClass(), "parent", null);
        setBooleanField(term3929, term3929.getClass(), "color", true);
        setField(term3928, term3928.getClass(), "root", term3929);
        setIntField(term3928, term3928.getClass(), "size", 7);
        setIntField(term3928, term3928.getClass(), "modCount", 7);
        setField(term3928, term3928.getClass(), "entrySet", null);
        setField(term3928, term3928.getClass(), "navigableKeySet", null);
        setField(term3928, term3928.getClass(), "descendingMap", null);
        setField(term3928, term3928.getClass(), "keySet", null);
        setField(term3928, term3928.getClass(), "values", null);
        setField(term3927, term3927.getClass(), "m", term3928);
        setField(term3880, term3880.getClass(), "genres", term3927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenres", argTypes, term3880, args);
    }

};


