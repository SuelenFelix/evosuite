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

public class TransactionEnt_TransactionEntBuilder_toString_14382308709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1692;

    public TransactionEnt_TransactionEntBuilder_toString_14382308709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1693 = new Long(-2850532706972744550L);
        Long term1733 = new Long(-2644215923136513282L);
        Long term1735 = new Long(-1468719814009985452L);
        term1692 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder"));
        Object term1707 = newInstance(Class.forName("java.util.Date"));
        setField(term1692, term1692.getClass(), "id", term1693);
        setField(term1692, term1692.getClass(), "hash", "IoAlmYsBwc");
        setLongField(term1707, term1707.getClass(), "fastTime", 1538078916394L);
        setField(term1707, term1707.getClass(), "cdate", null);
        setField(term1692, term1692.getClass(), "createDate", term1707);
        setField(term1692, term1692.getClass(), "failReason", "TEParAifyi");
        setField(term1692, term1692.getClass(), "code", "OWDIEULEFu");
        setField(term1692, term1692.getClass(), "dropRecipientId", term1733);
        setField(term1692, term1692.getClass(), "dropRequestId", term1735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1692, args);
    }

};


