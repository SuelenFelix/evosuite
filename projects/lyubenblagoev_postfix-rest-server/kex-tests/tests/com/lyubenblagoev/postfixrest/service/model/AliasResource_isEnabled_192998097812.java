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

public class AliasResource_isEnabled_192998097812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1361;

    public AliasResource_isEnabled_192998097812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1362 = new Long(1233889271256172047L);
        term1361 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource"));
        Object term1388 = newInstance(Class.forName("java.util.Date"));
        Object term1390 = newInstance(Class.forName("java.util.Date"));
        setField(term1361, term1361.getClass(), "id", term1362);
        setField(term1361, term1361.getClass(), "name", "JDswTTCZHV");
        setField(term1361, term1361.getClass(), "email", "onpbIeEKoi");
        setLongField(term1388, term1388.getClass(), "fastTime", 1630952644759L);
        setField(term1388, term1388.getClass(), "cdate", null);
        setField(term1361, term1361.getClass(), "created", term1388);
        setLongField(term1390, term1390.getClass(), "fastTime", 1739417792956L);
        setField(term1390, term1390.getClass(), "cdate", null);
        setField(term1361, term1361.getClass(), "updated", term1390);
        setBooleanField(term1361, term1361.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnabled", argTypes, term1361, args);
    }

};


