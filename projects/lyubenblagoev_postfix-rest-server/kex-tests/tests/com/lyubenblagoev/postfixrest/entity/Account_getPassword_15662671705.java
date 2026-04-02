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

public class Account_getPassword_15662671705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5607;

    public Account_getPassword_15662671705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5623 = new Long(-7514437039500876647L);
        Long term5654 = new Long(204473662283899955L);
        term5607 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term5608 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term5621 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term5626 = newInstance(Class.forName("java.util.Date"));
        Object term5628 = newInstance(Class.forName("java.util.Date"));
        Object term5657 = newInstance(Class.forName("java.util.Date"));
        Object term5659 = newInstance(Class.forName("java.util.Date"));
        setField(term5608, term5608.getClass(), "name", "JeyKRznnft");
        setIntField(term5621, term5621.getClass(), "modCount", 0);
        setField(term5608, term5608.getClass(), "accounts", term5621);
        setField(term5608, term5608.getClass(), "aliases", term5621);
        setField(term5608, term5608.getClass(), "id", term5623);
        setBooleanField(term5608, term5608.getClass(), "enabled", true);
        setLongField(term5626, term5626.getClass(), "fastTime", 1402175731231L);
        setField(term5626, term5626.getClass(), "cdate", null);
        setField(term5608, term5608.getClass(), "created", term5626);
        setLongField(term5628, term5628.getClass(), "fastTime", 1873258542077L);
        setField(term5628, term5628.getClass(), "cdate", null);
        setField(term5608, term5608.getClass(), "updated", term5628);
        setField(term5607, term5607.getClass(), "domain", term5608);
        setField(term5607, term5607.getClass(), "username", "vQJUCtuYpK");
        setField(term5607, term5607.getClass(), "password", "GHtOeztAdz");
        setField(term5607, term5607.getClass(), "id", term5654);
        setBooleanField(term5607, term5607.getClass(), "enabled", false);
        setLongField(term5657, term5657.getClass(), "fastTime", 1473318479281L);
        setField(term5657, term5657.getClass(), "cdate", null);
        setField(term5607, term5607.getClass(), "created", term5657);
        setLongField(term5659, term5659.getClass(), "fastTime", 1702444895732L);
        setField(term5659, term5659.getClass(), "cdate", null);
        setField(term5607, term5607.getClass(), "updated", term5659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term5607, args);
    }

};


