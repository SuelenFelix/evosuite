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

public class Alias_getAlias_4963401963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199;

    public Alias_getAlias_4963401963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term215 = new Long(7411271909051562686L);
        Long term246 = new Long(4872422362414183754L);
        term199 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Alias"));
        Object term200 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term213 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term218 = newInstance(Class.forName("java.util.Date"));
        Object term220 = newInstance(Class.forName("java.util.Date"));
        Object term249 = newInstance(Class.forName("java.util.Date"));
        Object term251 = newInstance(Class.forName("java.util.Date"));
        setField(term200, term200.getClass(), "name", "MjGYSRKTNF");
        setIntField(term213, term213.getClass(), "modCount", 0);
        setField(term200, term200.getClass(), "accounts", term213);
        setField(term200, term200.getClass(), "aliases", term213);
        setField(term200, term200.getClass(), "id", term215);
        setBooleanField(term200, term200.getClass(), "enabled", true);
        setLongField(term218, term218.getClass(), "fastTime", 1797203628025L);
        setField(term218, term218.getClass(), "cdate", null);
        setField(term200, term200.getClass(), "created", term218);
        setLongField(term220, term220.getClass(), "fastTime", 1589457921030L);
        setField(term220, term220.getClass(), "cdate", null);
        setField(term200, term200.getClass(), "updated", term220);
        setField(term199, term199.getClass(), "domain", term200);
        setField(term199, term199.getClass(), "alias", "hRNSzYYIrc");
        setField(term199, term199.getClass(), "email", "RMFIsYGgne");
        setField(term199, term199.getClass(), "id", term246);
        setBooleanField(term199, term199.getClass(), "enabled", true);
        setLongField(term249, term249.getClass(), "fastTime", 1745462962080L);
        setField(term249, term249.getClass(), "cdate", null);
        setField(term199, term199.getClass(), "created", term249);
        setLongField(term251, term251.getClass(), "fastTime", 1349069753960L);
        setField(term251, term251.getClass(), "cdate", null);
        setField(term199, term199.getClass(), "updated", term251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Alias");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlias", argTypes, term199, args);
    }

};


