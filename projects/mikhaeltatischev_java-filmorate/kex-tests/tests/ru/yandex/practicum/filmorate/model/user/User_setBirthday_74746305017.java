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

public class User_setBirthday_74746305017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1759;
     Object term1825;

    public User_setBirthday_74746305017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1760 = new Long(6689117472719450333L);
        HashMap term1803 = new HashMap();
        Set<Object> term1859 =  ((Map) term1803).keySet();
        HashSet term1802 = new HashSet((Collection<? extends Object>) term1859);
        term1759 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term1798 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1759, term1759.getClass(), "id", term1760);
        setField(term1759, term1759.getClass(), "email", "MLqYREekMl");
        setField(term1759, term1759.getClass(), "login", "ytSBIKXogI");
        setField(term1759, term1759.getClass(), "name", "nHXjMycHlU");
        setIntField(term1798, term1798.getClass(), "year", 2022);
        setShortField(term1798, term1798.getClass(), "month", (short) 11);
        setShortField(term1798, term1798.getClass(), "day", (short) 16);
        setField(term1759, term1759.getClass(), "birthday", term1798);
        setField(term1759, term1759.getClass(), "friendsId", term1802);
        term1825 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1825, term1825.getClass(), "year", 2024);
        setShortField(term1825, term1825.getClass(), "month", (short) 8);
        setShortField(term1825, term1825.getClass(), "day", (short) 31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term1825;
        callMethod(klass, "setBirthday", argTypes, term1759, args);
    }

};


