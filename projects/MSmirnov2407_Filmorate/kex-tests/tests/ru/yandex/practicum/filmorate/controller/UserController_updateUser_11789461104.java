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

public class UserController_updateUser_11789461104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107;
     Object term109;

    public UserController_updateUser_11789461104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term108 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term108, term108.getClass(), "storage", null);
        setField(term107, term107.getClass(), "userService", term108);
        HashMap term151 = new HashMap();
        Set<Object> term202 =  ((Map) term151).keySet();
        HashSet term150 = new HashSet((Collection<? extends Object>) term202);
        HashMap term157 = new HashMap();
        Set<Object> term203 =  ((Map) term157).keySet();
        HashSet term156 = new HashSet((Collection<? extends Object>) term203);
        term109 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term146 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term109, term109.getClass(), "login", "LQFpaHEwXR");
        setField(term109, term109.getClass(), "email", "oVcInYnLWB");
        setField(term109, term109.getClass(), "name", "aJlieCFVtF");
        setIntField(term146, term146.getClass(), "year", 2015);
        setShortField(term146, term146.getClass(), "month", (short) 4);
        setShortField(term146, term146.getClass(), "day", (short) 14);
        setField(term109, term109.getClass(), "birthday", term146);
        setField(term109, term109.getClass(), "friends", term150);
        setField(term109, term109.getClass(), "likedFilms", term156);
        setIntField(term109, term109.getClass(), "id", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term109;
        callMethod(klass, "updateUser", argTypes, term107, args);
    }

};


