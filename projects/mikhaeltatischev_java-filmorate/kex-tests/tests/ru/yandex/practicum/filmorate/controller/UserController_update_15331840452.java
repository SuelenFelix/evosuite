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
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserController_update_15331840452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;
     Object term6;

    public UserController_update_15331840452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term5 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.user.UserService"));
        setField(term5, term5.getClass(), "userStorage", null);
        setField(term4, term4.getClass(), "userService", term5);
        Long term7 = new Long(2442117782898005296L);
        HashMap term50 = new HashMap();
        Set<Object> term102 =  ((Map) term50).keySet();
        HashSet term49 = new HashSet((Collection<? extends Object>) term102);
        term6 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term45 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term6, term6.getClass(), "id", term7);
        setField(term6, term6.getClass(), "email", "PAEBtnZtTD");
        setField(term6, term6.getClass(), "login", "sjlJAEtRrb");
        setField(term6, term6.getClass(), "name", "MuLcgQHgqz");
        setIntField(term45, term45.getClass(), "year", 2012);
        setShortField(term45, term45.getClass(), "month", (short) 8);
        setShortField(term45, term45.getClass(), "day", (short) 25);
        setField(term6, term6.getClass(), "birthday", term45);
        setField(term6, term6.getClass(), "friendsId", term49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Object[] args = new Object[1];
        args[0] = term6;
        callMethod(klass, "update", argTypes, term4, args);
    }

};


