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

public class UserItem_toString_67669020735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53379;

    public UserItem_toString_67669020735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53379 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserItem"));
        setLongField(term53379, term53379.getClass(), "id", 0L);
        setField(term53379, term53379.getClass(), "user", null);
        setIntField(term53379, term53379.getClass(), "itemKind", 0);
        setIntField(term53379, term53379.getClass(), "itemId", 0);
        setIntField(term53379, term53379.getClass(), "stock", 0);
        setBooleanField(term53379, term53379.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term53379, args);
    }

};


