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

public class DomainResource_setCreated_4945956538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5737;
     Object term5758;

    public DomainResource_setCreated_4945956538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5738 = new Long(-1333707622307134180L);
        Boolean term5744 = new Boolean(true);
        term5737 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource"));
        Object term5740 = newInstance(Class.forName("java.util.Date"));
        Object term5742 = newInstance(Class.forName("java.util.Date"));
        setField(term5737, term5737.getClass(), "id", term5738);
        setLongField(term5740, term5740.getClass(), "fastTime", 1456374715658L);
        setField(term5740, term5740.getClass(), "cdate", null);
        setField(term5737, term5737.getClass(), "created", term5740);
        setLongField(term5742, term5742.getClass(), "fastTime", 1340909568660L);
        setField(term5742, term5742.getClass(), "cdate", null);
        setField(term5737, term5737.getClass(), "updated", term5742);
        setField(term5737, term5737.getClass(), "enabled", term5744);
        setField(term5737, term5737.getClass(), "name", "GZdcJyZntS");
        term5758 = newInstance(Class.forName("java.util.Date"));
        setLongField(term5758, term5758.getClass(), "fastTime", 1862657813973L);
        setField(term5758, term5758.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term5758;
        callMethod(klass, "setCreated", argTypes, term5737, args);
    }

};


