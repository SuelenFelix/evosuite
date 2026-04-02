package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class BaseEntity_onPrePersist_15293790331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4541;

    public BaseEntity_onPrePersist_15293790331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4542 = new Long(-5367775625638780650L);
        term4541 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity"));
        Object term4545 = newInstance(Class.forName("java.util.Date"));
        Object term4547 = newInstance(Class.forName("java.util.Date"));
        setField(term4541, term4541.getClass(), "id", term4542);
        setBooleanField(term4541, term4541.getClass(), "enabled", true);
        setLongField(term4545, term4545.getClass(), "fastTime", 1619029071558L);
        setField(term4545, term4545.getClass(), "cdate", null);
        setField(term4541, term4541.getClass(), "created", term4545);
        setLongField(term4547, term4547.getClass(), "fastTime", 1520096264802L);
        setField(term4547, term4547.getClass(), "cdate", null);
        setField(term4541, term4541.getClass(), "updated", term4547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "onPrePersist", argTypes, term4541, args);
    }

};


