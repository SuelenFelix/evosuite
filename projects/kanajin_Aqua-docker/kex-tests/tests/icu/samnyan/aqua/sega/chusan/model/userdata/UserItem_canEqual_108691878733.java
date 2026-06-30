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

public class UserItem_canEqual_108691878733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53367;

    public UserItem_canEqual_108691878733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53367 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserItem"));
        setLongField(term53367, term53367.getClass(), "id", 0L);
        setField(term53367, term53367.getClass(), "user", null);
        setIntField(term53367, term53367.getClass(), "itemKind", 0);
        setIntField(term53367, term53367.getClass(), "itemId", 0);
        setIntField(term53367, term53367.getClass(), "stock", 0);
        setBooleanField(term53367, term53367.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term53367, args);
    }

};


