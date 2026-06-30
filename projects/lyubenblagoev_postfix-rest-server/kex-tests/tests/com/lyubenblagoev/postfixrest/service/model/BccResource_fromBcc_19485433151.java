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
import java.lang.Object;
import java.lang.Long;

public class BccResource_fromBcc_19485433151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1495;

    public BccResource_fromBcc_19485433151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1512 = new Long(1439298019805881866L);
        Long term1543 = new Long(-8708192233349544946L);
        Long term1562 = new Long(5907001541142728739L);
        term1495 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Bcc"));
        Object term1496 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term1497 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term1510 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term1515 = newInstance(Class.forName("java.util.Date"));
        Object term1517 = newInstance(Class.forName("java.util.Date"));
        Object term1546 = newInstance(Class.forName("java.util.Date"));
        Object term1548 = newInstance(Class.forName("java.util.Date"));
        Object term1565 = newInstance(Class.forName("java.util.Date"));
        Object term1567 = newInstance(Class.forName("java.util.Date"));
        setField(term1497, term1497.getClass(), "name", "MLqYREekMl");
        setIntField(term1510, term1510.getClass(), "modCount", 0);
        setField(term1497, term1497.getClass(), "accounts", term1510);
        setField(term1497, term1497.getClass(), "aliases", term1510);
        setField(term1497, term1497.getClass(), "id", term1512);
        setBooleanField(term1497, term1497.getClass(), "enabled", false);
        setLongField(term1515, term1515.getClass(), "fastTime", 1496859828764L);
        setField(term1515, term1515.getClass(), "cdate", null);
        setField(term1497, term1497.getClass(), "created", term1515);
        setLongField(term1517, term1517.getClass(), "fastTime", 1691868468367L);
        setField(term1517, term1517.getClass(), "cdate", null);
        setField(term1497, term1497.getClass(), "updated", term1517);
        setField(term1496, term1496.getClass(), "domain", term1497);
        setField(term1496, term1496.getClass(), "username", "ytSBIKXogI");
        setField(term1496, term1496.getClass(), "password", "nHXjMycHlU");
        setField(term1496, term1496.getClass(), "id", term1543);
        setBooleanField(term1496, term1496.getClass(), "enabled", true);
        setLongField(term1546, term1546.getClass(), "fastTime", 1442370534632L);
        setField(term1546, term1546.getClass(), "cdate", null);
        setField(term1496, term1496.getClass(), "created", term1546);
        setLongField(term1548, term1548.getClass(), "fastTime", 1659994192918L);
        setField(term1548, term1548.getClass(), "cdate", null);
        setField(term1496, term1496.getClass(), "updated", term1548);
        setField(term1495, term1495.getClass(), "account", term1496);
        setField(term1495, term1495.getClass(), "receiverEmailAddress", "ieCtQFdkii");
        setField(term1495, term1495.getClass(), "id", term1562);
        setBooleanField(term1495, term1495.getClass(), "enabled", true);
        setLongField(term1565, term1565.getClass(), "fastTime", 1876872800559L);
        setField(term1565, term1565.getClass(), "cdate", null);
        setField(term1495, term1495.getClass(), "created", term1565);
        setLongField(term1567, term1567.getClass(), "fastTime", 1304532099366L);
        setField(term1567, term1567.getClass(), "cdate", null);
        setField(term1495, term1495.getClass(), "updated", term1567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.entity.Bcc");
        Object[] args = new Object[1];
        args[0] = term1495;
        callMethod(klass, "fromBcc", argTypes, null, args);
    }

};


