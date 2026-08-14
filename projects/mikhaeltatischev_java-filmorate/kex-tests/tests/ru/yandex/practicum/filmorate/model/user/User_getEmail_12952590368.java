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

public class User_getEmail_12952590368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868;

    public User_getEmail_12952590368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term869 = new Long(-5788180182343976541L);
        HashMap term912 = new HashMap();
        Set<Object> term976 =  ((Map) term912).keySet();
        HashSet term911 = new HashSet((Collection<? extends Object>) term976);
        term868 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term907 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term868, term868.getClass(), "id", term869);
        setField(term868, term868.getClass(), "email", "OclPbYPkcH");
        setField(term868, term868.getClass(), "login", "IoAlmYsBwc");
        setField(term868, term868.getClass(), "name", "TEParAifyi");
        setIntField(term907, term907.getClass(), "year", 2017);
        setShortField(term907, term907.getClass(), "month", (short) 7);
        setShortField(term907, term907.getClass(), "day", (short) 22);
        setField(term868, term868.getClass(), "birthday", term907);
        setField(term868, term868.getClass(), "friendsId", term911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term868, args);
    }

};


