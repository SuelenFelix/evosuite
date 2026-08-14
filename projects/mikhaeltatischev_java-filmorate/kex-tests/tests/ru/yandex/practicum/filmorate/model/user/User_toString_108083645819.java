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

public class User_toString_108083645819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1994;

    public User_toString_108083645819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1995 = new Long(-3936701866695933852L);
        HashMap term2038 = new HashMap();
        Set<Object> term2082 =  ((Map) term2038).keySet();
        HashSet term2037 = new HashSet((Collection<? extends Object>) term2082);
        term1994 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term2033 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1994, term1994.getClass(), "id", term1995);
        setField(term1994, term1994.getClass(), "email", "eqJfYWRaEL");
        setField(term1994, term1994.getClass(), "login", "fhkbdRViHi");
        setField(term1994, term1994.getClass(), "name", "uWHnvSvaPl");
        setIntField(term2033, term2033.getClass(), "year", 2027);
        setShortField(term2033, term2033.getClass(), "month", (short) 3);
        setShortField(term2033, term2033.getClass(), "day", (short) 14);
        setField(term1994, term1994.getClass(), "birthday", term2033);
        setField(term1994, term1994.getClass(), "friendsId", term2037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1994, args);
    }

};


