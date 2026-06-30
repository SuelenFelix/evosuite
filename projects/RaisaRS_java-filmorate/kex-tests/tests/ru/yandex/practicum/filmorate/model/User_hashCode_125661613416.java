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

public class User_hashCode_125661613416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2519;

    public User_hashCode_125661613416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2562 = new HashMap();
        Set<Object> term2602 =  ((Map) term2562).keySet();
        HashSet term2561 = new HashSet((Collection<? extends Object>) term2602);
        term2519 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term2557 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term2519, term2519.getClass(), "id", 1967728129628047933L);
        setField(term2519, term2519.getClass(), "email", "TimdotUuNC");
        setField(term2519, term2519.getClass(), "login", "PkWMRdJcBb");
        setField(term2519, term2519.getClass(), "name", "jSpAteRute");
        setIntField(term2557, term2557.getClass(), "year", 2029);
        setShortField(term2557, term2557.getClass(), "month", (short) 8);
        setShortField(term2557, term2557.getClass(), "day", (short) 28);
        setField(term2519, term2519.getClass(), "birthday", term2557);
        setField(term2519, term2519.getClass(), "friends", term2561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2519, args);
    }

};


