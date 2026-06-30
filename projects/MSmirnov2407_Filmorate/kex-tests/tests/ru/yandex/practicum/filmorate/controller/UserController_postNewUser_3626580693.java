package ru.yandex.practicum.filmorate.controller;

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
import static ru.yandex.practicum.filmorate.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserController_postNewUser_3626580693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8;
     Object term10;

    public UserController_postNewUser_3626580693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term9 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term9, term9.getClass(), "storage", null);
        setField(term8, term8.getClass(), "userService", term9);
        HashMap term52 = new HashMap();
        Set<Object> term105 =  ((Map) term52).keySet();
        HashSet term51 = new HashSet((Collection<? extends Object>) term105);
        HashMap term58 = new HashMap();
        Set<Object> term106 =  ((Map) term58).keySet();
        HashSet term57 = new HashSet((Collection<? extends Object>) term106);
        term10 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term47 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term10, term10.getClass(), "login", "PAEBtnZtTD");
        setField(term10, term10.getClass(), "email", "sjlJAEtRrb");
        setField(term10, term10.getClass(), "name", "MuLcgQHgqz");
        setIntField(term47, term47.getClass(), "year", 2012);
        setShortField(term47, term47.getClass(), "month", (short) 8);
        setShortField(term47, term47.getClass(), "day", (short) 25);
        setField(term10, term10.getClass(), "birthday", term47);
        setField(term10, term10.getClass(), "friends", term51);
        setField(term10, term10.getClass(), "likedFilms", term57);
        setIntField(term10, term10.getClass(), "id", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term10;
        callMethod(klass, "postNewUser", argTypes, term8, args);
    }

};


