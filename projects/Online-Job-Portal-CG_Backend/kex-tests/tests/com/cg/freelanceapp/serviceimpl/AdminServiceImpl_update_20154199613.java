package com.cg.freelanceapp.serviceimpl;

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
import static com.cg.freelanceapp.serviceimpl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class AdminServiceImpl_update_20154199613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549;
     Object term551;

    public AdminServiceImpl_update_20154199613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term549 = new Long(-5476826692763582090L);
        term551 = newInstance(Class.forName("com.cg.freelanceapp.dto.AdminDTO"));
        setField(term551, term551.getClass(), "userName", "xOEqzGAmDU");
        setField(term551, term551.getClass(), "firstName", "eZFUvlxvGV");
        setField(term551, term551.getClass(), "lastName", "BYqFIqCKAV");
        setField(term551, term551.getClass(), "password", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.serviceimpl.AdminServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("com.cg.freelanceapp.dto.AdminDTO");
        Object[] args = new Object[2];
        args[0] = term549;
        args[1] = term551;
        callMethod(klass, "update", argTypes, null, args);
    }

};


