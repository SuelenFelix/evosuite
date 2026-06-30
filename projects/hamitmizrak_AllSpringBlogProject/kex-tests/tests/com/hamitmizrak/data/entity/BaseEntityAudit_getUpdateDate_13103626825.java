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

public class BaseEntityAudit_getUpdateDate_13103626825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339;

    public BaseEntityAudit_getUpdateDate_13103626825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term340 = new Long(5270370404989704783L);
        term339 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term354 = newInstance(Class.forName("java.util.Date"));
        Object term368 = newInstance(Class.forName("java.util.Date"));
        setField(term339, term339.getClass(), "id", term340);
        setField(term339, term339.getClass(), "createdBy", "oVcInYnLWB");
        setLongField(term354, term354.getClass(), "fastTime", 1645834034896L);
        setField(term354, term354.getClass(), "cdate", null);
        setField(term339, term339.getClass(), "createdDate", term354);
        setField(term339, term339.getClass(), "updateBy", "aJlieCFVtF");
        setLongField(term368, term368.getClass(), "fastTime", 1500721068023L);
        setField(term368, term368.getClass(), "cdate", null);
        setField(term339, term339.getClass(), "updateDate", term368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateDate", argTypes, term339, args);
    }

};


