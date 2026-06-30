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

public class TransactionEnt_setCode_154888961519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3100;

    public TransactionEnt_setCode_154888961519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3101 = new Long(-3936701866695933852L);
        Long term3141 = new Long(1215116475929634177L);
        Long term3143 = new Long(1597484336218508869L);
        term3100 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term3115 = newInstance(Class.forName("java.util.Date"));
        setField(term3100, term3100.getClass(), "id", term3101);
        setField(term3100, term3100.getClass(), "hash", "cAPeiZHKGJ");
        setLongField(term3115, term3115.getClass(), "fastTime", 1822704644050L);
        setField(term3115, term3115.getClass(), "cdate", null);
        setField(term3100, term3100.getClass(), "createDate", term3115);
        setField(term3100, term3100.getClass(), "failReason", "LvJFtLBaxj");
        setField(term3100, term3100.getClass(), "code", "PHvxnGHptP");
        setField(term3100, term3100.getClass(), "dropRecipientId", term3141);
        setField(term3100, term3100.getClass(), "dropRequestId", term3143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TimdotUuNC";
        callMethod(klass, "setCode", argTypes, term3100, args);
    }

};


