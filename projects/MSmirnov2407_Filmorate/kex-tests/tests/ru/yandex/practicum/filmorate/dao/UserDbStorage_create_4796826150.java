package ru.yandex.practicum.filmorate.dao;

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
import static ru.yandex.practicum.filmorate.dao.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserDbStorage_create_4796826150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UserDbStorage_create_4796826150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term43 = new HashMap();
        Set<Object> term96 =  ((Map) term43).keySet();
        HashSet term42 = new HashSet((Collection<? extends Object>) term96);
        HashMap term49 = new HashMap();
        Set<Object> term97 =  ((Map) term49).keySet();
        HashSet term48 = new HashSet((Collection<? extends Object>) term97);
        term1 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term38 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1, term1.getClass(), "login", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "email", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "name", "MuLcgQHgqz");
        setIntField(term38, term38.getClass(), "year", 2012);
        setShortField(term38, term38.getClass(), "month", (short) 8);
        setShortField(term38, term38.getClass(), "day", (short) 25);
        setField(term1, term1.getClass(), "birthday", term38);
        setField(term1, term1.getClass(), "friends", term42);
        setField(term1, term1.getClass(), "likedFilms", term48);
        setIntField(term1, term1.getClass(), "id", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.dao.UserDbStorage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "create", argTypes, null, args);
    }

};


