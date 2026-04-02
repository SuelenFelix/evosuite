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

public class BccResource_toBcc_7571755792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1609;
     Object term1631;

    public BccResource_toBcc_7571755792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1610 = new Long(4178434741742309755L);
        Long term1612 = new Long(-2068172595987555756L);
        term1609 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        Object term1627 = newInstance(Class.forName("java.util.Date"));
        Object term1629 = newInstance(Class.forName("java.util.Date"));
        setField(term1609, term1609.getClass(), "id", term1610);
        setField(term1609, term1609.getClass(), "accountId", term1612);
        setField(term1609, term1609.getClass(), "email", "dEnhdmILtU");
        setBooleanField(term1609, term1609.getClass(), "enabled", false);
        setLongField(term1627, term1627.getClass(), "fastTime", 1488725902101L);
        setField(term1627, term1627.getClass(), "cdate", null);
        setField(term1609, term1609.getClass(), "created", term1627);
        setLongField(term1629, term1629.getClass(), "fastTime", 1311560117361L);
        setField(term1629, term1629.getClass(), "cdate", null);
        setField(term1609, term1609.getClass(), "updated", term1629);
        Long term1647 = new Long(-6292278961887936280L);
        Long term1678 = new Long(-6645965768855543712L);
        term1631 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term1632 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term1645 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term1650 = newInstance(Class.forName("java.util.Date"));
        Object term1652 = newInstance(Class.forName("java.util.Date"));
        Object term1681 = newInstance(Class.forName("java.util.Date"));
        Object term1683 = newInstance(Class.forName("java.util.Date"));
        setField(term1632, term1632.getClass(), "name", "hoicvmsovO");
        setIntField(term1645, term1645.getClass(), "modCount", 0);
        setField(term1632, term1632.getClass(), "accounts", term1645);
        setField(term1632, term1632.getClass(), "aliases", term1645);
        setField(term1632, term1632.getClass(), "id", term1647);
        setBooleanField(term1632, term1632.getClass(), "enabled", false);
        setLongField(term1650, term1650.getClass(), "fastTime", 1595517583842L);
        setField(term1650, term1650.getClass(), "cdate", null);
        setField(term1632, term1632.getClass(), "created", term1650);
        setLongField(term1652, term1652.getClass(), "fastTime", 1464421789888L);
        setField(term1652, term1652.getClass(), "cdate", null);
        setField(term1632, term1632.getClass(), "updated", term1652);
        setField(term1631, term1631.getClass(), "domain", term1632);
        setField(term1631, term1631.getClass(), "username", "eqJfYWRaEL");
        setField(term1631, term1631.getClass(), "password", "fhkbdRViHi");
        setField(term1631, term1631.getClass(), "id", term1678);
        setBooleanField(term1631, term1631.getClass(), "enabled", true);
        setLongField(term1681, term1681.getClass(), "fastTime", 1405279189488L);
        setField(term1681, term1681.getClass(), "cdate", null);
        setField(term1631, term1631.getClass(), "created", term1681);
        setLongField(term1683, term1683.getClass(), "fastTime", 1822704644050L);
        setField(term1683, term1683.getClass(), "cdate", null);
        setField(term1631, term1631.getClass(), "updated", term1683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        argTypes[1] = Class.forName("com.lyubenblagoev.postfixrest.entity.Account");
        Object[] args = new Object[2];
        args[0] = term1609;
        args[1] = term1631;
        callMethod(klass, "toBcc", argTypes, null, args);
    }

};


