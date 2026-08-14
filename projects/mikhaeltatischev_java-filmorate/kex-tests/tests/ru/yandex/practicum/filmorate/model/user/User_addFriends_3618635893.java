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
import java.util.LinkedList;

public class User_addFriends_3618635893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366;
     Object term432;

    public User_addFriends_3618635893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term367 = new Long(5127676408959197577L);
        HashMap term410 = new HashMap();
        Set<Object> term477 =  ((Map) term410).keySet();
        HashSet term409 = new HashSet((Collection<? extends Object>) term477);
        term366 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term405 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term366, term366.getClass(), "id", term367);
        setField(term366, term366.getClass(), "email", "MxlszYVzRf");
        setField(term366, term366.getClass(), "login", "LQFpaHEwXR");
        setField(term366, term366.getClass(), "name", "oVcInYnLWB");
        setIntField(term405, term405.getClass(), "year", 2015);
        setShortField(term405, term405.getClass(), "month", (short) 9);
        setShortField(term405, term405.getClass(), "day", (short) 19);
        setField(term366, term366.getClass(), "birthday", term405);
        setField(term366, term366.getClass(), "friendsId", term409);
        Long term435 = new Long(8059786003080744426L);
        Long term438 = new Long(-4365849114644724155L);
        Long term441 = new Long(2486810210675247493L);
        Long term444 = new Long(7009926388951271268L);
        term432 = new LinkedList();
        ((LinkedList) term432).add(term435);
        ((LinkedList) term432).add(term438);
        ((LinkedList) term432).add(term441);
        ((LinkedList) term432).add(term444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term432;
        callMethod(klass, "addFriends", argTypes, term366, args);
    }

};


