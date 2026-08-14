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
import java.lang.Long;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserService_update_3094691138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;
     Object term126;

    public UserService_update_3094691138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.user.UserService"));
        setField(term125, term125.getClass(), "userStorage", null);
        Long term127 = new Long(-5476826692763582090L);
        HashMap term170 = new HashMap();
        Set<Object> term222 =  ((Map) term170).keySet();
        HashSet term169 = new HashSet((Collection<? extends Object>) term222);
        term126 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term165 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term126, term126.getClass(), "id", term127);
        setField(term126, term126.getClass(), "email", "xxtlPwDYFs");
        setField(term126, term126.getClass(), "login", "jJCZpVmanW");
        setField(term126, term126.getClass(), "name", "EGtDIRbSSb");
        setIntField(term165, term165.getClass(), "year", 2016);
        setShortField(term165, term165.getClass(), "month", (short) 11);
        setShortField(term165, term165.getClass(), "day", (short) 29);
        setField(term126, term126.getClass(), "birthday", term165);
        setField(term126, term126.getClass(), "friendsId", term169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.user.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Object[] args = new Object[1];
        args[0] = term126;
        callMethod(klass, "update", argTypes, term125, args);
    }

};


