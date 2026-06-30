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

public class Film_getName_4000454483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3173;

    public Film_getName_4000454483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3174 = new Integer(-1016503459);
        Integer term3204 = new Integer(-1968847291);
        LinkedHashMap term3221 = new LinkedHashMap();
        Set<Object> term3271 =  ((Map) term3221).keySet();
        LinkedHashSet term3220 = new LinkedHashSet((Collection<? extends Object>) term3271);
        term3173 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3200 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3206 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3173, term3173.getClass(), "id", term3174);
        setField(term3173, term3173.getClass(), "name", "OJJtVNPyKZ");
        setField(term3173, term3173.getClass(), "description", "AKNapTAfmD");
        setIntField(term3200, term3200.getClass(), "year", 2011);
        setShortField(term3200, term3200.getClass(), "month", (short) 5);
        setShortField(term3200, term3200.getClass(), "day", (short) 4);
        setField(term3173, term3173.getClass(), "releaseDate", term3200);
        setField(term3173, term3173.getClass(), "duration", term3204);
        setIntField(term3206, term3206.getClass(), "id", -1530420153);
        setField(term3206, term3206.getClass(), "name", "xJgPlLxpgC");
        setField(term3173, term3173.getClass(), "mpa", term3206);
        setField(term3173, term3173.getClass(), "genres", term3220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3173, args);
    }

};


