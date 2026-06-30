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

public class Film_setDuration_110156619613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4207;
     Object term4277;

    public Film_setDuration_110156619613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4208 = new Integer(-93135961);
        Integer term4238 = new Integer(-112921587);
        LinkedHashMap term4255 = new LinkedHashMap();
        Set<Object> term4309 =  ((Map) term4255).keySet();
        LinkedHashSet term4254 = new LinkedHashSet((Collection<? extends Object>) term4309);
        term4207 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4234 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4240 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4207, term4207.getClass(), "id", term4208);
        setField(term4207, term4207.getClass(), "name", "ZkMALXpEAZ");
        setField(term4207, term4207.getClass(), "description", "tXfQjSqDzN");
        setIntField(term4234, term4234.getClass(), "year", 2027);
        setShortField(term4234, term4234.getClass(), "month", (short) 8);
        setShortField(term4234, term4234.getClass(), "day", (short) 25);
        setField(term4207, term4207.getClass(), "releaseDate", term4234);
        setField(term4207, term4207.getClass(), "duration", term4238);
        setIntField(term4240, term4240.getClass(), "id", -1547384488);
        setField(term4240, term4240.getClass(), "name", "BjugTaMcxJ");
        setField(term4207, term4207.getClass(), "mpa", term4240);
        setField(term4207, term4207.getClass(), "genres", term4254);
        term4277 = new Integer(933028652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4277;
        callMethod(klass, "setDuration", argTypes, term4207, args);
    }

};


