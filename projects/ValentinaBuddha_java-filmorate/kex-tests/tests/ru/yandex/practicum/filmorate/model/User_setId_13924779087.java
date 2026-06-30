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

public class User_setId_13924779087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term962;
     Object term1005;

    public User_setId_13924779087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term963 = new Integer(-1955890973);
        term962 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1001 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term962, term962.getClass(), "id", term963);
        setField(term962, term962.getClass(), "email", "nyiiPDVjAc");
        setField(term962, term962.getClass(), "login", "aKnKipADSo");
        setField(term962, term962.getClass(), "name", "wSQxaModmm");
        setIntField(term1001, term1001.getClass(), "year", 2015);
        setShortField(term1001, term1001.getClass(), "month", (short) 4);
        setShortField(term1001, term1001.getClass(), "day", (short) 14);
        setField(term962, term962.getClass(), "birthday", term1001);
        term1005 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1005;
        callMethod(klass, "setId", argTypes, term962, args);
    }

};


