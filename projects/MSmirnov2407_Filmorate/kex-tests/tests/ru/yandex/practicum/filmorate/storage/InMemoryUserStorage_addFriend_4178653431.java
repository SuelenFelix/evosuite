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

public class InMemoryUserStorage_addFriend_4178653431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351;
     Object term358;
     Object term419;

    public InMemoryUserStorage_addFriend_4178653431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term352 = new HashMap();
        term351 = newInstance(Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryUserStorage"));
        setField(term351, term351.getClass(), "storagedData", term352);
        setIntField(term351, term351.getClass(), "id", -1456670397);
        HashMap term400 = new HashMap();
        Set<Object> term512 =  ((Map) term400).keySet();
        HashSet term399 = new HashSet((Collection<? extends Object>) term512);
        HashMap term406 = new HashMap();
        Set<Object> term513 =  ((Map) term406).keySet();
        HashSet term405 = new HashSet((Collection<? extends Object>) term513);
        term358 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term395 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term358, term358.getClass(), "login", "IoAlmYsBwc");
        setField(term358, term358.getClass(), "email", "TEParAifyi");
        setField(term358, term358.getClass(), "name", "OWDIEULEFu");
        setIntField(term395, term395.getClass(), "year", 2012);
        setShortField(term395, term395.getClass(), "month", (short) 10);
        setShortField(term395, term395.getClass(), "day", (short) 1);
        setField(term358, term358.getClass(), "birthday", term395);
        setField(term358, term358.getClass(), "friends", term399);
        setField(term358, term358.getClass(), "likedFilms", term405);
        setIntField(term358, term358.getClass(), "id", -6029667);
        HashMap term461 = new HashMap();
        Set<Object> term544 =  ((Map) term461).keySet();
        HashSet term460 = new HashSet((Collection<? extends Object>) term544);
        HashMap term467 = new HashMap();
        Set<Object> term545 =  ((Map) term467).keySet();
        HashSet term466 = new HashSet((Collection<? extends Object>) term545);
        term419 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term456 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term419, term419.getClass(), "login", "IDCWpPLRkE");
        setField(term419, term419.getClass(), "email", "nyiiPDVjAc");
        setField(term419, term419.getClass(), "name", "aKnKipADSo");
        setIntField(term456, term456.getClass(), "year", 2015);
        setShortField(term456, term456.getClass(), "month", (short) 7);
        setShortField(term456, term456.getClass(), "day", (short) 24);
        setField(term419, term419.getClass(), "birthday", term456);
        setField(term419, term419.getClass(), "friends", term460);
        setField(term419, term419.getClass(), "likedFilms", term466);
        setIntField(term419, term419.getClass(), "id", 590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryUserStorage");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        argTypes[1] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[2];
        args[0] = term358;
        args[1] = term419;
        callMethod(klass, "addFriend", argTypes, term351, args);
    }

};


