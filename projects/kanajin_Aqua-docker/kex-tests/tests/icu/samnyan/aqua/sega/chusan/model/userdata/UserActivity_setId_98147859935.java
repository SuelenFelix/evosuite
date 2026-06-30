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
import java.lang.Long;

public class UserActivity_setId_98147859935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41973;
     Object term41982;

    public UserActivity_setId_98147859935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41973 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserActivity"));
        setLongField(term41973, term41973.getClass(), "id", 0L);
        setField(term41973, term41973.getClass(), "user", null);
        setIntField(term41973, term41973.getClass(), "kind", 0);
        setIntField(term41973, term41973.getClass(), "activityId", 0);
        setIntField(term41973, term41973.getClass(), "sortNumber", 0);
        setIntField(term41973, term41973.getClass(), "param1", 0);
        setIntField(term41973, term41973.getClass(), "param2", 0);
        setIntField(term41973, term41973.getClass(), "param3", 0);
        setIntField(term41973, term41973.getClass(), "param4", 0);
        term41982 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term41982;
        callMethod(klass, "setId", argTypes, term41973, args);
    }

};


