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

public class AccountResource_setUpdated_190773010714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5021;
     Object term5055;

    public AccountResource_setUpdated_190773010714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5022 = new Long(-1616722610139554082L);
        Long term5048 = new Long(7495904023107549024L);
        term5021 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term5050 = newInstance(Class.forName("java.util.Date"));
        Object term5052 = newInstance(Class.forName("java.util.Date"));
        setField(term5021, term5021.getClass(), "id", term5022);
        setField(term5021, term5021.getClass(), "username", "DhjNLmRMCu");
        setField(term5021, term5021.getClass(), "domain", "PgPzMSEjjX");
        setField(term5021, term5021.getClass(), "domainId", term5048);
        setLongField(term5050, term5050.getClass(), "fastTime", 1431655415283L);
        setField(term5050, term5050.getClass(), "cdate", null);
        setField(term5021, term5021.getClass(), "created", term5050);
        setLongField(term5052, term5052.getClass(), "fastTime", 1714975302670L);
        setField(term5052, term5052.getClass(), "cdate", null);
        setField(term5021, term5021.getClass(), "updated", term5052);
        setBooleanField(term5021, term5021.getClass(), "enabled", true);
        term5055 = newInstance(Class.forName("java.util.Date"));
        setLongField(term5055, term5055.getClass(), "fastTime", 1830753077357L);
        setField(term5055, term5055.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term5055;
        callMethod(klass, "setUpdated", argTypes, term5021, args);
    }

};


