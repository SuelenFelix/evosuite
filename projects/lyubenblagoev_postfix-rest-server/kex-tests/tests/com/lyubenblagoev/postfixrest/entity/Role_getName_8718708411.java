package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Object;

public class Role_getName_8718708411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5809;

    public Role_getName_8718708411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5822 = new ArrayList();
        Long term5826 = new Long(5071015720043054072L);
        term5809 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        Object term5829 = newInstance(Class.forName("java.util.Date"));
        Object term5831 = newInstance(Class.forName("java.util.Date"));
        setField(term5809, term5809.getClass(), "name", "rdiIyXfRtL");
        setField(term5809, term5809.getClass(), "users", term5822);
        setField(term5809, term5809.getClass(), "id", term5826);
        setBooleanField(term5809, term5809.getClass(), "enabled", false);
        setLongField(term5829, term5829.getClass(), "fastTime", 1321208965398L);
        setField(term5829, term5829.getClass(), "cdate", null);
        setField(term5809, term5809.getClass(), "created", term5829);
        setLongField(term5831, term5831.getClass(), "fastTime", 1601332041140L);
        setField(term5831, term5831.getClass(), "cdate", null);
        setField(term5809, term5809.getClass(), "updated", term5831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term5809, args);
    }

};


