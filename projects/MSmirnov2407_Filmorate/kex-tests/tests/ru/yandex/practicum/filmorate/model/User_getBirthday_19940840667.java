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

public class User_getBirthday_19940840667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term773;

    public User_getBirthday_19940840667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term815 = new HashMap();
        Set<Object> term860 =  ((Map) term815).keySet();
        HashSet term814 = new HashSet((Collection<? extends Object>) term860);
        HashMap term821 = new HashMap();
        Set<Object> term861 =  ((Map) term821).keySet();
        HashSet term820 = new HashSet((Collection<? extends Object>) term861);
        term773 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term810 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term773, term773.getClass(), "login", "JUmudUmaaV");
        setField(term773, term773.getClass(), "email", "KoyGrUJeJW");
        setField(term773, term773.getClass(), "name", "HqBOwkVqjD");
        setIntField(term810, term810.getClass(), "year", 2012);
        setShortField(term810, term810.getClass(), "month", (short) 4);
        setShortField(term810, term810.getClass(), "day", (short) 19);
        setField(term773, term773.getClass(), "birthday", term810);
        setField(term773, term773.getClass(), "friends", term814);
        setField(term773, term773.getClass(), "likedFilms", term820);
        setIntField(term773, term773.getClass(), "id", -1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthday", argTypes, term773, args);
    }

};


