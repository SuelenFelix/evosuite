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

public class DomainResource_getCreated_14525493857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5706;

    public DomainResource_getCreated_14525493857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5707 = new Long(5381386339318883012L);
        Boolean term5713 = new Boolean(true);
        term5706 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource"));
        Object term5709 = newInstance(Class.forName("java.util.Date"));
        Object term5711 = newInstance(Class.forName("java.util.Date"));
        setField(term5706, term5706.getClass(), "id", term5707);
        setLongField(term5709, term5709.getClass(), "fastTime", 1709178890088L);
        setField(term5709, term5709.getClass(), "cdate", null);
        setField(term5706, term5706.getClass(), "created", term5709);
        setLongField(term5711, term5711.getClass(), "fastTime", 1644776129220L);
        setField(term5711, term5711.getClass(), "cdate", null);
        setField(term5706, term5706.getClass(), "updated", term5711);
        setField(term5706, term5706.getClass(), "enabled", term5713);
        setField(term5706, term5706.getClass(), "name", "SFqCrhEWLm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreated", argTypes, term5706, args);
    }

};


