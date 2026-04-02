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

public class TransactionEnt_canEqual_12683280303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1927;
     Object term1972;

    public TransactionEnt_canEqual_12683280303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1928 = new Long(2443640364875054177L);
        Long term1968 = new Long(-1610676979013636850L);
        Long term1970 = new Long(2062173786000223358L);
        term1927 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term1942 = newInstance(Class.forName("java.util.Date"));
        setField(term1927, term1927.getClass(), "id", term1928);
        setField(term1927, term1927.getClass(), "hash", "IDCWpPLRkE");
        setLongField(term1942, term1942.getClass(), "fastTime", 1502158153899L);
        setField(term1942, term1942.getClass(), "cdate", null);
        setField(term1927, term1927.getClass(), "createDate", term1942);
        setField(term1927, term1927.getClass(), "failReason", "nyiiPDVjAc");
        setField(term1927, term1927.getClass(), "code", "aKnKipADSo");
        setField(term1927, term1927.getClass(), "dropRecipientId", term1968);
        setField(term1927, term1927.getClass(), "dropRequestId", term1970);
        term1972 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1972;
        callMethod(klass, "canEqual", argTypes, term1927, args);
    }

};


