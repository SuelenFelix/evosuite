package com.scaleguard.server.db;

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
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ApplicationEntry_setUts_207436455010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8305;
     Object term8344;

    public ApplicationEntry_setUts_207436455010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8305 = newInstance(Class.forName("com.scaleguard.server.db.ApplicationEntry"));
        setField(term8305, term8305.getClass(), "id", "hulYxtowxw");
        setField(term8305, term8305.getClass(), "name", "GNEmuHPNcU");
        setField(term8305, term8305.getClass(), "description", "IoSfuKDFRe");
        setLongField(term8305, term8305.getClass(), "mts", 4266570509071948633L);
        setLongField(term8305, term8305.getClass(), "uts", -7291742736502427077L);
        term8344 = new Long(-8121849829073967555L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ApplicationEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term8344;
        callMethod(klass, "setUts", argTypes, term8305, args);
    }

};


