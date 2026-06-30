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

public class UserAct_canEqual_171947936645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14591;

    public UserAct_canEqual_171947936645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14591 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        setLongField(term14591, term14591.getClass(), "id", 0L);
        setField(term14591, term14591.getClass(), "user", null);
        setIntField(term14591, term14591.getClass(), "kind", 0);
        setIntField(term14591, term14591.getClass(), "activityId", 0);
        setLongField(term14591, term14591.getClass(), "sortNumber", 0L);
        setIntField(term14591, term14591.getClass(), "param1", 0);
        setIntField(term14591, term14591.getClass(), "param2", 0);
        setIntField(term14591, term14591.getClass(), "param3", 0);
        setIntField(term14591, term14591.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term14591, args);
    }

};


