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

public class Alias_getDomain_3795513031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Alias_getDomain_3795513031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17 = new Long(2442117782898005296L);
        Long term48 = new Long(6375119433582206027L);
        term1 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Alias"));
        Object term2 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term15 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term20 = newInstance(Class.forName("java.util.Date"));
        Object term22 = newInstance(Class.forName("java.util.Date"));
        Object term51 = newInstance(Class.forName("java.util.Date"));
        Object term53 = newInstance(Class.forName("java.util.Date"));
        setField(term2, term2.getClass(), "name", "PAEBtnZtTD");
        setIntField(term15, term15.getClass(), "modCount", 0);
        setField(term2, term2.getClass(), "accounts", term15);
        setField(term2, term2.getClass(), "aliases", term15);
        setField(term2, term2.getClass(), "id", term17);
        setBooleanField(term2, term2.getClass(), "enabled", false);
        setLongField(term20, term20.getClass(), "fastTime", 1345871412244L);
        setField(term20, term20.getClass(), "cdate", null);
        setField(term2, term2.getClass(), "created", term20);
        setLongField(term22, term22.getClass(), "fastTime", 1480438351369L);
        setField(term22, term22.getClass(), "cdate", null);
        setField(term2, term2.getClass(), "updated", term22);
        setField(term1, term1.getClass(), "domain", term2);
        setField(term1, term1.getClass(), "alias", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "email", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "id", term48);
        setBooleanField(term1, term1.getClass(), "enabled", false);
        setLongField(term51, term51.getClass(), "fastTime", 1610940182830L);
        setField(term51, term51.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "created", term51);
        setLongField(term53, term53.getClass(), "fastTime", 1606045635837L);
        setField(term53, term53.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "updated", term53);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Alias");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDomain", argTypes, term1, args);
    }

};


