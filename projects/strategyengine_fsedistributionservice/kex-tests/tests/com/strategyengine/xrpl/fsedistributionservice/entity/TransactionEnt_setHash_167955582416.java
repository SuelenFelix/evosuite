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

public class TransactionEnt_setHash_167955582416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2829;

    public TransactionEnt_setHash_167955582416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2830 = new Long(4949335493504695457L);
        Long term2870 = new Long(-5216789073301458893L);
        Long term2872 = new Long(-1832940336320585644L);
        term2829 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term2844 = newInstance(Class.forName("java.util.Date"));
        setField(term2829, term2829.getClass(), "id", term2830);
        setField(term2829, term2829.getClass(), "hash", "KoyGrUJeJW");
        setLongField(term2844, term2844.getClass(), "fastTime", 1311560117361L);
        setField(term2844, term2844.getClass(), "cdate", null);
        setField(term2829, term2829.getClass(), "createDate", term2844);
        setField(term2829, term2829.getClass(), "failReason", "HqBOwkVqjD");
        setField(term2829, term2829.getClass(), "code", "MAcUBcBckh");
        setField(term2829, term2829.getClass(), "dropRecipientId", term2870);
        setField(term2829, term2829.getClass(), "dropRequestId", term2872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        callMethod(klass, "setHash", argTypes, term2829, args);
    }

};


