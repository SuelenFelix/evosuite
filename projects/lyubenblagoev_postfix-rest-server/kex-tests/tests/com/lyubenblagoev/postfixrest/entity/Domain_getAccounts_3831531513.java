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
import java.lang.Object;
import java.lang.Long;

public class Domain_getAccounts_3831531513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6406;

    public Domain_getAccounts_3831531513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6421 = new Long(7594342965038171122L);
        term6406 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term6419 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term6424 = newInstance(Class.forName("java.util.Date"));
        Object term6426 = newInstance(Class.forName("java.util.Date"));
        setField(term6406, term6406.getClass(), "name", "LvLbdICdfA");
        setIntField(term6419, term6419.getClass(), "modCount", 0);
        setField(term6406, term6406.getClass(), "accounts", term6419);
        setField(term6406, term6406.getClass(), "aliases", term6419);
        setField(term6406, term6406.getClass(), "id", term6421);
        setBooleanField(term6406, term6406.getClass(), "enabled", true);
        setLongField(term6424, term6424.getClass(), "fastTime", 1599920232074L);
        setField(term6424, term6424.getClass(), "cdate", null);
        setField(term6406, term6406.getClass(), "created", term6424);
        setLongField(term6426, term6426.getClass(), "fastTime", 1789685181508L);
        setField(term6426, term6426.getClass(), "cdate", null);
        setField(term6406, term6406.getClass(), "updated", term6426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccounts", argTypes, term6406, args);
    }

};


