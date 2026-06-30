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

public class Film_setReleaseDate_149277904912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4100;
     Object term4172;

    public Film_setReleaseDate_149277904912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4101 = new Integer(1324040357);
        Integer term4131 = new Integer(-1588772968);
        LinkedHashMap term4148 = new LinkedHashMap();
        Set<Object> term4206 =  ((Map) term4148).keySet();
        LinkedHashSet term4147 = new LinkedHashSet((Collection<? extends Object>) term4206);
        term4100 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4133 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4100, term4100.getClass(), "id", term4101);
        setField(term4100, term4100.getClass(), "name", "tRxZafjqIx");
        setField(term4100, term4100.getClass(), "description", "DhjNLmRMCu");
        setIntField(term4127, term4127.getClass(), "year", 2015);
        setShortField(term4127, term4127.getClass(), "month", (short) 3);
        setShortField(term4127, term4127.getClass(), "day", (short) 10);
        setField(term4100, term4100.getClass(), "releaseDate", term4127);
        setField(term4100, term4100.getClass(), "duration", term4131);
        setIntField(term4133, term4133.getClass(), "id", -478195677);
        setField(term4133, term4133.getClass(), "name", "PgPzMSEjjX");
        setField(term4100, term4100.getClass(), "mpa", term4133);
        setField(term4100, term4100.getClass(), "genres", term4147);
        term4172 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term4172, term4172.getClass(), "year", 2021);
        setShortField(term4172, term4172.getClass(), "month", (short) 9);
        setShortField(term4172, term4172.getClass(), "day", (short) 30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term4172;
        callMethod(klass, "setReleaseDate", argTypes, term4100, args);
    }

};


