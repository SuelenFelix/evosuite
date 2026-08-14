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

public class User_removeFriend_3795311374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478;
     Object term527;

    public User_removeFriend_3795311374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term479 = new Long(-7672528020740371001L);
        HashMap term522 = new HashMap();
        Set<Object> term559 =  ((Map) term522).keySet();
        HashSet term521 = new HashSet((Collection<? extends Object>) term559);
        term478 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term517 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term478, term478.getClass(), "id", term479);
        setField(term478, term478.getClass(), "email", "aJlieCFVtF");
        setField(term478, term478.getClass(), "login", "ZiaGIbnzTs");
        setField(term478, term478.getClass(), "name", "tbcdzjIfER");
        setIntField(term517, term517.getClass(), "year", 2018);
        setShortField(term517, term517.getClass(), "month", (short) 1);
        setShortField(term517, term517.getClass(), "day", (short) 13);
        setField(term478, term478.getClass(), "birthday", term517);
        setField(term478, term478.getClass(), "friendsId", term521);
        term527 = new Long(-4502405999831680926L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term527;
        callMethod(klass, "removeFriend", argTypes, term478, args);
    }

};


