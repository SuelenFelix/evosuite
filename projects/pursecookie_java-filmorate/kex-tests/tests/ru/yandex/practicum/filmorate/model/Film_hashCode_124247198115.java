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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Film_hashCode_124247198115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3072;

    public Film_hashCode_124247198115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3117 = new HashMap();
        Set<Object> term3153 =  ((Map) term3117).keySet();
        HashSet term3116 = new HashSet((Collection<? extends Object>) term3153);
        term3072 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3102 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3072, term3072.getClass(), "name", "dpNsDgfPso");
        setField(term3072, term3072.getClass(), "description", "hCWPJQKpdc");
        setIntField(term3097, term3097.getClass(), "year", 2012);
        setShortField(term3097, term3097.getClass(), "month", (short) 2);
        setShortField(term3097, term3097.getClass(), "day", (short) 19);
        setField(term3072, term3072.getClass(), "releaseDate", term3097);
        setLongField(term3072, term3072.getClass(), "duration", -3948863953565024517L);
        setField(term3102, term3102.getClass(), "name", "WzMEhMXkKx");
        setLongField(term3102, term3102.getClass(), "id", -6587807377747738663L);
        setField(term3072, term3072.getClass(), "mpa", term3102);
        setField(term3072, term3072.getClass(), "genres", term3116);
        setLongField(term3072, term3072.getClass(), "id", -6301101997917060727L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3072, args);
    }

};


