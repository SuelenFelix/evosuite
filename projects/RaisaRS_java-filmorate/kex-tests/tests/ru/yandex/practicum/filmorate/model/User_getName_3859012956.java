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

public class User_getName_3859012956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1489;

    public User_getName_3859012956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1532 = new HashMap();
        Set<Object> term1588 =  ((Map) term1532).keySet();
        HashSet term1531 = new HashSet((Collection<? extends Object>) term1588);
        term1489 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1527 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1489, term1489.getClass(), "id", 5127676408959197577L);
        setField(term1489, term1489.getClass(), "email", "onpbIeEKoi");
        setField(term1489, term1489.getClass(), "login", "YRHGsAkhxb");
        setField(term1489, term1489.getClass(), "name", "ffYhPOzlUs");
        setIntField(term1527, term1527.getClass(), "year", 2018);
        setShortField(term1527, term1527.getClass(), "month", (short) 1);
        setShortField(term1527, term1527.getClass(), "day", (short) 13);
        setField(term1489, term1489.getClass(), "birthday", term1527);
        setField(term1489, term1489.getClass(), "friends", term1531);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1489, args);
    }

};


