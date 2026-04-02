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
import java.lang.Boolean;

public class AliasChangeRequest_getEnabled_11145026639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term457;

    public AliasChangeRequest_getEnabled_11145026639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term458 = new Long(-6573104506744284592L);
        Long term460 = new Long(-4920224193275732920L);
        Boolean term462 = new Boolean(false);
        term457 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasChangeRequest"));
        setField(term457, term457.getClass(), "id", term458);
        setField(term457, term457.getClass(), "domainId", term460);
        setField(term457, term457.getClass(), "enabled", term462);
        setField(term457, term457.getClass(), "name", "HyxfbSQYBe");
        setField(term457, term457.getClass(), "email", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasChangeRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnabled", argTypes, term457, args);
    }

};


