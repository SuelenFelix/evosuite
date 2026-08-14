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

public class User_equals_204028282320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2083;
     Object term2137;

    public User_equals_204028282320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2084 = new Long(-685023850445639859L);
        HashMap term2127 = new HashMap();
        Set<Object> term2168 =  ((Map) term2127).keySet();
        HashSet term2126 = new HashSet((Collection<? extends Object>) term2168);
        term2083 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term2122 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2083, term2083.getClass(), "id", term2084);
        setField(term2083, term2083.getClass(), "email", "kBdSllIBVz");
        setField(term2083, term2083.getClass(), "login", "TJmVBGfTML");
        setField(term2083, term2083.getClass(), "name", "tPlsykYBqO");
        setIntField(term2122, term2122.getClass(), "year", 2018);
        setShortField(term2122, term2122.getClass(), "month", (short) 9);
        setShortField(term2122, term2122.getClass(), "day", (short) 27);
        setField(term2083, term2083.getClass(), "birthday", term2122);
        setField(term2083, term2083.getClass(), "friendsId", term2126);
        term2137 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2137;
        callMethod(klass, "equals", argTypes, term2083, args);
    }

};


