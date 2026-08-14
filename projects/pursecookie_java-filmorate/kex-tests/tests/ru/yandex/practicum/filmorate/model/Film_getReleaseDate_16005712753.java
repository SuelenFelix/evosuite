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

public class Film_getReleaseDate_16005712753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1999;

    public Film_getReleaseDate_16005712753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2044 = new HashMap();
        Set<Object> term2080 =  ((Map) term2044).keySet();
        HashSet term2043 = new HashSet((Collection<? extends Object>) term2080);
        term1999 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2029 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term1999, term1999.getClass(), "name", "idgaQsnJpQ");
        setField(term1999, term1999.getClass(), "description", "VgZnGoIFwQ");
        setIntField(term2024, term2024.getClass(), "year", 2029);
        setShortField(term2024, term2024.getClass(), "month", (short) 1);
        setShortField(term2024, term2024.getClass(), "day", (short) 20);
        setField(term1999, term1999.getClass(), "releaseDate", term2024);
        setLongField(term1999, term1999.getClass(), "duration", 1368340889161782793L);
        setField(term2029, term2029.getClass(), "name", "jUbSRrkrYZ");
        setLongField(term2029, term2029.getClass(), "id", -5786861555969446503L);
        setField(term1999, term1999.getClass(), "mpa", term2029);
        setField(term1999, term1999.getClass(), "genres", term2043);
        setLongField(term1999, term1999.getClass(), "id", 2354625302846375590L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseDate", argTypes, term1999, args);
    }

};


