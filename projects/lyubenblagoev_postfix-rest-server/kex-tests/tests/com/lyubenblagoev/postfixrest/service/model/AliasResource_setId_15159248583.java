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

public class AliasResource_setId_15159248583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843;
     Object term875;

    public AliasResource_setId_15159248583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term844 = new Long(7009926388951271268L);
        term843 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource"));
        Object term870 = newInstance(Class.forName("java.util.Date"));
        Object term872 = newInstance(Class.forName("java.util.Date"));
        setField(term843, term843.getClass(), "id", term844);
        setField(term843, term843.getClass(), "name", "SbAoxhfrkn");
        setField(term843, term843.getClass(), "email", "kuTXqwMtDB");
        setLongField(term870, term870.getClass(), "fastTime", 1429023851389L);
        setField(term870, term870.getClass(), "cdate", null);
        setField(term843, term843.getClass(), "created", term870);
        setLongField(term872, term872.getClass(), "fastTime", 1495357463288L);
        setField(term872, term872.getClass(), "cdate", null);
        setField(term843, term843.getClass(), "updated", term872);
        setBooleanField(term843, term843.getClass(), "enabled", false);
        term875 = new Long(-7672528020740371001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term875;
        callMethod(klass, "setId", argTypes, term843, args);
    }

};


