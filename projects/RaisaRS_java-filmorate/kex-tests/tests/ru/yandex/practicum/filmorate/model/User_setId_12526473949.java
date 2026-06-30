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
import java.lang.Long;

public class User_setId_12526473949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1781;
     Object term1854;

    public User_setId_12526473949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1824 = new HashMap();
        Set<Object> term1886 =  ((Map) term1824).keySet();
        HashSet term1823 = new HashSet((Collection<? extends Object>) term1886);
        term1781 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1819 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1781, term1781.getClass(), "id", 8428634514691209827L);
        setField(term1781, term1781.getClass(), "email", "eqJfYWRaEL");
        setField(term1781, term1781.getClass(), "login", "fhkbdRViHi");
        setField(term1781, term1781.getClass(), "name", "uWHnvSvaPl");
        setIntField(term1819, term1819.getClass(), "year", 2022);
        setShortField(term1819, term1819.getClass(), "month", (short) 2);
        setShortField(term1819, term1819.getClass(), "day", (short) 25);
        setField(term1781, term1781.getClass(), "birthday", term1819);
        setField(term1781, term1781.getClass(), "friends", term1823);
        term1854 = new Long(-2585684163342970173L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1854;
        callMethod(klass, "setId", argTypes, term1781, args);
    }

};


