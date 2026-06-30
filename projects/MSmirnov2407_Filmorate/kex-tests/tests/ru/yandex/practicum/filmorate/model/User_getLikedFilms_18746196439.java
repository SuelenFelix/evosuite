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

public class User_getLikedFilms_18746196439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;

    public User_getLikedFilms_18746196439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1001 = new HashMap();
        Set<Object> term1056 =  ((Map) term1001).keySet();
        HashSet term1000 = new HashSet((Collection<? extends Object>) term1056);
        HashMap term1007 = new HashMap();
        Set<Object> term1057 =  ((Map) term1007).keySet();
        HashSet term1006 = new HashSet((Collection<? extends Object>) term1057);
        term959 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term996 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term959, term959.getClass(), "login", "jiKYgYHqIS");
        setField(term959, term959.getClass(), "email", "DfISiziTgG");
        setField(term959, term959.getClass(), "name", "XqgfKFvPSD");
        setIntField(term996, term996.getClass(), "year", 2016);
        setShortField(term996, term996.getClass(), "month", (short) 5);
        setShortField(term996, term996.getClass(), "day", (short) 28);
        setField(term959, term959.getClass(), "birthday", term996);
        setField(term959, term959.getClass(), "friends", term1000);
        setField(term959, term959.getClass(), "likedFilms", term1006);
        setIntField(term959, term959.getClass(), "id", 2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikedFilms", argTypes, term959, args);
    }

};


