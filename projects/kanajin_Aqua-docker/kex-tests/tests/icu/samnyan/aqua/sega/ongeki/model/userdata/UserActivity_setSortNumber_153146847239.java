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

public class UserActivity_setSortNumber_153146847239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293661;
     Object term293670;

    public UserActivity_setSortNumber_153146847239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293661 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        setLongField(term293661, term293661.getClass(), "id", 0L);
        setField(term293661, term293661.getClass(), "user", null);
        setIntField(term293661, term293661.getClass(), "kind", 0);
        setIntField(term293661, term293661.getClass(), "activityId", 0);
        setIntField(term293661, term293661.getClass(), "sortNumber", 0);
        setIntField(term293661, term293661.getClass(), "param1", 0);
        setIntField(term293661, term293661.getClass(), "param2", 0);
        setIntField(term293661, term293661.getClass(), "param3", 0);
        setIntField(term293661, term293661.getClass(), "param4", 0);
        term293670 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term293670;
        callMethod(klass, "setSortNumber", argTypes, term293661, args);
    }

};


