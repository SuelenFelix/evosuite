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

public class UserActivity_getActivityId_204678897229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41919;

    public UserActivity_getActivityId_204678897229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41919 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserActivity"));
        setLongField(term41919, term41919.getClass(), "id", 0L);
        setField(term41919, term41919.getClass(), "user", null);
        setIntField(term41919, term41919.getClass(), "kind", 0);
        setIntField(term41919, term41919.getClass(), "activityId", 0);
        setIntField(term41919, term41919.getClass(), "sortNumber", 0);
        setIntField(term41919, term41919.getClass(), "param1", 0);
        setIntField(term41919, term41919.getClass(), "param2", 0);
        setIntField(term41919, term41919.getClass(), "param3", 0);
        setIntField(term41919, term41919.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActivityId", argTypes, term41919, args);
    }

};


