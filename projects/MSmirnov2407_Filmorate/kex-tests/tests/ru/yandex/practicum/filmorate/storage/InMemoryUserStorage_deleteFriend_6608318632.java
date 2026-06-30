package ru.yandex.practicum.filmorate.storage;

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
import static ru.yandex.practicum.filmorate.storage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class InMemoryUserStorage_deleteFriend_6608318632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546;
     Object term553;
     Object term610;

    public InMemoryUserStorage_deleteFriend_6608318632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term547 = new HashMap();
        term546 = newInstance(Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryUserStorage"));
        setField(term546, term546.getClass(), "storagedData", term547);
        setIntField(term546, term546.getClass(), "id", 865208305);
        HashMap term595 = new HashMap();
        Set<Object> term703 =  ((Map) term595).keySet();
        HashSet term594 = new HashSet((Collection<? extends Object>) term703);
        HashMap term601 = new HashMap();
        Set<Object> term704 =  ((Map) term601).keySet();
        HashSet term600 = new HashSet((Collection<? extends Object>) term704);
        term553 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term590 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term553, term553.getClass(), "login", "xLbjWUgOIL");
        setField(term553, term553.getClass(), "email", "jDtqGUpnZN");
        setField(term553, term553.getClass(), "name", "nGKItKLYNC");
        setIntField(term590, term590.getClass(), "year", 2018);
        setShortField(term590, term590.getClass(), "month", (short) 9);
        setShortField(term590, term590.getClass(), "day", (short) 27);
        setField(term553, term553.getClass(), "birthday", term590);
        setField(term553, term553.getClass(), "friends", term594);
        setField(term553, term553.getClass(), "likedFilms", term600);
        setIntField(term553, term553.getClass(), "id", -244121226);
        HashMap term652 = new HashMap();
        Set<Object> term735 =  ((Map) term652).keySet();
        HashSet term651 = new HashSet((Collection<? extends Object>) term735);
        HashMap term658 = new HashMap();
        Set<Object> term736 =  ((Map) term658).keySet();
        HashSet term657 = new HashSet((Collection<? extends Object>) term736);
        term610 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term647 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term610, term610.getClass(), "login", "JDswTTCZHV");
        setField(term610, term610.getClass(), "email", "onpbIeEKoi");
        setField(term610, term610.getClass(), "name", "YRHGsAkhxb");
        setIntField(term647, term647.getClass(), "year", 2012);
        setShortField(term647, term647.getClass(), "month", (short) 9);
        setShortField(term647, term647.getClass(), "day", (short) 11);
        setField(term610, term610.getClass(), "birthday", term647);
        setField(term610, term610.getClass(), "friends", term651);
        setField(term610, term610.getClass(), "likedFilms", term657);
        setIntField(term610, term610.getClass(), "id", -1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryUserStorage");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        argTypes[1] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[2];
        args[0] = term553;
        args[1] = term610;
        callMethod(klass, "deleteFriend", argTypes, term546, args);
    }

};


