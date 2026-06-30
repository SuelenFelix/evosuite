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
import java.lang.Integer;

public class UserActivity_setKind_182432241137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293639;
     Object term293648;

    public UserActivity_setKind_182432241137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293639 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        setLongField(term293639, term293639.getClass(), "id", 0L);
        setField(term293639, term293639.getClass(), "user", null);
        setIntField(term293639, term293639.getClass(), "kind", 0);
        setIntField(term293639, term293639.getClass(), "activityId", 0);
        setIntField(term293639, term293639.getClass(), "sortNumber", 0);
        setIntField(term293639, term293639.getClass(), "param1", 0);
        setIntField(term293639, term293639.getClass(), "param2", 0);
        setIntField(term293639, term293639.getClass(), "param3", 0);
        setIntField(term293639, term293639.getClass(), "param4", 0);
        term293648 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term293648;
        callMethod(klass, "setKind", argTypes, term293639, args);
    }

};


