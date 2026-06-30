package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class TransactionEnt_getId_16989611046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2153;

    public TransactionEnt_getId_16989611046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2154 = new Long(-6723783499250797216L);
        Long term2194 = new Long(41775768178052008L);
        Long term2196 = new Long(6682528376118987775L);
        term2153 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term2168 = newInstance(Class.forName("java.util.Date"));
        setField(term2153, term2153.getClass(), "id", term2154);
        setField(term2153, term2153.getClass(), "hash", "tShwQLRGNe");
        setLongField(term2168, term2168.getClass(), "fastTime", 1329640267573L);
        setField(term2168, term2168.getClass(), "cdate", null);
        setField(term2153, term2153.getClass(), "createDate", term2168);
        setField(term2153, term2153.getClass(), "failReason", "LvtrsXUliU");
        setField(term2153, term2153.getClass(), "code", "xLbjWUgOIL");
        setField(term2153, term2153.getClass(), "dropRecipientId", term2194);
        setField(term2153, term2153.getClass(), "dropRequestId", term2196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2153, args);
    }

};


