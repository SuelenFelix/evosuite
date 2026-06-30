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

public class Film_setMpa_81352049514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4464;
     Object term4522;

    public Film_setMpa_81352049514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4465 = new Long(463622836963501975L);
        Integer term4495 = new Integer(-1007160944);
        term4464 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4491 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4497 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term4511 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4512 = newInstance(Class.forName("java.util.TreeMap"));
        Object term4513 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4514 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term4516 = newInstance(Class.forName("java.lang.Object"));
        Object term4517 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term4464, term4464.getClass(), "id", term4465);
        setField(term4464, term4464.getClass(), "name", "vOuMEpOQAg");
        setField(term4464, term4464.getClass(), "description", "SIODFGaQhr");
        setIntField(term4491, term4491.getClass(), "year", 2025);
        setShortField(term4491, term4491.getClass(), "month", (short) 3);
        setShortField(term4491, term4491.getClass(), "day", (short) 8);
        setField(term4464, term4464.getClass(), "releaseDate", term4491);
        setField(term4464, term4464.getClass(), "duration", term4495);
        setIntField(term4497, term4497.getClass(), "id", 480137250);
        setField(term4497, term4497.getClass(), "name", "qYzsiuXOgS");
        setField(term4464, term4464.getClass(), "mpa", term4497);
        setField(term4512, term4512.getClass(), "comparator", null);
        setIntField(term4514, term4514.getClass(), "id", -341152642);
        setField(term4514, term4514.getClass(), "name", null);
        setField(term4513, term4513.getClass(), "key", term4514);
        setField(term4513, term4513.getClass(), "value", term4516);
        setField(term4517, term4517.getClass(), "key", null);
        setField(term4517, term4517.getClass(), "value", term4516);
        setField(term4517, term4517.getClass(), "left", null);
        setField(term4517, term4517.getClass(), "right", null);
        setField(term4517, term4517.getClass(), "parent", term4513);
        setBooleanField(term4517, term4517.getClass(), "color", false);
        setField(term4513, term4513.getClass(), "left", term4517);
        setField(term4513, term4513.getClass(), "right", null);
        setField(term4513, term4513.getClass(), "parent", null);
        setBooleanField(term4513, term4513.getClass(), "color", true);
        setField(term4512, term4512.getClass(), "root", term4513);
        setIntField(term4512, term4512.getClass(), "size", 2);
        setIntField(term4512, term4512.getClass(), "modCount", 2);
        setField(term4512, term4512.getClass(), "entrySet", null);
        setField(term4512, term4512.getClass(), "navigableKeySet", null);
        setField(term4512, term4512.getClass(), "descendingMap", null);
        setField(term4512, term4512.getClass(), "keySet", null);
        setField(term4512, term4512.getClass(), "values", null);
        setField(term4511, term4511.getClass(), "m", term4512);
        setField(term4464, term4464.getClass(), "genres", term4511);
        term4522 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setIntField(term4522, term4522.getClass(), "id", 538259104);
        setField(term4522, term4522.getClass(), "name", "UBRmXJmfrt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[1];
        args[0] = term4522;
        callMethod(klass, "setMpa", argTypes, term4464, args);
    }

};


