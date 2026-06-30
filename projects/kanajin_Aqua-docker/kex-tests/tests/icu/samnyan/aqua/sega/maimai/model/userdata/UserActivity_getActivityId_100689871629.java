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

public class UserActivity_getActivityId_100689871629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50570;

    public UserActivity_getActivityId_100689871629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50570 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        setLongField(term50570, term50570.getClass(), "id", 0L);
        setField(term50570, term50570.getClass(), "user", null);
        setIntField(term50570, term50570.getClass(), "kind", 0);
        setIntField(term50570, term50570.getClass(), "activityId", 0);
        setLongField(term50570, term50570.getClass(), "sortNumber", 0L);
        setIntField(term50570, term50570.getClass(), "param1", 0);
        setIntField(term50570, term50570.getClass(), "param2", 0);
        setIntField(term50570, term50570.getClass(), "param3", 0);
        setIntField(term50570, term50570.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActivityId", argTypes, term50570, args);
    }

};


