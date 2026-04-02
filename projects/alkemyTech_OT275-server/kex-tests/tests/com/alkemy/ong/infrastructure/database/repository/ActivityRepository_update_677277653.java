package com.alkemy.ong.infrastructure.database.repository;

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
import static com.alkemy.ong.infrastructure.database.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ActivityRepository_update_677277653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1014;

    public ActivityRepository_update_677277653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1015 = new Long(-1154553077993834885L);
        term1014 = newInstance(Class.forName("com.alkemy.ong.domain.Activity"));
        setField(term1014, term1014.getClass(), "id", term1015);
        setField(term1014, term1014.getClass(), "content", "BRIVNtfUWU");
        setField(term1014, term1014.getClass(), "imageUrl", "DbiCVtPPCT");
        setField(term1014, term1014.getClass(), "name", "WzFopsaDuG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.repository.ActivityRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Activity");
        Object[] args = new Object[1];
        args[0] = term1014;
        callMethod(klass, "update", argTypes, null, args);
    }

};


