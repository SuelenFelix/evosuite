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

public class UserDbStorage_deleteFriend_20923188587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385;
     Object term442;

    public UserDbStorage_deleteFriend_20923188587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term427 = new HashMap();
        Set<Object> term539 =  ((Map) term427).keySet();
        HashSet term426 = new HashSet((Collection<? extends Object>) term539);
        HashMap term433 = new HashMap();
        Set<Object> term540 =  ((Map) term433).keySet();
        HashSet term432 = new HashSet((Collection<? extends Object>) term540);
        term385 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term422 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term385, term385.getClass(), "login", "BndsHwAFMv");
        setField(term385, term385.getClass(), "email", "GzFkzHGYFt");
        setField(term385, term385.getClass(), "name", "tShwQLRGNe");
        setIntField(term422, term422.getClass(), "year", 2019);
        setShortField(term422, term422.getClass(), "month", (short) 2);
        setShortField(term422, term422.getClass(), "day", (short) 20);
        setField(term385, term385.getClass(), "birthday", term422);
        setField(term385, term385.getClass(), "friends", term426);
        setField(term385, term385.getClass(), "likedFilms", term432);
        setIntField(term385, term385.getClass(), "id", -1007160944);
        HashMap term484 = new HashMap();
        Set<Object> term571 =  ((Map) term484).keySet();
        HashSet term483 = new HashSet((Collection<? extends Object>) term571);
        HashMap term490 = new HashMap();
        Set<Object> term572 =  ((Map) term490).keySet();
        HashSet term489 = new HashSet((Collection<? extends Object>) term572);
        term442 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term479 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term442, term442.getClass(), "login", "jDtqGUpnZN");
        setField(term442, term442.getClass(), "email", "nGKItKLYNC");
        setField(term442, term442.getClass(), "name", "UiUYnPrcCi");
        setIntField(term479, term479.getClass(), "year", 2018);
        setShortField(term479, term479.getClass(), "month", (short) 9);
        setShortField(term479, term479.getClass(), "day", (short) 27);
        setField(term442, term442.getClass(), "birthday", term479);
        setField(term442, term442.getClass(), "friends", term483);
        setField(term442, term442.getClass(), "likedFilms", term489);
        setIntField(term442, term442.getClass(), "id", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.dao.UserDbStorage");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        argTypes[1] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[2];
        args[0] = term385;
        args[1] = term442;
        callMethod(klass, "deleteFriend", argTypes, null, args);
    }

};


