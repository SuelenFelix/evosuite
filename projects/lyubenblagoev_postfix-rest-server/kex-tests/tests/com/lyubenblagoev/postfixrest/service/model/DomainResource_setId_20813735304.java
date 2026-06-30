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

public class DomainResource_setId_20813735304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5589;
     Object term5610;

    public DomainResource_setId_20813735304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5590 = new Long(-6301101997917060727L);
        Boolean term5596 = new Boolean(false);
        term5589 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource"));
        Object term5592 = newInstance(Class.forName("java.util.Date"));
        Object term5594 = newInstance(Class.forName("java.util.Date"));
        setField(term5589, term5589.getClass(), "id", term5590);
        setLongField(term5592, term5592.getClass(), "fastTime", 1655668811013L);
        setField(term5592, term5592.getClass(), "cdate", null);
        setField(term5589, term5589.getClass(), "created", term5592);
        setLongField(term5594, term5594.getClass(), "fastTime", 1319355084958L);
        setField(term5594, term5594.getClass(), "cdate", null);
        setField(term5589, term5589.getClass(), "updated", term5594);
        setField(term5589, term5589.getClass(), "enabled", term5596);
        setField(term5589, term5589.getClass(), "name", "PCipZnmBOF");
        term5610 = new Long(8166095254618543564L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5610;
        callMethod(klass, "setId", argTypes, term5589, args);
    }

};


