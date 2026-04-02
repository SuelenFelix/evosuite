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

public class Alias_setDomain_13964334652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;
     Object term139;

    public Alias_setDomain_13964334652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term101 = new Long(-8257434502486459194L);
        Long term132 = new Long(-8400487765614892086L);
        term85 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Alias"));
        Object term86 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term99 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term104 = newInstance(Class.forName("java.util.Date"));
        Object term106 = newInstance(Class.forName("java.util.Date"));
        Object term135 = newInstance(Class.forName("java.util.Date"));
        Object term137 = newInstance(Class.forName("java.util.Date"));
        setField(term86, term86.getClass(), "name", "xxtlPwDYFs");
        setIntField(term99, term99.getClass(), "modCount", 0);
        setField(term86, term86.getClass(), "accounts", term99);
        setField(term86, term86.getClass(), "aliases", term99);
        setField(term86, term86.getClass(), "id", term101);
        setBooleanField(term86, term86.getClass(), "enabled", false);
        setLongField(term104, term104.getClass(), "fastTime", 1442639565302L);
        setField(term104, term104.getClass(), "cdate", null);
        setField(term86, term86.getClass(), "created", term104);
        setLongField(term106, term106.getClass(), "fastTime", 1515890130018L);
        setField(term106, term106.getClass(), "cdate", null);
        setField(term86, term86.getClass(), "updated", term106);
        setField(term85, term85.getClass(), "domain", term86);
        setField(term85, term85.getClass(), "alias", "jJCZpVmanW");
        setField(term85, term85.getClass(), "email", "EGtDIRbSSb");
        setField(term85, term85.getClass(), "id", term132);
        setBooleanField(term85, term85.getClass(), "enabled", false);
        setLongField(term135, term135.getClass(), "fastTime", 1429023851389L);
        setField(term135, term135.getClass(), "cdate", null);
        setField(term85, term85.getClass(), "created", term135);
        setLongField(term137, term137.getClass(), "fastTime", 1495357463288L);
        setField(term137, term137.getClass(), "cdate", null);
        setField(term85, term85.getClass(), "updated", term137);
        Long term152 = new Long(5270370404989704783L);
        term139 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term155 = newInstance(Class.forName("java.util.Date"));
        Object term157 = newInstance(Class.forName("java.util.Date"));
        setField(term139, term139.getClass(), "name", "SzjVpOQTyS");
        setField(term139, term139.getClass(), "accounts", term99);
        setField(term139, term139.getClass(), "aliases", term99);
        setField(term139, term139.getClass(), "id", term152);
        setBooleanField(term139, term139.getClass(), "enabled", true);
        setLongField(term155, term155.getClass(), "fastTime", 1645834034896L);
        setField(term155, term155.getClass(), "cdate", null);
        setField(term139, term139.getClass(), "created", term155);
        setLongField(term157, term157.getClass(), "fastTime", 1500721068023L);
        setField(term157, term157.getClass(), "cdate", null);
        setField(term139, term139.getClass(), "updated", term157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Alias");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Object[] args = new Object[1];
        args[0] = term139;
        callMethod(klass, "setDomain", argTypes, term85, args);
    }

};


