package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class UserItem_setValid_145493814431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53353;
     Object term53359;

    public UserItem_setValid_145493814431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53353 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserItem"));
        setLongField(term53353, term53353.getClass(), "id", 0L);
        setField(term53353, term53353.getClass(), "user", null);
        setIntField(term53353, term53353.getClass(), "itemKind", 0);
        setIntField(term53353, term53353.getClass(), "itemId", 0);
        setIntField(term53353, term53353.getClass(), "stock", 0);
        setBooleanField(term53353, term53353.getClass(), "isValid", false);
        term53359 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term53359;
        callMethod(klass, "setValid", argTypes, term53353, args);
    }

};


