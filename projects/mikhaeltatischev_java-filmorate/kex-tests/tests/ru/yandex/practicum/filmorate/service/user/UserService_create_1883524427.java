package ru.yandex.practicum.filmorate.service.user;

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
import static ru.yandex.practicum.filmorate.service.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserService_create_1883524427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term24;

    public UserService_create_1883524427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.user.UserService"));
        setField(term23, term23.getClass(), "userStorage", null);
        Long term25 = new Long(-7237588299778557629L);
        HashMap term68 = new HashMap();
        Set<Object> term124 =  ((Map) term68).keySet();
        HashSet term67 = new HashSet((Collection<? extends Object>) term124);
        term24 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term63 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term24, term24.getClass(), "id", term25);
        setField(term24, term24.getClass(), "email", "PAEBtnZtTD");
        setField(term24, term24.getClass(), "login", "sjlJAEtRrb");
        setField(term24, term24.getClass(), "name", "MuLcgQHgqz");
        setIntField(term63, term63.getClass(), "year", 2012);
        setShortField(term63, term63.getClass(), "month", (short) 8);
        setShortField(term63, term63.getClass(), "day", (short) 25);
        setField(term24, term24.getClass(), "birthday", term63);
        setField(term24, term24.getClass(), "friendsId", term67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.user.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Object[] args = new Object[1];
        args[0] = term24;
        callMethod(klass, "create", argTypes, term23, args);
    }

};


