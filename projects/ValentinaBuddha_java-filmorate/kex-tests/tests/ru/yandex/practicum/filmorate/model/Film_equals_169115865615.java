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

public class Film_equals_169115865615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4435;
     Object term4497;

    public Film_equals_169115865615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4436 = new Integer(1540719661);
        Integer term4466 = new Integer(1265463001);
        LinkedHashMap term4483 = new LinkedHashMap();
        Set<Object> term4528 =  ((Map) term4483).keySet();
        LinkedHashSet term4482 = new LinkedHashSet((Collection<? extends Object>) term4528);
        term4435 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4462 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4468 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4435, term4435.getClass(), "id", term4436);
        setField(term4435, term4435.getClass(), "name", "SFqCrhEWLm");
        setField(term4435, term4435.getClass(), "description", "GZdcJyZntS");
        setIntField(term4462, term4462.getClass(), "year", 2025);
        setShortField(term4462, term4462.getClass(), "month", (short) 3);
        setShortField(term4462, term4462.getClass(), "day", (short) 8);
        setField(term4435, term4435.getClass(), "releaseDate", term4462);
        setField(term4435, term4435.getClass(), "duration", term4466);
        setIntField(term4468, term4468.getClass(), "id", 304775596);
        setField(term4468, term4468.getClass(), "name", "OIHoJeysUi");
        setField(term4435, term4435.getClass(), "mpa", term4468);
        setField(term4435, term4435.getClass(), "genres", term4482);
        term4497 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4497;
        callMethod(klass, "equals", argTypes, term4435, args);
    }

};


