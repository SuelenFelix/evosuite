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
import java.lang.Integer;
import java.lang.Object;

public class User_setName_133397527310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1227;

    public User_setName_133397527310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1228 = new Integer(1725571209);
        term1227 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1266 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1227, term1227.getClass(), "id", term1228);
        setField(term1227, term1227.getClass(), "email", "jDtqGUpnZN");
        setField(term1227, term1227.getClass(), "login", "nGKItKLYNC");
        setField(term1227, term1227.getClass(), "name", "UiUYnPrcCi");
        setIntField(term1266, term1266.getClass(), "year", 2017);
        setShortField(term1266, term1266.getClass(), "month", (short) 7);
        setShortField(term1266, term1266.getClass(), "day", (short) 22);
        setField(term1227, term1227.getClass(), "birthday", term1266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UoYtihxVaS";
        callMethod(klass, "setName", argTypes, term1227, args);
    }

};


