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
     Object term1451;

    public User_setName_133397527310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1452 = new Integer(-1786399638);
        term1451 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1490 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1451, term1451.getClass(), "id", term1452);
        setField(term1451, term1451.getClass(), "email", "onpbIeEKoi");
        setField(term1451, term1451.getClass(), "login", "YRHGsAkhxb");
        setField(term1451, term1451.getClass(), "name", "ffYhPOzlUs");
        setIntField(term1490, term1490.getClass(), "year", 2017);
        setShortField(term1490, term1490.getClass(), "month", (short) 7);
        setShortField(term1490, term1490.getClass(), "day", (short) 22);
        setField(term1451, term1451.getClass(), "birthday", term1490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MLqYREekMl";
        callMethod(klass, "setName", argTypes, term1451, args);
    }

};


