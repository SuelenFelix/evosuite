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

public class User_setEmail_171892745214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1414;

    public User_setEmail_171892745214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1415 = new Long(9013624480170062917L);
        HashMap term1458 = new HashMap();
        Set<Object> term1514 =  ((Map) term1458).keySet();
        HashSet term1457 = new HashSet((Collection<? extends Object>) term1514);
        term1414 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term1453 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1414, term1414.getClass(), "id", term1415);
        setField(term1414, term1414.getClass(), "email", "GzFkzHGYFt");
        setField(term1414, term1414.getClass(), "login", "tShwQLRGNe");
        setField(term1414, term1414.getClass(), "name", "LvtrsXUliU");
        setIntField(term1453, term1453.getClass(), "year", 2029);
        setShortField(term1453, term1453.getClass(), "month", (short) 1);
        setShortField(term1453, term1453.getClass(), "day", (short) 20);
        setField(term1414, term1414.getClass(), "birthday", term1453);
        setField(term1414, term1414.getClass(), "friendsId", term1457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        callMethod(klass, "setEmail", argTypes, term1414, args);
    }

};


