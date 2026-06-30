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

public class DomainResource_getUpdated_2948515949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5770;

    public DomainResource_getUpdated_2948515949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5771 = new Long(-4360569253593381888L);
        Boolean term5777 = new Boolean(true);
        term5770 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource"));
        Object term5773 = newInstance(Class.forName("java.util.Date"));
        Object term5775 = newInstance(Class.forName("java.util.Date"));
        setField(term5770, term5770.getClass(), "id", term5771);
        setLongField(term5773, term5773.getClass(), "fastTime", 1299431078379L);
        setField(term5773, term5773.getClass(), "cdate", null);
        setField(term5770, term5770.getClass(), "created", term5773);
        setLongField(term5775, term5775.getClass(), "fastTime", 1476970157231L);
        setField(term5775, term5775.getClass(), "cdate", null);
        setField(term5770, term5770.getClass(), "updated", term5775);
        setField(term5770, term5770.getClass(), "enabled", term5777);
        setField(term5770, term5770.getClass(), "name", "OIHoJeysUi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdated", argTypes, term5770, args);
    }

};


