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
import java.lang.Long;
import java.lang.Object;

public class User_setEmail_20539074668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1119;

    public User_setEmail_20539074668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1120 = new Long(1967728129628047933L);
        term1119 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1158 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1119, term1119.getClass(), "id", term1120);
        setField(term1119, term1119.getClass(), "email", "gGSMzuGICf");
        setField(term1119, term1119.getClass(), "login", "hxCBltsObl");
        setField(term1119, term1119.getClass(), "name", "BndsHwAFMv");
        setIntField(term1158, term1158.getClass(), "year", 2017);
        setShortField(term1158, term1158.getClass(), "month", (short) 5);
        setShortField(term1158, term1158.getClass(), "day", (short) 21);
        setField(term1119, term1119.getClass(), "birthday", term1158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GzFkzHGYFt";
        callMethod(klass, "setEmail", argTypes, term1119, args);
    }

};


