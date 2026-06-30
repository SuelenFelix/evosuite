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

public class Film_toString_73171229119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4942;

    public Film_toString_73171229119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4943 = new Long(41775768178052008L);
        Integer term4973 = new Integer(-244121226);
        term4942 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4969 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4975 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term4989 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4990 = newInstance(Class.forName("java.util.TreeMap"));
        Object term4991 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4992 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term4994 = newInstance(Class.forName("java.lang.Object"));
        Object term4995 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4997 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term4942, term4942.getClass(), "id", term4943);
        setField(term4942, term4942.getClass(), "name", "zNdorvdUgu");
        setField(term4942, term4942.getClass(), "description", "oPxuZbkYio");
        setIntField(term4969, term4969.getClass(), "year", 2026);
        setShortField(term4969, term4969.getClass(), "month", (short) 11);
        setShortField(term4969, term4969.getClass(), "day", (short) 29);
        setField(term4942, term4942.getClass(), "releaseDate", term4969);
        setField(term4942, term4942.getClass(), "duration", term4973);
        setIntField(term4975, term4975.getClass(), "id", 11724947);
        setField(term4975, term4975.getClass(), "name", "vKitydDVnM");
        setField(term4942, term4942.getClass(), "mpa", term4975);
        setField(term4990, term4990.getClass(), "comparator", null);
        setIntField(term4992, term4992.getClass(), "id", 1953277050);
        setField(term4992, term4992.getClass(), "name", null);
        setField(term4991, term4991.getClass(), "key", term4992);
        setField(term4991, term4991.getClass(), "value", term4994);
        setField(term4995, term4995.getClass(), "key", null);
        setField(term4995, term4995.getClass(), "value", term4994);
        setField(term4995, term4995.getClass(), "left", null);
        setField(term4995, term4995.getClass(), "right", null);
        setField(term4995, term4995.getClass(), "parent", term4991);
        setBooleanField(term4995, term4995.getClass(), "color", false);
        setField(term4991, term4991.getClass(), "left", term4995);
        setField(term4997, term4997.getClass(), "key", null);
        setField(term4997, term4997.getClass(), "value", term4994);
        setField(term4997, term4997.getClass(), "left", null);
        setField(term4997, term4997.getClass(), "right", null);
        setField(term4997, term4997.getClass(), "parent", term4991);
        setBooleanField(term4997, term4997.getClass(), "color", false);
        setField(term4991, term4991.getClass(), "right", term4997);
        setField(term4991, term4991.getClass(), "parent", null);
        setBooleanField(term4991, term4991.getClass(), "color", true);
        setField(term4990, term4990.getClass(), "root", term4991);
        setIntField(term4990, term4990.getClass(), "size", 3);
        setIntField(term4990, term4990.getClass(), "modCount", 3);
        setField(term4990, term4990.getClass(), "entrySet", null);
        setField(term4990, term4990.getClass(), "navigableKeySet", null);
        setField(term4990, term4990.getClass(), "descendingMap", null);
        setField(term4990, term4990.getClass(), "keySet", null);
        setField(term4990, term4990.getClass(), "values", null);
        setField(term4989, term4989.getClass(), "m", term4990);
        setField(term4942, term4942.getClass(), "genres", term4989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4942, args);
    }

};


