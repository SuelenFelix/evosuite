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

public class Film_setMpa_81352049521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7369;
     Object term7472;

    public Film_setMpa_81352049521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7427 = new HashMap();
        Set<Object> term7538 =  ((Map) term7427).keySet();
        HashSet term7426 = new HashSet((Collection<? extends Object>) term7538);
        HashMap term7438 = new HashMap();
        Set<Object> term7539 =  ((Map) term7438).keySet();
        HashSet term7437 = new HashSet((Collection<? extends Object>) term7539);
        term7369 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term7395 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7400 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term7369, term7369.getClass(), "id", 3133860696238261492L);
        setField(term7369, term7369.getClass(), "name", "lZIgPZPgTu");
        setField(term7369, term7369.getClass(), "description", "iuCxnHGMoW");
        setIntField(term7395, term7395.getClass(), "year", 2014);
        setShortField(term7395, term7395.getClass(), "month", (short) 2);
        setShortField(term7395, term7395.getClass(), "day", (short) 23);
        setField(term7369, term7369.getClass(), "releaseDate", term7395);
        setIntField(term7369, term7369.getClass(), "duration", -1885090354);
        setIntField(term7400, term7400.getClass(), "id", -2066804303);
        setField(term7400, term7400.getClass(), "name", "GPSEWEDSTo");
        setField(term7400, term7400.getClass(), "description", "RCOqfVsRHt");
        setField(term7369, term7369.getClass(), "mpa", term7400);
        setField(term7369, term7369.getClass(), "genres", term7426);
        setField(term7369, term7369.getClass(), "likes", term7437);
        term7472 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setIntField(term7472, term7472.getClass(), "id", -1239406390);
        setField(term7472, term7472.getClass(), "name", "vOVuNSCCLe");
        setField(term7472, term7472.getClass(), "description", "fzeqPnzpnt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[1];
        args[0] = term7472;
        callMethod(klass, "setMpa", argTypes, term7369, args);
    }

};


