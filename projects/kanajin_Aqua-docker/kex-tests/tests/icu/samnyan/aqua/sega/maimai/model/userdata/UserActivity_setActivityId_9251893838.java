package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserActivity_setActivityId_9251893838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50655;
     Object term50664;

    public UserActivity_setActivityId_9251893838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50655 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        setLongField(term50655, term50655.getClass(), "id", 0L);
        setField(term50655, term50655.getClass(), "user", null);
        setIntField(term50655, term50655.getClass(), "kind", 0);
        setIntField(term50655, term50655.getClass(), "activityId", 0);
        setLongField(term50655, term50655.getClass(), "sortNumber", 0L);
        setIntField(term50655, term50655.getClass(), "param1", 0);
        setIntField(term50655, term50655.getClass(), "param2", 0);
        setIntField(term50655, term50655.getClass(), "param3", 0);
        setIntField(term50655, term50655.getClass(), "param4", 0);
        term50664 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term50664;
        callMethod(klass, "setActivityId", argTypes, term50655, args);
    }

};


