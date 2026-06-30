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

public class User_equals_17053028091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303;
     Object term366;

    public User_equals_17053028091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term345 = new HashMap();
        Set<Object> term397 =  ((Map) term345).keySet();
        HashSet term344 = new HashSet((Collection<? extends Object>) term397);
        HashMap term351 = new HashMap();
        Set<Object> term398 =  ((Map) term351).keySet();
        HashSet term350 = new HashSet((Collection<? extends Object>) term398);
        term303 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term340 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term303, term303.getClass(), "login", "RkybSrpybU");
        setField(term303, term303.getClass(), "email", "xOEqzGAmDU");
        setField(term303, term303.getClass(), "name", "eZFUvlxvGV");
        setIntField(term340, term340.getClass(), "year", 2015);
        setShortField(term340, term340.getClass(), "month", (short) 4);
        setShortField(term340, term340.getClass(), "day", (short) 14);
        setField(term303, term303.getClass(), "birthday", term340);
        setField(term303, term303.getClass(), "friends", term344);
        setField(term303, term303.getClass(), "likedFilms", term350);
        setIntField(term303, term303.getClass(), "id", -1456670397);
        term366 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term366;
        callMethod(klass, "equals", argTypes, term303, args);
    }

};


