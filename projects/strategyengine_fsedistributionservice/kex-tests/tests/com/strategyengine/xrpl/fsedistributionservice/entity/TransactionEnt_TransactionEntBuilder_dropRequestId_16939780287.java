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

public class TransactionEnt_TransactionEntBuilder_dropRequestId_16939780287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1540;
     Object term1585;

    public TransactionEnt_TransactionEntBuilder_dropRequestId_16939780287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1541 = new Long(-2170847986967241072L);
        Long term1581 = new Long(4044358158040652353L);
        Long term1583 = new Long(-4443169559037975007L);
        term1540 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder"));
        Object term1555 = newInstance(Class.forName("java.util.Date"));
        setField(term1540, term1540.getClass(), "id", term1541);
        setField(term1540, term1540.getClass(), "hash", "xOEqzGAmDU");
        setLongField(term1555, term1555.getClass(), "fastTime", 1550698994689L);
        setField(term1555, term1555.getClass(), "cdate", null);
        setField(term1540, term1540.getClass(), "createDate", term1555);
        setField(term1540, term1540.getClass(), "failReason", "eZFUvlxvGV");
        setField(term1540, term1540.getClass(), "code", "BYqFIqCKAV");
        setField(term1540, term1540.getClass(), "dropRecipientId", term1581);
        setField(term1540, term1540.getClass(), "dropRequestId", term1583);
        term1585 = new Long(-3842548265506930260L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1585;
        callMethod(klass, "dropRequestId", argTypes, term1540, args);
    }

};


