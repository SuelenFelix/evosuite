package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserActivity_getParam2_107123085232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293592;

    public UserActivity_getParam2_107123085232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293592 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        setLongField(term293592, term293592.getClass(), "id", 0L);
        setField(term293592, term293592.getClass(), "user", null);
        setIntField(term293592, term293592.getClass(), "kind", 0);
        setIntField(term293592, term293592.getClass(), "activityId", 0);
        setIntField(term293592, term293592.getClass(), "sortNumber", 0);
        setIntField(term293592, term293592.getClass(), "param1", 0);
        setIntField(term293592, term293592.getClass(), "param2", 0);
        setIntField(term293592, term293592.getClass(), "param3", 0);
        setIntField(term293592, term293592.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam2", argTypes, term293592, args);
    }

};


