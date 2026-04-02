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

public class AccountResource_fromAccount_19345293631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4207;

    public AccountResource_fromAccount_19345293631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4223 = new Long(7276637106827860087L);
        Long term4254 = new Long(-3936701866695933852L);
        term4207 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term4208 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term4221 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term4226 = newInstance(Class.forName("java.util.Date"));
        Object term4228 = newInstance(Class.forName("java.util.Date"));
        Object term4257 = newInstance(Class.forName("java.util.Date"));
        Object term4259 = newInstance(Class.forName("java.util.Date"));
        setField(term4208, term4208.getClass(), "name", "WzFopsaDuG");
        setIntField(term4221, term4221.getClass(), "modCount", 0);
        setField(term4208, term4208.getClass(), "accounts", term4221);
        setField(term4208, term4208.getClass(), "aliases", term4221);
        setField(term4208, term4208.getClass(), "id", term4223);
        setBooleanField(term4208, term4208.getClass(), "enabled", false);
        setLongField(term4226, term4226.getClass(), "fastTime", 1272776321768L);
        setField(term4226, term4226.getClass(), "cdate", null);
        setField(term4208, term4208.getClass(), "created", term4226);
        setLongField(term4228, term4228.getClass(), "fastTime", 1597352397295L);
        setField(term4228, term4228.getClass(), "cdate", null);
        setField(term4208, term4208.getClass(), "updated", term4228);
        setField(term4207, term4207.getClass(), "domain", term4208);
        setField(term4207, term4207.getClass(), "username", "PapWxkhEWe");
        setField(term4207, term4207.getClass(), "password", "smnHEqRFRx");
        setField(term4207, term4207.getClass(), "id", term4254);
        setBooleanField(term4207, term4207.getClass(), "enabled", true);
        setLongField(term4257, term4257.getClass(), "fastTime", 1713891155263L);
        setField(term4257, term4257.getClass(), "cdate", null);
        setField(term4207, term4207.getClass(), "created", term4257);
        setLongField(term4259, term4259.getClass(), "fastTime", 1663413767651L);
        setField(term4259, term4259.getClass(), "cdate", null);
        setField(term4207, term4207.getClass(), "updated", term4259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.entity.Account");
        Object[] args = new Object[1];
        args[0] = term4207;
        callMethod(klass, "fromAccount", argTypes, null, args);
    }

};


