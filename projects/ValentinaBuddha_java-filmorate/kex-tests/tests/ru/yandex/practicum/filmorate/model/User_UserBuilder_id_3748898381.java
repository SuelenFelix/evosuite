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

public class User_UserBuilder_id_3748898381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1708;
     Object term1751;

    public User_UserBuilder_id_3748898381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1709 = new Integer(-1685132342);
        term1708 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term1747 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1708, term1708.getClass(), "id", term1709);
        setField(term1708, term1708.getClass(), "email", "tPlsykYBqO");
        setField(term1708, term1708.getClass(), "login", "bLPjGVBhlX");
        setField(term1708, term1708.getClass(), "name", "whBvTVIIlC");
        setIntField(term1747, term1747.getClass(), "year", 2029);
        setShortField(term1747, term1747.getClass(), "month", (short) 8);
        setShortField(term1747, term1747.getClass(), "day", (short) 28);
        setField(term1708, term1708.getClass(), "birthday", term1747);
        term1751 = new Integer(-1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1751;
        callMethod(klass, "id", argTypes, term1708, args);
    }

};


