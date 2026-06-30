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

public class Film_setName_131983112010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3860;

    public Film_setName_131983112010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3861 = new Integer(97029295);
        Integer term3891 = new Integer(-1371869594);
        LinkedHashMap term3908 = new LinkedHashMap();
        Set<Object> term3976 =  ((Map) term3908).keySet();
        LinkedHashSet term3907 = new LinkedHashSet((Collection<? extends Object>) term3976);
        term3860 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3893 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3860, term3860.getClass(), "id", term3861);
        setField(term3860, term3860.getClass(), "name", "JmcmxoGhIK");
        setField(term3860, term3860.getClass(), "description", "jXzmYyrnnT");
        setIntField(term3887, term3887.getClass(), "year", 2023);
        setShortField(term3887, term3887.getClass(), "month", (short) 3);
        setShortField(term3887, term3887.getClass(), "day", (short) 7);
        setField(term3860, term3860.getClass(), "releaseDate", term3887);
        setField(term3860, term3860.getClass(), "duration", term3891);
        setIntField(term3893, term3893.getClass(), "id", 933028652);
        setField(term3893, term3893.getClass(), "name", "igCAtimmYB");
        setField(term3860, term3860.getClass(), "mpa", term3893);
        setField(term3860, term3860.getClass(), "genres", term3907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iljANwuEjk";
        callMethod(klass, "setName", argTypes, term3860, args);
    }

};


