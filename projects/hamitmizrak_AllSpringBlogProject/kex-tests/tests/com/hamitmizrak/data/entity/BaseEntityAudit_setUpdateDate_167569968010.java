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

public class BaseEntityAudit_setUpdateDate_167569968010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term642;
     Object term673;

    public BaseEntityAudit_setUpdateDate_167569968010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term643 = new Long(-2813493605142626659L);
        term642 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term657 = newInstance(Class.forName("java.util.Date"));
        Object term671 = newInstance(Class.forName("java.util.Date"));
        setField(term642, term642.getClass(), "id", term643);
        setField(term642, term642.getClass(), "createdBy", "flxyYxBRtu");
        setLongField(term657, term657.getClass(), "fastTime", 1725122217647L);
        setField(term657, term657.getClass(), "cdate", null);
        setField(term642, term642.getClass(), "createdDate", term657);
        setField(term642, term642.getClass(), "updateBy", "OclPbYPkcH");
        setLongField(term671, term671.getClass(), "fastTime", 1550698994689L);
        setField(term671, term671.getClass(), "cdate", null);
        setField(term642, term642.getClass(), "updateDate", term671);
        term673 = newInstance(Class.forName("java.util.Date"));
        setLongField(term673, term673.getClass(), "fastTime", 1804998087131L);
        setField(term673, term673.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term673;
        callMethod(klass, "setUpdateDate", argTypes, term642, args);
    }

};


