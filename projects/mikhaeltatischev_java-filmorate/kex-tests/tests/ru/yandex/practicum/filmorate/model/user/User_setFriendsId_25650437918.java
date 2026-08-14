package ru.yandex.practicum.filmorate.model.user;

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
import static ru.yandex.practicum.filmorate.model.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_setFriendsId_25650437918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1860;
     Object term1930;

    public User_setFriendsId_25650437918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1861 = new Long(2135754395358000892L);
        HashMap term1904 = new HashMap();
        Set<Object> term1992 =  ((Map) term1904).keySet();
        HashSet term1903 = new HashSet((Collection<? extends Object>) term1992);
        term1860 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term1899 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1860, term1860.getClass(), "id", term1861);
        setField(term1860, term1860.getClass(), "email", "ieCtQFdkii");
        setField(term1860, term1860.getClass(), "login", "dEnhdmILtU");
        setField(term1860, term1860.getClass(), "name", "hoicvmsovO");
        setIntField(term1899, term1899.getClass(), "year", 2019);
        setShortField(term1899, term1899.getClass(), "month", (short) 2);
        setShortField(term1899, term1899.getClass(), "day", (short) 20);
        setField(term1860, term1860.getClass(), "birthday", term1899);
        setField(term1860, term1860.getClass(), "friendsId", term1903);
        HashMap term1931 = new HashMap();
        Set<Object> term1993 =  ((Map) term1931).keySet();
        term1930 = new HashSet((Collection<? extends Object>) term1993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1930;
        callMethod(klass, "setFriendsId", argTypes, term1860, args);
    }

};


