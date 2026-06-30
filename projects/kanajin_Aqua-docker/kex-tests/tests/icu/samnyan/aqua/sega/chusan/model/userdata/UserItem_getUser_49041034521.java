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

public class UserItem_getUser_49041034521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53285;

    public UserItem_getUser_49041034521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53285 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserItem"));
        setLongField(term53285, term53285.getClass(), "id", 0L);
        setField(term53285, term53285.getClass(), "user", null);
        setIntField(term53285, term53285.getClass(), "itemKind", 0);
        setIntField(term53285, term53285.getClass(), "itemId", 0);
        setIntField(term53285, term53285.getClass(), "stock", 0);
        setBooleanField(term53285, term53285.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term53285, args);
    }

};


