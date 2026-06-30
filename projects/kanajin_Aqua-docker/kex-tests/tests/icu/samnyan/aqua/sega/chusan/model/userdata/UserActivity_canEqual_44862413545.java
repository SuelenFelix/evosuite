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

public class UserActivity_canEqual_44862413545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42079;

    public UserActivity_canEqual_44862413545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42079 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserActivity"));
        setLongField(term42079, term42079.getClass(), "id", 0L);
        setField(term42079, term42079.getClass(), "user", null);
        setIntField(term42079, term42079.getClass(), "kind", 0);
        setIntField(term42079, term42079.getClass(), "activityId", 0);
        setIntField(term42079, term42079.getClass(), "sortNumber", 0);
        setIntField(term42079, term42079.getClass(), "param1", 0);
        setIntField(term42079, term42079.getClass(), "param2", 0);
        setIntField(term42079, term42079.getClass(), "param3", 0);
        setIntField(term42079, term42079.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term42079, args);
    }

};


