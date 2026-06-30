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

public class UserAct_setParam3_86659185542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14560;
     Object term14569;

    public UserAct_setParam3_86659185542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14560 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        setLongField(term14560, term14560.getClass(), "id", 0L);
        setField(term14560, term14560.getClass(), "user", null);
        setIntField(term14560, term14560.getClass(), "kind", 0);
        setIntField(term14560, term14560.getClass(), "activityId", 0);
        setLongField(term14560, term14560.getClass(), "sortNumber", 0L);
        setIntField(term14560, term14560.getClass(), "param1", 0);
        setIntField(term14560, term14560.getClass(), "param2", 0);
        setIntField(term14560, term14560.getClass(), "param3", 0);
        setIntField(term14560, term14560.getClass(), "param4", 0);
        term14569 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14569;
        callMethod(klass, "setParam3", argTypes, term14560, args);
    }

};


