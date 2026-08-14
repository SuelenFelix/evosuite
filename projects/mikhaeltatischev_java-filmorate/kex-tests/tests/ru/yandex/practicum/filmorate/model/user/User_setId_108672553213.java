package ru.yandex.practicum.filmorate.model.user;

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
import static ru.yandex.practicum.filmorate.model.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_setId_108672553213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1332;
     Object term1381;

    public User_setId_108672553213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1333 = new Long(-7291743527973326814L);
        HashMap term1376 = new HashMap();
        Set<Object> term1413 =  ((Map) term1376).keySet();
        HashSet term1375 = new HashSet((Collection<? extends Object>) term1413);
        term1332 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term1371 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1332, term1332.getClass(), "id", term1333);
        setField(term1332, term1332.getClass(), "email", "gGSMzuGICf");
        setField(term1332, term1332.getClass(), "login", "hxCBltsObl");
        setField(term1332, term1332.getClass(), "name", "BndsHwAFMv");
        setIntField(term1371, term1371.getClass(), "year", 2024);
        setShortField(term1371, term1371.getClass(), "month", (short) 1);
        setShortField(term1371, term1371.getClass(), "day", (short) 24);
        setField(term1332, term1332.getClass(), "birthday", term1371);
        setField(term1332, term1332.getClass(), "friendsId", term1375);
        term1381 = new Long(-5963439350418910964L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1381;
        callMethod(klass, "setId", argTypes, term1332, args);
    }

};


