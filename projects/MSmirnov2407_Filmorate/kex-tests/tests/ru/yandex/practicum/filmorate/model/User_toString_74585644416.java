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

public class User_toString_74585644416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1704;

    public User_toString_74585644416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1746 = new HashMap();
        Set<Object> term1788 =  ((Map) term1746).keySet();
        HashSet term1745 = new HashSet((Collection<? extends Object>) term1788);
        HashMap term1752 = new HashMap();
        Set<Object> term1789 =  ((Map) term1752).keySet();
        HashSet term1751 = new HashSet((Collection<? extends Object>) term1789);
        term1704 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1741 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1704, term1704.getClass(), "login", "xtftXXMbem");
        setField(term1704, term1704.getClass(), "email", "cudZvLMQon");
        setField(term1704, term1704.getClass(), "name", "lihXWlGDxk");
        setIntField(term1741, term1741.getClass(), "year", 2022);
        setShortField(term1741, term1741.getClass(), "month", (short) 2);
        setShortField(term1741, term1741.getClass(), "day", (short) 4);
        setField(term1704, term1704.getClass(), "birthday", term1741);
        setField(term1704, term1704.getClass(), "friends", term1745);
        setField(term1704, term1704.getClass(), "likedFilms", term1751);
        setIntField(term1704, term1704.getClass(), "id", 1655935355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1704, args);
    }

};


