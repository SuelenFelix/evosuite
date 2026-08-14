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

public class User_updateUser_6938412651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;
     Object term143;

    public User_updateUser_6938412651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term74 = new Long(6375119433582206027L);
        HashMap term117 = new HashMap();
        Set<Object> term239 =  ((Map) term117).keySet();
        HashSet term116 = new HashSet((Collection<? extends Object>) term239);
        term73 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term112 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term73, term73.getClass(), "id", term74);
        setField(term73, term73.getClass(), "email", "xxtlPwDYFs");
        setField(term73, term73.getClass(), "login", "jJCZpVmanW");
        setField(term73, term73.getClass(), "name", "EGtDIRbSSb");
        setIntField(term112, term112.getClass(), "year", 2016);
        setShortField(term112, term112.getClass(), "month", (short) 11);
        setShortField(term112, term112.getClass(), "day", (short) 29);
        setField(term73, term73.getClass(), "birthday", term112);
        setField(term73, term73.getClass(), "friendsId", term116);
        Long term144 = new Long(6811161968424632369L);
        HashMap term187 = new HashMap();
        Set<Object> term270 =  ((Map) term187).keySet();
        HashSet term186 = new HashSet((Collection<? extends Object>) term270);
        term143 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term182 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term143, term143.getClass(), "id", term144);
        setField(term143, term143.getClass(), "email", "SzjVpOQTyS");
        setField(term143, term143.getClass(), "login", "MjGYSRKTNF");
        setField(term143, term143.getClass(), "name", "hRNSzYYIrc");
        setIntField(term182, term182.getClass(), "year", 2021);
        setShortField(term182, term182.getClass(), "month", (short) 1);
        setShortField(term182, term182.getClass(), "day", (short) 18);
        setField(term143, term143.getClass(), "birthday", term182);
        setField(term143, term143.getClass(), "friendsId", term186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Object[] args = new Object[1];
        args[0] = term143;
        callMethod(klass, "updateUser", argTypes, term73, args);
    }

};


