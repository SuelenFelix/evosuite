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

public class TransactionEnt_toBuilder_12675211931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1776;

    public TransactionEnt_toBuilder_12675211931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1777 = new Long(-7738503207562305297L);
        Long term1817 = new Long(3825396310311739952L);
        Long term1819 = new Long(-3838084482494604218L);
        term1776 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term1791 = newInstance(Class.forName("java.util.Date"));
        setField(term1776, term1776.getClass(), "id", term1777);
        setField(term1776, term1776.getClass(), "hash", "dWRymuLBtr");
        setLongField(term1791, term1791.getClass(), "fastTime", 1744090065937L);
        setField(term1791, term1791.getClass(), "cdate", null);
        setField(term1776, term1776.getClass(), "createDate", term1791);
        setField(term1776, term1776.getClass(), "failReason", "AijpHYOFuy");
        setField(term1776, term1776.getClass(), "code", "SbAoxhfrkn");
        setField(term1776, term1776.getClass(), "dropRecipientId", term1817);
        setField(term1776, term1776.getClass(), "dropRequestId", term1819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term1776, args);
    }

};


