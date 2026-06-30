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

public class Film_getName_4000454483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3454;

    public Film_getName_4000454483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3455 = new Long(-1468719814009985452L);
        Integer term3485 = new Integer(1134449235);
        term3454 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3481 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3487 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term3501 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3502 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3503 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3504 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term3506 = newInstance(Class.forName("java.lang.Object"));
        Object term3507 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3509 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term3454, term3454.getClass(), "id", term3455);
        setField(term3454, term3454.getClass(), "name", "DyiXbeYIaN");
        setField(term3454, term3454.getClass(), "description", "VGizxZnyHX");
        setIntField(term3481, term3481.getClass(), "year", 2017);
        setShortField(term3481, term3481.getClass(), "month", (short) 3);
        setShortField(term3481, term3481.getClass(), "day", (short) 5);
        setField(term3454, term3454.getClass(), "releaseDate", term3481);
        setField(term3454, term3454.getClass(), "duration", term3485);
        setIntField(term3487, term3487.getClass(), "id", -1465035361);
        setField(term3487, term3487.getClass(), "name", "kVEZMHmRtR");
        setField(term3454, term3454.getClass(), "mpa", term3487);
        setField(term3502, term3502.getClass(), "comparator", null);
        setIntField(term3504, term3504.getClass(), "id", 1442160736);
        setField(term3504, term3504.getClass(), "name", null);
        setField(term3503, term3503.getClass(), "key", term3504);
        setField(term3503, term3503.getClass(), "value", term3506);
        setField(term3507, term3507.getClass(), "key", null);
        setField(term3507, term3507.getClass(), "value", term3506);
        setField(term3507, term3507.getClass(), "left", null);
        setField(term3507, term3507.getClass(), "right", null);
        setField(term3507, term3507.getClass(), "parent", term3503);
        setBooleanField(term3507, term3507.getClass(), "color", true);
        setField(term3503, term3503.getClass(), "left", term3507);
        setField(term3509, term3509.getClass(), "key", null);
        setField(term3509, term3509.getClass(), "value", term3506);
        setField(term3509, term3509.getClass(), "left", null);
        setField(term3509, term3509.getClass(), "right", null);
        setField(term3509, term3509.getClass(), "parent", term3503);
        setBooleanField(term3509, term3509.getClass(), "color", true);
        setField(term3503, term3503.getClass(), "right", term3509);
        setField(term3503, term3503.getClass(), "parent", null);
        setBooleanField(term3503, term3503.getClass(), "color", true);
        setField(term3502, term3502.getClass(), "root", term3503);
        setIntField(term3502, term3502.getClass(), "size", 7);
        setIntField(term3502, term3502.getClass(), "modCount", 7);
        setField(term3502, term3502.getClass(), "entrySet", null);
        setField(term3502, term3502.getClass(), "navigableKeySet", null);
        setField(term3502, term3502.getClass(), "descendingMap", null);
        setField(term3502, term3502.getClass(), "keySet", null);
        setField(term3502, term3502.getClass(), "values", null);
        setField(term3501, term3501.getClass(), "m", term3502);
        setField(term3454, term3454.getClass(), "genres", term3501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3454, args);
    }

};


