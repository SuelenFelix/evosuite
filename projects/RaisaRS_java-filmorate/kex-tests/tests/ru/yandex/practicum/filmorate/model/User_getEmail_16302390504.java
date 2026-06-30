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

public class User_getEmail_16302390504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1313;

    public User_getEmail_16302390504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1356 = new HashMap();
        Set<Object> term1404 =  ((Map) term1356).keySet();
        HashSet term1355 = new HashSet((Collection<? extends Object>) term1404);
        term1313 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1351 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1313, term1313.getClass(), "id", -872011222785455006L);
        setField(term1313, term1313.getClass(), "email", "xLbjWUgOIL");
        setField(term1313, term1313.getClass(), "login", "jDtqGUpnZN");
        setField(term1313, term1313.getClass(), "name", "nGKItKLYNC");
        setIntField(term1351, term1351.getClass(), "year", 2020);
        setShortField(term1351, term1351.getClass(), "month", (short) 11);
        setShortField(term1351, term1351.getClass(), "day", (short) 22);
        setField(term1313, term1313.getClass(), "birthday", term1351);
        setField(term1313, term1313.getClass(), "friends", term1355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1313, args);
    }

};


