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

public class DAOUser_getPassword_5068765122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term830;

    public DAOUser_getPassword_5068765122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term857 = new Long(6375119433582206027L);
        term830 = newInstance(Class.forName("com.hamitmizrak.jwt.DAOUser"));
        Object term855 = newInstance(Class.forName("java.util.Date"));
        Object term871 = newInstance(Class.forName("java.util.Date"));
        Object term885 = newInstance(Class.forName("java.util.Date"));
        setField(term830, term830.getClass(), "username", "xrwlQZdwCp");
        setField(term830, term830.getClass(), "password", "IDCWpPLRkE");
        setLongField(term855, term855.getClass(), "fastTime", 1606045635837L);
        setField(term855, term855.getClass(), "cdate", null);
        setField(term830, term830.getClass(), "date", term855);
        setField(term830, term830.getClass(), "id", term857);
        setField(term830, term830.getClass(), "createdBy", "nyiiPDVjAc");
        setLongField(term871, term871.getClass(), "fastTime", 1442639565302L);
        setField(term871, term871.getClass(), "cdate", null);
        setField(term830, term830.getClass(), "createdDate", term871);
        setField(term830, term830.getClass(), "updateBy", "aKnKipADSo");
        setLongField(term885, term885.getClass(), "fastTime", 1515890130018L);
        setField(term885, term885.getClass(), "cdate", null);
        setField(term830, term830.getClass(), "updateDate", term885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.jwt.DAOUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term830, args);
    }

};


