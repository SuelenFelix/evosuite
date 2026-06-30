package com.hamitmizrak.jwt;

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
import static com.hamitmizrak.jwt.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class DAOUser_setUsername_10380126854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1024;

    public DAOUser_setUsername_10380126854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1051 = new Long(-8400487765614892086L);
        term1024 = newInstance(Class.forName("com.hamitmizrak.jwt.DAOUser"));
        Object term1049 = newInstance(Class.forName("java.util.Date"));
        Object term1065 = newInstance(Class.forName("java.util.Date"));
        Object term1079 = newInstance(Class.forName("java.util.Date"));
        setField(term1024, term1024.getClass(), "username", "BndsHwAFMv");
        setField(term1024, term1024.getClass(), "password", "GzFkzHGYFt");
        setLongField(term1049, term1049.getClass(), "fastTime", 1500721068023L);
        setField(term1049, term1049.getClass(), "cdate", null);
        setField(term1024, term1024.getClass(), "date", term1049);
        setField(term1024, term1024.getClass(), "id", term1051);
        setField(term1024, term1024.getClass(), "createdBy", "tShwQLRGNe");
        setLongField(term1065, term1065.getClass(), "fastTime", 1797203628025L);
        setField(term1065, term1065.getClass(), "cdate", null);
        setField(term1024, term1024.getClass(), "createdDate", term1065);
        setField(term1024, term1024.getClass(), "updateBy", "LvtrsXUliU");
        setLongField(term1079, term1079.getClass(), "fastTime", 1589457921030L);
        setField(term1079, term1079.getClass(), "cdate", null);
        setField(term1024, term1024.getClass(), "updateDate", term1079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.jwt.DAOUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        callMethod(klass, "setUsername", argTypes, term1024, args);
    }

};


