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

public class User_setLogin_26143236915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1525;

    public User_setLogin_26143236915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1526 = new Long(5510783420697225605L);
        HashMap term1569 = new HashMap();
        Set<Object> term1641 =  ((Map) term1569).keySet();
        HashSet term1568 = new HashSet((Collection<? extends Object>) term1641);
        term1525 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term1564 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1525, term1525.getClass(), "id", term1526);
        setField(term1525, term1525.getClass(), "email", "jDtqGUpnZN");
        setField(term1525, term1525.getClass(), "login", "nGKItKLYNC");
        setField(term1525, term1525.getClass(), "name", "UiUYnPrcCi");
        setIntField(term1564, term1564.getClass(), "year", 2029);
        setShortField(term1564, term1564.getClass(), "month", (short) 8);
        setShortField(term1564, term1564.getClass(), "day", (short) 28);
        setField(term1525, term1525.getClass(), "birthday", term1564);
        setField(term1525, term1525.getClass(), "friendsId", term1568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UoYtihxVaS";
        callMethod(klass, "setLogin", argTypes, term1525, args);
    }

};


