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

public class User_getLogin_3501207715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1405;

    public User_getLogin_3501207715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1448 = new HashMap();
        Set<Object> term1488 =  ((Map) term1448).keySet();
        HashSet term1447 = new HashSet((Collection<? extends Object>) term1488);
        term1405 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1443 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1405, term1405.getClass(), "id", -316468845751588286L);
        setField(term1405, term1405.getClass(), "email", "UiUYnPrcCi");
        setField(term1405, term1405.getClass(), "login", "UoYtihxVaS");
        setField(term1405, term1405.getClass(), "name", "JDswTTCZHV");
        setIntField(term1443, term1443.getClass(), "year", 2015);
        setShortField(term1443, term1443.getClass(), "month", (short) 9);
        setShortField(term1443, term1443.getClass(), "day", (short) 19);
        setField(term1405, term1405.getClass(), "birthday", term1443);
        setField(term1405, term1405.getClass(), "friends", term1447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogin", argTypes, term1405, args);
    }

};


