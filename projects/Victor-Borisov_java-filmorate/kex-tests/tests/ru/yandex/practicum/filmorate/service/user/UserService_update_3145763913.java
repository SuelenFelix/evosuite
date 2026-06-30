package ru.yandex.practicum.filmorate.service.user;

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
import static ru.yandex.practicum.filmorate.service.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class UserService_update_3145763913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;
     Object term80;

    public UserService_update_3145763913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.user.UserService"));
        setField(term79, term79.getClass(), "userStorage", null);
        setField(term79, term79.getClass(), "friendshipStorage", null);
        Integer term81 = new Integer(1484323161);
        term80 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term119 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term80, term80.getClass(), "id", term81);
        setField(term80, term80.getClass(), "email", "xxtlPwDYFs");
        setField(term80, term80.getClass(), "login", "jJCZpVmanW");
        setField(term80, term80.getClass(), "name", "EGtDIRbSSb");
        setIntField(term119, term119.getClass(), "year", 2016);
        setShortField(term119, term119.getClass(), "month", (short) 11);
        setShortField(term119, term119.getClass(), "day", (short) 29);
        setField(term80, term80.getClass(), "birthday", term119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.user.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term80;
        callMethod(klass, "update", argTypes, term79, args);
    }

};


