package ru.yandex.practicum.filmorate.model;

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
import static ru.yandex.practicum.filmorate.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_setLogin_735476459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1214;

    public User_setLogin_735476459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1215 = new Long(2120084523938730454L);
        term1214 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1253 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1214, term1214.getClass(), "id", term1215);
        setField(term1214, term1214.getClass(), "email", "tShwQLRGNe");
        setField(term1214, term1214.getClass(), "login", "LvtrsXUliU");
        setField(term1214, term1214.getClass(), "name", "xLbjWUgOIL");
        setIntField(term1253, term1253.getClass(), "year", 2022);
        setShortField(term1253, term1253.getClass(), "month", (short) 2);
        setShortField(term1253, term1253.getClass(), "day", (short) 25);
        setField(term1214, term1214.getClass(), "birthday", term1253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jDtqGUpnZN";
        callMethod(klass, "setLogin", argTypes, term1214, args);
    }

};


