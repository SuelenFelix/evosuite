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

public class User_UserBuilder_email_5185459282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1865;

    public User_UserBuilder_email_5185459282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1866 = new Long(-8708192233349544946L);
        term1865 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term1904 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1865, term1865.getClass(), "id", term1866);
        setField(term1865, term1865.getClass(), "email", "JUmudUmaaV");
        setField(term1865, term1865.getClass(), "login", "KoyGrUJeJW");
        setField(term1865, term1865.getClass(), "name", "HqBOwkVqjD");
        setIntField(term1904, term1904.getClass(), "year", 2015);
        setShortField(term1904, term1904.getClass(), "month", (short) 7);
        setShortField(term1904, term1904.getClass(), "day", (short) 24);
        setField(term1865, term1865.getClass(), "birthday", term1904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MAcUBcBckh";
        callMethod(klass, "email", argTypes, term1865, args);
    }

};


