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

public class BccResource_getId_8096542983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1725;

    public BccResource_getId_8096542983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1726 = new Long(4784595517102746672L);
        Long term1728 = new Long(-7612550318181586304L);
        term1725 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        Object term1743 = newInstance(Class.forName("java.util.Date"));
        Object term1745 = newInstance(Class.forName("java.util.Date"));
        setField(term1725, term1725.getClass(), "id", term1726);
        setField(term1725, term1725.getClass(), "accountId", term1728);
        setField(term1725, term1725.getClass(), "email", "uWHnvSvaPl");
        setBooleanField(term1725, term1725.getClass(), "enabled", true);
        setLongField(term1743, term1743.getClass(), "fastTime", 1678177615298L);
        setField(term1743, term1743.getClass(), "cdate", null);
        setField(term1725, term1725.getClass(), "created", term1743);
        setLongField(term1745, term1745.getClass(), "fastTime", 1666076287186L);
        setField(term1745, term1745.getClass(), "cdate", null);
        setField(term1725, term1725.getClass(), "updated", term1745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1725, args);
    }

};


