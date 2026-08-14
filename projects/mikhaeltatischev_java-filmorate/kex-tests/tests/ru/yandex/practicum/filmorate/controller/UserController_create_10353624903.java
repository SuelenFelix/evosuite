package ru.yandex.practicum.filmorate.controller;

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
import static ru.yandex.practicum.filmorate.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserController_create_10353624903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;
     Object term105;

    public UserController_create_10353624903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.UserController"));
        Object term104 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.user.UserService"));
        setField(term104, term104.getClass(), "userStorage", null);
        setField(term103, term103.getClass(), "userService", term104);
        Long term106 = new Long(4872422362414183754L);
        HashMap term149 = new HashMap();
        Set<Object> term201 =  ((Map) term149).keySet();
        HashSet term148 = new HashSet((Collection<? extends Object>) term201);
        term105 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term144 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term105, term105.getClass(), "id", term106);
        setField(term105, term105.getClass(), "email", "xxtlPwDYFs");
        setField(term105, term105.getClass(), "login", "jJCZpVmanW");
        setField(term105, term105.getClass(), "name", "EGtDIRbSSb");
        setIntField(term144, term144.getClass(), "year", 2016);
        setShortField(term144, term144.getClass(), "month", (short) 11);
        setShortField(term144, term144.getClass(), "day", (short) 29);
        setField(term105, term105.getClass(), "birthday", term144);
        setField(term105, term105.getClass(), "friendsId", term148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.UserController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Object[] args = new Object[1];
        args[0] = term105;
        callMethod(klass, "create", argTypes, term103, args);
    }

};


