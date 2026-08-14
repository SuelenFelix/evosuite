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

public class User_getFriendsId_103658973912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1247;

    public User_getFriendsId_103658973912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1248 = new Long(6682528376118987775L);
        HashMap term1291 = new HashMap();
        Set<Object> term1331 =  ((Map) term1291).keySet();
        HashSet term1290 = new HashSet((Collection<? extends Object>) term1331);
        term1247 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term1286 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1247, term1247.getClass(), "id", term1248);
        setField(term1247, term1247.getClass(), "email", "aKnKipADSo");
        setField(term1247, term1247.getClass(), "login", "wSQxaModmm");
        setField(term1247, term1247.getClass(), "name", "UlajhuVLaP");
        setIntField(term1286, term1286.getClass(), "year", 2012);
        setShortField(term1286, term1286.getClass(), "month", (short) 10);
        setShortField(term1286, term1286.getClass(), "day", (short) 1);
        setField(term1247, term1247.getClass(), "birthday", term1286);
        setField(term1247, term1247.getClass(), "friendsId", term1290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFriendsId", argTypes, term1247, args);
    }

};


