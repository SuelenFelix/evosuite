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
import java.lang.Integer;

public class Film_setDuration_154356009820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7247;
     Object term7325;

    public Film_setDuration_154356009820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7305 = new HashMap();
        Set<Object> term7367 =  ((Map) term7305).keySet();
        HashSet term7304 = new HashSet((Collection<? extends Object>) term7367);
        HashMap term7320 = new HashMap();
        Set<Object> term7368 =  ((Map) term7320).keySet();
        HashSet term7319 = new HashSet((Collection<? extends Object>) term7368);
        term7247 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term7273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7278 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term7247, term7247.getClass(), "id", -8463029266761149071L);
        setField(term7247, term7247.getClass(), "name", "pumvwBWvpy");
        setField(term7247, term7247.getClass(), "description", "HwLHeGLyhe");
        setIntField(term7273, term7273.getClass(), "year", 2021);
        setShortField(term7273, term7273.getClass(), "month", (short) 8);
        setShortField(term7273, term7273.getClass(), "day", (short) 11);
        setField(term7247, term7247.getClass(), "releaseDate", term7273);
        setIntField(term7247, term7247.getClass(), "duration", -1002370457);
        setIntField(term7278, term7278.getClass(), "id", -2014576105);
        setField(term7278, term7278.getClass(), "name", "RDnkgWkcbz");
        setField(term7278, term7278.getClass(), "description", "IBpaxltauX");
        setField(term7247, term7247.getClass(), "mpa", term7278);
        setField(term7247, term7247.getClass(), "genres", term7304);
        setField(term7247, term7247.getClass(), "likes", term7319);
        term7325 = new Integer(663292551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7325;
        callMethod(klass, "setDuration", argTypes, term7247, args);
    }

};


