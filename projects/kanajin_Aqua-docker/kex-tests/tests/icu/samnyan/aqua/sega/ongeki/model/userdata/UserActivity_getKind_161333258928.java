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

public class UserActivity_getKind_161333258928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293556;

    public UserActivity_getKind_161333258928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293556 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        setLongField(term293556, term293556.getClass(), "id", 0L);
        setField(term293556, term293556.getClass(), "user", null);
        setIntField(term293556, term293556.getClass(), "kind", 0);
        setIntField(term293556, term293556.getClass(), "activityId", 0);
        setIntField(term293556, term293556.getClass(), "sortNumber", 0);
        setIntField(term293556, term293556.getClass(), "param1", 0);
        setIntField(term293556, term293556.getClass(), "param2", 0);
        setIntField(term293556, term293556.getClass(), "param3", 0);
        setIntField(term293556, term293556.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKind", argTypes, term293556, args);
    }

};


