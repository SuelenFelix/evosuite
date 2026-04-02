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
import java.lang.Boolean;

public class BaseEntity_setEnabled_17026642666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4583;
     Object term4591;

    public BaseEntity_setEnabled_17026642666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4584 = new Long(-8033044954947064558L);
        term4583 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity"));
        Object term4587 = newInstance(Class.forName("java.util.Date"));
        Object term4589 = newInstance(Class.forName("java.util.Date"));
        setField(term4583, term4583.getClass(), "id", term4584);
        setBooleanField(term4583, term4583.getClass(), "enabled", false);
        setLongField(term4587, term4587.getClass(), "fastTime", 1543876873692L);
        setField(term4587, term4587.getClass(), "cdate", null);
        setField(term4583, term4583.getClass(), "created", term4587);
        setLongField(term4589, term4589.getClass(), "fastTime", 1318825298954L);
        setField(term4589, term4589.getClass(), "cdate", null);
        setField(term4583, term4583.getClass(), "updated", term4589);
        term4591 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4591;
        callMethod(klass, "setEnabled", argTypes, term4583, args);
    }

};


