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

public class BaseEntityAudit_setUpdateBy_12323412989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569;

    public BaseEntityAudit_setUpdateBy_12323412989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term570 = new Long(6967924379644551255L);
        term569 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term584 = newInstance(Class.forName("java.util.Date"));
        Object term598 = newInstance(Class.forName("java.util.Date"));
        setField(term569, term569.getClass(), "id", term570);
        setField(term569, term569.getClass(), "createdBy", "eZFUvlxvGV");
        setLongField(term584, term584.getClass(), "fastTime", 1437757323580L);
        setField(term584, term584.getClass(), "cdate", null);
        setField(term569, term569.getClass(), "createdDate", term584);
        setField(term569, term569.getClass(), "updateBy", "BYqFIqCKAV");
        setLongField(term598, term598.getClass(), "fastTime", 1668569229825L);
        setField(term598, term598.getClass(), "cdate", null);
        setField(term569, term569.getClass(), "updateDate", term598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        callMethod(klass, "setUpdateBy", argTypes, term569, args);
    }

};


