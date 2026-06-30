package ru.yandex.practicum.filmorate.validator;

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
import static ru.yandex.practicum.filmorate.validator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserValidator_validate_17448808681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UserValidator_validate_17448808681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        term1 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term40 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "email", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "login", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "name", "MuLcgQHgqz");
        setIntField(term40, term40.getClass(), "year", 2012);
        setShortField(term40, term40.getClass(), "month", (short) 8);
        setShortField(term40, term40.getClass(), "day", (short) 25);
        setField(term1, term1.getClass(), "birthday", term40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.validator.UserValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "validate", argTypes, null, args);
    }

};


