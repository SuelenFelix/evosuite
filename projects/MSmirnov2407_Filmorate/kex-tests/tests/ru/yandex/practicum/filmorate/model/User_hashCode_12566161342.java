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

public class User_hashCode_12566161342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399;

    public User_hashCode_12566161342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term441 = new HashMap();
        Set<Object> term490 =  ((Map) term441).keySet();
        HashSet term440 = new HashSet((Collection<? extends Object>) term490);
        HashMap term447 = new HashMap();
        Set<Object> term491 =  ((Map) term447).keySet();
        HashSet term446 = new HashSet((Collection<? extends Object>) term491);
        term399 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term436 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term399, term399.getClass(), "login", "AijpHYOFuy");
        setField(term399, term399.getClass(), "email", "SbAoxhfrkn");
        setField(term399, term399.getClass(), "name", "kuTXqwMtDB");
        setIntField(term436, term436.getClass(), "year", 2020);
        setShortField(term436, term436.getClass(), "month", (short) 5);
        setShortField(term436, term436.getClass(), "day", (short) 14);
        setField(term399, term399.getClass(), "birthday", term436);
        setField(term399, term399.getClass(), "friends", term440);
        setField(term399, term399.getClass(), "likedFilms", term446);
        setIntField(term399, term399.getClass(), "id", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term399, args);
    }

};


