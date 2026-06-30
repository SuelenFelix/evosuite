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

public class Bcc_setReceiverEmailAddress_3429667654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5075;

    public Bcc_setReceiverEmailAddress_3429667654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5092 = new Long(-723697646775816649L);
        Long term5123 = new Long(-5671086125367688052L);
        Long term5142 = new Long(7875739215674729968L);
        term5075 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Bcc"));
        Object term5076 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term5077 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term5090 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term5095 = newInstance(Class.forName("java.util.Date"));
        Object term5097 = newInstance(Class.forName("java.util.Date"));
        Object term5126 = newInstance(Class.forName("java.util.Date"));
        Object term5128 = newInstance(Class.forName("java.util.Date"));
        Object term5145 = newInstance(Class.forName("java.util.Date"));
        Object term5147 = newInstance(Class.forName("java.util.Date"));
        setField(term5077, term5077.getClass(), "name", "owLqDDnwZA");
        setIntField(term5090, term5090.getClass(), "modCount", 0);
        setField(term5077, term5077.getClass(), "accounts", term5090);
        setField(term5077, term5077.getClass(), "aliases", term5090);
        setField(term5077, term5077.getClass(), "id", term5092);
        setBooleanField(term5077, term5077.getClass(), "enabled", true);
        setLongField(term5095, term5095.getClass(), "fastTime", 1782000689594L);
        setField(term5095, term5095.getClass(), "cdate", null);
        setField(term5077, term5077.getClass(), "created", term5095);
        setLongField(term5097, term5097.getClass(), "fastTime", 1271660272004L);
        setField(term5097, term5097.getClass(), "cdate", null);
        setField(term5077, term5077.getClass(), "updated", term5097);
        setField(term5076, term5076.getClass(), "domain", term5077);
        setField(term5076, term5076.getClass(), "username", "eBcTbweeYp");
        setField(term5076, term5076.getClass(), "password", "drcmjfQUDq");
        setField(term5076, term5076.getClass(), "id", term5123);
        setBooleanField(term5076, term5076.getClass(), "enabled", true);
        setLongField(term5126, term5126.getClass(), "fastTime", 1401133070350L);
        setField(term5126, term5126.getClass(), "cdate", null);
        setField(term5076, term5076.getClass(), "created", term5126);
        setLongField(term5128, term5128.getClass(), "fastTime", 1377478450577L);
        setField(term5128, term5128.getClass(), "cdate", null);
        setField(term5076, term5076.getClass(), "updated", term5128);
        setField(term5075, term5075.getClass(), "account", term5076);
        setField(term5075, term5075.getClass(), "receiverEmailAddress", "GjdWUoUSyA");
        setField(term5075, term5075.getClass(), "id", term5142);
        setBooleanField(term5075, term5075.getClass(), "enabled", false);
        setLongField(term5145, term5145.getClass(), "fastTime", 1554263285562L);
        setField(term5145, term5145.getClass(), "cdate", null);
        setField(term5075, term5075.getClass(), "created", term5145);
        setLongField(term5147, term5147.getClass(), "fastTime", 1390893591730L);
        setField(term5147, term5147.getClass(), "cdate", null);
        setField(term5075, term5075.getClass(), "updated", term5147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Bcc");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YEkxWsWaUl";
        callMethod(klass, "setReceiverEmailAddress", argTypes, term5075, args);
    }

};


