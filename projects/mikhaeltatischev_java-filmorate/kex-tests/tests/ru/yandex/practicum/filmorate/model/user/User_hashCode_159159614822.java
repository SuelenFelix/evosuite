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

public class User_hashCode_159159614822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2279;

    public User_hashCode_159159614822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2280 = new Long(1084801489398441516L);
        HashMap term2323 = new HashMap();
        Set<Object> term2367 =  ((Map) term2323).keySet();
        HashSet term2322 = new HashSet((Collection<? extends Object>) term2367);
        term2279 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term2318 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2279, term2279.getClass(), "id", term2280);
        setField(term2279, term2279.getClass(), "email", "JUmudUmaaV");
        setField(term2279, term2279.getClass(), "login", "KoyGrUJeJW");
        setField(term2279, term2279.getClass(), "name", "HqBOwkVqjD");
        setIntField(term2318, term2318.getClass(), "year", 2012);
        setShortField(term2318, term2318.getClass(), "month", (short) 9);
        setShortField(term2318, term2318.getClass(), "day", (short) 11);
        setField(term2279, term2279.getClass(), "birthday", term2318);
        setField(term2279, term2279.getClass(), "friendsId", term2322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2279, args);
    }

};


