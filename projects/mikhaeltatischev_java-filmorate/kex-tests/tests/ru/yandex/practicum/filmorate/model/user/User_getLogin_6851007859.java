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

public class User_getLogin_6851007859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977;

    public User_getLogin_6851007859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term978 = new Long(5953383087795962419L);
        HashMap term1021 = new HashMap();
        Set<Object> term1065 =  ((Map) term1021).keySet();
        HashSet term1020 = new HashSet((Collection<? extends Object>) term1065);
        term977 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term1016 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term977, term977.getClass(), "id", term978);
        setField(term977, term977.getClass(), "email", "OWDIEULEFu");
        setField(term977, term977.getClass(), "login", "dWRymuLBtr");
        setField(term977, term977.getClass(), "name", "AijpHYOFuy");
        setIntField(term1016, term1016.getClass(), "year", 2026);
        setShortField(term1016, term1016.getClass(), "month", (short) 12);
        setShortField(term1016, term1016.getClass(), "day", (short) 13);
        setField(term977, term977.getClass(), "birthday", term1016);
        setField(term977, term977.getClass(), "friendsId", term1020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogin", argTypes, term977, args);
    }

};


