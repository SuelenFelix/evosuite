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
import java.lang.Object;
import java.lang.Long;

public class DomainResource_fromDomain_12389117871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5495;

    public DomainResource_fromDomain_12389117871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5510 = new Long(-2924531382671518368L);
        term5495 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term5508 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term5513 = newInstance(Class.forName("java.util.Date"));
        Object term5515 = newInstance(Class.forName("java.util.Date"));
        setField(term5495, term5495.getClass(), "name", "izPpKDErnQ");
        setIntField(term5508, term5508.getClass(), "modCount", 0);
        setField(term5495, term5495.getClass(), "accounts", term5508);
        setField(term5495, term5495.getClass(), "aliases", term5508);
        setField(term5495, term5495.getClass(), "id", term5510);
        setBooleanField(term5495, term5495.getClass(), "enabled", false);
        setLongField(term5513, term5513.getClass(), "fastTime", 1342877876146L);
        setField(term5513, term5513.getClass(), "cdate", null);
        setField(term5495, term5495.getClass(), "created", term5513);
        setLongField(term5515, term5515.getClass(), "fastTime", 1511283614327L);
        setField(term5515, term5515.getClass(), "cdate", null);
        setField(term5495, term5495.getClass(), "updated", term5515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Object[] args = new Object[1];
        args[0] = term5495;
        callMethod(klass, "fromDomain", argTypes, null, args);
    }

};


