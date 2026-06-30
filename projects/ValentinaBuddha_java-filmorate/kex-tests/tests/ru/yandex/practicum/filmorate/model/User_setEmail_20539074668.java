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

public class User_setEmail_20539074668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1037;

    public User_setEmail_20539074668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1038 = new Integer(1227103734);
        term1037 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1076 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1037, term1037.getClass(), "id", term1038);
        setField(term1037, term1037.getClass(), "email", "UlajhuVLaP");
        setField(term1037, term1037.getClass(), "login", "gGSMzuGICf");
        setField(term1037, term1037.getClass(), "name", "hxCBltsObl");
        setIntField(term1076, term1076.getClass(), "year", 2017);
        setShortField(term1076, term1076.getClass(), "month", (short) 5);
        setShortField(term1076, term1076.getClass(), "day", (short) 21);
        setField(term1037, term1037.getClass(), "birthday", term1076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BndsHwAFMv";
        callMethod(klass, "setEmail", argTypes, term1037, args);
    }

};


