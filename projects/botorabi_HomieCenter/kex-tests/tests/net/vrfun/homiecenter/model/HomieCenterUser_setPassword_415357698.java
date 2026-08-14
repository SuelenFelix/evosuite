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

public class HomieCenterUser_setPassword_415357698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6919;

    public HomieCenterUser_setPassword_415357698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6920 = new Long(8059786003080744426L);
        term6919 = newInstance(Class.forName("net.vrfun.homiecenter.model.HomieCenterUser"));
        setField(term6919, term6919.getClass(), "id", term6920);
        setField(term6919, term6919.getClass(), "realName", "SIODFGaQhr");
        setField(term6919, term6919.getClass(), "userName", "qYzsiuXOgS");
        setField(term6919, term6919.getClass(), "password", "bxrCBbrrct");
        setBooleanField(term6919, term6919.getClass(), "admin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HomieCenterUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CKWpJaaaxX";
        callMethod(klass, "setPassword", argTypes, term6919, args);
    }

};


