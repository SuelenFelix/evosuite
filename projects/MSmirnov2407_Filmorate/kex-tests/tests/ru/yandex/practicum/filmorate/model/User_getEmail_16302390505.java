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

public class User_getEmail_16302390505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585;

    public User_getEmail_16302390505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term627 = new HashMap();
        Set<Object> term672 =  ((Map) term627).keySet();
        HashSet term626 = new HashSet((Collection<? extends Object>) term672);
        HashMap term633 = new HashMap();
        Set<Object> term673 =  ((Map) term633).keySet();
        HashSet term632 = new HashSet((Collection<? extends Object>) term673);
        term585 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term622 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term585, term585.getClass(), "login", "UoYtihxVaS");
        setField(term585, term585.getClass(), "email", "JDswTTCZHV");
        setField(term585, term585.getClass(), "name", "onpbIeEKoi");
        setIntField(term622, term622.getClass(), "year", 2019);
        setShortField(term622, term622.getClass(), "month", (short) 2);
        setShortField(term622, term622.getClass(), "day", (short) 20);
        setField(term585, term585.getClass(), "birthday", term622);
        setField(term585, term585.getClass(), "friends", term626);
        setField(term585, term585.getClass(), "likedFilms", term632);
        setIntField(term585, term585.getClass(), "id", -1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term585, args);
    }

};


