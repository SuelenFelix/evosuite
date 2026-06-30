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

public class DAOUser_getDate_8088698843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927;

    public DAOUser_getDate_8088698843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term954 = new Long(-8257434502486459194L);
        term927 = newInstance(Class.forName("com.hamitmizrak.jwt.DAOUser"));
        Object term952 = newInstance(Class.forName("java.util.Date"));
        Object term968 = newInstance(Class.forName("java.util.Date"));
        Object term982 = newInstance(Class.forName("java.util.Date"));
        setField(term927, term927.getClass(), "username", "wSQxaModmm");
        setField(term927, term927.getClass(), "password", "UlajhuVLaP");
        setLongField(term952, term952.getClass(), "fastTime", 1429023851389L);
        setField(term952, term952.getClass(), "cdate", null);
        setField(term927, term927.getClass(), "date", term952);
        setField(term927, term927.getClass(), "id", term954);
        setField(term927, term927.getClass(), "createdBy", "gGSMzuGICf");
        setLongField(term968, term968.getClass(), "fastTime", 1495357463288L);
        setField(term968, term968.getClass(), "cdate", null);
        setField(term927, term927.getClass(), "createdDate", term968);
        setField(term927, term927.getClass(), "updateBy", "hxCBltsObl");
        setLongField(term982, term982.getClass(), "fastTime", 1645834034896L);
        setField(term982, term982.getClass(), "cdate", null);
        setField(term927, term927.getClass(), "updateDate", term982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.jwt.DAOUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term927, args);
    }

};


