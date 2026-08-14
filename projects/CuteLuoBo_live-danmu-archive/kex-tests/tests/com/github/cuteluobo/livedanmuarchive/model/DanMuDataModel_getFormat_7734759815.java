package com.github.cuteluobo.livedanmuarchive.model;

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
import static com.github.cuteluobo.livedanmuarchive.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class DanMuDataModel_getFormat_7734759815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5470;

    public DanMuDataModel_getFormat_7734759815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5471 = new Long(2209808079059619773L);
        Integer term5473 = new Integer(-1504890659);
        Integer term5487 = new Integer(1358829571);
        Integer term5489 = new Integer(991356662);
        Long term5491 = new Long(8403492202041709902L);
        term5470 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5470, term5470.getClass(), "id", term5471);
        setField(term5470, term5470.getClass(), "userId", term5473);
        setField(term5470, term5470.getClass(), "data", "jXzmYyrnnT");
        setField(term5470, term5470.getClass(), "format", term5487);
        setField(term5470, term5470.getClass(), "type", term5489);
        setField(term5470, term5470.getClass(), "createTime", term5491);
        setField(term5470, term5470.getClass(), "createTimeText", "igCAtimmYB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormat", argTypes, term5470, args);
    }

};


