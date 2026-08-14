package net.vrfun.homiecenter.model;

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
import static net.vrfun.homiecenter.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class HomieCenterUser_setAdmin_17615161221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7171;
     Object term7173;

    public HomieCenterUser_setAdmin_17615161221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7171 = newInstance(Class.forName("net.vrfun.homiecenter.model.HomieCenterUser"));
        setField(term7171, term7171.getClass(), "id", null);
        setField(term7171, term7171.getClass(), "realName", null);
        setField(term7171, term7171.getClass(), "userName", null);
        setField(term7171, term7171.getClass(), "password", null);
        setBooleanField(term7171, term7171.getClass(), "admin", false);
        term7173 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HomieCenterUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7173;
        callMethod(klass, "setAdmin", argTypes, term7171, args);
    }

};


