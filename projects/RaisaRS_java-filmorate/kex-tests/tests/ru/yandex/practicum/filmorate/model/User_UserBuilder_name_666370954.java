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

public class User_UserBuilder_name_666370954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3056;

    public User_UserBuilder_name_666370954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3056 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term3094 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term3056, term3056.getClass(), "id", 1233889271256172047L);
        setField(term3056, term3056.getClass(), "email", "sEnIVFtZuQ");
        setField(term3056, term3056.getClass(), "login", "ZVecLZMLHF");
        setField(term3056, term3056.getClass(), "name", "fztQhjqwdP");
        setIntField(term3094, term3094.getClass(), "year", 2018);
        setShortField(term3094, term3094.getClass(), "month", (short) 9);
        setShortField(term3094, term3094.getClass(), "day", (short) 27);
        setField(term3056, term3056.getClass(), "birthday", term3094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eVpkWxjuki";
        callMethod(klass, "name", argTypes, term3056, args);
    }

};


