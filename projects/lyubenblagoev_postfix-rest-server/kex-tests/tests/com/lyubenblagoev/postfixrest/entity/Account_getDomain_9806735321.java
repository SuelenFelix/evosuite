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

public class Account_getDomain_9806735321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5219;

    public Account_getDomain_9806735321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5235 = new Long(-8605430501912680279L);
        Long term5266 = new Long(2985226914509512766L);
        term5219 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term5220 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term5233 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term5238 = newInstance(Class.forName("java.util.Date"));
        Object term5240 = newInstance(Class.forName("java.util.Date"));
        Object term5269 = newInstance(Class.forName("java.util.Date"));
        Object term5271 = newInstance(Class.forName("java.util.Date"));
        setField(term5220, term5220.getClass(), "name", "RINhPkhhct");
        setIntField(term5233, term5233.getClass(), "modCount", 0);
        setField(term5220, term5220.getClass(), "accounts", term5233);
        setField(term5220, term5220.getClass(), "aliases", term5233);
        setField(term5220, term5220.getClass(), "id", term5235);
        setBooleanField(term5220, term5220.getClass(), "enabled", false);
        setLongField(term5238, term5238.getClass(), "fastTime", 1505870391081L);
        setField(term5238, term5238.getClass(), "cdate", null);
        setField(term5220, term5220.getClass(), "created", term5238);
        setLongField(term5240, term5240.getClass(), "fastTime", 1301509215398L);
        setField(term5240, term5240.getClass(), "cdate", null);
        setField(term5220, term5220.getClass(), "updated", term5240);
        setField(term5219, term5219.getClass(), "domain", term5220);
        setField(term5219, term5219.getClass(), "username", "vjNPcTSqmS");
        setField(term5219, term5219.getClass(), "password", "fFhdWuJbdC");
        setField(term5219, term5219.getClass(), "id", term5266);
        setBooleanField(term5219, term5219.getClass(), "enabled", false);
        setLongField(term5269, term5269.getClass(), "fastTime", 1736311383294L);
        setField(term5269, term5269.getClass(), "cdate", null);
        setField(term5219, term5219.getClass(), "created", term5269);
        setLongField(term5271, term5271.getClass(), "fastTime", 1604366814991L);
        setField(term5271, term5271.getClass(), "cdate", null);
        setField(term5219, term5219.getClass(), "updated", term5271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDomain", argTypes, term5219, args);
    }

};


