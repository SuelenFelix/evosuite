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

public class Account_setUsername_20974033434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5501;

    public Account_setUsername_20974033434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5517 = new Long(-823085399570394644L);
        Long term5548 = new Long(-894705411488729365L);
        term5501 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term5502 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term5515 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term5520 = newInstance(Class.forName("java.util.Date"));
        Object term5522 = newInstance(Class.forName("java.util.Date"));
        Object term5551 = newInstance(Class.forName("java.util.Date"));
        Object term5553 = newInstance(Class.forName("java.util.Date"));
        setField(term5502, term5502.getClass(), "name", "OTSPWPJefj");
        setIntField(term5515, term5515.getClass(), "modCount", 0);
        setField(term5502, term5502.getClass(), "accounts", term5515);
        setField(term5502, term5502.getClass(), "aliases", term5515);
        setField(term5502, term5502.getClass(), "id", term5517);
        setBooleanField(term5502, term5502.getClass(), "enabled", true);
        setLongField(term5520, term5520.getClass(), "fastTime", 1578552749976L);
        setField(term5520, term5520.getClass(), "cdate", null);
        setField(term5502, term5502.getClass(), "created", term5520);
        setLongField(term5522, term5522.getClass(), "fastTime", 1545924259654L);
        setField(term5522, term5522.getClass(), "cdate", null);
        setField(term5502, term5502.getClass(), "updated", term5522);
        setField(term5501, term5501.getClass(), "domain", term5502);
        setField(term5501, term5501.getClass(), "username", "EOTYMqXRmE");
        setField(term5501, term5501.getClass(), "password", "iTxNduwSjE");
        setField(term5501, term5501.getClass(), "id", term5548);
        setBooleanField(term5501, term5501.getClass(), "enabled", false);
        setLongField(term5551, term5551.getClass(), "fastTime", 1704769335740L);
        setField(term5551, term5551.getClass(), "cdate", null);
        setField(term5501, term5501.getClass(), "created", term5551);
        setLongField(term5553, term5553.getClass(), "fastTime", 1679648500919L);
        setField(term5553, term5553.getClass(), "cdate", null);
        setField(term5501, term5501.getClass(), "updated", term5553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MQUTfIiFnh";
        callMethod(klass, "setUsername", argTypes, term5501, args);
    }

};


