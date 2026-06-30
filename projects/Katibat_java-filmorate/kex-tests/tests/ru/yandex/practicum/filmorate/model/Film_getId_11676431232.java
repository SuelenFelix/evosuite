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

public class Film_getId_11676431232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3364;

    public Film_getId_11676431232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3365 = new Long(-2644215923136513282L);
        Integer term3395 = new Integer(-522618178);
        term3364 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3391 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3397 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term3411 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3412 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3413 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3414 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term3416 = newInstance(Class.forName("java.lang.Object"));
        Object term3417 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3419 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term3364, term3364.getClass(), "id", term3365);
        setField(term3364, term3364.getClass(), "name", "xtftXXMbem");
        setField(term3364, term3364.getClass(), "description", "cudZvLMQon");
        setIntField(term3391, term3391.getClass(), "year", 2011);
        setShortField(term3391, term3391.getClass(), "month", (short) 5);
        setShortField(term3391, term3391.getClass(), "day", (short) 4);
        setField(term3364, term3364.getClass(), "releaseDate", term3391);
        setField(term3364, term3364.getClass(), "duration", term3395);
        setIntField(term3397, term3397.getClass(), "id", 972867650);
        setField(term3397, term3397.getClass(), "name", "lihXWlGDxk");
        setField(term3364, term3364.getClass(), "mpa", term3397);
        setField(term3412, term3412.getClass(), "comparator", null);
        setIntField(term3414, term3414.getClass(), "id", 1240914516);
        setField(term3414, term3414.getClass(), "name", null);
        setField(term3413, term3413.getClass(), "key", term3414);
        setField(term3413, term3413.getClass(), "value", term3416);
        setField(term3417, term3417.getClass(), "key", null);
        setField(term3417, term3417.getClass(), "value", term3416);
        setField(term3417, term3417.getClass(), "left", null);
        setField(term3417, term3417.getClass(), "right", null);
        setField(term3417, term3417.getClass(), "parent", term3413);
        setBooleanField(term3417, term3417.getClass(), "color", false);
        setField(term3413, term3413.getClass(), "left", term3417);
        setField(term3419, term3419.getClass(), "key", null);
        setField(term3419, term3419.getClass(), "value", term3416);
        setField(term3419, term3419.getClass(), "left", null);
        setField(term3419, term3419.getClass(), "right", null);
        setField(term3419, term3419.getClass(), "parent", term3413);
        setBooleanField(term3419, term3419.getClass(), "color", false);
        setField(term3413, term3413.getClass(), "right", term3419);
        setField(term3413, term3413.getClass(), "parent", null);
        setBooleanField(term3413, term3413.getClass(), "color", true);
        setField(term3412, term3412.getClass(), "root", term3413);
        setIntField(term3412, term3412.getClass(), "size", 3);
        setIntField(term3412, term3412.getClass(), "modCount", 3);
        setField(term3412, term3412.getClass(), "entrySet", null);
        setField(term3412, term3412.getClass(), "navigableKeySet", null);
        setField(term3412, term3412.getClass(), "descendingMap", null);
        setField(term3412, term3412.getClass(), "keySet", null);
        setField(term3412, term3412.getClass(), "values", null);
        setField(term3411, term3411.getClass(), "m", term3412);
        setField(term3364, term3364.getClass(), "genres", term3411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3364, args);
    }

};


