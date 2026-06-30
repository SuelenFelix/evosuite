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

public class UserActivity_getParam3_107123181333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293601;

    public UserActivity_getParam3_107123181333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293601 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        setLongField(term293601, term293601.getClass(), "id", 0L);
        setField(term293601, term293601.getClass(), "user", null);
        setIntField(term293601, term293601.getClass(), "kind", 0);
        setIntField(term293601, term293601.getClass(), "activityId", 0);
        setIntField(term293601, term293601.getClass(), "sortNumber", 0);
        setIntField(term293601, term293601.getClass(), "param1", 0);
        setIntField(term293601, term293601.getClass(), "param2", 0);
        setIntField(term293601, term293601.getClass(), "param3", 0);
        setIntField(term293601, term293601.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam3", argTypes, term293601, args);
    }

};


