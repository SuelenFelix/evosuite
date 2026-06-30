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

public class User_setFriends_130247086614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1508;
     Object term1567;

    public User_setFriends_130247086614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1550 = new HashMap();
        Set<Object> term1603 =  ((Map) term1550).keySet();
        HashSet term1549 = new HashSet((Collection<? extends Object>) term1603);
        HashMap term1556 = new HashMap();
        Set<Object> term1604 =  ((Map) term1556).keySet();
        HashSet term1555 = new HashSet((Collection<? extends Object>) term1604);
        term1508 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1545 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1508, term1508.getClass(), "login", "VeDtgDzGAN");
        setField(term1508, term1508.getClass(), "email", "aWYOWZFyaX");
        setField(term1508, term1508.getClass(), "name", "BRIVNtfUWU");
        setIntField(term1545, term1545.getClass(), "year", 2020);
        setShortField(term1545, term1545.getClass(), "month", (short) 8);
        setShortField(term1545, term1545.getClass(), "day", (short) 13);
        setField(term1508, term1508.getClass(), "birthday", term1545);
        setField(term1508, term1508.getClass(), "friends", term1549);
        setField(term1508, term1508.getClass(), "likedFilms", term1555);
        setIntField(term1508, term1508.getClass(), "id", 1063420942);
        HashMap term1568 = new HashMap();
        Set<Object> term1605 =  ((Map) term1568).keySet();
        term1567 = new HashSet((Collection<? extends Object>) term1605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1567;
        callMethod(klass, "setFriends", argTypes, term1508, args);
    }

};


