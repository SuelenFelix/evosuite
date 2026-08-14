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

public class User_getId_15167672907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term755;

    public User_getId_15167672907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term756 = new Long(4178434741742309755L);
        HashMap term799 = new HashMap();
        Set<Object> term867 =  ((Map) term799).keySet();
        HashSet term798 = new HashSet((Collection<? extends Object>) term867);
        term755 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term794 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term755, term755.getClass(), "id", term756);
        setField(term755, term755.getClass(), "email", "BYqFIqCKAV");
        setField(term755, term755.getClass(), "login", "vrQLuWIDJX");
        setField(term755, term755.getClass(), "name", "flxyYxBRtu");
        setIntField(term794, term794.getClass(), "year", 2022);
        setShortField(term794, term794.getClass(), "month", (short) 2);
        setShortField(term794, term794.getClass(), "day", (short) 25);
        setField(term755, term755.getClass(), "birthday", term794);
        setField(term755, term755.getClass(), "friendsId", term798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term755, args);
    }

};


