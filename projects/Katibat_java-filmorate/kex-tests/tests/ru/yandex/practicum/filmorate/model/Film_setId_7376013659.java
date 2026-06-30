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

public class Film_setId_7376013659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3970;
     Object term4026;

    public Film_setId_7376013659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3971 = new Long(7994303628307559416L);
        Integer term4001 = new Integer(1622346318);
        term3970 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3997 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4003 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term4017 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4018 = newInstance(Class.forName("java.util.TreeMap"));
        Object term4019 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4020 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term4022 = newInstance(Class.forName("java.lang.Object"));
        setField(term3970, term3970.getClass(), "id", term3971);
        setField(term3970, term3970.getClass(), "name", "PCipZnmBOF");
        setField(term3970, term3970.getClass(), "description", "zcorEihhLK");
        setIntField(term3997, term3997.getClass(), "year", 2023);
        setShortField(term3997, term3997.getClass(), "month", (short) 3);
        setShortField(term3997, term3997.getClass(), "day", (short) 7);
        setField(term3970, term3970.getClass(), "releaseDate", term3997);
        setField(term3970, term3970.getClass(), "duration", term4001);
        setIntField(term4003, term4003.getClass(), "id", 339854490);
        setField(term4003, term4003.getClass(), "name", "GrqozDKFOk");
        setField(term3970, term3970.getClass(), "mpa", term4003);
        setField(term4018, term4018.getClass(), "comparator", null);
        setIntField(term4020, term4020.getClass(), "id", -615654495);
        setField(term4020, term4020.getClass(), "name", null);
        setField(term4019, term4019.getClass(), "key", term4020);
        setField(term4019, term4019.getClass(), "value", term4022);
        setField(term4019, term4019.getClass(), "left", null);
        setField(term4019, term4019.getClass(), "right", null);
        setField(term4019, term4019.getClass(), "parent", null);
        setBooleanField(term4019, term4019.getClass(), "color", true);
        setField(term4018, term4018.getClass(), "root", term4019);
        setIntField(term4018, term4018.getClass(), "size", 1);
        setIntField(term4018, term4018.getClass(), "modCount", 1);
        setField(term4018, term4018.getClass(), "entrySet", null);
        setField(term4018, term4018.getClass(), "navigableKeySet", null);
        setField(term4018, term4018.getClass(), "descendingMap", null);
        setField(term4018, term4018.getClass(), "keySet", null);
        setField(term4018, term4018.getClass(), "values", null);
        setField(term4017, term4017.getClass(), "m", term4018);
        setField(term3970, term3970.getClass(), "genres", term4017);
        term4026 = new Long(2443640364875054177L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4026;
        callMethod(klass, "setId", argTypes, term3970, args);
    }

};


