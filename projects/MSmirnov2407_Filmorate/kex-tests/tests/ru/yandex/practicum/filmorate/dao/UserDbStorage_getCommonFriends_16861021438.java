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

public class UserDbStorage_getCommonFriends_16861021438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573;
     Object term632;

    public UserDbStorage_getCommonFriends_16861021438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term615 = new HashMap();
        Set<Object> term729 =  ((Map) term615).keySet();
        HashSet term614 = new HashSet((Collection<? extends Object>) term729);
        HashMap term621 = new HashMap();
        Set<Object> term730 =  ((Map) term621).keySet();
        HashSet term620 = new HashSet((Collection<? extends Object>) term730);
        term573 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term610 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term573, term573.getClass(), "login", "fhkbdRViHi");
        setField(term573, term573.getClass(), "email", "uWHnvSvaPl");
        setField(term573, term573.getClass(), "name", "kBdSllIBVz");
        setIntField(term610, term610.getClass(), "year", 2012);
        setShortField(term610, term610.getClass(), "month", (short) 4);
        setShortField(term610, term610.getClass(), "day", (short) 19);
        setField(term573, term573.getClass(), "birthday", term610);
        setField(term573, term573.getClass(), "friends", term614);
        setField(term573, term573.getClass(), "likedFilms", term620);
        setIntField(term573, term573.getClass(), "id", 1193880199);
        HashMap term674 = new HashMap();
        Set<Object> term761 =  ((Map) term674).keySet();
        HashSet term673 = new HashSet((Collection<? extends Object>) term761);
        HashMap term680 = new HashMap();
        Set<Object> term762 =  ((Map) term680).keySet();
        HashSet term679 = new HashSet((Collection<? extends Object>) term762);
        term632 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term669 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term632, term632.getClass(), "login", "IgRJUzaCwW");
        setField(term632, term632.getClass(), "email", "JUmudUmaaV");
        setField(term632, term632.getClass(), "name", "KoyGrUJeJW");
        setIntField(term669, term669.getClass(), "year", 2015);
        setShortField(term669, term669.getClass(), "month", (short) 9);
        setShortField(term669, term669.getClass(), "day", (short) 15);
        setField(term632, term632.getClass(), "birthday", term669);
        setField(term632, term632.getClass(), "friends", term673);
        setField(term632, term632.getClass(), "likedFilms", term679);
        setIntField(term632, term632.getClass(), "id", 767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.dao.UserDbStorage");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        argTypes[1] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[2];
        args[0] = term573;
        args[1] = term632;
        callMethod(klass, "getCommonFriends", argTypes, null, args);
    }

};


