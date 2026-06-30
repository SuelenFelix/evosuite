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

public class Account_setDomain_362086302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5303;
     Object term5357;

    public Account_setDomain_362086302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5319 = new Long(4041117732464806744L);
        Long term5350 = new Long(7199459243454109261L);
        term5303 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term5304 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term5317 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term5322 = newInstance(Class.forName("java.util.Date"));
        Object term5324 = newInstance(Class.forName("java.util.Date"));
        Object term5353 = newInstance(Class.forName("java.util.Date"));
        Object term5355 = newInstance(Class.forName("java.util.Date"));
        setField(term5304, term5304.getClass(), "name", "JlgLIHPabR");
        setIntField(term5317, term5317.getClass(), "modCount", 0);
        setField(term5304, term5304.getClass(), "accounts", term5317);
        setField(term5304, term5304.getClass(), "aliases", term5317);
        setField(term5304, term5304.getClass(), "id", term5319);
        setBooleanField(term5304, term5304.getClass(), "enabled", true);
        setLongField(term5322, term5322.getClass(), "fastTime", 1601316811425L);
        setField(term5322, term5322.getClass(), "cdate", null);
        setField(term5304, term5304.getClass(), "created", term5322);
        setLongField(term5324, term5324.getClass(), "fastTime", 1853162461987L);
        setField(term5324, term5324.getClass(), "cdate", null);
        setField(term5304, term5304.getClass(), "updated", term5324);
        setField(term5303, term5303.getClass(), "domain", term5304);
        setField(term5303, term5303.getClass(), "username", "LHnkeoNwHq");
        setField(term5303, term5303.getClass(), "password", "gVnDVbSyKa");
        setField(term5303, term5303.getClass(), "id", term5350);
        setBooleanField(term5303, term5303.getClass(), "enabled", false);
        setLongField(term5353, term5353.getClass(), "fastTime", 1816360049562L);
        setField(term5353, term5353.getClass(), "cdate", null);
        setField(term5303, term5303.getClass(), "created", term5353);
        setLongField(term5355, term5355.getClass(), "fastTime", 1547127120190L);
        setField(term5355, term5355.getClass(), "cdate", null);
        setField(term5303, term5303.getClass(), "updated", term5355);
        Long term5370 = new Long(-1009485425289165749L);
        term5357 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term5373 = newInstance(Class.forName("java.util.Date"));
        Object term5375 = newInstance(Class.forName("java.util.Date"));
        setField(term5357, term5357.getClass(), "name", "kdCYNMSuoD");
        setField(term5357, term5357.getClass(), "accounts", term5317);
        setField(term5357, term5357.getClass(), "aliases", term5317);
        setField(term5357, term5357.getClass(), "id", term5370);
        setBooleanField(term5357, term5357.getClass(), "enabled", true);
        setLongField(term5373, term5373.getClass(), "fastTime", 1555903253002L);
        setField(term5373, term5373.getClass(), "cdate", null);
        setField(term5357, term5357.getClass(), "created", term5373);
        setLongField(term5375, term5375.getClass(), "fastTime", 1725264808793L);
        setField(term5375, term5375.getClass(), "cdate", null);
        setField(term5357, term5357.getClass(), "updated", term5375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Object[] args = new Object[1];
        args[0] = term5357;
        callMethod(klass, "setDomain", argTypes, term5303, args);
    }

};


