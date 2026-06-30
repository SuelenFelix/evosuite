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

public class Account_getUsername_5110609033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5417;

    public Account_getUsername_5110609033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5433 = new Long(-5044181804110715069L);
        Long term5464 = new Long(-2413135395771470086L);
        term5417 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term5418 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term5431 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term5436 = newInstance(Class.forName("java.util.Date"));
        Object term5438 = newInstance(Class.forName("java.util.Date"));
        Object term5467 = newInstance(Class.forName("java.util.Date"));
        Object term5469 = newInstance(Class.forName("java.util.Date"));
        setField(term5418, term5418.getClass(), "name", "eRYlSLwtvV");
        setIntField(term5431, term5431.getClass(), "modCount", 0);
        setField(term5418, term5418.getClass(), "accounts", term5431);
        setField(term5418, term5418.getClass(), "aliases", term5431);
        setField(term5418, term5418.getClass(), "id", term5433);
        setBooleanField(term5418, term5418.getClass(), "enabled", false);
        setLongField(term5436, term5436.getClass(), "fastTime", 1860211896556L);
        setField(term5436, term5436.getClass(), "cdate", null);
        setField(term5418, term5418.getClass(), "created", term5436);
        setLongField(term5438, term5438.getClass(), "fastTime", 1690849519656L);
        setField(term5438, term5438.getClass(), "cdate", null);
        setField(term5418, term5418.getClass(), "updated", term5438);
        setField(term5417, term5417.getClass(), "domain", term5418);
        setField(term5417, term5417.getClass(), "username", "duOyJsARTD");
        setField(term5417, term5417.getClass(), "password", "xPnOHsNlyc");
        setField(term5417, term5417.getClass(), "id", term5464);
        setBooleanField(term5417, term5417.getClass(), "enabled", true);
        setLongField(term5467, term5467.getClass(), "fastTime", 1808612190069L);
        setField(term5467, term5467.getClass(), "cdate", null);
        setField(term5417, term5417.getClass(), "created", term5467);
        setLongField(term5469, term5469.getClass(), "fastTime", 1557841205002L);
        setField(term5469, term5469.getClass(), "cdate", null);
        setField(term5417, term5417.getClass(), "updated", term5469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term5417, args);
    }

};


