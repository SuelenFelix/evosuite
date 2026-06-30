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

public class User_setEmail_205390746611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1169;

    public User_setEmail_205390746611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1211 = new HashMap();
        Set<Object> term1276 =  ((Map) term1211).keySet();
        HashSet term1210 = new HashSet((Collection<? extends Object>) term1276);
        HashMap term1217 = new HashMap();
        Set<Object> term1277 =  ((Map) term1217).keySet();
        HashSet term1216 = new HashSet((Collection<? extends Object>) term1277);
        term1169 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1206 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1169, term1169.getClass(), "login", "XylxrMBraH");
        setField(term1169, term1169.getClass(), "email", "pORebkoRdD");
        setField(term1169, term1169.getClass(), "name", "mXGCWJDOqA");
        setIntField(term1206, term1206.getClass(), "year", 2025);
        setShortField(term1206, term1206.getClass(), "month", (short) 11);
        setShortField(term1206, term1206.getClass(), "day", (short) 1);
        setField(term1169, term1169.getClass(), "birthday", term1206);
        setField(term1169, term1169.getClass(), "friends", term1210);
        setField(term1169, term1169.getClass(), "likedFilms", term1216);
        setIntField(term1169, term1169.getClass(), "id", -1371869594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        callMethod(klass, "setEmail", argTypes, term1169, args);
    }

};


