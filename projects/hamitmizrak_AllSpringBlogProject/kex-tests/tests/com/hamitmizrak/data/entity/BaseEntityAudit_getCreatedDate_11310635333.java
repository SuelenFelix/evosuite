package com.hamitmizrak.data.entity;

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
import static com.hamitmizrak.data.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class BaseEntityAudit_getCreatedDate_11310635333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;

    public BaseEntityAudit_getCreatedDate_11310635333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238 = new Long(-8257434502486459194L);
        term237 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term252 = newInstance(Class.forName("java.util.Date"));
        Object term266 = newInstance(Class.forName("java.util.Date"));
        setField(term237, term237.getClass(), "id", term238);
        setField(term237, term237.getClass(), "createdBy", "NRdvgJlhkX");
        setLongField(term252, term252.getClass(), "fastTime", 1442639565302L);
        setField(term252, term252.getClass(), "cdate", null);
        setField(term237, term237.getClass(), "createdDate", term252);
        setField(term237, term237.getClass(), "updateBy", "uuaPigETmJ");
        setLongField(term266, term266.getClass(), "fastTime", 1515890130018L);
        setField(term266, term266.getClass(), "cdate", null);
        setField(term237, term237.getClass(), "updateDate", term266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term237, args);
    }

};


