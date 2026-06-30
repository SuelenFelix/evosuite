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
import java.util.ArrayList;
import java.lang.Long;

public class User_getDevices_20944197416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3423;

    public User_getDevices_20944197416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3450 = new ArrayList();
        Long term3454 = new Long(2209808079059619773L);
        term3423 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term3448 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term3457 = newInstance(Class.forName("java.util.Date"));
        Object term3459 = newInstance(Class.forName("java.util.Date"));
        setField(term3423, term3423.getClass(), "email", "VUkRVwROTl");
        setField(term3423, term3423.getClass(), "password", "UDlkdccCRn");
        setIntField(term3448, term3448.getClass(), "modCount", 0);
        setField(term3423, term3423.getClass(), "devices", term3448);
        setField(term3423, term3423.getClass(), "roles", term3450);
        setField(term3423, term3423.getClass(), "id", term3454);
        setBooleanField(term3423, term3423.getClass(), "enabled", false);
        setLongField(term3457, term3457.getClass(), "fastTime", 1781537434241L);
        setField(term3457, term3457.getClass(), "cdate", null);
        setField(term3423, term3423.getClass(), "created", term3457);
        setLongField(term3459, term3459.getClass(), "fastTime", 1587972339860L);
        setField(term3459, term3459.getClass(), "cdate", null);
        setField(term3423, term3423.getClass(), "updated", term3459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDevices", argTypes, term3423, args);
    }

};


