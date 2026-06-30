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

public class TransactionEnt_TransactionEntBuilder_id_11779709241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018;
     Object term1063;

    public TransactionEnt_TransactionEntBuilder_id_11779709241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1019 = new Long(-7672528020740371001L);
        Long term1059 = new Long(-4502405999831680926L);
        Long term1061 = new Long(1967728129628047933L);
        term1018 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder"));
        Object term1033 = newInstance(Class.forName("java.util.Date"));
        setField(term1018, term1018.getClass(), "id", term1019);
        setField(term1018, term1018.getClass(), "hash", "sjlJAEtRrb");
        setLongField(term1033, term1033.getClass(), "fastTime", 1349069753960L);
        setField(term1033, term1033.getClass(), "cdate", null);
        setField(term1018, term1018.getClass(), "createDate", term1033);
        setField(term1018, term1018.getClass(), "failReason", "MuLcgQHgqz");
        setField(term1018, term1018.getClass(), "code", "xxtlPwDYFs");
        setField(term1018, term1018.getClass(), "dropRecipientId", term1059);
        setField(term1018, term1018.getClass(), "dropRequestId", term1061);
        term1063 = new Long(2120084523938730454L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1063;
        callMethod(klass, "id", argTypes, term1018, args);
    }

};


