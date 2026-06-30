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

public class TransactionEnt_TransactionEntBuilder_createDate_5237183973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1192;
     Object term1237;

    public TransactionEnt_TransactionEntBuilder_createDate_5237183973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1193 = new Long(-6823727938421990489L);
        Long term1233 = new Long(-484994522244390100L);
        Long term1235 = new Long(1233889271256172047L);
        term1192 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder"));
        Object term1207 = newInstance(Class.forName("java.util.Date"));
        setField(term1192, term1192.getClass(), "id", term1193);
        setField(term1192, term1192.getClass(), "hash", "hRNSzYYIrc");
        setLongField(term1207, term1207.getClass(), "fastTime", 1863631094992L);
        setField(term1207, term1207.getClass(), "cdate", null);
        setField(term1192, term1192.getClass(), "createDate", term1207);
        setField(term1192, term1192.getClass(), "failReason", "RMFIsYGgne");
        setField(term1192, term1192.getClass(), "code", "NRdvgJlhkX");
        setField(term1192, term1192.getClass(), "dropRecipientId", term1233);
        setField(term1192, term1192.getClass(), "dropRequestId", term1235);
        term1237 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1237, term1237.getClass(), "fastTime", 1882638884364L);
        setField(term1237, term1237.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term1237;
        callMethod(klass, "createDate", argTypes, term1192, args);
    }

};


