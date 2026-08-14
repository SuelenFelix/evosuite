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
import java.lang.Long;
import java.lang.Boolean;

public class HomieCenterUser_setAdmin_17615161210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7081;
     Object term7121;

    public HomieCenterUser_setAdmin_17615161210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7082 = new Long(2486810210675247493L);
        term7081 = newInstance(Class.forName("net.vrfun.homiecenter.model.HomieCenterUser"));
        setField(term7081, term7081.getClass(), "id", term7082);
        setField(term7081, term7081.getClass(), "realName", "lCyLIcSuom");
        setField(term7081, term7081.getClass(), "userName", "CGOpQSZZwI");
        setField(term7081, term7081.getClass(), "password", "ypEdrstygY");
        setBooleanField(term7081, term7081.getClass(), "admin", true);
        term7121 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HomieCenterUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7121;
        callMethod(klass, "setAdmin", argTypes, term7081, args);
    }

};


