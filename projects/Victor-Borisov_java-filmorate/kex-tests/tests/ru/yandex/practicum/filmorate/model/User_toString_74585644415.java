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

public class User_toString_74585644415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1844;

    public User_toString_74585644415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1845 = new Integer(-184153539);
        term1844 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1883 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1844, term1844.getClass(), "id", term1845);
        setField(term1844, term1844.getClass(), "email", "whBvTVIIlC");
        setField(term1844, term1844.getClass(), "login", "IgRJUzaCwW");
        setField(term1844, term1844.getClass(), "name", "JUmudUmaaV");
        setIntField(term1883, term1883.getClass(), "year", 2029);
        setShortField(term1883, term1883.getClass(), "month", (short) 1);
        setShortField(term1883, term1883.getClass(), "day", (short) 20);
        setField(term1844, term1844.getClass(), "birthday", term1883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1844, args);
    }

};


