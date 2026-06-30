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

public class DomainResource_setEnabled_121378932012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5865;
     Object term5886;

    public DomainResource_setEnabled_121378932012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5866 = new Long(-8603648071751666348L);
        Boolean term5872 = new Boolean(false);
        term5865 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource"));
        Object term5868 = newInstance(Class.forName("java.util.Date"));
        Object term5870 = newInstance(Class.forName("java.util.Date"));
        setField(term5865, term5865.getClass(), "id", term5866);
        setLongField(term5868, term5868.getClass(), "fastTime", 1816279347222L);
        setField(term5868, term5868.getClass(), "cdate", null);
        setField(term5865, term5865.getClass(), "created", term5868);
        setLongField(term5870, term5870.getClass(), "fastTime", 1267380225974L);
        setField(term5870, term5870.getClass(), "cdate", null);
        setField(term5865, term5865.getClass(), "updated", term5870);
        setField(term5865, term5865.getClass(), "enabled", term5872);
        setField(term5865, term5865.getClass(), "name", "NzBMMhkhpT");
        term5886 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term5886;
        callMethod(klass, "setEnabled", argTypes, term5865, args);
    }

};


