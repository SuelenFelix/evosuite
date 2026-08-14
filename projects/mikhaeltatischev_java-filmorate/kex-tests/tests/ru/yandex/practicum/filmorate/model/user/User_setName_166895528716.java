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

public class User_setName_166895528716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1652;

    public User_setName_166895528716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1653 = new Long(-8876856890348836498L);
        HashMap term1696 = new HashMap();
        Set<Object> term1748 =  ((Map) term1696).keySet();
        HashSet term1695 = new HashSet((Collection<? extends Object>) term1748);
        term1652 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term1691 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1652, term1652.getClass(), "id", term1653);
        setField(term1652, term1652.getClass(), "email", "JDswTTCZHV");
        setField(term1652, term1652.getClass(), "login", "onpbIeEKoi");
        setField(term1652, term1652.getClass(), "name", "YRHGsAkhxb");
        setIntField(term1691, term1691.getClass(), "year", 2015);
        setShortField(term1691, term1691.getClass(), "month", (short) 7);
        setShortField(term1691, term1691.getClass(), "day", (short) 24);
        setField(term1652, term1652.getClass(), "birthday", term1691);
        setField(term1652, term1652.getClass(), "friendsId", term1695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ffYhPOzlUs";
        callMethod(klass, "setName", argTypes, term1652, args);
    }

};


