package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

public class DomainResource_setName_16313640116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653;

    public DomainResource_setName_16313640116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5654 = new Long(138235087558060686L);
        Boolean term5660 = new Boolean(true);
        term5653 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource"));
        Object term5656 = newInstance(Class.forName("java.util.Date"));
        Object term5658 = newInstance(Class.forName("java.util.Date"));
        setField(term5653, term5653.getClass(), "id", term5654);
        setLongField(term5656, term5656.getClass(), "fastTime", 1743136792108L);
        setField(term5656, term5656.getClass(), "cdate", null);
        setField(term5653, term5653.getClass(), "created", term5656);
        setLongField(term5658, term5658.getClass(), "fastTime", 1728457746580L);
        setField(term5658, term5658.getClass(), "cdate", null);
        setField(term5653, term5653.getClass(), "updated", term5658);
        setField(term5653, term5653.getClass(), "enabled", term5660);
        setField(term5653, term5653.getClass(), "name", "GrqozDKFOk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CFyoseFGLF";
        callMethod(klass, "setName", argTypes, term5653, args);
    }

};


