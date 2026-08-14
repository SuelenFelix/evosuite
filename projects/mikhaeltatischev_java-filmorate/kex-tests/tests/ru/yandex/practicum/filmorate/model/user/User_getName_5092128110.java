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

public class User_getName_5092128110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1066;

    public User_getName_5092128110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1067 = new Long(2062173786000223358L);
        HashMap term1110 = new HashMap();
        Set<Object> term1166 =  ((Map) term1110).keySet();
        HashSet term1109 = new HashSet((Collection<? extends Object>) term1166);
        term1066 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term1105 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1066, term1066.getClass(), "id", term1067);
        setField(term1066, term1066.getClass(), "email", "SbAoxhfrkn");
        setField(term1066, term1066.getClass(), "login", "kuTXqwMtDB");
        setField(term1066, term1066.getClass(), "name", "Ghbwtircqb");
        setIntField(term1105, term1105.getClass(), "year", 2020);
        setShortField(term1105, term1105.getClass(), "month", (short) 5);
        setShortField(term1105, term1105.getClass(), "day", (short) 14);
        setField(term1066, term1066.getClass(), "birthday", term1105);
        setField(term1066, term1066.getClass(), "friendsId", term1109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1066, args);
    }

};


