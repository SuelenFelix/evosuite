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

public class User_setLikedFilms_210096320315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1606;
     Object term1665;

    public User_setLikedFilms_210096320315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1648 = new HashMap();
        Set<Object> term1701 =  ((Map) term1648).keySet();
        HashSet term1647 = new HashSet((Collection<? extends Object>) term1701);
        HashMap term1654 = new HashMap();
        Set<Object> term1702 =  ((Map) term1654).keySet();
        HashSet term1653 = new HashSet((Collection<? extends Object>) term1702);
        term1606 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1643 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1606, term1606.getClass(), "login", "XYtryyobou");
        setField(term1606, term1606.getClass(), "email", "OYbzXylRWW");
        setField(term1606, term1606.getClass(), "name", "DSNsTGYXDF");
        setIntField(term1643, term1643.getClass(), "year", 2010);
        setShortField(term1643, term1643.getClass(), "month", (short) 1);
        setShortField(term1643, term1643.getClass(), "day", (short) 17);
        setField(term1606, term1606.getClass(), "birthday", term1643);
        setField(term1606, term1606.getClass(), "friends", term1647);
        setField(term1606, term1606.getClass(), "likedFilms", term1653);
        setIntField(term1606, term1606.getClass(), "id", 972867650);
        HashMap term1666 = new HashMap();
        Set<Object> term1703 =  ((Map) term1666).keySet();
        term1665 = new HashSet((Collection<? extends Object>) term1703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1665;
        callMethod(klass, "setLikedFilms", argTypes, term1606, args);
    }

};


