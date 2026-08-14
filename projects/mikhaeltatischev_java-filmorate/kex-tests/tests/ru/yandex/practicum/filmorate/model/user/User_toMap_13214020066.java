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

public class User_toMap_13214020066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675;

    public User_toMap_13214020066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term676 = new Long(5907001541142728739L);
        HashMap term719 = new HashMap();
        Set<Object> term754 =  ((Map) term719).keySet();
        HashSet term718 = new HashSet((Collection<? extends Object>) term754);
        term675 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.user.User"));
        Object term714 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term675, term675.getClass(), "id", term676);
        setField(term675, term675.getClass(), "email", "RkybSrpybU");
        setField(term675, term675.getClass(), "login", "xOEqzGAmDU");
        setField(term675, term675.getClass(), "name", "eZFUvlxvGV");
        setIntField(term714, term714.getClass(), "year", 2017);
        setShortField(term714, term714.getClass(), "month", (short) 5);
        setShortField(term714, term714.getClass(), "day", (short) 21);
        setField(term675, term675.getClass(), "birthday", term714);
        setField(term675, term675.getClass(), "friendsId", term718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.user.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMap", argTypes, term675, args);
    }

};


