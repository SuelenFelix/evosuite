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

public class User_addFriend_9997031982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271;
     Object term333;

    public User_addFriend_9997031982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term272 = new Long(-4325723315152823407L);
        HashMap term315 = new HashMap();
        Set<Object> term365 =  ((Map) term315).keySet();
        HashSet term314 = new HashSet((Collection<? extends Object>) term365);
        term271 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term310 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term271, term271.getClass(), "id", term272);
        setField(term271, term271.getClass(), "email", "RMFIsYGgne");
        setField(term271, term271.getClass(), "login", "NRdvgJlhkX");
        setField(term271, term271.getClass(), "name", "uuaPigETmJ");
        setIntField(term310, term310.getClass(), "year", 2020);
        setShortField(term310, term310.getClass(), "month", (short) 11);
        setShortField(term310, term310.getClass(), "day", (short) 22);
        setField(term271, term271.getClass(), "birthday", term310);
        setField(term271, term271.getClass(), "friendsId", term314);
        term333 = new Long(-316468845751588286L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term333;
        callMethod(klass, "addFriend", argTypes, term271, args);
    }

};


