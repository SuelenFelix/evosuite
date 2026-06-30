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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Long;

public class User_addFriend_6647231840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1027;
     Object term1092;

    public User_addFriend_6647231840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1070 = new HashMap();
        Set<Object> term1124 =  ((Map) term1070).keySet();
        HashSet term1069 = new HashSet((Collection<? extends Object>) term1124);
        term1027 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1065 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1027, term1027.getClass(), "id", -4325723315152823407L);
        setField(term1027, term1027.getClass(), "email", "aKnKipADSo");
        setField(term1027, term1027.getClass(), "login", "wSQxaModmm");
        setField(term1027, term1027.getClass(), "name", "UlajhuVLaP");
        setIntField(term1065, term1065.getClass(), "year", 2012);
        setShortField(term1065, term1065.getClass(), "month", (short) 8);
        setShortField(term1065, term1065.getClass(), "day", (short) 25);
        setField(term1027, term1027.getClass(), "birthday", term1065);
        setField(term1027, term1027.getClass(), "friends", term1069);
        term1092 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1092;
        callMethod(klass, "addFriend", argTypes, term1027, args);
    }

};


