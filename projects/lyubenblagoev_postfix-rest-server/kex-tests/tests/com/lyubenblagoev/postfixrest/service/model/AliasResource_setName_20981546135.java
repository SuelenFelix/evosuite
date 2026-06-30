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
import java.lang.Object;

public class AliasResource_setName_20981546135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term949;

    public AliasResource_setName_20981546135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term950 = new Long(1967728129628047933L);
        term949 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource"));
        Object term976 = newInstance(Class.forName("java.util.Date"));
        Object term978 = newInstance(Class.forName("java.util.Date"));
        setField(term949, term949.getClass(), "id", term950);
        setField(term949, term949.getClass(), "name", "IDCWpPLRkE");
        setField(term949, term949.getClass(), "email", "nyiiPDVjAc");
        setLongField(term976, term976.getClass(), "fastTime", 1797203628025L);
        setField(term976, term976.getClass(), "cdate", null);
        setField(term949, term949.getClass(), "created", term976);
        setLongField(term978, term978.getClass(), "fastTime", 1589457921030L);
        setField(term978, term978.getClass(), "cdate", null);
        setField(term949, term949.getClass(), "updated", term978);
        setBooleanField(term949, term949.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aKnKipADSo";
        callMethod(klass, "setName", argTypes, term949, args);
    }

};


