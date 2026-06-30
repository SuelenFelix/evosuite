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

public class UserDbStorage_addFriend_11239512326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197;
     Object term258;

    public UserDbStorage_addFriend_11239512326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term239 = new HashMap();
        Set<Object> term351 =  ((Map) term239).keySet();
        HashSet term238 = new HashSet((Collection<? extends Object>) term351);
        HashMap term245 = new HashMap();
        Set<Object> term352 =  ((Map) term245).keySet();
        HashSet term244 = new HashSet((Collection<? extends Object>) term352);
        term197 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term234 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term197, term197.getClass(), "login", "BYqFIqCKAV");
        setField(term197, term197.getClass(), "email", "vrQLuWIDJX");
        setField(term197, term197.getClass(), "name", "flxyYxBRtu");
        setIntField(term234, term234.getClass(), "year", 2020);
        setShortField(term234, term234.getClass(), "month", (short) 5);
        setShortField(term234, term234.getClass(), "day", (short) 14);
        setField(term197, term197.getClass(), "birthday", term234);
        setField(term197, term197.getClass(), "friends", term238);
        setField(term197, term197.getClass(), "likedFilms", term244);
        setIntField(term197, term197.getClass(), "id", -1456670397);
        HashMap term300 = new HashMap();
        Set<Object> term383 =  ((Map) term300).keySet();
        HashSet term299 = new HashSet((Collection<? extends Object>) term383);
        HashMap term306 = new HashMap();
        Set<Object> term384 =  ((Map) term306).keySet();
        HashSet term305 = new HashSet((Collection<? extends Object>) term384);
        term258 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term295 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term258, term258.getClass(), "login", "SbAoxhfrkn");
        setField(term258, term258.getClass(), "email", "kuTXqwMtDB");
        setField(term258, term258.getClass(), "name", "Ghbwtircqb");
        setIntField(term295, term295.getClass(), "year", 2029);
        setShortField(term295, term295.getClass(), "month", (short) 1);
        setShortField(term295, term295.getClass(), "day", (short) 20);
        setField(term258, term258.getClass(), "birthday", term295);
        setField(term258, term258.getClass(), "friends", term299);
        setField(term258, term258.getClass(), "likedFilms", term305);
        setIntField(term258, term258.getClass(), "id", -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.dao.UserDbStorage");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        argTypes[1] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[2];
        args[0] = term197;
        args[1] = term258;
        callMethod(klass, "addFriend", argTypes, null, args);
    }

};


