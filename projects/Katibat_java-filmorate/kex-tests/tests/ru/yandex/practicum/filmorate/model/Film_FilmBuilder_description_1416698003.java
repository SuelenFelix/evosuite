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

public class Film_FilmBuilder_description_1416698003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2584;

    public Film_FilmBuilder_description_1416698003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2585 = new Long(4044358158040652353L);
        Integer term2615 = new Integer(1484323161);
        term2584 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2611 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2617 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term2631 = newInstance(Class.forName("java.util.TreeSet"));
        Object term2632 = newInstance(Class.forName("java.util.TreeMap"));
        Object term2633 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2634 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term2636 = newInstance(Class.forName("java.lang.Object"));
        Object term2637 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2639 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term2584, term2584.getClass(), "id", term2585);
        setField(term2584, term2584.getClass(), "name", "fztQhjqwdP");
        setField(term2584, term2584.getClass(), "description", "eVpkWxjuki");
        setIntField(term2611, term2611.getClass(), "year", 2021);
        setShortField(term2611, term2611.getClass(), "month", (short) 9);
        setShortField(term2611, term2611.getClass(), "day", (short) 6);
        setField(term2584, term2584.getClass(), "releaseDate", term2611);
        setField(term2584, term2584.getClass(), "duration", term2615);
        setIntField(term2617, term2617.getClass(), "id", -73683645);
        setField(term2617, term2617.getClass(), "name", "SJiQaLvSKv");
        setField(term2584, term2584.getClass(), "mpa", term2617);
        setField(term2632, term2632.getClass(), "comparator", null);
        setIntField(term2634, term2634.getClass(), "id", -226514366);
        setField(term2634, term2634.getClass(), "name", null);
        setField(term2633, term2633.getClass(), "key", term2634);
        setField(term2633, term2633.getClass(), "value", term2636);
        setField(term2637, term2637.getClass(), "key", null);
        setField(term2637, term2637.getClass(), "value", term2636);
        setField(term2637, term2637.getClass(), "left", null);
        setField(term2637, term2637.getClass(), "right", null);
        setField(term2637, term2637.getClass(), "parent", term2633);
        setBooleanField(term2637, term2637.getClass(), "color", false);
        setField(term2633, term2633.getClass(), "left", term2637);
        setField(term2639, term2639.getClass(), "key", null);
        setField(term2639, term2639.getClass(), "value", term2636);
        setField(term2639, term2639.getClass(), "left", null);
        setField(term2639, term2639.getClass(), "right", null);
        setField(term2639, term2639.getClass(), "parent", term2633);
        setBooleanField(term2639, term2639.getClass(), "color", false);
        setField(term2633, term2633.getClass(), "right", term2639);
        setField(term2633, term2633.getClass(), "parent", null);
        setBooleanField(term2633, term2633.getClass(), "color", true);
        setField(term2632, term2632.getClass(), "root", term2633);
        setIntField(term2632, term2632.getClass(), "size", 3);
        setIntField(term2632, term2632.getClass(), "modCount", 3);
        setField(term2632, term2632.getClass(), "entrySet", null);
        setField(term2632, term2632.getClass(), "navigableKeySet", null);
        setField(term2632, term2632.getClass(), "descendingMap", null);
        setField(term2632, term2632.getClass(), "keySet", null);
        setField(term2632, term2632.getClass(), "values", null);
        setField(term2631, term2631.getClass(), "m", term2632);
        setField(term2584, term2584.getClass(), "genres", term2631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MvRIxilFMJ";
        callMethod(klass, "description", argTypes, term2584, args);
    }

};


