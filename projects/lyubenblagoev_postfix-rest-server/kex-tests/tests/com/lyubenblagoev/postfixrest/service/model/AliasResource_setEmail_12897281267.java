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

public class AliasResource_setEmail_12897281267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1075;

    public AliasResource_setEmail_12897281267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1076 = new Long(6855071767938501807L);
        term1075 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource"));
        Object term1102 = newInstance(Class.forName("java.util.Date"));
        Object term1104 = newInstance(Class.forName("java.util.Date"));
        setField(term1075, term1075.getClass(), "id", term1076);
        setField(term1075, term1075.getClass(), "name", "gGSMzuGICf");
        setField(term1075, term1075.getClass(), "email", "hxCBltsObl");
        setLongField(term1102, term1102.getClass(), "fastTime", 1706078172457L);
        setField(term1102, term1102.getClass(), "cdate", null);
        setField(term1075, term1075.getClass(), "created", term1102);
        setLongField(term1104, term1104.getClass(), "fastTime", 1863631094992L);
        setField(term1104, term1104.getClass(), "cdate", null);
        setField(term1075, term1075.getClass(), "updated", term1104);
        setBooleanField(term1075, term1075.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BndsHwAFMv";
        callMethod(klass, "setEmail", argTypes, term1075, args);
    }

};


