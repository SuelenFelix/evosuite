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

public class DomainResource_setUpdated_205297066410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5801;
     Object term5822;

    public DomainResource_setUpdated_205297066410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5802 = new Long(1457594663983990440L);
        Boolean term5808 = new Boolean(true);
        term5801 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource"));
        Object term5804 = newInstance(Class.forName("java.util.Date"));
        Object term5806 = newInstance(Class.forName("java.util.Date"));
        setField(term5801, term5801.getClass(), "id", term5802);
        setLongField(term5804, term5804.getClass(), "fastTime", 1386180897453L);
        setField(term5804, term5804.getClass(), "cdate", null);
        setField(term5801, term5801.getClass(), "created", term5804);
        setLongField(term5806, term5806.getClass(), "fastTime", 1546769987439L);
        setField(term5806, term5806.getClass(), "cdate", null);
        setField(term5801, term5801.getClass(), "updated", term5806);
        setField(term5801, term5801.getClass(), "enabled", term5808);
        setField(term5801, term5801.getClass(), "name", "WXMWFDGcLB");
        term5822 = newInstance(Class.forName("java.util.Date"));
        setLongField(term5822, term5822.getClass(), "fastTime", 1851896886282L);
        setField(term5822, term5822.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term5822;
        callMethod(klass, "setUpdated", argTypes, term5801, args);
    }

};


