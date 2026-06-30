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

public class InMemoryUserStorage_getCommonFriends_10670485784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746;
     Object term753;
     Object term812;

    public InMemoryUserStorage_getCommonFriends_10670485784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term747 = new HashMap();
        term746 = newInstance(Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryUserStorage"));
        setField(term746, term746.getClass(), "storagedData", term747);
        setIntField(term746, term746.getClass(), "id", 679763016);
        HashMap term795 = new HashMap();
        Set<Object> term905 =  ((Map) term795).keySet();
        HashSet term794 = new HashSet((Collection<? extends Object>) term905);
        HashMap term801 = new HashMap();
        Set<Object> term906 =  ((Map) term801).keySet();
        HashSet term800 = new HashSet((Collection<? extends Object>) term906);
        term753 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term790 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term753, term753.getClass(), "login", "tPlsykYBqO");
        setField(term753, term753.getClass(), "email", "bLPjGVBhlX");
        setField(term753, term753.getClass(), "name", "whBvTVIIlC");
        setIntField(term790, term790.getClass(), "year", 2023);
        setShortField(term790, term790.getClass(), "month", (short) 8);
        setShortField(term790, term790.getClass(), "day", (short) 12);
        setField(term753, term753.getClass(), "birthday", term790);
        setField(term753, term753.getClass(), "friends", term794);
        setField(term753, term753.getClass(), "likedFilms", term800);
        setIntField(term753, term753.getClass(), "id", -602026508);
        HashMap term854 = new HashMap();
        Set<Object> term937 =  ((Map) term854).keySet();
        HashSet term853 = new HashSet((Collection<? extends Object>) term937);
        HashMap term860 = new HashMap();
        Set<Object> term938 =  ((Map) term860).keySet();
        HashSet term859 = new HashSet((Collection<? extends Object>) term938);
        term812 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term849 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term812, term812.getClass(), "login", "MAcUBcBckh");
        setField(term812, term812.getClass(), "email", "oVgzLbrsFr");
        setField(term812, term812.getClass(), "name", "vQVyKLdtaz");
        setIntField(term849, term849.getClass(), "year", 2029);
        setShortField(term849, term849.getClass(), "month", (short) 6);
        setShortField(term849, term849.getClass(), "day", (short) 22);
        setField(term812, term812.getClass(), "birthday", term849);
        setField(term812, term812.getClass(), "friends", term853);
        setField(term812, term812.getClass(), "likedFilms", term859);
        setIntField(term812, term812.getClass(), "id", -14890619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryUserStorage");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        argTypes[1] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[2];
        args[0] = term753;
        args[1] = term812;
        callMethod(klass, "getCommonFriends", argTypes, term746, args);
    }

};


