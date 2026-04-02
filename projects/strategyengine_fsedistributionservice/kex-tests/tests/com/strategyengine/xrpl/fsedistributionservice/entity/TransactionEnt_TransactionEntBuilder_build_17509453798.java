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

public class TransactionEnt_TransactionEntBuilder_build_17509453798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1617;

    public TransactionEnt_TransactionEntBuilder_build_17509453798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1618 = new Long(-5788180182343976541L);
        Long term1658 = new Long(2936323121573284007L);
        Long term1660 = new Long(-1154553077993834885L);
        term1617 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder"));
        Object term1632 = newInstance(Class.forName("java.util.Date"));
        setField(term1617, term1617.getClass(), "id", term1618);
        setField(term1617, term1617.getClass(), "hash", "vrQLuWIDJX");
        setLongField(term1632, term1632.getClass(), "fastTime", 1804998087131L);
        setField(term1632, term1632.getClass(), "cdate", null);
        setField(term1617, term1617.getClass(), "createDate", term1632);
        setField(term1617, term1617.getClass(), "failReason", "flxyYxBRtu");
        setField(term1617, term1617.getClass(), "code", "OclPbYPkcH");
        setField(term1617, term1617.getClass(), "dropRecipientId", term1658);
        setField(term1617, term1617.getClass(), "dropRequestId", term1660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1617, args);
    }

};


