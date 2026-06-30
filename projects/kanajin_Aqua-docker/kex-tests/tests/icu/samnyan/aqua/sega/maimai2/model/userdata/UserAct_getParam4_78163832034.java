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

public class UserAct_getParam4_78163832034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14476;

    public UserAct_getParam4_78163832034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14476 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        setLongField(term14476, term14476.getClass(), "id", 0L);
        setField(term14476, term14476.getClass(), "user", null);
        setIntField(term14476, term14476.getClass(), "kind", 0);
        setIntField(term14476, term14476.getClass(), "activityId", 0);
        setLongField(term14476, term14476.getClass(), "sortNumber", 0L);
        setIntField(term14476, term14476.getClass(), "param1", 0);
        setIntField(term14476, term14476.getClass(), "param2", 0);
        setIntField(term14476, term14476.getClass(), "param3", 0);
        setIntField(term14476, term14476.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam4", argTypes, term14476, args);
    }

};


