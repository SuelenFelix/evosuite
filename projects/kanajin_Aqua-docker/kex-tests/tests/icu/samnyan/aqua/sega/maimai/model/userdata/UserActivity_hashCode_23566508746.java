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

public class UserActivity_hashCode_23566508746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50739;

    public UserActivity_hashCode_23566508746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50739 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        setLongField(term50739, term50739.getClass(), "id", 0L);
        setField(term50739, term50739.getClass(), "user", null);
        setIntField(term50739, term50739.getClass(), "kind", 0);
        setIntField(term50739, term50739.getClass(), "activityId", 0);
        setLongField(term50739, term50739.getClass(), "sortNumber", 0L);
        setIntField(term50739, term50739.getClass(), "param1", 0);
        setIntField(term50739, term50739.getClass(), "param2", 0);
        setIntField(term50739, term50739.getClass(), "param3", 0);
        setIntField(term50739, term50739.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term50739, args);
    }

};


