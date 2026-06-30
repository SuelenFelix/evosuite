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

public class User_UserBuilder_build_1656415996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2145;

    public User_UserBuilder_build_1656415996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2146 = new Integer(-2068769794);
        term2145 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term2184 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2145, term2145.getClass(), "id", term2146);
        setField(term2145, term2145.getClass(), "email", "PHvxnGHptP");
        setField(term2145, term2145.getClass(), "login", "TimdotUuNC");
        setField(term2145, term2145.getClass(), "name", "PkWMRdJcBb");
        setIntField(term2184, term2184.getClass(), "year", 2018);
        setShortField(term2184, term2184.getClass(), "month", (short) 9);
        setShortField(term2184, term2184.getClass(), "day", (short) 27);
        setField(term2145, term2145.getClass(), "birthday", term2184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2145, args);
    }

};


