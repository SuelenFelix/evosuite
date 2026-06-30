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

public class DomainResource_getId_17835520083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5558;

    public DomainResource_getId_17835520083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5559 = new Long(-6587807377747738663L);
        Boolean term5565 = new Boolean(false);
        term5558 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource"));
        Object term5561 = newInstance(Class.forName("java.util.Date"));
        Object term5563 = newInstance(Class.forName("java.util.Date"));
        setField(term5558, term5558.getClass(), "id", term5559);
        setLongField(term5561, term5561.getClass(), "fastTime", 1316972437233L);
        setField(term5561, term5561.getClass(), "cdate", null);
        setField(term5558, term5558.getClass(), "created", term5561);
        setLongField(term5563, term5563.getClass(), "fastTime", 1870028835492L);
        setField(term5563, term5563.getClass(), "cdate", null);
        setField(term5558, term5558.getClass(), "updated", term5563);
        setField(term5558, term5558.getClass(), "enabled", term5565);
        setField(term5558, term5558.getClass(), "name", "tlQSNgTkQX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term5558, args);
    }

};


