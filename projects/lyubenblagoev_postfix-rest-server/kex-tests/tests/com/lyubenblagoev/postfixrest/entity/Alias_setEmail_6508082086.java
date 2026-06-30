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

public class Alias_setEmail_6508082086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473;

    public Alias_setEmail_6508082086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term489 = new Long(-8885298608300233488L);
        Long term520 = new Long(-4325723315152823407L);
        term473 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Alias"));
        Object term474 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term487 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term492 = newInstance(Class.forName("java.util.Date"));
        Object term494 = newInstance(Class.forName("java.util.Date"));
        Object term523 = newInstance(Class.forName("java.util.Date"));
        Object term525 = newInstance(Class.forName("java.util.Date"));
        setField(term474, term474.getClass(), "name", "tbcdzjIfER");
        setIntField(term487, term487.getClass(), "modCount", 0);
        setField(term474, term474.getClass(), "accounts", term487);
        setField(term474, term474.getClass(), "aliases", term487);
        setField(term474, term474.getClass(), "id", term489);
        setBooleanField(term474, term474.getClass(), "enabled", true);
        setLongField(term492, term492.getClass(), "fastTime", 1538078916394L);
        setField(term492, term492.getClass(), "cdate", null);
        setField(term474, term474.getClass(), "created", term492);
        setLongField(term494, term494.getClass(), "fastTime", 1744090065937L);
        setField(term494, term494.getClass(), "cdate", null);
        setField(term474, term474.getClass(), "updated", term494);
        setField(term473, term473.getClass(), "domain", term474);
        setField(term473, term473.getClass(), "alias", "HyxfbSQYBe");
        setField(term473, term473.getClass(), "email", "pCTimMblYc");
        setField(term473, term473.getClass(), "id", term520);
        setBooleanField(term473, term473.getClass(), "enabled", false);
        setLongField(term523, term523.getClass(), "fastTime", 1347400561385L);
        setField(term523, term523.getClass(), "cdate", null);
        setField(term473, term473.getClass(), "created", term523);
        setLongField(term525, term525.getClass(), "fastTime", 1502158153899L);
        setField(term525, term525.getClass(), "cdate", null);
        setField(term473, term473.getClass(), "updated", term525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Alias");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "setEmail", argTypes, term473, args);
    }

};


