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

public class Film_setId_13783337559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3755;
     Object term3827;

    public Film_setId_13783337559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3756 = new Integer(493620644);
        Integer term3786 = new Integer(1328271830);
        LinkedHashMap term3803 = new LinkedHashMap();
        Set<Object> term3859 =  ((Map) term3803).keySet();
        LinkedHashSet term3802 = new LinkedHashSet((Collection<? extends Object>) term3859);
        term3755 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3788 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3755, term3755.getClass(), "id", term3756);
        setField(term3755, term3755.getClass(), "name", "OYbzXylRWW");
        setField(term3755, term3755.getClass(), "description", "DSNsTGYXDF");
        setIntField(term3782, term3782.getClass(), "year", 2027);
        setShortField(term3782, term3782.getClass(), "month", (short) 10);
        setShortField(term3782, term3782.getClass(), "day", (short) 4);
        setField(term3755, term3755.getClass(), "releaseDate", term3782);
        setField(term3755, term3755.getClass(), "duration", term3786);
        setIntField(term3788, term3788.getClass(), "id", -1371869594);
        setField(term3788, term3788.getClass(), "name", "sQvGcVjdEx");
        setField(term3755, term3755.getClass(), "mpa", term3788);
        setField(term3755, term3755.getClass(), "genres", term3802);
        term3827 = new Integer(1596070772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3827;
        callMethod(klass, "setId", argTypes, term3755, args);
    }

};


