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

public class Bcc_getReceiverEmailAddress_18601487573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4961;

    public Bcc_getReceiverEmailAddress_18601487573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4978 = new Long(800893933628130392L);
        Long term5009 = new Long(-6983938899150831997L);
        Long term5028 = new Long(-2720964670491002091L);
        term4961 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Bcc"));
        Object term4962 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term4963 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term4976 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term4981 = newInstance(Class.forName("java.util.Date"));
        Object term4983 = newInstance(Class.forName("java.util.Date"));
        Object term5012 = newInstance(Class.forName("java.util.Date"));
        Object term5014 = newInstance(Class.forName("java.util.Date"));
        Object term5031 = newInstance(Class.forName("java.util.Date"));
        Object term5033 = newInstance(Class.forName("java.util.Date"));
        setField(term4963, term4963.getClass(), "name", "TbiwoiebNe");
        setIntField(term4976, term4976.getClass(), "modCount", 0);
        setField(term4963, term4963.getClass(), "accounts", term4976);
        setField(term4963, term4963.getClass(), "aliases", term4976);
        setField(term4963, term4963.getClass(), "id", term4978);
        setBooleanField(term4963, term4963.getClass(), "enabled", false);
        setLongField(term4981, term4981.getClass(), "fastTime", 1701700093301L);
        setField(term4981, term4981.getClass(), "cdate", null);
        setField(term4963, term4963.getClass(), "created", term4981);
        setLongField(term4983, term4983.getClass(), "fastTime", 1288107422286L);
        setField(term4983, term4983.getClass(), "cdate", null);
        setField(term4963, term4963.getClass(), "updated", term4983);
        setField(term4962, term4962.getClass(), "domain", term4963);
        setField(term4962, term4962.getClass(), "username", "laTITSWZuc");
        setField(term4962, term4962.getClass(), "password", "fkzRpxlAqS");
        setField(term4962, term4962.getClass(), "id", term5009);
        setBooleanField(term4962, term4962.getClass(), "enabled", true);
        setLongField(term5012, term5012.getClass(), "fastTime", 1823809645099L);
        setField(term5012, term5012.getClass(), "cdate", null);
        setField(term4962, term4962.getClass(), "created", term5012);
        setLongField(term5014, term5014.getClass(), "fastTime", 1432063787603L);
        setField(term5014, term5014.getClass(), "cdate", null);
        setField(term4962, term4962.getClass(), "updated", term5014);
        setField(term4961, term4961.getClass(), "account", term4962);
        setField(term4961, term4961.getClass(), "receiverEmailAddress", "VYvbTGKslj");
        setField(term4961, term4961.getClass(), "id", term5028);
        setBooleanField(term4961, term4961.getClass(), "enabled", true);
        setLongField(term5031, term5031.getClass(), "fastTime", 1540951674688L);
        setField(term5031, term5031.getClass(), "cdate", null);
        setField(term4961, term4961.getClass(), "created", term5031);
        setLongField(term5033, term5033.getClass(), "fastTime", 1393504588753L);
        setField(term5033, term5033.getClass(), "cdate", null);
        setField(term4961, term4961.getClass(), "updated", term5033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Bcc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReceiverEmailAddress", argTypes, term4961, args);
    }

};


