package ru.yandex.practicum.filmorate.dao;

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
import static ru.yandex.practicum.filmorate.dao.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserDbStorage_update_181389401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;

    public UserDbStorage_update_181389401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term140 = new HashMap();
        Set<Object> term189 =  ((Map) term140).keySet();
        HashSet term139 = new HashSet((Collection<? extends Object>) term189);
        HashMap term146 = new HashMap();
        Set<Object> term190 =  ((Map) term146).keySet();
        HashSet term145 = new HashSet((Collection<? extends Object>) term190);
        term98 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term135 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term98, term98.getClass(), "login", "LQFpaHEwXR");
        setField(term98, term98.getClass(), "email", "oVcInYnLWB");
        setField(term98, term98.getClass(), "name", "aJlieCFVtF");
        setIntField(term135, term135.getClass(), "year", 2015);
        setShortField(term135, term135.getClass(), "month", (short) 4);
        setShortField(term135, term135.getClass(), "day", (short) 14);
        setField(term98, term98.getClass(), "birthday", term135);
        setField(term98, term98.getClass(), "friends", term139);
        setField(term98, term98.getClass(), "likedFilms", term145);
        setIntField(term98, term98.getClass(), "id", 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.dao.UserDbStorage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term98;
        callMethod(klass, "update", argTypes, null, args);
    }

};


