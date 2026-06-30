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

public class User_userValues_198431161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1125;

    public User_userValues_198431161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1168 = new HashMap();
        Set<Object> term1220 =  ((Map) term1168).keySet();
        HashSet term1167 = new HashSet((Collection<? extends Object>) term1220);
        term1125 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1163 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1125, term1125.getClass(), "id", 2535595959091595249L);
        setField(term1125, term1125.getClass(), "email", "gGSMzuGICf");
        setField(term1125, term1125.getClass(), "login", "hxCBltsObl");
        setField(term1125, term1125.getClass(), "name", "BndsHwAFMv");
        setIntField(term1163, term1163.getClass(), "year", 2016);
        setShortField(term1163, term1163.getClass(), "month", (short) 11);
        setShortField(term1163, term1163.getClass(), "day", (short) 29);
        setField(term1125, term1125.getClass(), "birthday", term1163);
        setField(term1125, term1125.getClass(), "friends", term1167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "userValues", argTypes, term1125, args);
    }

};


