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

public class Film_getDescription_159240473911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5949;

    public Film_getDescription_159240473911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6007 = new HashMap();
        Set<Object> term6090 =  ((Map) term6007).keySet();
        HashSet term6006 = new HashSet((Collection<? extends Object>) term6090);
        HashMap term6024 = new HashMap();
        Set<Object> term6091 =  ((Map) term6024).keySet();
        HashSet term6023 = new HashSet((Collection<? extends Object>) term6091);
        term5949 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5980 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term5949, term5949.getClass(), "id", 5946780097489996391L);
        setField(term5949, term5949.getClass(), "name", "pJbnHTYrxn");
        setField(term5949, term5949.getClass(), "description", "iIRsCSYqXH");
        setIntField(term5975, term5975.getClass(), "year", 2027);
        setShortField(term5975, term5975.getClass(), "month", (short) 8);
        setShortField(term5975, term5975.getClass(), "day", (short) 25);
        setField(term5949, term5949.getClass(), "releaseDate", term5975);
        setIntField(term5949, term5949.getClass(), "duration", 683666002);
        setIntField(term5980, term5980.getClass(), "id", 1596213415);
        setField(term5980, term5980.getClass(), "name", "nghfqDXyCG");
        setField(term5980, term5980.getClass(), "description", "WBAOTqErtm");
        setField(term5949, term5949.getClass(), "mpa", term5980);
        setField(term5949, term5949.getClass(), "genres", term6006);
        setField(term5949, term5949.getClass(), "likes", term6023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term5949, args);
    }

};


