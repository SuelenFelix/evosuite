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

public class Film_getMpa_20404313457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3559;

    public Film_getMpa_20404313457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3560 = new Integer(-1048298087);
        Integer term3590 = new Integer(292681826);
        LinkedHashMap term3607 = new LinkedHashMap();
        Set<Object> term3661 =  ((Map) term3607).keySet();
        LinkedHashSet term3606 = new LinkedHashSet((Collection<? extends Object>) term3661);
        term3559 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3586 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3592 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3559, term3559.getClass(), "id", term3560);
        setField(term3559, term3559.getClass(), "name", "XkIoWJRNwN");
        setField(term3559, term3559.getClass(), "description", "aNWLJdrZMq");
        setIntField(term3586, term3586.getClass(), "year", 2016);
        setShortField(term3586, term3586.getClass(), "month", (short) 5);
        setShortField(term3586, term3586.getClass(), "day", (short) 28);
        setField(term3559, term3559.getClass(), "releaseDate", term3586);
        setField(term3559, term3559.getClass(), "duration", term3590);
        setIntField(term3592, term3592.getClass(), "id", -1786399638);
        setField(term3592, term3592.getClass(), "name", "HHmNoYxIGj");
        setField(term3559, term3559.getClass(), "mpa", term3592);
        setField(term3559, term3559.getClass(), "genres", term3606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMpa", argTypes, term3559, args);
    }

};


