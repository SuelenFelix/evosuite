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

public class DomainResource_getName_9437267175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5622;

    public DomainResource_getName_9437267175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5623 = new Long(-4598158870068953328L);
        Boolean term5629 = new Boolean(false);
        term5622 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource"));
        Object term5625 = newInstance(Class.forName("java.util.Date"));
        Object term5627 = newInstance(Class.forName("java.util.Date"));
        setField(term5622, term5622.getClass(), "id", term5623);
        setLongField(term5625, term5625.getClass(), "fastTime", 1676471642491L);
        setField(term5625, term5625.getClass(), "cdate", null);
        setField(term5622, term5622.getClass(), "created", term5625);
        setLongField(term5627, term5627.getClass(), "fastTime", 1724960506464L);
        setField(term5627, term5627.getClass(), "cdate", null);
        setField(term5622, term5622.getClass(), "updated", term5627);
        setField(term5622, term5622.getClass(), "enabled", term5629);
        setField(term5622, term5622.getClass(), "name", "zcorEihhLK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term5622, args);
    }

};


