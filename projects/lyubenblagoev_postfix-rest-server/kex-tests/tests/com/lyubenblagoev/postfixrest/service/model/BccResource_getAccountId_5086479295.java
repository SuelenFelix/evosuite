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

public class BccResource_getAccountId_5086479295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1791;

    public BccResource_getAccountId_5086479295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1792 = new Long(-3842548265506930260L);
        Long term1794 = new Long(-5788180182343976541L);
        term1791 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        Object term1809 = newInstance(Class.forName("java.util.Date"));
        Object term1811 = newInstance(Class.forName("java.util.Date"));
        setField(term1791, term1791.getClass(), "id", term1792);
        setField(term1791, term1791.getClass(), "accountId", term1794);
        setField(term1791, term1791.getClass(), "email", "TJmVBGfTML");
        setBooleanField(term1791, term1791.getClass(), "enabled", true);
        setLongField(term1809, term1809.getClass(), "fastTime", 1819191638549L);
        setField(term1809, term1809.getClass(), "cdate", null);
        setField(term1791, term1791.getClass(), "created", term1809);
        setLongField(term1811, term1811.getClass(), "fastTime", 1400691778698L);
        setField(term1811, term1811.getClass(), "cdate", null);
        setField(term1791, term1791.getClass(), "updated", term1811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccountId", argTypes, term1791, args);
    }

};


