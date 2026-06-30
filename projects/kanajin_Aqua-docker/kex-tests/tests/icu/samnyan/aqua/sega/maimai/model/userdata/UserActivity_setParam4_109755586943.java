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

public class UserActivity_setParam4_109755586943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50710;
     Object term50719;

    public UserActivity_setParam4_109755586943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50710 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        setLongField(term50710, term50710.getClass(), "id", 0L);
        setField(term50710, term50710.getClass(), "user", null);
        setIntField(term50710, term50710.getClass(), "kind", 0);
        setIntField(term50710, term50710.getClass(), "activityId", 0);
        setLongField(term50710, term50710.getClass(), "sortNumber", 0L);
        setIntField(term50710, term50710.getClass(), "param1", 0);
        setIntField(term50710, term50710.getClass(), "param2", 0);
        setIntField(term50710, term50710.getClass(), "param3", 0);
        setIntField(term50710, term50710.getClass(), "param4", 0);
        term50719 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term50719;
        callMethod(klass, "setParam4", argTypes, term50710, args);
    }

};


