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

public class AliasResource_setUpdated_167654796011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1307;
     Object term1339;

    public AliasResource_setUpdated_167654796011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1308 = new Long(-484994522244390100L);
        term1307 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource"));
        Object term1334 = newInstance(Class.forName("java.util.Date"));
        Object term1336 = newInstance(Class.forName("java.util.Date"));
        setField(term1307, term1307.getClass(), "id", term1308);
        setField(term1307, term1307.getClass(), "name", "UiUYnPrcCi");
        setField(term1307, term1307.getClass(), "email", "UoYtihxVaS");
        setLongField(term1334, term1334.getClass(), "fastTime", 1744090065937L);
        setField(term1334, term1334.getClass(), "cdate", null);
        setField(term1307, term1307.getClass(), "created", term1334);
        setLongField(term1336, term1336.getClass(), "fastTime", 1347400561385L);
        setField(term1336, term1336.getClass(), "cdate", null);
        setField(term1307, term1307.getClass(), "updated", term1336);
        setBooleanField(term1307, term1307.getClass(), "enabled", true);
        term1339 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1339, term1339.getClass(), "fastTime", 1502158153899L);
        setField(term1339, term1339.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term1339;
        callMethod(klass, "setUpdated", argTypes, term1307, args);
    }

};


