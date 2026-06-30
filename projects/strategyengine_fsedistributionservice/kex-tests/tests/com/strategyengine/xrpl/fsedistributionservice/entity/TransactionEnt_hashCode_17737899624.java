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

public class TransactionEnt_hashCode_17737899624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2003;

    public TransactionEnt_hashCode_17737899624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2004 = new Long(-8658027316505137504L);
        Long term2044 = new Long(414749984815662075L);
        Long term2046 = new Long(463622836963501975L);
        term2003 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term2018 = newInstance(Class.forName("java.util.Date"));
        setField(term2003, term2003.getClass(), "id", term2004);
        setField(term2003, term2003.getClass(), "hash", "wSQxaModmm");
        setLongField(term2018, term2018.getClass(), "fastTime", 1630952644759L);
        setField(term2018, term2018.getClass(), "cdate", null);
        setField(term2003, term2003.getClass(), "createDate", term2018);
        setField(term2003, term2003.getClass(), "failReason", "UlajhuVLaP");
        setField(term2003, term2003.getClass(), "code", "gGSMzuGICf");
        setField(term2003, term2003.getClass(), "dropRecipientId", term2044);
        setField(term2003, term2003.getClass(), "dropRequestId", term2046);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2003, args);
    }

};


