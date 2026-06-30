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

public class User_getLogin_3501207714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492;

    public User_getLogin_3501207714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term534 = new HashMap();
        Set<Object> term583 =  ((Map) term534).keySet();
        HashSet term533 = new HashSet((Collection<? extends Object>) term583);
        HashMap term540 = new HashMap();
        Set<Object> term584 =  ((Map) term540).keySet();
        HashSet term539 = new HashSet((Collection<? extends Object>) term584);
        term492 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term529 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term492, term492.getClass(), "login", "UlajhuVLaP");
        setField(term492, term492.getClass(), "email", "gGSMzuGICf");
        setField(term492, term492.getClass(), "name", "hxCBltsObl");
        setIntField(term529, term529.getClass(), "year", 2029);
        setShortField(term529, term529.getClass(), "month", (short) 1);
        setShortField(term529, term529.getClass(), "day", (short) 20);
        setField(term492, term492.getClass(), "birthday", term529);
        setField(term492, term492.getClass(), "friends", term533);
        setField(term492, term492.getClass(), "likedFilms", term539);
        setIntField(term492, term492.getClass(), "id", 590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogin", argTypes, term492, args);
    }

};


