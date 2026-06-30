package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserAct_setActivityId_13844603738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14516;
     Object term14525;

    public UserAct_setActivityId_13844603738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14516 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        setLongField(term14516, term14516.getClass(), "id", 0L);
        setField(term14516, term14516.getClass(), "user", null);
        setIntField(term14516, term14516.getClass(), "kind", 0);
        setIntField(term14516, term14516.getClass(), "activityId", 0);
        setLongField(term14516, term14516.getClass(), "sortNumber", 0L);
        setIntField(term14516, term14516.getClass(), "param1", 0);
        setIntField(term14516, term14516.getClass(), "param2", 0);
        setIntField(term14516, term14516.getClass(), "param3", 0);
        setIntField(term14516, term14516.getClass(), "param4", 0);
        term14525 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14525;
        callMethod(klass, "setActivityId", argTypes, term14516, args);
    }

};


