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

public class User_getBirthday_196590321611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1167;

    public User_getBirthday_196590321611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1168 = new Long(41775768178052008L);
        HashMap term1211 = new HashMap();
        Set<Object> term1246 =  ((Map) term1211).keySet();
        HashSet term1210 = new HashSet((Collection<? extends Object>) term1246);
        term1167 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term1206 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1167, term1167.getClass(), "id", term1168);
        setField(term1167, term1167.getClass(), "email", "xrwlQZdwCp");
        setField(term1167, term1167.getClass(), "login", "IDCWpPLRkE");
        setField(term1167, term1167.getClass(), "name", "nyiiPDVjAc");
        setIntField(term1206, term1206.getClass(), "year", 2025);
        setShortField(term1206, term1206.getClass(), "month", (short) 4);
        setShortField(term1206, term1206.getClass(), "day", (short) 23);
        setField(term1167, term1167.getClass(), "birthday", term1206);
        setField(term1167, term1167.getClass(), "friendsId", term1210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthday", argTypes, term1167, args);
    }

};


