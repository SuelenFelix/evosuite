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

public class AliasResource_setEnabled_156538654813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1413;
     Object term1445;

    public AliasResource_setEnabled_156538654813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1414 = new Long(6617340557564669657L);
        term1413 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource"));
        Object term1440 = newInstance(Class.forName("java.util.Date"));
        Object term1442 = newInstance(Class.forName("java.util.Date"));
        setField(term1413, term1413.getClass(), "id", term1414);
        setField(term1413, term1413.getClass(), "name", "YRHGsAkhxb");
        setField(term1413, term1413.getClass(), "email", "ffYhPOzlUs");
        setLongField(term1440, term1440.getClass(), "fastTime", 1329640267573L);
        setField(term1440, term1440.getClass(), "cdate", null);
        setField(term1413, term1413.getClass(), "created", term1440);
        setLongField(term1442, term1442.getClass(), "fastTime", 1334853104718L);
        setField(term1442, term1442.getClass(), "cdate", null);
        setField(term1413, term1413.getClass(), "updated", term1442);
        setBooleanField(term1413, term1413.getClass(), "enabled", true);
        term1445 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1445;
        callMethod(klass, "setEnabled", argTypes, term1413, args);
    }

};


