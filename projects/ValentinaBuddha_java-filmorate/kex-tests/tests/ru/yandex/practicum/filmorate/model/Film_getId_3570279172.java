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
import java.lang.Integer;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Film_getId_3570279172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3074;

    public Film_getId_3570279172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3075 = new Integer(1876565163);
        Integer term3105 = new Integer(-817164822);
        LinkedHashMap term3122 = new LinkedHashMap();
        Set<Object> term3172 =  ((Map) term3122).keySet();
        LinkedHashSet term3121 = new LinkedHashSet((Collection<? extends Object>) term3172);
        term3074 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3101 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3107 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3074, term3074.getClass(), "id", term3075);
        setField(term3074, term3074.getClass(), "name", "WzMEhMXkKx");
        setField(term3074, term3074.getClass(), "description", "XOiDvlDhdc");
        setIntField(term3101, term3101.getClass(), "year", 2029);
        setShortField(term3101, term3101.getClass(), "month", (short) 6);
        setShortField(term3101, term3101.getClass(), "day", (short) 22);
        setField(term3074, term3074.getClass(), "releaseDate", term3101);
        setField(term3074, term3074.getClass(), "duration", term3105);
        setIntField(term3107, term3107.getClass(), "id", -203030934);
        setField(term3107, term3107.getClass(), "name", "AdxvLJhNLe");
        setField(term3074, term3074.getClass(), "mpa", term3107);
        setField(term3074, term3074.getClass(), "genres", term3121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3074, args);
    }

};


