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

public class User_isFriend_11770871235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560;
     Object term642;

    public User_isFriend_11770871235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term561 = new Long(1967728129628047933L);
        HashMap term604 = new HashMap();
        Set<Object> term674 =  ((Map) term604).keySet();
        HashSet term603 = new HashSet((Collection<? extends Object>) term674);
        term560 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term599 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term560, term560.getClass(), "id", term561);
        setField(term560, term560.getClass(), "email", "HyxfbSQYBe");
        setField(term560, term560.getClass(), "login", "pCTimMblYc");
        setField(term560, term560.getClass(), "name", "hNxWaHcfhY");
        setIntField(term599, term599.getClass(), "year", 2015);
        setShortField(term599, term599.getClass(), "month", (short) 4);
        setShortField(term599, term599.getClass(), "day", (short) 14);
        setField(term560, term560.getClass(), "birthday", term599);
        setField(term560, term560.getClass(), "friendsId", term603);
        term642 = new Long(-8708192233349544946L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term642;
        callMethod(klass, "isFriend", argTypes, term560, args);
    }

};


