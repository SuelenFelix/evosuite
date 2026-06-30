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

public class User_getBirthday_19940840667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1589;

    public User_getBirthday_19940840667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1632 = new HashMap();
        Set<Object> term1676 =  ((Map) term1632).keySet();
        HashSet term1631 = new HashSet((Collection<? extends Object>) term1676);
        term1589 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1627 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1589, term1589.getClass(), "id", -6573104506744284592L);
        setField(term1589, term1589.getClass(), "email", "MLqYREekMl");
        setField(term1589, term1589.getClass(), "login", "ytSBIKXogI");
        setField(term1589, term1589.getClass(), "name", "nHXjMycHlU");
        setIntField(term1627, term1627.getClass(), "year", 2015);
        setShortField(term1627, term1627.getClass(), "month", (short) 4);
        setShortField(term1627, term1627.getClass(), "day", (short) 14);
        setField(term1589, term1589.getClass(), "birthday", term1627);
        setField(term1589, term1589.getClass(), "friends", term1631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthday", argTypes, term1589, args);
    }

};


