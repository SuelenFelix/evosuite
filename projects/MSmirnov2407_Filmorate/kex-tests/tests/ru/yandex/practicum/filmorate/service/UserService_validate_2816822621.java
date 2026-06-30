package ru.yandex.practicum.filmorate.service;

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
import static ru.yandex.practicum.filmorate.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserService_validate_2816822621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;
     Object term28;

    public UserService_validate_2816822621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.UserService"));
        setField(term27, term27.getClass(), "storage", null);
        HashMap term70 = new HashMap();
        Set<Object> term121 =  ((Map) term70).keySet();
        HashSet term69 = new HashSet((Collection<? extends Object>) term121);
        HashMap term76 = new HashMap();
        Set<Object> term122 =  ((Map) term76).keySet();
        HashSet term75 = new HashSet((Collection<? extends Object>) term122);
        term28 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term65 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term28, term28.getClass(), "login", "sjlJAEtRrb");
        setField(term28, term28.getClass(), "email", "MuLcgQHgqz");
        setField(term28, term28.getClass(), "name", "xxtlPwDYFs");
        setIntField(term65, term65.getClass(), "year", 2012);
        setShortField(term65, term65.getClass(), "month", (short) 8);
        setShortField(term65, term65.getClass(), "day", (short) 25);
        setField(term28, term28.getClass(), "birthday", term65);
        setField(term28, term28.getClass(), "friends", term69);
        setField(term28, term28.getClass(), "likedFilms", term75);
        setIntField(term28, term28.getClass(), "id", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term28;
        callMethod(klass, "validate", argTypes, term27, args);
    }

};


