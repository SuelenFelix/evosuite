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

public class TransactionEnt_TransactionEntBuilder_code_19579707615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1366;

    public TransactionEnt_TransactionEntBuilder_code_19579707615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1367 = new Long(5907001541142728739L);
        Long term1407 = new Long(4178434741742309755L);
        Long term1409 = new Long(-2068172595987555756L);
        term1366 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder"));
        Object term1381 = newInstance(Class.forName("java.util.Date"));
        setField(term1366, term1366.getClass(), "id", term1367);
        setField(term1366, term1366.getClass(), "hash", "aJlieCFVtF");
        setLongField(term1381, term1381.getClass(), "fastTime", 1668569229825L);
        setField(term1381, term1381.getClass(), "cdate", null);
        setField(term1366, term1366.getClass(), "createDate", term1381);
        setField(term1366, term1366.getClass(), "failReason", "ZiaGIbnzTs");
        setField(term1366, term1366.getClass(), "code", "tbcdzjIfER");
        setField(term1366, term1366.getClass(), "dropRecipientId", term1407);
        setField(term1366, term1366.getClass(), "dropRequestId", term1409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "code", argTypes, term1366, args);
    }

};


