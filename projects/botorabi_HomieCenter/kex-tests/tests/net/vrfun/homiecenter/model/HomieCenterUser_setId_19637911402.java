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

public class HomieCenterUser_setId_19637911402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6453;
     Object term6493;

    public HomieCenterUser_setId_19637911402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6454 = new Long(-872011222785455006L);
        term6453 = newInstance(Class.forName("net.vrfun.homiecenter.model.HomieCenterUser"));
        setField(term6453, term6453.getClass(), "id", term6454);
        setField(term6453, term6453.getClass(), "realName", "EwQBhZjCIT");
        setField(term6453, term6453.getClass(), "userName", "aSkmSwTnEw");
        setField(term6453, term6453.getClass(), "password", "xvkbvaEGYd");
        setBooleanField(term6453, term6453.getClass(), "admin", true);
        term6493 = new Long(-316468845751588286L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HomieCenterUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term6493;
        callMethod(klass, "setId", argTypes, term6453, args);
    }

};


