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

public class Film_getDuration_13662387266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3711;

    public Film_getDuration_13662387266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3712 = new Long(-3838084482494604218L);
        Integer term3742 = new Integer(597278769);
        term3711 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3738 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3744 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term3758 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3759 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term3711, term3711.getClass(), "id", term3712);
        setField(term3711, term3711.getClass(), "name", "kGMQdqJYyB");
        setField(term3711, term3711.getClass(), "description", "XJJNClzHRf");
        setIntField(term3738, term3738.getClass(), "year", 2016);
        setShortField(term3738, term3738.getClass(), "month", (short) 5);
        setShortField(term3738, term3738.getClass(), "day", (short) 28);
        setField(term3711, term3711.getClass(), "releaseDate", term3738);
        setField(term3711, term3711.getClass(), "duration", term3742);
        setIntField(term3744, term3744.getClass(), "id", 444029505);
        setField(term3744, term3744.getClass(), "name", "HDaezxQfQR");
        setField(term3711, term3711.getClass(), "mpa", term3744);
        setField(term3759, term3759.getClass(), "comparator", null);
        setField(term3759, term3759.getClass(), "root", null);
        setIntField(term3759, term3759.getClass(), "size", 0);
        setIntField(term3759, term3759.getClass(), "modCount", 0);
        setField(term3759, term3759.getClass(), "entrySet", null);
        setField(term3759, term3759.getClass(), "navigableKeySet", null);
        setField(term3759, term3759.getClass(), "descendingMap", null);
        setField(term3759, term3759.getClass(), "keySet", null);
        setField(term3759, term3759.getClass(), "values", null);
        setField(term3758, term3758.getClass(), "m", term3759);
        setField(term3711, term3711.getClass(), "genres", term3758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term3711, args);
    }

};


